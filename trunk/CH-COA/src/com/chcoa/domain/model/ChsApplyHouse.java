package com.chcoa.domain.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsApplyHouse entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_HOUSE"
    ,schema="CH_COA"
)

public class ChsApplyHouse  implements java.io.Serializable {


    // Fields    

     private String id;
     private Date applyTime;
     private String workAddr;
     private String project;
     private String people;
     private String houseLeader;
     private String leaseTerm;
     private Double leaseAmount;
     private String payWay;
     private String status;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplyHouse() {
    }

	/** minimal constructor */
    public ChsApplyHouse(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyHouse(String id, Date applyTime, String workAddr, String project, String people, String houseLeader, String leaseTerm, Double leaseAmount, String payWay, String status, String remark) {
        this.id = id;
        this.applyTime = applyTime;
        this.workAddr = workAddr;
        this.project = project;
        this.people = people;
        this.houseLeader = houseLeader;
        this.leaseTerm = leaseTerm;
        this.leaseAmount = leaseAmount;
        this.payWay = payWay;
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
    @Temporal(TemporalType.DATE)
    @Column(name="APPLY_TIME", length=7)

    public Date getApplyTime() {
        return this.applyTime;
    }
    
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
    
    @Column(name="WORK_ADDR", length=100)

    public String getWorkAddr() {
        return this.workAddr;
    }
    
    public void setWorkAddr(String workAddr) {
        this.workAddr = workAddr;
    }
    
    @Column(name="PROJECT", length=100)

    public String getProject() {
        return this.project;
    }
    
    public void setProject(String project) {
        this.project = project;
    }
    
    @Column(name="PEOPLE", length=500)

    public String getPeople() {
        return this.people;
    }
    
    public void setPeople(String people) {
        this.people = people;
    }
    
    @Column(name="HOUSE_LEADER", length=20)

    public String getHouseLeader() {
        return this.houseLeader;
    }
    
    public void setHouseLeader(String houseLeader) {
        this.houseLeader = houseLeader;
    }
    
    @Column(name="LEASE_TERM", length=20)

    public String getLeaseTerm() {
        return this.leaseTerm;
    }
    
    public void setLeaseTerm(String leaseTerm) {
        this.leaseTerm = leaseTerm;
    }
    
    @Column(name="LEASE_AMOUNT", precision=126, scale=0)

    public Double getLeaseAmount() {
        return this.leaseAmount;
    }
    
    public void setLeaseAmount(Double leaseAmount) {
        this.leaseAmount = leaseAmount;
    }
    
    @Column(name="PAY_WAY", length=1)

    public String getPayWay() {
        return this.payWay;
    }
    
    public void setPayWay(String payWay) {
        this.payWay = payWay;
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