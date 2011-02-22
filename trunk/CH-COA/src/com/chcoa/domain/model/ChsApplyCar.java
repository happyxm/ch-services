package com.chcoa.domain.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsApplyCar entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_CAR"
    ,schema="CH_COA"
)

public class ChsApplyCar  implements java.io.Serializable {


    // Fields    

     private String id;
     private String useType;
     private String brand;
     private String model;
     private String verdor;
     private Double price;
     private BigDecimal limitPeople;
     private String orgId;
     private String proposer;
     private Date applyTime;
     private String status;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplyCar() {
    }

	/** minimal constructor */
    public ChsApplyCar(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyCar(String id, String useType, String brand, String model, String verdor, Double price, BigDecimal limitPeople, String orgId, String proposer, Date applyTime, String status, String remark) {
        this.id = id;
        this.useType = useType;
        this.brand = brand;
        this.model = model;
        this.verdor = verdor;
        this.price = price;
        this.limitPeople = limitPeople;
        this.orgId = orgId;
        this.proposer = proposer;
        this.applyTime = applyTime;
        this.status = status;
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
    
    @Column(name="USE_TYPE", length=1)

    public String getUseType() {
        return this.useType;
    }
    
    public void setUseType(String useType) {
        this.useType = useType;
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
    
    @Column(name="VERDOR", length=100)

    public String getVerdor() {
        return this.verdor;
    }
    
    public void setVerdor(String verdor) {
        this.verdor = verdor;
    }
    
    @Column(name="PRICE", precision=126, scale=0)

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Column(name="LIMIT_PEOPLE", precision=22, scale=0)

    public BigDecimal getLimitPeople() {
        return this.limitPeople;
    }
    
    public void setLimitPeople(BigDecimal limitPeople) {
        this.limitPeople = limitPeople;
    }
    
    @Column(name="ORG_ID", length=20)

    public String getOrgId() {
        return this.orgId;
    }
    
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
    
    @Column(name="PROPOSER", length=20)

    public String getProposer() {
        return this.proposer;
    }
    
    public void setProposer(String proposer) {
        this.proposer = proposer;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="APPLY_TIME", length=7)

    public Date getApplyTime() {
        return this.applyTime;
    }
    
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
    
    @Column(name="STATUS", length=1)

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}