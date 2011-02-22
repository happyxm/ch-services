package com.chcoa.domain.model;

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
 * ChsFixedAssetsInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_FIXED_ASSETS_INFO"
    ,schema="CH_COA"
)

public class ChsFixedAssetsInfo  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsFixedAssetsClassify chsFixedAssetsClassify;
     private ChsFixedAssetsDepreciation chsFixedAssetsDepreciation;
     private String assetsName;
     private Date deprStartTime;
     private Double assetsValue;
     private Double currentAssetsValue;
     private String orgId;
     private String custodian;
     private Double lossFactor;
     private String model;
     private String vendor;
     private Date toProduceTime;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsFixedAssetsInfo() {
    }

	/** minimal constructor */
    public ChsFixedAssetsInfo(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsFixedAssetsInfo(String id, ChsFixedAssetsClassify chsFixedAssetsClassify, ChsFixedAssetsDepreciation chsFixedAssetsDepreciation, String assetsName, Date deprStartTime, Double assetsValue, Double currentAssetsValue, String orgId, String custodian, Double lossFactor, String model, String vendor, Date toProduceTime, String remark) {
        this.id = id;
        this.chsFixedAssetsClassify = chsFixedAssetsClassify;
        this.chsFixedAssetsDepreciation = chsFixedAssetsDepreciation;
        this.assetsName = assetsName;
        this.deprStartTime = deprStartTime;
        this.assetsValue = assetsValue;
        this.currentAssetsValue = currentAssetsValue;
        this.orgId = orgId;
        this.custodian = custodian;
        this.lossFactor = lossFactor;
        this.model = model;
        this.vendor = vendor;
        this.toProduceTime = toProduceTime;
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
        @JoinColumn(name="TYPE_ID")

    public ChsFixedAssetsClassify getChsFixedAssetsClassify() {
        return this.chsFixedAssetsClassify;
    }
    
    public void setChsFixedAssetsClassify(ChsFixedAssetsClassify chsFixedAssetsClassify) {
        this.chsFixedAssetsClassify = chsFixedAssetsClassify;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="DEPRECIATION_ID")

    public ChsFixedAssetsDepreciation getChsFixedAssetsDepreciation() {
        return this.chsFixedAssetsDepreciation;
    }
    
    public void setChsFixedAssetsDepreciation(ChsFixedAssetsDepreciation chsFixedAssetsDepreciation) {
        this.chsFixedAssetsDepreciation = chsFixedAssetsDepreciation;
    }
    
    @Column(name="ASSETS_NAME", length=100)

    public String getAssetsName() {
        return this.assetsName;
    }
    
    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="DEPR_START_TIME", length=7)

    public Date getDeprStartTime() {
        return this.deprStartTime;
    }
    
    public void setDeprStartTime(Date deprStartTime) {
        this.deprStartTime = deprStartTime;
    }
    
    @Column(name="ASSETS_VALUE", precision=126, scale=0)

    public Double getAssetsValue() {
        return this.assetsValue;
    }
    
    public void setAssetsValue(Double assetsValue) {
        this.assetsValue = assetsValue;
    }
    
    @Column(name="CURRENT_ASSETS_VALUE", precision=126, scale=0)

    public Double getCurrentAssetsValue() {
        return this.currentAssetsValue;
    }
    
    public void setCurrentAssetsValue(Double currentAssetsValue) {
        this.currentAssetsValue = currentAssetsValue;
    }
    
    @Column(name="ORG_ID", length=20)

    public String getOrgId() {
        return this.orgId;
    }
    
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
    
    @Column(name="CUSTODIAN", length=20)

    public String getCustodian() {
        return this.custodian;
    }
    
    public void setCustodian(String custodian) {
        this.custodian = custodian;
    }
    
    @Column(name="LOSS_FACTOR", precision=126, scale=0)

    public Double getLossFactor() {
        return this.lossFactor;
    }
    
    public void setLossFactor(Double lossFactor) {
        this.lossFactor = lossFactor;
    }
    
    @Column(name="MODEL", length=100)

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    @Column(name="VENDOR", length=100)

    public String getVendor() {
        return this.vendor;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="TO_PRODUCE_TIME", length=7)

    public Date getToProduceTime() {
        return this.toProduceTime;
    }
    
    public void setToProduceTime(Date toProduceTime) {
        this.toProduceTime = toProduceTime;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}