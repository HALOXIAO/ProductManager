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

    private WarehouseBO(Warehouse warehouse) {
        this.warehouseName = warehouse.warehouseName;
        this.warehouseCode = warehouse.warehouseCode;
        this.description = warehouse.description;
        this.status = warehouse.status;
        this.warehouseId =warehouse.warehouseId;
        this.address = warehouse.address;
        this.administratorId=warehouse.administratorId;
        this.updaterId=warehouse.updaterId;
    }

    public static class Warehouse {
        private long warehouseId;
        private String warehouseName;
        private String warehouseCode;
        private String description;
        private long administratorId;
        private long updaterId;
        private java.sql.Timestamp updateTime;

        private String address;
        private int status;

        public Warehouse setAdministratorId(long administratorId) {
            this.administratorId = administratorId;
            return this;
        }

        public Warehouse setUpdaterId(long updaterId) {
            this.updaterId = updaterId;
            return this;
        }


    }
}