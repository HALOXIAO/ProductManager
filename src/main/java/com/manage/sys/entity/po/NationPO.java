package com.manage.sys.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName("nation")
public class NationPO {
    @TableId("nation")
    private Integer nation;

    @TableField("nation_name")
    private String nationName;


    public Integer getNation() {
        return this.nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public String getNationName() {
        return this.nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    @Override
    public String toString() {
        return "NationPO{" +
                "nation=" + nation +
                ", nationName='" + nationName + '\'' +
                '}';
    }
}
