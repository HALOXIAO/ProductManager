package com.manage.sys.entity.PO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.sql.Timestamp;

@TableName("user")
public class UserPO implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long userId;
    @TableField
    @NotEmpty
    @Length(min = 2, max = 20)
    private String username;

    @TableField
    @NotEmpty
    private String telephone;

    @TableField
    @NotEmpty
    private String password;
    @TableField
    private Long employeeId;
    @TableField
    private int status;

    private Timestamp registerTime;


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
        return "UserPO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", employeeId=" + employeeId +
                ", status=" + status +
                ", registerTime=" + registerTime +
                '}';
    }
}
