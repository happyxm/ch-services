package com.chcoa.domain.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsDriverInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_DRIVER_INFO"
    ,schema="CH_COA"
)

public class ChsDriverInfo  implements java.io.Serializable {


    // Fields    

     private String id;
     private String name;
     private String certType;
     private String certNo;
     private String tel;
     private String drivingLicense;
     private String allowedType;
     private String isValid;
     private Date createTime;
     private Set<ChsCarInfo> chsCarInfos = new HashSet<ChsCarInfo>(0);


    // Constructors

    /** default constructor */
    public ChsDriverInfo() {
    }

	/** minimal constructor */
    public ChsDriverInfo(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsDriverInfo(String id, String name, String certType, String certNo, String tel, String drivingLicense, String allowedType, String isValid, Date createTime, Set<ChsCarInfo> chsCarInfos) {
        this.id = id;
        this.name = name;
        this.certType = certType;
        this.certNo = certNo;
        this.tel = tel;
        this.drivingLicense = drivingLicense;
        this.allowedType = allowedType;
        this.isValid = isValid;
        this.createTime = createTime;
        this.chsCarInfos = chsCarInfos;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID", unique=true, nullable=false, length=20)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="NAME", length=50)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="CERT_TYPE", length=3)

    public String getCertType() {
        return this.certType;
    }
    
    public void setCertType(String certType) {
        this.certType = certType;
    }
    
    @Column(name="CERT_NO", length=100)

    public String getCertNo() {
        return this.certNo;
    }
    
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }
    
    @Column(name="TEL", length=20)

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    @Column(name="DRIVING_LICENSE", length=50)

    public String getDrivingLicense() {
        return this.drivingLicense;
    }
    
    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
    
    @Column(name="ALLOWED_TYPE", length=2)

    public String getAllowedType() {
        return this.allowedType;
    }
    
    public void setAllowedType(String allowedType) {
        this.allowedType = allowedType;
    }
    
    @Column(name="IS_VALID", length=1)

    public String getIsValid() {
        return this.isValid;
    }
    
    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CREATE_TIME", length=7)

    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name="CHS_CAR_ASSIGN", schema="CH_COA", joinColumns = { 
        @JoinColumn(name="DRIVER_ID", updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="CAR_ID", updatable=false) })

    public Set<ChsCarInfo> getChsCarInfos() {
        return this.chsCarInfos;
    }
    
    public void setChsCarInfos(Set<ChsCarInfo> chsCarInfos) {
        this.chsCarInfos = chsCarInfos;
    }
   








}