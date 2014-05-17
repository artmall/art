package cn.culturemall.art.business.service.auctionproduct;

import cn.culturemall.art.business.domain.auctionproduct.AuctionProduct;
import cn.culturemall.art.business.domain.product.Product;
import cn.culturemall.art.common.service.ReturnData;
import cn.culturemall.art.common.service.VOID;

public interface AuctionProductService {

	ReturnData<AuctionProduct> saveAuctionProduct(AuctionProduct auctionProduct);

	ReturnData<VOID> deleteAuctionProductById(Long auctionId);

	ReturnData<VOID> updateAuctionProduct(AuctionProduct auctionProduct);

	ReturnData<AuctionProduct> findAuctionProductById(Long auctionId);
	
}
