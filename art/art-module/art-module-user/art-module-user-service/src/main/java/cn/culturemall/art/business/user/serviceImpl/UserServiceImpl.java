package cn.culturemall.art.business.user.serviceImpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.culturemall.art.business.user.dao.UserDao;
import cn.culturemall.art.business.user.domain.User;
import cn.culturemall.art.business.user.service.UserService;
import cn.culturemall.art.common.service.ReturnCode;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.ReturnPageData;
import cn.culturemall.art.common.service.VOID;
import cn.culturemall.art.common.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	private static final Log log = LogFactory.getLog(UserServiceImpl.class);

	@Override
	public ReturnData<User> saveUser(User user) {
		ReturnData<User> returnData = new ReturnData<User>();
		if (!checkSaveParam(user)) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = userDao.save(user);
			if (count != 1) {
				returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
				return returnData;
			}
			returnData.setResultData(user);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	private boolean checkSaveParam(User user) {
		if (user == null) {
			return false;
		}
		if (user.getLogin_name() == null) {
			return false;
		}
		if (user.getPassword() == null) {
			return false;
		}
		if (user.getSex() == null) {
			return false;
		}
		return true;
	}

	@Override
	public ReturnData<VOID> deleteUserById(Long userId) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if (userId == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			userDao.deleteById(userId);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	@Override
	public ReturnData<VOID> updateUser(User user) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if (user == null || user.getUser_id() == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = userDao.update(user);
			if (count != 1) {
				returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
				return returnData;
			}
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	@Override
	public ReturnData<User> findUserById(Long userId) {
		ReturnData<User> returnData = new ReturnData<User>();
		if (userId == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			User user = userDao.findById(userId);
			returnData.setResultData(user);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	@Override
	public ReturnPageData<List<User>> findUsersLikeNickname(String nickname,
			int curentPage, int onePageSize, boolean isNeedCount) {
		ReturnPageData<List<User>> returnData = new ReturnPageData<List<User>>(
				curentPage, onePageSize);
		if (nickname == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = 0;
			if (isNeedCount) {
				count = userDao.findUsersCountLikeNickname(StringUtils
						.trimBlank(nickname));
			}
			int startRow = returnData.getStartRow();
			List<User> users = userDao.findUsersLikeNickname(
					StringUtils.trimBlank(nickname), startRow, onePageSize);
			returnData.setTotalResults(count);
			returnData.setResultData(users);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

}
