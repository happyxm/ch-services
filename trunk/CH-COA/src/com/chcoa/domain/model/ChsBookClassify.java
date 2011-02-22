package com.chcoa.domain.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * ChsBookClassify entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_BOOK_CLASSIFY"
    ,schema="CH_COA"
)

public class ChsBookClassify  implements java.io.Serializable {


    // Fields    

     private String id;
     private String name;
     private String remark;
     private Set<ChsBookInfo> chsBookInfos = new HashSet<ChsBookInfo>(0);


    // Constructors

    /** default constructor */
    public ChsBookClassify() {
    }

	/** minimal constructor */
    public ChsBookClassify(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsBookClassify(String id, String name, String remark, Set<ChsBookInfo> chsBookInfos) {
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.chsBookInfos = chsBookInfos;
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
    
    @Column(name="NAME", length=100)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsBookClassify")

    public Set<ChsBookInfo> getChsBookInfos() {
        return this.chsBookInfos;
    }
    
    public void setChsBookInfos(Set<ChsBookInfo> chsBookInfos) {
        this.chsBookInfos = chsBookInfos;
    }
   








}