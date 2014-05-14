package cn.culturemall.art.business.serviceImpl.order;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cn.culturemall.art.business.domain.order.Order;
import cn.culturemall.art.business.enums.order.ORDER_STATUS;
import cn.culturemall.art.business.enums.order.PAY_MODE;
import cn.culturemall.art.business.enums.order.TRADE_MODE;
import cn.culturemall.art.business.service.order.OrderService;
import cn.culturemall.art.common.service.ReturnCode;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext*.xml" })
@TransactionConfiguration(transactionManager = "orderTxManager", defaultRollback = true)
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImplTest {

	@Autowired
	private OrderService orderService;

	private ReturnData<Order> save() {
		Order order = new Order();
		order.setAmount(100d);
		order.setCreate_time(new Date());
		order.setLast_pay_time(new Date());
		order.setMerchant_id(1L);
		order.setOrder_code("order_code");
		order.setOrder_id(1L);
		order.setOrder_status(ORDER_STATUS.WAITING_PAY);
		order.setPay_mode(PAY_MODE.EBANK);
		order.setProduct_id(1L);
		order.setUser_id(1L);
		order.setTrade_mode(TRADE_MODE.NORMAL_BUY);

		ReturnData<Order> returnData = orderService.saveOrder(order);
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
		return returnData;
	}

	@Test
	public void testSaveOrder() {
		this.save();
	}

	@Test
	public void testDeleteOrderById() {
		Order order = this.save().getResultData();
		ReturnData<VOID> returnData = orderService.deleteOrderById(order.getOrder_id());
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

	@Test
	public void testUpdateOrder() {
		Order order = this.save().getResultData();
		order.setAmount(100d);
		order.setCreate_time(new Date());
		order.setLast_pay_time(new Date());
		order.setMerchant_id(1L);
		order.setOrder_code("order_code");
		order.setOrder_status(ORDER_STATUS.WAITING_PAY);
		order.setPay_mode(PAY_MODE.EBANK);
		order.setProduct_id(1L);
		order.setUser_id(1L);
		order.setIs_pay(Boolean.TRUE);
		order.setPay_mode(PAY_MODE.ALIPAY);
		ReturnData<VOID> returnData = orderService.updateOrder(order);
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
	}

	@Test
	public void testFindOrderById() {
		Order order = this.save().getResultData();
		ReturnData<Order> returnData = orderService.findOrderById(order.getOrder_id());
		if (returnData.getReturnCode() != ReturnCode.SUCCESS.getCode()) {
			Assert.fail();
		}
		if (returnData.getResultData() == null) {
			Assert.fail();
		}
	}

}
