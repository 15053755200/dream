package com.ming.dream.enity;

/**
 * @Author : Ming
 * @Date : 2020/1/8 15:52
 * @Version 1.0
 */
public class UserEntity {
    private int id;
    private String userName;
    private String passWord;
    private int usertypeid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getUsertypeid() {
        return usertypeid;
    }

    public void setUsertypeid(int usertypeid) {
        this.usertypeid = usertypeid;
    }
}
