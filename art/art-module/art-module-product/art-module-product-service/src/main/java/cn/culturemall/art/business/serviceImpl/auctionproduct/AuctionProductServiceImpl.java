package cn.culturemall.art.business.serviceImpl.auctionproduct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.culturemall.art.business.dao.auctionproduct.AuctionProductDao;
import cn.culturemall.art.business.domain.auctionproduct.AuctionProduct;
import cn.culturemall.art.business.service.auctionproduct.AuctionProductService;
import cn.culturemall.art.common.service.ReturnCode;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

@Service
public class AuctionProductServiceImpl implements AuctionProductService {

	@Autowired
	private AuctionProductDao auctionProductDao;

	private static final Log log = LogFactory.getLog(AuctionProductServiceImpl.class);

	@Override
	public ReturnData<AuctionProduct> saveAuctionProduct(AuctionProduct auctionProduct) {
		ReturnData<AuctionProduct> returnData = new ReturnData<AuctionProduct>();
		if (!checkSaveParam(auctionProduct)) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = auctionProductDao.save(auctionProduct);
			if (count != 1) {
				returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
				return returnData;
			}
			returnData.setResultData(auctionProduct);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	@Override
	public ReturnData<VOID> deleteAuctionProductById(Long auctionId) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if (auctionId == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			auctionProductDao.deleteById(auctionId);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	@Override
	public ReturnData<VOID> updateAuctionProduct(AuctionProduct auctionProduct) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if (auctionProduct == null || auctionProduct.getAuction_id() == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = auctionProductDao.update(auctionProduct);
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
	public ReturnData<AuctionProduct> findAuctionProductById(Long auctionId) {
		ReturnData<AuctionProduct> returnData = new ReturnData<AuctionProduct>();
		if (auctionId == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			AuctionProduct auctionProduct = auctionProductDao.findById(auctionId);
			returnData.setResultData(auctionProduct);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	private boolean checkSaveParam(AuctionProduct auctionProduct) {
		if (auctionProduct == null) {
			return false;
		}
		if (auctionProduct.getAuction_id() == null) {
			return false;
		}
		if (auctionProduct.getProduct_id() == null) {
			return false;
		}
		if (auctionProduct.getMerchant_id() == null) {
			return false;
		}
		if (auctionProduct.getClub_id() == null) {
			return false;
		}
		if (auctionProduct.getStart_time() == null) {
			return false;
		}
		if (auctionProduct.getEnd_time() == null) {
			return false;
		}
		if (auctionProduct.getLowest_price() == null) {
			return false;
		}
		if (auctionProduct.getStep_price() == null) {
			return false;
		}
		return true;
	}

}
