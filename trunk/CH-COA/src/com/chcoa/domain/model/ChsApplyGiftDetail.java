package com.chcoa.domain.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * ChsApplyGiftDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_GIFT_DETAIL"
    ,schema="CH_COA"
)

public class ChsApplyGiftDetail  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsApplyGift chsApplyGift;
     private String name;
     private Double price;
     private BigDecimal num;
     private Double amount;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplyGiftDetail() {
    }

	/** minimal constructor */
    public ChsApplyGiftDetail(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyGiftDetail(String id, ChsApplyGift chsApplyGift, String name, Double price, BigDecimal num, Double amount, String remark) {
        this.id = id;
        this.chsApplyGift = chsApplyGift;
        this.name = name;
        this.price = price;
        this.num = num;
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

    public ChsApplyGift getChsApplyGift() {
        return this.chsApplyGift;
    }
    
    public void setChsApplyGift(ChsApplyGift chsApplyGift) {
        this.chsApplyGift = chsApplyGift;
    }
    
    @Column(name="NAME", length=50)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="PRICE", precision=126, scale=0)

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Column(name="NUM", precision=22, scale=0)

    public BigDecimal getNum() {
        return this.num;
    }
    
    public void setNum(BigDecimal num) {
        this.num = num;
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