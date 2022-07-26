package io.gulimall.product.feign;

import io.gulimall.common.to.SkuReductionTo;
import io.gulimall.common.to.SpuBoundTo;
import io.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("/coupon/skufullreduction/saveInfo")
    R saveSkuReductionTo(@RequestBody SkuReductionTo skuReductionTo);
}
