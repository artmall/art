package cn.cultruemall.art.business.user.serviceImpl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.culturemall.art.business.user.domain.User;
import cn.culturemall.art.business.user.service.UserService;
import cn.culturemall.art.common.enums.GENDER;
import cn.culturemall.art.common.service.ReturnCode;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.ReturnPageData;
import cn.culturemall.art.common.service.VOID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext*.xml" })
@TransactionConfiguration(transactionManager = "userTxManager", defaultRollback = true)
@Transactional(rollbackFor = Exception.class)
public class UserServiceImplTest {

	@Autowired
	private UserService userService;

	@Test
	public void testSaveUser() {
		User user = new User();
		user.setLogin_name("登陆名");
		user.setNickname("昵称");
		user.setPassword("123456");
		user.setReal_name("测试真实姓名");
		user.setSex(GENDER.FEMALE);

		ReturnData<User> returnData = userService.saveUser(user);

		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

	@Test
	public void testDeleteUserById() {
		ReturnData<VOID> returnData = userService.deleteUserById(1L);
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

	@Test
	public void testUpdateUser() {
		User user = new User();
		user.setUser_id(2L);
		user.setLogin_name("登陆名1");
		user.setNickname("昵称1");
		user.setPassword("1234561");
		user.setReal_name("测试真实姓名1");
		user.setSex(GENDER.FEMALE);
		ReturnData<VOID> returnData = userService.updateUser(user);
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

	@Test
	public void testFindUserById() {
		ReturnData<User> returnData = userService.findUserById(2L);
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

	@Test
	public void testFindUsersLikeNickname() {
		String nickname = "称";
		int curentPage = 1;
		int onePageSize = 2;
		boolean isNeedCount = true;
		ReturnPageData<List<User>> returnData = userService
				.findUsersLikeNickname(nickname, curentPage, onePageSize,
						isNeedCount);
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}
}
