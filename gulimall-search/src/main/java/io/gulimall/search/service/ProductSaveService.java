package io.gulimall.search.service;

import io.gulimall.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;


public interface ProductSaveService {

    boolean saveProductAsIndices(List<SkuEsModel> skuEsModels) throws IOException;
}
