package com.chcoa.domain.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsOfficeSupplies entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_OFFICE_SUPPLIES"
    ,schema="CH_COA"
)

public class ChsOfficeSupplies  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsOfficeSuppliesClassify chsOfficeSuppliesClassify;
     private String name;
     private String supplier;
     private String spec;
     private String unit;
     private Double price;
     private String isStorageAlert;
     private BigDecimal storageNum;
     private BigDecimal minStorage;
     private Date creatTime;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsOfficeSupplies() {
    }

	/** minimal constructor */
    public ChsOfficeSupplies(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsOfficeSupplies(String id, ChsOfficeSuppliesClassify chsOfficeSuppliesClassify, String name, String supplier, String spec, String unit, Double price, String isStorageAlert, BigDecimal storageNum, BigDecimal minStorage, Date creatTime, String remark) {
        this.id = id;
        this.chsOfficeSuppliesClassify = chsOfficeSuppliesClassify;
        this.name = name;
        this.supplier = supplier;
        this.spec = spec;
        this.unit = unit;
        this.price = price;
        this.isStorageAlert = isStorageAlert;
        this.storageNum = storageNum;
        this.minStorage = minStorage;
        this.creatTime = creatTime;
        this.remark = remark;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="CLASSIFY")

    public ChsOfficeSuppliesClassify getChsOfficeSuppliesClassify() {
        return this.chsOfficeSuppliesClassify;
    }
    
    public void setChsOfficeSuppliesClassify(ChsOfficeSuppliesClassify chsOfficeSuppliesClassify) {
        this.chsOfficeSuppliesClassify = chsOfficeSuppliesClassify;
    }
    
    @Column(name="NAME", length=50)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="SUPPLIER", length=100)

    public String getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
    @Column(name="SPEC", length=100)

    public String getSpec() {
        return this.spec;
    }
    
    public void setSpec(String spec) {
        this.spec = spec;
    }
    
    @Column(name="UNIT", length=20)

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    @Column(name="PRICE", precision=126, scale=0)

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Column(name="IS_STORAGE_ALERT", length=1)

    public String getIsStorageAlert() {
        return this.isStorageAlert;
    }
    
    public void setIsStorageAlert(String isStorageAlert) {
        this.isStorageAlert = isStorageAlert;
    }
    
    @Column(name="STORAGE_NUM", precision=22, scale=0)

    public BigDecimal getStorageNum() {
        return this.storageNum;
    }
    
    public void setStorageNum(BigDecimal storageNum) {
        this.storageNum = storageNum;
    }
    
    @Column(name="MIN_STORAGE", precision=22, scale=0)

    public BigDecimal getMinStorage() {
        return this.minStorage;
    }
    
    public void setMinStorage(BigDecimal minStorage) {
        this.minStorage = minStorage;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CREAT_TIME", length=7)

    public Date getCreatTime() {
        return this.creatTime;
    }
    
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}