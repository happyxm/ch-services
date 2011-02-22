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
 * ChsApplyAssets entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_ASSETS"
    ,schema="CH_COA"
)

public class ChsApplyAssets  implements java.io.Serializable {


    // Fields    

     private String id;
     private String proposer;
     private String orgId;
     private Date applyTime;
     private String status;
     private String remark;
     private Set<ChsApplyAssetsDetail> chsApplyAssetsDetails = new HashSet<ChsApplyAssetsDetail>(0);
     private Set<ChsApplyBookInfo> chsApplyBookInfos = new HashSet<ChsApplyBookInfo>(0);


    // Constructors

    /** default constructor */
    public ChsApplyAssets() {
    }

	/** minimal constructor */
    public ChsApplyAssets(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyAssets(String id, String proposer, String orgId, Date applyTime, String status, String remark, Set<ChsApplyAssetsDetail> chsApplyAssetsDetails, Set<ChsApplyBookInfo> chsApplyBookInfos) {
        this.id = id;
        this.proposer = proposer;
        this.orgId = orgId;
        this.applyTime = applyTime;
        this.status = status;
        this.remark = remark;
        this.chsApplyAssetsDetails = chsApplyAssetsDetails;
        this.chsApplyBookInfos = chsApplyBookInfos;
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
    
    @Column(name="ORG_ID", length=20)

    public String getOrgId() {
        return this.orgId;
    }
    
    public void setOrgId(String orgId) {
        this.orgId = orgId;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsApplyAssets")

    public Set<ChsApplyAssetsDetail> getChsApplyAssetsDetails() {
        return this.chsApplyAssetsDetails;
    }
    
    public void setChsApplyAssetsDetails(Set<ChsApplyAssetsDetail> chsApplyAssetsDetails) {
        this.chsApplyAssetsDetails = chsApplyAssetsDetails;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsApplyAssets")

    public Set<ChsApplyBookInfo> getChsApplyBookInfos() {
        return this.chsApplyBookInfos;
    }
    
    public void setChsApplyBookInfos(Set<ChsApplyBookInfo> chsApplyBookInfos) {
        this.chsApplyBookInfos = chsApplyBookInfos;
    }
   








}