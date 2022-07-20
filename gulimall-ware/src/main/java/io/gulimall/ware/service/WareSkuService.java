package io.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.gulimall.common.to.SkuHasStockVo;
import io.gulimall.common.to.mq.OrderTo;
import io.gulimall.common.to.mq.StockLockedTo;
import io.gulimall.common.utils.PageUtils;
import io.gulimall.ware.vo.WareSkuLockVo;
import io.gulimall.ware.entity.WareSkuEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 23:15:25
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);

    List<SkuHasStockVo> getSkuHasStocks(List<Long> ids);

    Boolean orderLockStock(WareSkuLockVo lockVo);

    void unlock(StockLockedTo stockLockedTo);

    void unlock(OrderTo orderTo);
}

