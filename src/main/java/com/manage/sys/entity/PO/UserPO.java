package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;

@TableName("user")
public class UserPO {

    private Long userId;
    private String username;
    private String telehone;
    private String password;
    private Long employeeId;
    private int status;
    private Timestamp registerTime;


    public String getTelehone() {
        return telehone;
    }

    public void setTelehone(String telehone) {
        this.telehone = telehone;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", telehone='" + telehone + '\'' +
                ", password='" + password + '\'' +
                ", employeeId=" + employeeId +
                ", status=" + status +
                ", registerTime=" + registerTime +
                '}';
    }
}
