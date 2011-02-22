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
 * ChsIssue entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_ISSUE"
    ,schema="CH_COA"
)

public class ChsIssue  implements java.io.Serializable {


    // Fields    

     private String id;
     private String issueNo;
     private String title;
     private String content;
     private String draftOrg;
     private String drafter;
     private Date draftTime;
     private String fileForm;
     private String classification;
     private String secrecyTerm;
     private String materialityLevel;
     private String emergencyLevel;
     private String issueOrg;
     private String issuePeople;
     private Date issueTime;
     private String signOrg;
     private String signPeople;
     private String remark;
     private Set<ChsIssueOpinion> chsIssueOpinions = new HashSet<ChsIssueOpinion>(0);
     private Set<ChsIssueDoc> chsIssueDocs = new HashSet<ChsIssueDoc>(0);


    // Constructors

    /** default constructor */
    public ChsIssue() {
    }

	/** minimal constructor */
    public ChsIssue(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsIssue(String id, String issueNo, String title, String content, String draftOrg, String drafter, Date draftTime, String fileForm, String classification, String secrecyTerm, String materialityLevel, String emergencyLevel, String issueOrg, String issuePeople, Date issueTime, String signOrg, String signPeople, String remark, Set<ChsIssueOpinion> chsIssueOpinions, Set<ChsIssueDoc> chsIssueDocs) {
        this.id = id;
        this.issueNo = issueNo;
        this.title = title;
        this.content = content;
        this.draftOrg = draftOrg;
        this.drafter = drafter;
        this.draftTime = draftTime;
        this.fileForm = fileForm;
        this.classification = classification;
        this.secrecyTerm = secrecyTerm;
        this.materialityLevel = materialityLevel;
        this.emergencyLevel = emergencyLevel;
        this.issueOrg = issueOrg;
        this.issuePeople = issuePeople;
        this.issueTime = issueTime;
        this.signOrg = signOrg;
        this.signPeople = signPeople;
        this.remark = remark;
        this.chsIssueOpinions = chsIssueOpinions;
        this.chsIssueDocs = chsIssueDocs;
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
    
    @Column(name="ISSUE_NO", length=20)

    public String getIssueNo() {
        return this.issueNo;
    }
    
    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
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
    
    @Column(name="DRAFT_ORG", length=20)

    public String getDraftOrg() {
        return this.draftOrg;
    }
    
    public void setDraftOrg(String draftOrg) {
        this.draftOrg = draftOrg;
    }
    
    @Column(name="DRAFTER", length=20)

    public String getDrafter() {
        return this.drafter;
    }
    
    public void setDrafter(String drafter) {
        this.drafter = drafter;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="DRAFT_TIME", length=7)

    public Date getDraftTime() {
        return this.draftTime;
    }
    
    public void setDraftTime(Date draftTime) {
        this.draftTime = draftTime;
    }
    
    @Column(name="FILE_FORM", length=2)

    public String getFileForm() {
        return this.fileForm;
    }
    
    public void setFileForm(String fileForm) {
        this.fileForm = fileForm;
    }
    
    @Column(name="CLASSIFICATION", length=1)

    public String getClassification() {
        return this.classification;
    }
    
    public void setClassification(String classification) {
        this.classification = classification;
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
    
    @Column(name="ISSUE_ORG", length=20)

    public String getIssueOrg() {
        return this.issueOrg;
    }
    
    public void setIssueOrg(String issueOrg) {
        this.issueOrg = issueOrg;
    }
    
    @Column(name="ISSUE_PEOPLE", length=20)

    public String getIssuePeople() {
        return this.issuePeople;
    }
    
    public void setIssuePeople(String issuePeople) {
        this.issuePeople = issuePeople;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="ISSUE_TIME", length=7)

    public Date getIssueTime() {
        return this.issueTime;
    }
    
    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }
    
    @Column(name="SIGN_ORG", length=20)

    public String getSignOrg() {
        return this.signOrg;
    }
    
    public void setSignOrg(String signOrg) {
        this.signOrg = signOrg;
    }
    
    @Column(name="SIGN_PEOPLE", length=20)

    public String getSignPeople() {
        return this.signPeople;
    }
    
    public void setSignPeople(String signPeople) {
        this.signPeople = signPeople;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsIssue")

    public Set<ChsIssueOpinion> getChsIssueOpinions() {
        return this.chsIssueOpinions;
    }
    
    public void setChsIssueOpinions(Set<ChsIssueOpinion> chsIssueOpinions) {
        this.chsIssueOpinions = chsIssueOpinions;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsIssue")

    public Set<ChsIssueDoc> getChsIssueDocs() {
        return this.chsIssueDocs;
    }
    
    public void setChsIssueDocs(Set<ChsIssueDoc> chsIssueDocs) {
        this.chsIssueDocs = chsIssueDocs;
    }
   








}