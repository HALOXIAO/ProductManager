package com.manage.sys.service.generator;

public class EmployeeInformationGenerator {

    private String employeeName;
    private String internalName;
    private String telephoneNumber;
    private int sex;

    private EmployeeInformationGenerator(String employeeName, String telephoneNumber, String internalName, int sex) {
        this.employeeName=employeeName;
        this.telephoneNumber=telephoneNumber;
        this.internalName=internalName;
        this.sex=sex;
    }

    public static EmployeeInformationGenerator employeeBaseInformationFactory(String employeeName, String telephoneNumber, String internalName, int sex) {

        return new EmployeeInformationGenerator(employeeName,telephoneNumber,internalName,sex);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getInternalName() {
        return internalName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getSex() {
        return sex;
    }
}

