package cn.culturemall.art.business.serviceImpl.merchant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.culturemall.art.business.dao.merchant.MerchantDao;
import cn.culturemall.art.business.domain.merchant.Merchant;
import cn.culturemall.art.business.service.merchant.MerchantService;
import cn.culturemall.art.common.service.ReturnCode;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantDao merchantDao;

	private static final Log log = LogFactory.getLog(MerchantServiceImpl.class);

	@Override
	public ReturnData<Merchant> saveMerchant(Merchant merchant) {
		ReturnData<Merchant> returnData = new ReturnData<Merchant>();
		if (!checkSaveParam(merchant)) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = merchantDao.save(merchant);
			if (count != 1) {
				returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
				return returnData;
			}
			returnData.setResultData(merchant);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	@Override
	public ReturnData<VOID> deleteMerchantById(Long merchantId) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if (merchantId == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			merchantDao.deleteById(merchantId);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

	@Override
	public ReturnData<VOID> updateMerchant(Merchant merchant) {
		ReturnData<VOID> returnData = new ReturnData<VOID>();
		if (merchant == null || merchant.getMerchant_id() == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			int count = merchantDao.update(merchant);
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

	private boolean checkSaveParam(Merchant merchant) {
		if (merchant == null) {
			return false;
		}
		if (merchant.getClub_id() == null) {
			return false;
		}
		if (merchant.getLogin_name() == null) {
			return false;
		}
		if (merchant.getPassword() == null) {
			return false;
		}
		if (merchant.getReal_name() == null) {
			return false;
		}
		if (merchant.getMobile_phone() == null) {
			return false;
		}
		if (merchant.getEmall() == null) {
			return false;
		}
		if (merchant.getIdentity_card() == null) {
			return false;
		}
		if (merchant.getSex() == null) {
			return false;
		}
		return true;
	}

	@Override
	public ReturnData<Merchant> findMerchantById(Long merchantId) {
		ReturnData<Merchant> returnData = new ReturnData<Merchant>();
		if (merchantId == null) {
			returnData.setReturnCode(ReturnCode.PARAM_ERROR.getCode());
			return returnData;
		}
		try {
			Merchant merchant = merchantDao.findById(merchantId);
			returnData.setResultData(merchant);
			returnData.setReturnCode(ReturnCode.SUCCESS.getCode());
		} catch (Exception e) {
			log.error("service exception", e);
			returnData.setReturnCode(ReturnCode.EXCEPTION.getCode());
		}
		return returnData;
	}

}
