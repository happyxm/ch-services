package com.chcoa.domain.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsCarInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_CAR_INFO"
    ,schema="CH_COA"
)

public class ChsCarInfo  implements java.io.Serializable {


    // Fields    

     private String id;
     private String name;
     private String type;
     private String brand;
     private String model;
     private String engine;
     private String useType;
     private String source;
     private BigDecimal mileageQuota;
     private BigDecimal usedMileage;
     private Double price;
     private String tel;
     private BigDecimal limitPeoples;
     private String storageAdde;
     private String orgId;
     private BigDecimal storageTotal;
     private Date create;
     private String registeredTime;
     private String remark;
     private Set<ChsDriverInfo> chsDriverInfos = new HashSet<ChsDriverInfo>(0);
     private Set<ChsCarOilConsume> chsCarOilConsumes = new HashSet<ChsCarOilConsume>(0);


    // Constructors

    /** default constructor */
    public ChsCarInfo() {
    }

	/** minimal constructor */
    public ChsCarInfo(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsCarInfo(String id, String name, String type, String brand, String model, String engine, String useType, String source, BigDecimal mileageQuota, BigDecimal usedMileage, Double price, String tel, BigDecimal limitPeoples, String storageAdde, String orgId, BigDecimal storageTotal, Date create, String registeredTime, String remark, Set<ChsDriverInfo> chsDriverInfos, Set<ChsCarOilConsume> chsCarOilConsumes) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.useType = useType;
        this.source = source;
        this.mileageQuota = mileageQuota;
        this.usedMileage = usedMileage;
        this.price = price;
        this.tel = tel;
        this.limitPeoples = limitPeoples;
        this.storageAdde = storageAdde;
        this.orgId = orgId;
        this.storageTotal = storageTotal;
        this.create = create;
        this.registeredTime = registeredTime;
        this.remark = remark;
        this.chsDriverInfos = chsDriverInfos;
        this.chsCarOilConsumes = chsCarOilConsumes;
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
    
    @Column(name="NAME", length=100)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="TYPE", length=2)

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="BRAND", length=100)

    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    @Column(name="MODEL", length=200)

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    @Column(name="ENGINE", length=200)

    public String getEngine() {
        return this.engine;
    }
    
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    @Column(name="USE_TYPE", length=1)

    public String getUseType() {
        return this.useType;
    }
    
    public void setUseType(String useType) {
        this.useType = useType;
    }
    
    @Column(name="SOURCE", length=100)

    public String getSource() {
        return this.source;
    }
    
    public void setSource(String source) {
        this.source = source;
    }
    
    @Column(name="MILEAGE_QUOTA", precision=22, scale=0)

    public BigDecimal getMileageQuota() {
        return this.mileageQuota;
    }
    
    public void setMileageQuota(BigDecimal mileageQuota) {
        this.mileageQuota = mileageQuota;
    }
    
    @Column(name="USED_MILEAGE", precision=22, scale=0)

    public BigDecimal getUsedMileage() {
        return this.usedMileage;
    }
    
    public void setUsedMileage(BigDecimal usedMileage) {
        this.usedMileage = usedMileage;
    }
    
    @Column(name="PRICE", precision=126, scale=0)

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Column(name="TEL", length=20)

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    @Column(name="LIMIT_PEOPLES", precision=22, scale=0)

    public BigDecimal getLimitPeoples() {
        return this.limitPeoples;
    }
    
    public void setLimitPeoples(BigDecimal limitPeoples) {
        this.limitPeoples = limitPeoples;
    }
    
    @Column(name="STORAGE_ADDE", length=100)

    public String getStorageAdde() {
        return this.storageAdde;
    }
    
    public void setStorageAdde(String storageAdde) {
        this.storageAdde = storageAdde;
    }
    
    @Column(name="ORG_ID", length=20)

    public String getOrgId() {
        return this.orgId;
    }
    
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
    
    @Column(name="STORAGE_TOTAL", precision=22, scale=0)

    public BigDecimal getStorageTotal() {
        return this.storageTotal;
    }
    
    public void setStorageTotal(BigDecimal storageTotal) {
        this.storageTotal = storageTotal;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CREATE", length=7)

    public Date getCreate() {
        return this.create;
    }
    
    public void setCreate(Date create) {
        this.create = create;
    }
    
    @Column(name="REGISTERED_TIME", length=20)

    public String getRegisteredTime() {
        return this.registeredTime;
    }
    
    public void setRegisteredTime(String registeredTime) {
        this.registeredTime = registeredTime;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsCarInfos")

    public Set<ChsDriverInfo> getChsDriverInfos() {
        return this.chsDriverInfos;
    }
    
    public void setChsDriverInfos(Set<ChsDriverInfo> chsDriverInfos) {
        this.chsDriverInfos = chsDriverInfos;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsCarInfo")

    public Set<ChsCarOilConsume> getChsCarOilConsumes() {
        return this.chsCarOilConsumes;
    }
    
    public void setChsCarOilConsumes(Set<ChsCarOilConsume> chsCarOilConsumes) {
        this.chsCarOilConsumes = chsCarOilConsumes;
    }
   








}