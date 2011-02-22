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
 * ChsApplyOvertimeDetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_OVERTIME_DETAIL"
    ,schema="CH_COA"
)

public class ChsApplyOvertimeDetail  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsApplyOvertime chsApplyOvertime;
     private String reason;
     private Date startTime;
     private Date endTime;
     private String overtimeType;
     private String benifitsType;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplyOvertimeDetail() {
    }

	/** minimal constructor */
    public ChsApplyOvertimeDetail(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyOvertimeDetail(String id, ChsApplyOvertime chsApplyOvertime, String reason, Date startTime, Date endTime, String overtimeType, String benifitsType, String remark) {
        this.id = id;
        this.chsApplyOvertime = chsApplyOvertime;
        this.reason = reason;
        this.startTime = startTime;
        this.endTime = endTime;
        this.overtimeType = overtimeType;
        this.benifitsType = benifitsType;
        this.remark = remark;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID", unique=true, nullable=false, length=32)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="APPLY_ID")

    public ChsApplyOvertime getChsApplyOvertime() {
        return this.chsApplyOvertime;
    }
    
    public void setChsApplyOvertime(ChsApplyOvertime chsApplyOvertime) {
        this.chsApplyOvertime = chsApplyOvertime;
    }
    
    @Column(name="REASON", length=200)

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="START_TIME", length=7)

    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="END_TIME", length=7)

    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    @Column(name="OVERTIME_TYPE", length=1)

    public String getOvertimeType() {
        return this.overtimeType;
    }
    
    public void setOvertimeType(String overtimeType) {
        this.overtimeType = overtimeType;
    }
    
    @Column(name="BENIFITS_TYPE", length=1)

    public String getBenifitsType() {
        return this.benifitsType;
    }
    
    public void setBenifitsType(String benifitsType) {
        this.benifitsType = benifitsType;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}