package com.cykj.bean;


import com.cykj.util.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class User {
    private int userId;
    private String userName;
    private String account;
    private String pwd;
    private String sex;
    private String education;
    private String profession;
    private int phone;
    private String email;
    @Autowired
    @Resource
    /**
     * 共同点：装配在bean上 写在属性上或者setter方法上
     * 不同点：@Autowired默认按照类型进行匹配
     * @Resource 默认按照名称进行装配
     */
    private Classes classes;
    private List<String> strs;

    public User() {

    }

    public User(Classes classes) {
        this.classes = classes;
    }

    public User(String userName, String sex) {
        this.userName = userName;
        this.sex = sex;
    }

    public User(int userId, String userName, String account, String pwd, String sex, String education, String profession, int phone, String email) {
        this.userId = userId;
        this.userName = userName;
        this.account = account;
        this.pwd = pwd;
        this.sex = sex;
        this.education = education;
        this.profession = profession;
        this.phone = phone;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public void init(){
//        System.out.println("-_-");
//    }

    public void des(){
        System.out.println("0.0");
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public List<String> getStrs() {
        return strs;
    }

    public void setStrs(List<String> strs) {
        this.strs = strs;
    }


    @Log(module = "用户模块",action = "登入",remark = "用户进行登入操作")
    public void init(){
        System.out.println("-_-");
    }
}
