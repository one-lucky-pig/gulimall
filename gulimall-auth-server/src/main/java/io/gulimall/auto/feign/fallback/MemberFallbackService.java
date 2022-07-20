package io.gulimall.auto.feign.fallback;

import io.gulimall.auto.vo.SocialUser;
import io.gulimall.auto.vo.UserLoginVo;
import io.gulimall.auto.vo.UserRegisterVo;
import io.gulimall.common.exception.BizCodeEnum;
import io.gulimall.common.utils.R;
import io.gulimall.auto.feign.MemberFeignService;
import org.springframework.stereotype.Service;

@Service
public class MemberFallbackService implements MemberFeignService {
    @Override
    public R register(UserRegisterVo registerVo) {
        return R.error(BizCodeEnum.READ_TIME_OUT_EXCEPTION.getCode(), BizCodeEnum.READ_TIME_OUT_EXCEPTION.getMsg());
    }

    @Override
    public R login(UserLoginVo loginVo) {
        return R.error(BizCodeEnum.READ_TIME_OUT_EXCEPTION.getCode(), BizCodeEnum.READ_TIME_OUT_EXCEPTION.getMsg());
    }

    @Override
    public R login(SocialUser socialUser) {
        return R.error(BizCodeEnum.READ_TIME_OUT_EXCEPTION.getCode(), BizCodeEnum.READ_TIME_OUT_EXCEPTION.getMsg());
    }
}
