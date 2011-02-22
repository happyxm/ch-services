package com.chcoa.domain.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsApplyCommonEvection entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_COMMON_EVECTION"
    ,schema="CH_COA"
)

public class ChsApplyCommonEvection  implements java.io.Serializable {


    // Fields    

     private String id;
     private String reason;
     private String address;
     private String proposer;
     private Date applyTime;
     private Date expectStartTime;
     private Date expectEndTime;
     private Date realStartTime;
     private Date realEndTime;
     private String status;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplyCommonEvection() {
    }

	/** minimal constructor */
    public ChsApplyCommonEvection(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyCommonEvection(String id, String reason, String address, String proposer, Date applyTime, Date expectStartTime, Date expectEndTime, Date realStartTime, Date realEndTime, String status, String remark) {
        this.id = id;
        this.reason = reason;
        this.address = address;
        this.proposer = proposer;
        this.applyTime = applyTime;
        this.expectStartTime = expectStartTime;
        this.expectEndTime = expectEndTime;
        this.realStartTime = realStartTime;
        this.realEndTime = realEndTime;
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
    
    @Column(name="REASON", length=200)

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    @Column(name="ADDRESS", length=100)

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
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
    @Temporal(TemporalType.DATE)
    @Column(name="EXPECT_START_TIME", length=7)

    public Date getExpectStartTime() {
        return this.expectStartTime;
    }
    
    public void setExpectStartTime(Date expectStartTime) {
        this.expectStartTime = expectStartTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="EXPECT_END_TIME", length=7)

    public Date getExpectEndTime() {
        return this.expectEndTime;
    }
    
    public void setExpectEndTime(Date expectEndTime) {
        this.expectEndTime = expectEndTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="REAL_START_TIME", length=7)

    public Date getRealStartTime() {
        return this.realStartTime;
    }
    
    public void setRealStartTime(Date realStartTime) {
        this.realStartTime = realStartTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="REAL_END_TIME", length=7)

    public Date getRealEndTime() {
        return this.realEndTime;
    }
    
    public void setRealEndTime(Date realEndTime) {
        this.realEndTime = realEndTime;
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