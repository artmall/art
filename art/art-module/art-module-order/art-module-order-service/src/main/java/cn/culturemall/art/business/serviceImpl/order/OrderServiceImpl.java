package cn.culturemall.art.business.serviceImpl.order;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.culturemall.art.business.dao.order.OrderDao;
import cn.culturemall.art.business.domain.order.Order;
import cn.culturemall.art.business.service.order.OrderService;
import cn.culturemall.art.common.service.ReturnCode;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

@Service
public class OrderServiceImpl implements OrderService {

	private static final Log log = LogFactory.getLog(OrderServiceImpl.class);

	@Autowired
	private OrderDao orderDao;

	@Override
	public ReturnData<Order> saveOrder(Order order) {
		ReturnData<Order> returnData = new ReturnData<Order>();
		if (!checkSaveParam(order)) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = orderDao.save(order);
			if (count != 1) {
				returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
				return returnData;
			}
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
			returnData.setResultData(order);
		} catch (Exception e) {
			e.printStackTrace();
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
			log.error("service exception", e);
		}
		return returnData;
	}

	private boolean checkSaveParam(Order order) {
		if (order == null) {
			return false;
		}
		if (order.getOrder_code() == null) {
			return false;
		}
		if (order.getProduct_id() == null) {
			return false;
		}
		if (order.getMerchant_id() == null) {
			return false;
		}
		if (order.getUser_id() == null) {
			return false;
		}
		if (order.getOrder_status() == null) {
			return false;
		}
		if (order.getTrade_mode() == null) {
			return false;
		}
		if (order.getAmount() == null) {
			return false;
		}
		if (order.getLast_pay_time() == null) {
			return false;
		}
		if (order.getCreate_time() == null) {
			return false;
		}
		return true;
	}

	@Override
	public ReturnData<VOID> deleteOrderById(Long orderId) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if (orderId == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			orderDao.deleteById(orderId);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
			log.error("service exception", e);
		}
		return returnData;
	}

	@Override
	public ReturnData<VOID> updateOrder(Order order) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if (order == null || order.getOrder_id() == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = orderDao.update(order);
			if (count != 1) {
				returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
				return returnData;
			}
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
			log.error("service exception", e);
		}
		return returnData;
	}

	@Override
	public ReturnData<Order> findOrderById(Long orderId) {
		ReturnData<Order> returnData = new ReturnData<Order>();
		if (orderId == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			Order order = orderDao.findById(orderId);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
			returnData.setResultData(order);
		} catch (Exception e) {
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
			log.error("service exception", e);
		}
		return returnData;
	}
}
