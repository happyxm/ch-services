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
 * ChsReceiveOpinion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_RECEIVE_OPINION"
    ,schema="CH_COA"
)

public class ChsReceiveOpinion  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsReceive chsReceive;
     private String publisher;
     private String content;
     private Date publishTime;


    // Constructors

    /** default constructor */
    public ChsReceiveOpinion() {
    }

	/** minimal constructor */
    public ChsReceiveOpinion(String id, ChsReceive chsReceive) {
        this.id = id;
        this.chsReceive = chsReceive;
    }
    
    /** full constructor */
    public ChsReceiveOpinion(String id, ChsReceive chsReceive, String publisher, String content, Date publishTime) {
        this.id = id;
        this.chsReceive = chsReceive;
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
        @JoinColumn(name="DOC_ID", nullable=false)

    public ChsReceive getChsReceive() {
        return this.chsReceive;
    }
    
    public void setChsReceive(ChsReceive chsReceive) {
        this.chsReceive = chsReceive;
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