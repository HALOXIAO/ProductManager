package com.manage.sys.entity.BO;

import com.manage.sys.service.generator.WarehouseInformationGenerator;

public class WarehouseBO {
    private long warehouseId;
    private String warehouseName;
    private long administratorId;
    private long updaterId;
    private String address;
    private Integer status;
    private java.sql.Timestamp updateTime;

    //optional
    private String description;
    private String warehouseCode;

    private WarehouseBO(Builder builder) {
        this.warehouseName = builder.warehouseName;
        this.warehouseCode = builder.warehouseCode;
        this.description = builder.description;
        this.status = builder.status;
        this.warehouseId =builder.warehouseId;
        this.address = builder.address;
        this.administratorId=builder.administratorId;
        this.updaterId=builder.updaterId;
    }

    public static class Builder {
        /**
         * 必传参数
         */
        private long warehouseId;
        private String warehouseName;
        private long administratorId;
        private long updaterId;
        private java.sql.Timestamp updateTime;
        private String address;
        private Integer status;
        /**
         * 选传参数
         */
        private String description;
        private String warehouseCode;

        public Builder(WarehouseInformationGenerator generator,long administratorId,long updaterId,String description,Integer status,String warehouseCode){
            this.warehouseId=generator.getWarehouseId();
            this.warehouseName=generator.getWarehouseName();
            this.address=generator.getAddress();
            this.administratorId=administratorId;
            this.updaterId=updaterId;
            this.description=description;
            this.status=status;
            this.warehouseCode=warehouseCode;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setWarehouse(String warehouseCode) {
            this.warehouseCode = warehouseCode;
            return this;
        }


    }
}