package cn.yunding.ydsocial1.service;

import cn.yunding.ydsocial1.dao.TestDao;
import cn.yunding.ydsocial1.pojo.TestMS;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @TODO
 * @Author Hao Wan
 * @Verison
 * @Date2018/7/28-14-46
 */
@Service
@Transactional
public class TestUserServiceImpl implements TestUserService{

    @Resource
    private TestDao testDao;
    @Override
    @Transactional(readOnly = true)
    public TestMS getUser(TestMS testMs) {
        testDao.selectUser(testMs);
        return testMs;
    }
}
