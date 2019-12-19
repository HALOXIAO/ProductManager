package com.manage.sys.entity.BO;

import com.manage.sys.service.generator.EmployeeInformationGenerator;
import com.manage.sys.manager.common.utils.Convert;
import java.sql.Date;

/**
* 最后一定要记得TM的build！！！！！
* */
public class EmployeeBO {
    private final Integer employeeTypeId;
    private final String employeeTypeName;
    private final String identityCard;
    private final String nationality;
    private final Integer wage;
    private final String employeeName;
    private final String internalName;
    private final String telephoneNumber;
    private final Integer sex;
    private final java.sql.Date birthDate;

    //Optional
    private final String employeeAddress;
    private final String eMail;
    private final Integer status;


    private EmployeeBO(Builder builder) {
        this.birthDate = builder.birthDate;
        this.employeeTypeId = builder.employeeTypeId;
        this.sex = builder.sex;
        this.wage = builder.sex;
        this.employeeName = builder.employeeName;
        this.telephoneNumber = builder.telephoneNumber;
        this.internalName = builder.internalName;
        this.nationality = builder.nationality;
        this.identityCard = builder.identityCard;
        this.employeeTypeName = builder.employeeTypeName;
        this.employeeAddress = builder.employeeAddress;
        this.eMail = builder.eMail;
        this.status = builder.status;
    }


    public static class Builder {
        /**
         * 必传参数
         */
        private final Integer employeeTypeId;
        private final String employeeTypeName;
        private final String identityCard;
        private final String nationality;
        private final Integer wage;
        private final String employeeName;
        private final String internalName;
        private final String telephoneNumber;
        private final Integer sex;
        private final Integer status;


        /**
         * 选传参数
         */
        private String employeeAddress;
        private String eMail;
        private java.sql.Date birthDate;

        public Builder(EmployeeInformationGenerator generator, String employeeTypeName, Integer employeeTypeId, String identityCard, Integer wage, String nationality, Integer status) {
            this.employeeTypeName = employeeTypeName;
            this.employeeTypeId = employeeTypeId;
            this.identityCard = identityCard;
            this.wage = wage;
            this.nationality = nationality;
            this.employeeName = generator.getEmployeeName();
            this.sex = generator.getSex();
            this.telephoneNumber = generator.getTelephoneNumber();
            this.internalName = generator.getInternalName();
            this.status = status;
        }

        public Builder setEmployeeAddress(String employeeAddress) {
            this.employeeAddress = employeeAddress;
            return this;
        }

        public Builder setEMail(String eMail) {
            this.eMail = eMail;
            return this;
        }


        public Builder setBirthDate(String birthDate) {
            Date date = Convert.stringConvertToTimestamp(birthDate);
            this.birthDate = date;
            return this;
        }


        public EmployeeBO builder() {
            return new EmployeeBO(this);
        }

    }

}
