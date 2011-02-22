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
 * ChsInstitutionAttach entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_INSTITUTION_ATTACH"
    ,schema="CH_COA"
)

public class ChsInstitutionAttach  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsInstitution chsInstitution;
     private String name;
     private BigDecimal size;
     private String path;
     private Date createTime;


    // Constructors

    /** default constructor */
    public ChsInstitutionAttach() {
    }

	/** minimal constructor */
    public ChsInstitutionAttach(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsInstitutionAttach(String id, ChsInstitution chsInstitution, String name, BigDecimal size, String path, Date createTime) {
        this.id = id;
        this.chsInstitution = chsInstitution;
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
        @JoinColumn(name="INSTITUTION_ID")

    public ChsInstitution getChsInstitution() {
        return this.chsInstitution;
    }
    
    public void setChsInstitution(ChsInstitution chsInstitution) {
        this.chsInstitution = chsInstitution;
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