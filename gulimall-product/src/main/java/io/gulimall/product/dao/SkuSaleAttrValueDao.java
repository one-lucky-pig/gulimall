package io.gulimall.product.dao;

import io.gulimall.product.entity.SkuSaleAttrValueEntity;
import io.gulimall.product.vo.SkuItemSaleAttrVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * sku销售属性&值
 * 
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 15:38:36
 */
@Mapper
public interface SkuSaleAttrValueDao extends BaseMapper<SkuSaleAttrValueEntity> {

    List<SkuItemSaleAttrVo> listSaleAttrs(@Param("spuId") Long spuId);

    List<String> getSkuSaleAttrValuesAsString(@Param("skuId") Long skuId);
}
