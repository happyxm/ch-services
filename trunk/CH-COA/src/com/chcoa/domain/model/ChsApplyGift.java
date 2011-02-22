package com.chcoa.domain.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsApplyGift entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_GIFT"
    ,schema="CH_COA"
)

public class ChsApplyGift  implements java.io.Serializable {


    // Fields    

     private String id;
     private String proposer;
     private Date applyTime;
     private String reason;
     private String status;
     private String remark;
     private Set<ChsApplyGiftDetail> chsApplyGiftDetails = new HashSet<ChsApplyGiftDetail>(0);
     private Set<ChsCustomer> chsCustomers = new HashSet<ChsCustomer>(0);


    // Constructors

    /** default constructor */
    public ChsApplyGift() {
    }

	/** minimal constructor */
    public ChsApplyGift(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyGift(String id, String proposer, Date applyTime, String reason, String status, String remark, Set<ChsApplyGiftDetail> chsApplyGiftDetails, Set<ChsCustomer> chsCustomers) {
        this.id = id;
        this.proposer = proposer;
        this.applyTime = applyTime;
        this.reason = reason;
        this.status = status;
        this.remark = remark;
        this.chsApplyGiftDetails = chsApplyGiftDetails;
        this.chsCustomers = chsCustomers;
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
    
    @Column(name="REASON", length=200)

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsApplyGift")

    public Set<ChsApplyGiftDetail> getChsApplyGiftDetails() {
        return this.chsApplyGiftDetails;
    }
    
    public void setChsApplyGiftDetails(Set<ChsApplyGiftDetail> chsApplyGiftDetails) {
        this.chsApplyGiftDetails = chsApplyGiftDetails;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsApplyGift")

    public Set<ChsCustomer> getChsCustomers() {
        return this.chsCustomers;
    }
    
    public void setChsCustomers(Set<ChsCustomer> chsCustomers) {
        this.chsCustomers = chsCustomers;
    }
   








}