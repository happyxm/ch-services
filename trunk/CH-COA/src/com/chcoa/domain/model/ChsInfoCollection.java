package com.chcoa.domain.model;

import java.math.BigDecimal;
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
 * ChsInfoCollection entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_INFO_COLLECTION"
    ,schema="CH_COA"
)

public class ChsInfoCollection  implements java.io.Serializable {


    // Fields    

     private String id;
     private String title;
     private String themeWord;
     private String content;
     private String status;
     private String journalType;
     private String useLevel;
     private String classification;
     private String isBulletin;
     private String sendOrg;
     private String sendPerson;
     private Date sendTime;
     private String operator;
     private Date dealTime;
     private String dealOpinion;
     private String isUse;
     private String useInfo;
     private BigDecimal aword;
     private String sendStatus;
     private Set<ChsInfoInstruction> chsInfoInstructions = new HashSet<ChsInfoInstruction>(0);
     private Set<ChsInfoCollectionAttach> chsInfoCollectionAttachs = new HashSet<ChsInfoCollectionAttach>(0);


    // Constructors

    /** default constructor */
    public ChsInfoCollection() {
    }

	/** minimal constructor */
    public ChsInfoCollection(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsInfoCollection(String id, String title, String themeWord, String content, String status, String journalType, String useLevel, String classification, String isBulletin, String sendOrg, String sendPerson, Date sendTime, String operator, Date dealTime, String dealOpinion, String isUse, String useInfo, BigDecimal aword, String sendStatus, Set<ChsInfoInstruction> chsInfoInstructions, Set<ChsInfoCollectionAttach> chsInfoCollectionAttachs) {
        this.id = id;
        this.title = title;
        this.themeWord = themeWord;
        this.content = content;
        this.status = status;
        this.journalType = journalType;
        this.useLevel = useLevel;
        this.classification = classification;
        this.isBulletin = isBulletin;
        this.sendOrg = sendOrg;
        this.sendPerson = sendPerson;
        this.sendTime = sendTime;
        this.operator = operator;
        this.dealTime = dealTime;
        this.dealOpinion = dealOpinion;
        this.isUse = isUse;
        this.useInfo = useInfo;
        this.aword = aword;
        this.sendStatus = sendStatus;
        this.chsInfoInstructions = chsInfoInstructions;
        this.chsInfoCollectionAttachs = chsInfoCollectionAttachs;
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
    
    @Column(name="THEME_WORD", length=100)

    public String getThemeWord() {
        return this.themeWord;
    }
    
    public void setThemeWord(String themeWord) {
        this.themeWord = themeWord;
    }
    
    @Column(name="CONTENT", length=200)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="STATUS", length=1)

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="JOURNAL_TYPE", length=2)

    public String getJournalType() {
        return this.journalType;
    }
    
    public void setJournalType(String journalType) {
        this.journalType = journalType;
    }
    
    @Column(name="USE_LEVEL", length=1)

    public String getUseLevel() {
        return this.useLevel;
    }
    
    public void setUseLevel(String useLevel) {
        this.useLevel = useLevel;
    }
    
    @Column(name="CLASSIFICATION", length=1)

    public String getClassification() {
        return this.classification;
    }
    
    public void setClassification(String classification) {
        this.classification = classification;
    }
    
    @Column(name="IS_BULLETIN", length=1)

    public String getIsBulletin() {
        return this.isBulletin;
    }
    
    public void setIsBulletin(String isBulletin) {
        this.isBulletin = isBulletin;
    }
    
    @Column(name="SEND_ORG", length=20)

    public String getSendOrg() {
        return this.sendOrg;
    }
    
    public void setSendOrg(String sendOrg) {
        this.sendOrg = sendOrg;
    }
    
    @Column(name="SEND_PERSON", length=20)

    public String getSendPerson() {
        return this.sendPerson;
    }
    
    public void setSendPerson(String sendPerson) {
        this.sendPerson = sendPerson;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="SEND_TIME", length=7)

    public Date getSendTime() {
        return this.sendTime;
    }
    
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
    
    @Column(name="OPERATOR", length=20)

    public String getOperator() {
        return this.operator;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="DEAL_TIME", length=7)

    public Date getDealTime() {
        return this.dealTime;
    }
    
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
    
    @Column(name="DEAL_OPINION", length=100)

    public String getDealOpinion() {
        return this.dealOpinion;
    }
    
    public void setDealOpinion(String dealOpinion) {
        this.dealOpinion = dealOpinion;
    }
    
    @Column(name="IS_USE", length=1)

    public String getIsUse() {
        return this.isUse;
    }
    
    public void setIsUse(String isUse) {
        this.isUse = isUse;
    }
    
    @Column(name="USE_INFO", length=100)

    public String getUseInfo() {
        return this.useInfo;
    }
    
    public void setUseInfo(String useInfo) {
        this.useInfo = useInfo;
    }
    
    @Column(name="AWORD", precision=22, scale=0)

    public BigDecimal getAword() {
        return this.aword;
    }
    
    public void setAword(BigDecimal aword) {
        this.aword = aword;
    }
    
    @Column(name="SEND_STATUS", length=1)

    public String getSendStatus() {
        return this.sendStatus;
    }
    
    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsInfoCollection")

    public Set<ChsInfoInstruction> getChsInfoInstructions() {
        return this.chsInfoInstructions;
    }
    
    public void setChsInfoInstructions(Set<ChsInfoInstruction> chsInfoInstructions) {
        this.chsInfoInstructions = chsInfoInstructions;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsInfoCollection")

    public Set<ChsInfoCollectionAttach> getChsInfoCollectionAttachs() {
        return this.chsInfoCollectionAttachs;
    }
    
    public void setChsInfoCollectionAttachs(Set<ChsInfoCollectionAttach> chsInfoCollectionAttachs) {
        this.chsInfoCollectionAttachs = chsInfoCollectionAttachs;
    }
   








}