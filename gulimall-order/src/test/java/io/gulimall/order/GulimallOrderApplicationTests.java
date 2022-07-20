package io.gulimall.order;

import io.gulimall.order.feign.CartFeignService;
import io.gulimall.order.service.OrderService;
import io.gulimall.order.vo.OrderItemVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallOrderApplicationTests {
    @Autowired
    private OrderService orderService;

    @Autowired
    private CartFeignService cartFeignService;

    @Test
    public void contextLoads() {
//        OrderEntity entity = new OrderEntity();
//        entity.setNote("这是一条测试信息");
//        orderService.save(entity);
    }

    @Test
    public void testCart() {
        List<OrderItemVo> checkedItems = cartFeignService.getCheckedItems();
        System.out.println(checkedItems);
    }

}
