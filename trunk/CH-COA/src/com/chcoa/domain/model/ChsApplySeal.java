package com.chcoa.domain.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsApplySeal entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_SEAL"
    ,schema="CH_COA"
)

public class ChsApplySeal  implements java.io.Serializable {


    // Fields    

     private String id;
     private String proposer;
     private Date applyTime;
     private String useType;
     private String useAddress;
     private String content;
     private String reason;
     private Date borrowTime;
     private Date backTime;
     private String status;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplySeal() {
    }

	/** minimal constructor */
    public ChsApplySeal(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplySeal(String id, String proposer, Date applyTime, String useType, String useAddress, String content, String reason, Date borrowTime, Date backTime, String status, String remark) {
        this.id = id;
        this.proposer = proposer;
        this.applyTime = applyTime;
        this.useType = useType;
        this.useAddress = useAddress;
        this.content = content;
        this.reason = reason;
        this.borrowTime = borrowTime;
        this.backTime = backTime;
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
    
    @Column(name="USE_TYPE", length=1)

    public String getUseType() {
        return this.useType;
    }
    
    public void setUseType(String useType) {
        this.useType = useType;
    }
    
    @Column(name="USE_ADDRESS", length=50)

    public String getUseAddress() {
        return this.useAddress;
    }
    
    public void setUseAddress(String useAddress) {
        this.useAddress = useAddress;
    }
    
    @Column(name="CONTENT", length=200)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="REASON", length=200)

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="BORROW_TIME", length=7)

    public Date getBorrowTime() {
        return this.borrowTime;
    }
    
    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="BACK_TIME", length=7)

    public Date getBackTime() {
        return this.backTime;
    }
    
    public void setBackTime(Date backTime) {
        this.backTime = backTime;
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