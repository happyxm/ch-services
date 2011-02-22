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
 * ChsApplyOvertime entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_OVERTIME"
    ,schema="CH_COA"
)

public class ChsApplyOvertime  implements java.io.Serializable {


    // Fields    

     private String id;
     private String proposer;
     private Date applyTime;
     private String status;
     private String remark;
     private Set<ChsApplyOvertimeDetail> chsApplyOvertimeDetails = new HashSet<ChsApplyOvertimeDetail>(0);


    // Constructors

    /** default constructor */
    public ChsApplyOvertime() {
    }

	/** minimal constructor */
    public ChsApplyOvertime(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyOvertime(String id, String proposer, Date applyTime, String status, String remark, Set<ChsApplyOvertimeDetail> chsApplyOvertimeDetails) {
        this.id = id;
        this.proposer = proposer;
        this.applyTime = applyTime;
        this.status = status;
        this.remark = remark;
        this.chsApplyOvertimeDetails = chsApplyOvertimeDetails;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsApplyOvertime")

    public Set<ChsApplyOvertimeDetail> getChsApplyOvertimeDetails() {
        return this.chsApplyOvertimeDetails;
    }
    
    public void setChsApplyOvertimeDetails(Set<ChsApplyOvertimeDetail> chsApplyOvertimeDetails) {
        this.chsApplyOvertimeDetails = chsApplyOvertimeDetails;
    }
   








}