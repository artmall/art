package cn.culturemall.art.business.serviceImpl.product;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.culturemall.art.business.dao.product.ProductDao;
import cn.culturemall.art.business.domain.product.Product;
import cn.culturemall.art.business.service.product.ProductService;
import cn.culturemall.art.common.service.ReturnCode;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	private static final Log log = LogFactory.getLog(ProductServiceImpl.class);
	
	@Override
	public ReturnData<Product> saveUser(Product product) {
		ReturnData<Product> returnData = new ReturnData<Product>();
		if(!checkSaveParam(product)){
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try{
			int count = productDao.save(product);
			if(count != 1){
				returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
				return returnData;
			}
			returnData.setResultData(product);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		}catch(Exception e){
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	@Override
	public ReturnData<VOID> deleteUserById(Long productId) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if(productId == null){
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try{
			productDao.deleteById(productId);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		}catch(Exception e){
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	@Override
	public ReturnData<VOID> updateUser(Product product) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if(product == null || product.getProduct_id() == null){
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = productDao.update(product);
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
	public ReturnData<Product> findUserById(Long productId) {
		ReturnData<Product> returnData = new ReturnData<Product>();
		if (productId == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			Product user = productDao.findById(productId);
			returnData.setResultData(user);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}
	
	private boolean checkSaveParam(Product product) {
		if(product == null){
			return false;
		}
		if(product.getProduct_id() == null){
			return false;
		}
		if(product.getCategroy_id() == null){
			return false;
		}
		if(product.getClub_id() == null){
			return false;
		}
		if(product.getProduct_name() == null){
			return false;
		}
		if(product.getProduct_price() == null){
			return false;
		}
		if(product.getStatus() == null){
			return false;
		}
		if(product.getCreate_time() == null){
			return false;
		}
		if(product.getTrade_model() == null){
			return false;
		}
		return true;
	}

}
