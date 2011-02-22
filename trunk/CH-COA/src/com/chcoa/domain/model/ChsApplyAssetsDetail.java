package com.chcoa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * ChsApplyAssetsDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_ASSETS_DETAIL"
    ,schema="CH_COA"
)

public class ChsApplyAssetsDetail  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsApplyAssets chsApplyAssets;
     private String name;
     private String spec;
     private String proclassify;
     private String unit;
     private Double price;
     private Double amount;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplyAssetsDetail() {
    }

	/** minimal constructor */
    public ChsApplyAssetsDetail(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyAssetsDetail(String id, ChsApplyAssets chsApplyAssets, String name, String spec, String proclassify, String unit, Double price, Double amount, String remark) {
        this.id = id;
        this.chsApplyAssets = chsApplyAssets;
        this.name = name;
        this.spec = spec;
        this.proclassify = proclassify;
        this.unit = unit;
        this.price = price;
        this.amount = amount;
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
        @JoinColumn(name="APPLY_ID")

    public ChsApplyAssets getChsApplyAssets() {
        return this.chsApplyAssets;
    }
    
    public void setChsApplyAssets(ChsApplyAssets chsApplyAssets) {
        this.chsApplyAssets = chsApplyAssets;
    }
    
    @Column(name="NAME", length=100)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="SPEC", length=200)

    public String getSpec() {
        return this.spec;
    }
    
    public void setSpec(String spec) {
        this.spec = spec;
    }
    
    @Column(name="PROCLASSIFY", length=20)

    public String getProclassify() {
        return this.proclassify;
    }
    
    public void setProclassify(String proclassify) {
        this.proclassify = proclassify;
    }
    
    @Column(name="UNIT", length=10)

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
    
    @Column(name="AMOUNT", precision=126, scale=0)

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}