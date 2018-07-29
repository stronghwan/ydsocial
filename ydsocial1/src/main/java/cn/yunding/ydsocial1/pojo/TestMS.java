package cn.yunding.ydsocial1.pojo;

import java.io.Serializable;

/**
 * 用来测试react native的交互
 * @Author Hao Wan
 * @Verison
 * @Date2018/7/28-14-14
 */
public class TestMS implements Serializable{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TestMS{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
