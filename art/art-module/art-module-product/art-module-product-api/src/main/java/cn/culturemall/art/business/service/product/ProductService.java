package cn.culturemall.art.business.service.product;

import cn.culturemall.art.business.domain.product.Product;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

public interface ProductService {

	ReturnData<Product> saveUser(Product product);

	ReturnData<VOID> deleteUserById(Long productId);

	ReturnData<VOID> updateUser(Product product);

	ReturnData<Product> findUserById(Long productId);
	
}
