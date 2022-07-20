package io.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.gulimall.common.utils.PageUtils;
import io.gulimall.member.entity.MemberEntity;
import io.gulimall.member.vo.MemberLoginVo;
import io.gulimall.member.vo.MemberRegisterVo;
import io.gulimall.member.vo.SocialUser;

import java.util.Map;

/**
 * 会员
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 23:01:00
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void register(MemberRegisterVo registerVo);

    MemberEntity login(MemberLoginVo loginVo);

    MemberEntity login(SocialUser socialUser);
}

