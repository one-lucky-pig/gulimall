package io.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.gulimall.common.utils.PageUtils;
import io.gulimall.ware.vo.FareVo;
import io.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 23:15:25
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    FareVo getFare(Long addrId);
}

