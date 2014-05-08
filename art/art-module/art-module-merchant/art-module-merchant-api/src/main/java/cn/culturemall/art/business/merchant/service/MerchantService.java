package cn.culturemall.art.business.merchant.service;

import cn.culturemall.art.business.merchant.domain.Merchant;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

public interface MerchantService {

	ReturnData<Merchant> saveMerchant(Merchant merchant);

	ReturnData<VOID> deleteMerchantById(Long merchantId);

	ReturnData<VOID> updateMerchant(Merchant merchant);

}
