package com.manage.sys.service.generator;

public class WarehouseInformationGenerator {
    private long warehouseId;
    private String warehouseName;
    private String address;

    private WarehouseInformationGenerator(long warehouseId,String warehouseName,String address){
        this.warehouseId=warehouseId;
        this.warehouseName=warehouseName;
        this.address=address;
    }

    public static WarehouseInformationGenerator warehouseBaseInformationFactory(long warehouseId,String warehouseName,String address){
        return new WarehouseInformationGenerator(warehouseId,warehouseName,address);
    }

    public long getWarehouseId(){return warehouseId;}
    public String getWarehouseName(){return  warehouseName;}
    public String getAddress(){return address;}
}
