package com.springcloud.consul;

import com.springcloud.consul.service.ServiceUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author:jianghuimin
 * @Date: 2017/8/22
 * @Time:14:48
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceTest {

    @Autowired
    private ServiceUtil serviceUtil;

    @Test
    public void delete(){
        serviceUtil.getAllServicer();
    }
}
