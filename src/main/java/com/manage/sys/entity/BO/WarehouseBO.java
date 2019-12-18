package com.manage.sys.entity.BO;

import com.manage.sys.service.generator.WarehouseInformationGenerator;

public class WarehouseBO {
    private long warehouseId;
    private String warehouseName;
    private long administratorId;
    private long updaterId;
    private String address;
    private int status;
    private java.sql.Timestamp updateTime;

    //optional
    private String description;
    private String warehouseCode;

    private WarehouseBO(Warehouser warehouser) {
        this.warehouseName = warehouser.warehouseName;
        this.warehouseCode = warehouser.warehouseCode;
        this.description = warehouser.description;
        this.status = warehouser.status;
        this.warehouseId =warehouser.warehouseId;
        this.address = warehouser.address;
        this.administratorId=warehouser.administratorId;
        this.updaterId=warehouser.updaterId;
    }

    public static class Warehouser {
        /**
         * 必传参数
         */
        private long warehouseId;
        private String warehouseName;
        private long administratorId;
        private long updaterId;
        private java.sql.Timestamp updateTime;
        private String address;
        private int status;
        /**
         * 选传参数
         */
        private String description;
        private String warehouseCode;

        public Warehouser(WarehouseInformationGenerator generator,long administratorId,long updaterId,String description,int status,String warehouseCode){
            this.warehouseId=generator.getWarehouseId();
            this.warehouseName=generator.getWarehouseName();
            this.address=generator.getAddress();
            this.administratorId=administratorId;
            this.updaterId=updaterId;
            this.description=description;
            this.status=status;
            this.warehouseCode=warehouseCode;
        }

        public Warehouser setDescription(String description) {
            this.description = description;
            return this;
        }

        public Warehouser setWarehouse(String warehouseCode) {
            this.warehouseCode = warehouseCode;
            return this;
        }


    }
}