package com.chcoa.domain.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsIssueOpinion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_ISSUE_OPINION"
    ,schema="CH_COA"
)

public class ChsIssueOpinion  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsIssue chsIssue;
     private String publisher;
     private String content;
     private Date publishTime;


    // Constructors

    /** default constructor */
    public ChsIssueOpinion() {
    }

	/** minimal constructor */
    public ChsIssueOpinion(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsIssueOpinion(String id, ChsIssue chsIssue, String publisher, String content, Date publishTime) {
        this.id = id;
        this.chsIssue = chsIssue;
        this.publisher = publisher;
        this.content = content;
        this.publishTime = publishTime;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID", unique=true, nullable=false, length=32)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ISSUE_ID")

    public ChsIssue getChsIssue() {
        return this.chsIssue;
    }
    
    public void setChsIssue(ChsIssue chsIssue) {
        this.chsIssue = chsIssue;
    }
    
    @Column(name="PUBLISHER", length=20)

    public String getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    @Column(name="CONTENT", length=200)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="PUBLISH_TIME", length=7)

    public Date getPublishTime() {
        return this.publishTime;
    }
    
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
   








}