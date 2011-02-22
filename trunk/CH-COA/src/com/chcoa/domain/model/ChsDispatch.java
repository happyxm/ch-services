package com.chcoa.domain.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;


/**
 * ChsDispatch entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_DISPATCH"
    ,schema="CH_COA"
)

public class ChsDispatch  implements java.io.Serializable {


    // Fields    

     private String id;
     private String title;
     private String type;
     private String themeWord;
     private String abstract_;
     private String status;
     private String draftOrg;
     private Date draftTime;
     private String draftPeople;
     private String classification;
     private String secrecyLevel;
     private String secrecyTerm;
     private String materialityLevel;
     private String emergencyLevel;
     private String dealTerm;
     private String fileWord;
     private String docNo;
     private String sendOrgId;
     private Date sendTime;
     private String sender;
     private String receiveOrg;
     private String carbonCopy;
     private String remark;
     private Set<ChsDispatchDoc> chsDispatchDocs = new HashSet<ChsDispatchDoc>(0);
     private Set<ChsDispatchOpinion> chsDispatchOpinions = new HashSet<ChsDispatchOpinion>(0);


    // Constructors

    /** default constructor */
    public ChsDispatch() {
    }

	/** minimal constructor */
    public ChsDispatch(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsDispatch(String id, String title, String type, String themeWord, String abstract_, String status, String draftOrg, Date draftTime, String draftPeople, String classification, String secrecyTerm,String secrecyLevel, String materialityLevel, String emergencyLevel, String dealTerm, String fileWord, String docNo, String sendOrgId, Date sendTime, String sender, String receiveOrg, String carbonCopy, String remark, Set<ChsDispatchDoc> chsDispatchDocs, Set<ChsDispatchOpinion> chsDispatchOpinions) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.themeWord = themeWord;
        this.abstract_ = abstract_;
        this.status = status;
        this.draftOrg = draftOrg;
        this.draftTime = draftTime;
        this.draftPeople = draftPeople;
        this.classification = classification;
        this.secrecyLevel = secrecyLevel;
        this.secrecyTerm = secrecyTerm;
        this.materialityLevel = materialityLevel;
        this.emergencyLevel = emergencyLevel;
        this.dealTerm = dealTerm;
        this.fileWord = fileWord;
        this.docNo = docNo;
        this.sendOrgId = sendOrgId;
        this.sendTime = sendTime;
        this.sender = sender;
        this.receiveOrg = receiveOrg;
        this.carbonCopy = carbonCopy;
        this.remark = remark;
        this.chsDispatchDocs = chsDispatchDocs;
        this.chsDispatchOpinions = chsDispatchOpinions;
    }

   
    // Property accessors
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
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
    
    @Column(name="THEME_WORD", length=100)

    public String getThemeWord() {
		return themeWord;
	}

	public void setThemeWord(String themeWord) {
		this.themeWord = themeWord;
	}
    
    @Column(name="ABSTRACT", length=200)

    public String getAbstract_() {
        return this.abstract_;
    }
    
   

	public void setAbstract_(String abstract_) {
        this.abstract_ = abstract_;
    }
    
    @Column(name="STATUS", length=1)

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="DRAFT_ORG", length=20)

    public String getDraftOrg() {
        return this.draftOrg;
    }
    
    public void setDraftOrg(String draftOrg) {
        this.draftOrg = draftOrg;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="DRAFT_TIME", length=7)

    public Date getDraftTime() {
        return this.draftTime;
    }
    
    public void setDraftTime(Date draftTime) {
        this.draftTime = draftTime;
    }
    
    @Column(name="DRAFT_PEOPLE", length=20)

    public String getDraftPeople() {
        return this.draftPeople;
    }
    
    public void setDraftPeople(String draftPeople) {
        this.draftPeople = draftPeople;
    }
    
    @Column(name="CLASSIFICATION", length=1)

    public String getClassification() {
        return this.classification;
    }
    
    public void setClassification(String classification) {
        this.classification = classification;
    }
    
    @Column(name="SECRECY_LEVEL", length=1)
    public String getSecrecyLevel() {
		return secrecyLevel;
	}

	public void setSecrecyLevel(String secrecyLevel) {
		this.secrecyLevel = secrecyLevel;
	}

	@Column(name="SECRECY_TERM", length=20)

    public String getSecrecyTerm() {
        return this.secrecyTerm;
    }
    
    public void setSecrecyTerm(String secrecyTerm) {
        this.secrecyTerm = secrecyTerm;
    }
    
    @Column(name="MATERIALITY_LEVEL", length=1)

    public String getMaterialityLevel() {
        return this.materialityLevel;
    }
    
    public void setMaterialityLevel(String materialityLevel) {
        this.materialityLevel = materialityLevel;
    }
    
    @Column(name="EMERGENCY_LEVEL", length=1)

    public String getEmergencyLevel() {
        return this.emergencyLevel;
    }
    
    public void setEmergencyLevel(String emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }
    
    @Column(name="DEAL_TERM", length=20)

    public String getDealTerm() {
        return this.dealTerm;
    }
    
    public void setDealTerm(String dealTerm) {
        this.dealTerm = dealTerm;
    }
    
    @Column(name="FILE_WORD", length=20)

    public String getFileWord() {
        return this.fileWord;
    }
    
    public void setFileWord(String fileWord) {
        this.fileWord = fileWord;
    }
    
    @Column(name="DOC_NO", length=20)

    public String getDocNo() {
        return this.docNo;
    }
    
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }
    
    @Column(name="SEND_ORG_ID", length=20)

    public String getSendOrgId() {
        return this.sendOrgId;
    }
    
    public void setSendOrgId(String sendOrgId) {
        this.sendOrgId = sendOrgId;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="SEND_TIME", length=7)

    public Date getSendTime() {
        return this.sendTime;
    }
    
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
    
    @Column(name="SENDER", length=20)

    public String getSender() {
        return this.sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    
    @Column(name="RECEIVE_ORG", length=20)

    public String getReceiveOrg() {
        return this.receiveOrg;
    }
    
    public void setReceiveOrg(String receiveOrg) {
        this.receiveOrg = receiveOrg;
    }
    
    @Column(name="CARBON_COPY", length=200)

    public String getCarbonCopy() {
        return this.carbonCopy;
    }
    
    public void setCarbonCopy(String carbonCopy) {
        this.carbonCopy = carbonCopy;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsDispatch")

    public Set<ChsDispatchDoc> getChsDispatchDocs() {
        return this.chsDispatchDocs;
    }
    
    public void setChsDispatchDocs(Set<ChsDispatchDoc> chsDispatchDocs) {
        this.chsDispatchDocs = chsDispatchDocs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsDispatch")

    public Set<ChsDispatchOpinion> getChsDispatchOpinions() {
        return this.chsDispatchOpinions;
    }
    
    public void setChsDispatchOpinions(Set<ChsDispatchOpinion> chsDispatchOpinions) {
        this.chsDispatchOpinions = chsDispatchOpinions;
    }
   








}