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
 * ChsInfoSubmit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_INFO_SUBMIT"
    ,schema="CH_COA"
)

public class ChsInfoSubmit  implements java.io.Serializable {


    // Fields    

     private String id;
     private String title;
     private String content;
     private String type;
     private String status;
     private Date submitTime;
     private String submitOrg;
     private String submitPeople;
     private String isUsed;
     private Set<ChsInfoSubmitAttach> chsInfoSubmitAttachs = new HashSet<ChsInfoSubmitAttach>(0);


    // Constructors

    /** default constructor */
    public ChsInfoSubmit() {
    }

	/** minimal constructor */
    public ChsInfoSubmit(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsInfoSubmit(String id, String title, String content, String type, String status, Date submitTime, String submitOrg, String submitPeople, String isUsed, Set<ChsInfoSubmitAttach> chsInfoSubmitAttachs) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type = type;
        this.status = status;
        this.submitTime = submitTime;
        this.submitOrg = submitOrg;
        this.submitPeople = submitPeople;
        this.isUsed = isUsed;
        this.chsInfoSubmitAttachs = chsInfoSubmitAttachs;
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
    
    @Column(name="TITLE", length=100)

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="CONTENT", length=200)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="TYPE", length=2)

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="STATUS", length=1)

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="SUBMIT_TIME", length=7)

    public Date getSubmitTime() {
        return this.submitTime;
    }
    
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }
    
    @Column(name="SUBMIT_ORG", length=20)

    public String getSubmitOrg() {
        return this.submitOrg;
    }
    
    public void setSubmitOrg(String submitOrg) {
        this.submitOrg = submitOrg;
    }
    
    @Column(name="SUBMIT_PEOPLE", length=20)

    public String getSubmitPeople() {
        return this.submitPeople;
    }
    
    public void setSubmitPeople(String submitPeople) {
        this.submitPeople = submitPeople;
    }
    
    @Column(name="IS_USED", length=1)

    public String getIsUsed() {
        return this.isUsed;
    }
    
    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsInfoSubmit")

    public Set<ChsInfoSubmitAttach> getChsInfoSubmitAttachs() {
        return this.chsInfoSubmitAttachs;
    }
    
    public void setChsInfoSubmitAttachs(Set<ChsInfoSubmitAttach> chsInfoSubmitAttachs) {
        this.chsInfoSubmitAttachs = chsInfoSubmitAttachs;
    }
   








}