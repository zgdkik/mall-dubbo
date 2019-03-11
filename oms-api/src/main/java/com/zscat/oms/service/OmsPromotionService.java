package com.zscat.oms.service;

import com.zscat.pms.dto.CartPromotionItem;
import com.zscat.pms.dto.OmsCartItem;

import java.util.List;

/**
 * Created by zscat on 2018/8/27.
 * 促销管理Service
 */
public interface OmsPromotionService {
    /**
     * 计算购物车中的促销活动信息
     *
     * @param cartItemList 购物车
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
