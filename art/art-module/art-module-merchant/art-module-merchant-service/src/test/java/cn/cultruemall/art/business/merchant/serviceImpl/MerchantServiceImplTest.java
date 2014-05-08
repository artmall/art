package cn.cultruemall.art.business.merchant.serviceImpl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.culturemall.art.business.merchant.domain.Merchant;
import cn.culturemall.art.business.merchant.service.MerchantService;
import cn.culturemall.art.common.enums.GENDER;
import cn.culturemall.art.common.service.ReturnCode;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext*.xml" })
@TransactionConfiguration(transactionManager = "merchantTxManager", defaultRollback = true)
@Transactional(rollbackFor = Exception.class)
public class MerchantServiceImplTest {

	@Autowired
	private MerchantService merchantService;

	@Test
	public void testSaveMerchant() {
		Merchant merchant = new Merchant();
		merchant.setClub_id(100000L);
		merchant.setNickname("测试nickname");
		merchant.setLogin_name("测试loginname");
		merchant.setPassword("测试password");
		merchant.setReal_name("测试realname");
		merchant.setTelephone(10000000);
		merchant.setMobile_phone(10000000);
		merchant.setEmall("测试emall");
		merchant.setIdentity_card("测试身份证");
		merchant.setSex(GENDER.MALE);

		ReturnData<Merchant> returnData = merchantService
				.saveMerchant(merchant);

		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

	@Test
	public void testDeleteMerchantById() {
		ReturnData<VOID> returnData = merchantService.deleteMerchantById(2L);
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

	@Test
	public void testUpdateMerchant() {
		Merchant merchant = new Merchant();
		merchant.setMerchant_id(3L);
		merchant.setClub_id(100000L);
		merchant.setNickname("测试nickname");
		merchant.setLogin_name("测试loginname");
		merchant.setPassword("测试password");
		merchant.setReal_name("测试realname");
		merchant.setTelephone(10000000);
		merchant.setMobile_phone(10000000);
		merchant.setEmall("测试emall");
		merchant.setIdentity_card("测试身份证");
		merchant.setSex(GENDER.SECRET);

		ReturnData<VOID> returnData = merchantService.updateMerchant(merchant);
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

	@Test
	public void testFindMerchantById() {
		ReturnData<Merchant> returnData = merchantService.findMerchantById(3L);
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

}
