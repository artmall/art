package cn.culturemall.art.business.service.merchant;

import cn.culturemall.art.business.domain.merchant.Merchant;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

public interface MerchantService {

	ReturnData<Merchant> saveMerchant(Merchant merchant);

	ReturnData<VOID> deleteMerchantById(Long merchantId);

	ReturnData<VOID> updateMerchant(Merchant merchant);

	ReturnData<Merchant> findMerchantById(Long merchantId);

}
