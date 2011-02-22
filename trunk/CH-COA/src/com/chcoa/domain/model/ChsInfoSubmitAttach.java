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
 * ChsInfoSubmitAttach entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_INFO_SUBMIT_ATTACH"
    ,schema="CH_COA"
)

public class ChsInfoSubmitAttach  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsInfoSubmit chsInfoSubmit;
     private String name;
     private BigDecimal size;
     private String path;
     private Date createTime;


    // Constructors

    /** default constructor */
    public ChsInfoSubmitAttach() {
    }

	/** minimal constructor */
    public ChsInfoSubmitAttach(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsInfoSubmitAttach(String id, ChsInfoSubmit chsInfoSubmit, String name, BigDecimal size, String path, Date createTime) {
        this.id = id;
        this.chsInfoSubmit = chsInfoSubmit;
        this.name = name;
        this.size = size;
        this.path = path;
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

    public ChsInfoSubmit getChsInfoSubmit() {
        return this.chsInfoSubmit;
    }
    
    public void setChsInfoSubmit(ChsInfoSubmit chsInfoSubmit) {
        this.chsInfoSubmit = chsInfoSubmit;
    }
    
    @Column(name="NAME", length=100)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="SIZE", precision=22, scale=0)

    public BigDecimal getSize() {
        return this.size;
    }
    
    public void setSize(BigDecimal size) {
        this.size = size;
    }
    
    @Column(name="PATH", length=200)

    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
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