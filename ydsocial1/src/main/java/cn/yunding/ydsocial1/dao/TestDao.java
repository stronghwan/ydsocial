package cn.yunding.ydsocial1.dao;

import cn.yunding.ydsocial1.pojo.TestMS;

/**
 * @test
 * @Author Hao Wan
 * @Verison
 * @Date2018/7/28-14-41
 */
public interface TestDao {

    /**
     * test 查询
     * @param testMS
     * @return
     */
    TestMS selectUser(TestMS testMS);
}
