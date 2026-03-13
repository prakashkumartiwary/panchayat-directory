
package com.panchayat.entity;

import jakarta.persistence.*;

@Entity
public class Family {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String familyName;
 private String houseNo;
 private String village;
 private String pinCode;

 public Long getId(){return id;}
 public void setId(Long id){this.id=id;}

 public String getFamilyName(){return familyName;}
 public void setFamilyName(String familyName){this.familyName=familyName;}

 public String getHouseNo(){return houseNo;}
 public void setHouseNo(String houseNo){this.houseNo=houseNo;}

 public String getVillage(){return village;}
 public void setVillage(String village){this.village=village;}

 public String getPinCode(){return pinCode;}
 public void setPinCode(String pinCode){this.pinCode=pinCode;}
}
