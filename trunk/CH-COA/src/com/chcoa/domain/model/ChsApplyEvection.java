package com.chcoa.domain.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsApplyEvection entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_EVECTION"
    ,schema="CH_COA"
)

public class ChsApplyEvection  implements java.io.Serializable {


    // Fields    

     private String id;
     private String evectionTask;
     private String project;
     private String proposer;
     private Date applyTime;
     private Date startDate;
     private Date expectEndDate;
     private Date realEndDate;
     private String origin;
     private String destination;
     private String accommodation;
     private String others;
     private String status;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplyEvection() {
    }

	/** minimal constructor */
    public ChsApplyEvection(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyEvection(String id, String evectionTask, String project, String proposer, Date applyTime, Date startDate, Date expectEndDate, Date realEndDate, String origin, String destination, String accommodation, String others, String status, String remark) {
        this.id = id;
        this.evectionTask = evectionTask;
        this.project = project;
        this.proposer = proposer;
        this.applyTime = applyTime;
        this.startDate = startDate;
        this.expectEndDate = expectEndDate;
        this.realEndDate = realEndDate;
        this.origin = origin;
        this.destination = destination;
        this.accommodation = accommodation;
        this.others = others;
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
    
    @Column(name="EVECTION_TASK", length=200)

    public String getEvectionTask() {
        return this.evectionTask;
    }
    
    public void setEvectionTask(String evectionTask) {
        this.evectionTask = evectionTask;
    }
    
    @Column(name="PROJECT", length=100)

    public String getProject() {
        return this.project;
    }
    
    public void setProject(String project) {
        this.project = project;
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
    @Column(name="START_DATE", length=7)

    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="EXPECT_END_DATE", length=7)

    public Date getExpectEndDate() {
        return this.expectEndDate;
    }
    
    public void setExpectEndDate(Date expectEndDate) {
        this.expectEndDate = expectEndDate;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="REAL_END_DATE", length=7)

    public Date getRealEndDate() {
        return this.realEndDate;
    }
    
    public void setRealEndDate(Date realEndDate) {
        this.realEndDate = realEndDate;
    }
    
    @Column(name="ORIGIN", length=100)

    public String getOrigin() {
        return this.origin;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    @Column(name="DESTINATION", length=100)

    public String getDestination() {
        return this.destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    @Column(name="ACCOMMODATION", length=1)

    public String getAccommodation() {
        return this.accommodation;
    }
    
    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }
    
    @Column(name="OTHERS", length=500)

    public String getOthers() {
        return this.others;
    }
    
    public void setOthers(String others) {
        this.others = others;
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