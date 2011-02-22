package com.chcoa.domain.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsApplyAdjustRest entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_ADJUST_REST"
    ,schema="CH_COA"
)

public class ChsApplyAdjustRest  implements java.io.Serializable {


    // Fields    

     private String id;
     private String proposer;
     private Date applyTime;
     private String reason;
     private Date beginTime;
     private Date endTime;
     private String status;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplyAdjustRest() {
    }

	/** minimal constructor */
    public ChsApplyAdjustRest(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyAdjustRest(String id, String proposer, Date applyTime, String reason, Date beginTime, Date endTime, String status, String remark) {
        this.id = id;
        this.proposer = proposer;
        this.applyTime = applyTime;
        this.reason = reason;
        this.beginTime = beginTime;
        this.endTime = endTime;
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
    
    @Column(name="REASON", length=200)

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="BEGIN_TIME", length=7)

    public Date getBeginTime() {
        return this.beginTime;
    }
    
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="END_TIME", length=7)

    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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