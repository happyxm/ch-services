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
 * ChsInfoInstruction entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_INFO_INSTRUCTION"
    ,schema="CH_COA"
)

public class ChsInfoInstruction  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsInfoCollection chsInfoCollection;
     private String content;
     private Date createTime;


    // Constructors

    /** default constructor */
    public ChsInfoInstruction() {
    }

	/** minimal constructor */
    public ChsInfoInstruction(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsInfoInstruction(String id, ChsInfoCollection chsInfoCollection, String content, Date createTime) {
        this.id = id;
        this.chsInfoCollection = chsInfoCollection;
        this.content = content;
        this.createTime = createTime;
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
        @JoinColumn(name="INFO_ID")

    public ChsInfoCollection getChsInfoCollection() {
        return this.chsInfoCollection;
    }
    
    public void setChsInfoCollection(ChsInfoCollection chsInfoCollection) {
        this.chsInfoCollection = chsInfoCollection;
    }
    
    @Column(name="CONTENT", length=200)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CREATE_TIME", length=7)

    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
   








}