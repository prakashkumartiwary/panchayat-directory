
package com.panchayat.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;
 private LocalDate dob;
 private String relation;
 private String gender;
 private String photoUrl;
 private Boolean isDeceased;
 private LocalDate demiseDate;
 private Long parentId;
 private Long familyId;

 public Long getId(){return id;}
 public void setId(Long id){this.id=id;}

 public String getName(){return name;}
 public void setName(String name){this.name=name;}

 public LocalDate getDob(){return dob;}
 public void setDob(LocalDate dob){this.dob=dob;}

 public String getRelation(){return relation;}
 public void setRelation(String relation){this.relation=relation;}

 public String getGender(){return gender;}
 public void setGender(String gender){this.gender=gender;}

 public String getPhotoUrl(){return photoUrl;}
 public void setPhotoUrl(String photoUrl){this.photoUrl=photoUrl;}

 public Boolean getIsDeceased(){return isDeceased;}
 public void setIsDeceased(Boolean isDeceased){this.isDeceased=isDeceased;}

 public LocalDate getDemiseDate(){return demiseDate;}
 public void setDemiseDate(LocalDate demiseDate){this.demiseDate=demiseDate;}

 public Long getParentId(){return parentId;}
 public void setParentId(Long parentId){this.parentId=parentId;}

 public Long getFamilyId(){return familyId;}
 public void setFamilyId(Long familyId){this.familyId=familyId;}
}
