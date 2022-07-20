package io.gulimall.auto.feign;

import io.gulimall.auto.feign.fallback.MemberFallbackService;
import io.gulimall.auto.vo.SocialUser;
import io.gulimall.auto.vo.UserLoginVo;
import io.gulimall.auto.vo.UserRegisterVo;
import io.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "gulimall-member",fallback = MemberFallbackService.class)
public interface MemberFeignService {

    @RequestMapping("member/member/register")
    R register(@RequestBody UserRegisterVo registerVo);


    @RequestMapping("member/member/login")
     R login(@RequestBody UserLoginVo loginVo);

    @RequestMapping("member/member/oauth2/login")
    R login(@RequestBody SocialUser socialUser);
}
