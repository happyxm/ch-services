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
 * ChsReceive entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_RECEIVE"
    ,schema="CH_COA"
)

public class ChsReceive  implements java.io.Serializable {


    // Fields    

     private String id;
     private String receiveNo;
     private String type;
     private String fileWord;
     private Date sendTime;
     private String receiveOrg;
     private Date receiveTime;
     private String receiver;
     private String sendOrg;
     private String sender;
     private String title;
     private String fileSecurecy;
     private String securecyTerm;
     private String materialityLevel;
     private String emergencyLevel;
     private String dealTerm;
     private String abstract_;
     private String remark;
     private Set<ChsReceiveDoc> chsReceiveDocs = new HashSet<ChsReceiveDoc>(0);
     private Set<ChsReceiveOpinion> chsReceiveOpinions = new HashSet<ChsReceiveOpinion>(0);


    // Constructors

    /** default constructor */
    public ChsReceive() {
    }

	/** minimal constructor */
    public ChsReceive(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsReceive(String id, String receiveNo, String type, String fileWord, Date sendTime, String receiveOrg, Date receiveTime, String receiver, String sendOrg, String sender, String title, String fileSecurecy, String securecyTerm, String materialityLevel, String emergencyLevel, String dealTerm, String abstract_, String remark, Set<ChsReceiveDoc> chsReceiveDocs, Set<ChsReceiveOpinion> chsReceiveOpinions) {
        this.id = id;
        this.receiveNo = receiveNo;
        this.type = type;
        this.fileWord = fileWord;
        this.sendTime = sendTime;
        this.receiveOrg = receiveOrg;
        this.receiveTime = receiveTime;
        this.receiver = receiver;
        this.sendOrg = sendOrg;
        this.sender = sender;
        this.title = title;
        this.fileSecurecy = fileSecurecy;
        this.securecyTerm = securecyTerm;
        this.materialityLevel = materialityLevel;
        this.emergencyLevel = emergencyLevel;
        this.dealTerm = dealTerm;
        this.abstract_ = abstract_;
        this.remark = remark;
        this.chsReceiveDocs = chsReceiveDocs;
        this.chsReceiveOpinions = chsReceiveOpinions;
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
    
    @Column(name="RECEIVE_NO", length=20)

    public String getReceiveNo() {
        return this.receiveNo;
    }
    
    public void setReceiveNo(String receiveNo) {
        this.receiveNo = receiveNo;
    }
    
    @Column(name="TYPE", length=2)

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="FILE_WORD", length=20)

    public String getFileWord() {
        return this.fileWord;
    }
    
    public void setFileWord(String fileWord) {
        this.fileWord = fileWord;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="SEND_TIME", length=7)

    public Date getSendTime() {
        return this.sendTime;
    }
    
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
    
    @Column(name="RECEIVE_ORG", length=20)

    public String getReceiveOrg() {
        return this.receiveOrg;
    }
    
    public void setReceiveOrg(String receiveOrg) {
        this.receiveOrg = receiveOrg;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="RECEIVE_TIME", length=7)

    public Date getReceiveTime() {
        return this.receiveTime;
    }
    
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }
    
    @Column(name="RECEIVER", length=20)

    public String getReceiver() {
        return this.receiver;
    }
    
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    
    @Column(name="SEND_ORG", length=20)

    public String getSendOrg() {
        return this.sendOrg;
    }
    
    public void setSendOrg(String sendOrg) {
        this.sendOrg = sendOrg;
    }
    
    @Column(name="SENDER", length=20)

    public String getSender() {
        return this.sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    
    @Column(name="TITLE", length=100)

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="FILE_SECURECY", length=1)

    public String getFileSecurecy() {
        return this.fileSecurecy;
    }
    
    public void setFileSecurecy(String fileSecurecy) {
        this.fileSecurecy = fileSecurecy;
    }
    
    @Column(name="SECURECY_TERM", length=20)

    public String getSecurecyTerm() {
        return this.securecyTerm;
    }
    
    public void setSecurecyTerm(String securecyTerm) {
        this.securecyTerm = securecyTerm;
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
    
    @Column(name="ABSTRACT", length=200)

    public String getAbstract_() {
        return this.abstract_;
    }
    
    public void setAbstract_(String abstract_) {
        this.abstract_ = abstract_;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsReceive")

    public Set<ChsReceiveDoc> getChsReceiveDocs() {
        return this.chsReceiveDocs;
    }
    
    public void setChsReceiveDocs(Set<ChsReceiveDoc> chsReceiveDocs) {
        this.chsReceiveDocs = chsReceiveDocs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsReceive")

    public Set<ChsReceiveOpinion> getChsReceiveOpinions() {
        return this.chsReceiveOpinions;
    }
    
    public void setChsReceiveOpinions(Set<ChsReceiveOpinion> chsReceiveOpinions) {
        this.chsReceiveOpinions = chsReceiveOpinions;
    }
   








}