package com.chcoa.domain.model;

import java.math.BigDecimal;
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
 * ChsReceiveDoc entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_RECEIVE_DOC"
    ,schema="CH_COA"
)

public class ChsReceiveDoc  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsReceive chsReceive;
     private String type;
     private String name;
     private String path;
     private BigDecimal size;
     private Date createTime;
     private String isValid;


    // Constructors

    /** default constructor */
    public ChsReceiveDoc() {
    }

	/** minimal constructor */
    public ChsReceiveDoc(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsReceiveDoc(String id, ChsReceive chsReceive, String type, String name, String path, BigDecimal size, Date createTime, String isValid) {
        this.id = id;
        this.chsReceive = chsReceive;
        this.type = type;
        this.name = name;
        this.path = path;
        this.size = size;
        this.createTime = createTime;
        this.isValid = isValid;
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
        @JoinColumn(name="DOC_ID")

    public ChsReceive getChsReceive() {
        return this.chsReceive;
    }
    
    public void setChsReceive(ChsReceive chsReceive) {
        this.chsReceive = chsReceive;
    }
    
    @Column(name="TYPE", length=2)

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="NAME", length=100)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="PATH", length=200)

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    
    @Column(name="SIZE", precision=22, scale=0)

    public BigDecimal getSize() {
        return this.size;
    }
    
    public void setSize(BigDecimal size) {
        this.size = size;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CREATE_TIME", length=7)

    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="IS_VALID", length=1)

    public String getIsValid() {
        return this.isValid;
    }
    
    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
   








}