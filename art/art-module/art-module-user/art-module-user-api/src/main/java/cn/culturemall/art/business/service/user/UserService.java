package cn.culturemall.art.business.service.user;

import java.util.List;

import cn.culturemall.art.business.user.domain.User;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.ReturnPageData;
import cn.culturemall.art.common.service.VOID;

public interface UserService {

	ReturnData<User> saveUser(User user);

	ReturnData<VOID> deleteUserById(Long userId);

	ReturnData<VOID> updateUser(User user);

	ReturnData<User> findUserById(Long userId);

	ReturnPageData<List<User>> findUsersLikeNickname(String nickname,
			int curentPage, int onePageSize, boolean isNeedCount);
}
