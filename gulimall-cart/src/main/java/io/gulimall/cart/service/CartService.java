package io.gulimall.cart.service;

import io.gulimall.cart.vo.CartItemVo;
import io.gulimall.cart.vo.CartVo;

import java.util.List;

public interface CartService {
    CartItemVo addCartItem(Long skuId, Integer num);

    CartItemVo getCartItem(Long skuId);

    CartVo getCart();

    void checkCart(Long skuId, Integer isChecked);

    void changeItemCount(Long skuId, Integer num);

    void deleteItem(Long skuId);

    List<CartItemVo> getCheckedItems();
}
