package cn.culturemall.art.business.service.order;

import cn.culturemall.art.business.domain.order.Order;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

public interface OrderService {

	ReturnData<Order> saveOrder(Order order);

	ReturnData<VOID> deleteOrderById(Long orderId);

	ReturnData<VOID> updateOrder(Order order);

	ReturnData<Order> findOrderById(Long orderId);
}
