package cn.yunding.ydsocial1.service;

import cn.yunding.ydsocial1.pojo.TestMS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @TODO
 * @Author Hao Wan
 * @Verison
 * @Date2018/7/28-15-04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class TestUserServiceImplTest {
    @Resource
    private TestUserService testUserService;
    @Test
    public void getUser() {
        TestMS testMS = new TestMS();
        testMS.setUsername("yunding");
        testMS.setPassword("yunding");
        TestMS user = testUserService.getUser(testMS);
        System.out.println(user);

    }
}