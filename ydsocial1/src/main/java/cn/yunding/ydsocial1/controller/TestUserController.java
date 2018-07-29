package cn.yunding.ydsocial1.controller;

import cn.yunding.ydsocial1.pojo.TestMS;
import cn.yunding.ydsocial1.service.TestUserService;
import com.wordnik.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @TODO
 * @Author Hao Wan
 * @Verison
 * @Date2018/7/28-15-14
 */
@Controller
public class TestUserController {

    @Autowired
    private TestUserService testUserService;
    @RequestMapping(value = "/test/login", method = RequestMethod.POST,produces="application/json; charset=utf-8")
    @ResponseBody
    @ApiOperation(value = "测试用户登录", httpMethod = "POST", notes = "add user",response = TestMS.class)
    public String login(@RequestBody TestMS testMS){
        if(StringUtils.isNotBlank(testMS.getUsername())){
            if(testMS.getUsername().equals(testUserService.getUser(testMS).getUsername())){
                if(StringUtils.isNotBlank(testMS.getPassword())){
                    if (testMS.getPassword().equals(testUserService.getUser(testMS).getPassword())){
                        return "登陆成功!";
                    }else {
                        return "密码错误！";
                    }
                }else {
                    return "密码不能为空!";
                }
            }else {
                return "用户名不正确！";
            }
        }else {
            return "用户名不能为空！";
        }
    }
}
