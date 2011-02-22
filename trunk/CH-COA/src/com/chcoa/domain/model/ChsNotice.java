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
 * ChsNotice entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_NOTICE"
    ,schema="CH_COA"
)

public class ChsNotice  implements java.io.Serializable {


    // Fields    

     private String id;
     private String title;
     private String type;
     private String publishOrg;
     private String publisher;
     private Date publishTime;
     private Date beginValidTime;
     private Date endValidTime;
     private String emergencyLevel;
     private String materialityLevel;
     private Set<ChsNoticeAttach> chsNoticeAttachs = new HashSet<ChsNoticeAttach>(0);


    // Constructors

    /** default constructor */
    public ChsNotice() {
    }

	/** minimal constructor */
    public ChsNotice(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsNotice(String id, String title, String type, String publishOrg, String publisher, Date publishTime, Date beginValidTime, Date endValidTime, String emergencyLevel, String materialityLevel, Set<ChsNoticeAttach> chsNoticeAttachs) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.publishOrg = publishOrg;
        this.publisher = publisher;
        this.publishTime = publishTime;
        this.beginValidTime = beginValidTime;
        this.endValidTime = endValidTime;
        this.emergencyLevel = emergencyLevel;
        this.materialityLevel = materialityLevel;
        this.chsNoticeAttachs = chsNoticeAttachs;
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
    
    @Column(name="TYPE", length=2)

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="PUBLISH_ORG", length=20)

    public String getPublishOrg() {
        return this.publishOrg;
    }
    
    public void setPublishOrg(String publishOrg) {
        this.publishOrg = publishOrg;
    }
    
    @Column(name="PUBLISHER", length=20)

    public String getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="PUBLISH_TIME", length=7)

    public Date getPublishTime() {
        return this.publishTime;
    }
    
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="BEGIN_VALID_TIME", length=7)

    public Date getBeginValidTime() {
        return this.beginValidTime;
    }
    
    public void setBeginValidTime(Date beginValidTime) {
        this.beginValidTime = beginValidTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="END_VALID_TIME", length=7)

    public Date getEndValidTime() {
        return this.endValidTime;
    }
    
    public void setEndValidTime(Date endValidTime) {
        this.endValidTime = endValidTime;
    }
    
    @Column(name="EMERGENCY_LEVEL", length=1)

    public String getEmergencyLevel() {
        return this.emergencyLevel;
    }
    
    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }
    
    @Column(name="MATERIALITY_LEVEL", length=1)

    public String getMaterialityLevel() {
        return this.materialityLevel;
    }
    
    public void setMaterialityLevel(String materialityLevel) {
        this.materialityLevel = materialityLevel;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsNotice")

    public Set<ChsNoticeAttach> getChsNoticeAttachs() {
        return this.chsNoticeAttachs;
    }
    
    public void setChsNoticeAttachs(Set<ChsNoticeAttach> chsNoticeAttachs) {
        this.chsNoticeAttachs = chsNoticeAttachs;
    }
   








}