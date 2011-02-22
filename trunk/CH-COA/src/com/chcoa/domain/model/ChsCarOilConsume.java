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
 * ChsCarOilConsume entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_CAR_OIL_CONSUME"
    ,schema="CH_COA"
)

public class ChsCarOilConsume  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsCarInfo chsCarInfo;
     private String proposer;
     private BigDecimal relativelyMiles;
     private BigDecimal oilApply;
     private Date applyTime;


    // Constructors

    /** default constructor */
    public ChsCarOilConsume() {
    }

	/** minimal constructor */
    public ChsCarOilConsume(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsCarOilConsume(String id, ChsCarInfo chsCarInfo, String proposer, BigDecimal relativelyMiles, BigDecimal oilApply, Date applyTime) {
        this.id = id;
        this.chsCarInfo = chsCarInfo;
        this.proposer = proposer;
        this.relativelyMiles = relativelyMiles;
        this.oilApply = oilApply;
        this.applyTime = applyTime;
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
        @JoinColumn(name="CAR_ID")

    public ChsCarInfo getChsCarInfo() {
        return this.chsCarInfo;
    }
    
    public void setChsCarInfo(ChsCarInfo chsCarInfo) {
        this.chsCarInfo = chsCarInfo;
    }
    
    @Column(name="PROPOSER", length=20)

    public String getProposer() {
        return this.proposer;
    }
    
    public void setProposer(String proposer) {
        this.proposer = proposer;
    }
    
    @Column(name="RELATIVELY_MILES", precision=22, scale=0)

    public BigDecimal getRelativelyMiles() {
        return this.relativelyMiles;
    }
    
    public void setRelativelyMiles(BigDecimal relativelyMiles) {
        this.relativelyMiles = relativelyMiles;
    }
    
    @Column(name="OIL_APPLY", precision=22, scale=0)

    public BigDecimal getOilApply() {
        return this.oilApply;
    }
    
    public void setOilApply(BigDecimal oilApply) {
        this.oilApply = oilApply;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="APPLY_TIME", length=7)

    public Date getApplyTime() {
        return this.applyTime;
    }
    
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
   








}