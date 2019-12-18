package com.manage.sys.entity.BO;

public class WarehouseBO {
    private long warehouseId;
    private String warehouseName;
    private String warehouseCode;
    private String description;
    private long administratorId;
    private long updaterId;
    private java.sql.Timestamp updateTime;

    private String address;
    private int status;

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
        private long warehouseId;
        private String warehouseName;
        private String warehouseCode;
        private String description;
        private long administratorId;
        private long updaterId;
        private java.sql.Timestamp updateTime;

        private String address;
        private int status;

        public Warehouser()
        public WarehouseBO setAdministratorId(long administratorId) {
            this.administratorId = administratorId;
            return this;
        }

        public WarehouseBO setUpdaterId(long updaterId) {
            this.updaterId = updaterId;
            return this;
        }


    }
}