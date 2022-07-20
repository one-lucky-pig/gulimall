package io.gulimall.product.vo;

import io.gulimall.product.entity.AttrEntity;
import io.gulimall.product.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

@Data
public class AttrGroupWithAttrVo extends AttrGroupEntity {
    private List<AttrEntity> attrs;
}
