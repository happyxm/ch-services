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
 * ChsFixedAssetsClassify entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_FIXED_ASSETS_CLASSIFY"
    ,schema="CH_COA"
)

public class ChsFixedAssetsClassify  implements java.io.Serializable {


    // Fields    

     private String id;
     private String name;
     private String remark;
     private Set<ChsFixedAssetsInfo> chsFixedAssetsInfos = new HashSet<ChsFixedAssetsInfo>(0);


    // Constructors

    /** default constructor */
    public ChsFixedAssetsClassify() {
    }

	/** minimal constructor */
    public ChsFixedAssetsClassify(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsFixedAssetsClassify(String id, String name, String remark, Set<ChsFixedAssetsInfo> chsFixedAssetsInfos) {
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.chsFixedAssetsInfos = chsFixedAssetsInfos;
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
    
    @Column(name="NAME", length=50)

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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsFixedAssetsClassify")

    public Set<ChsFixedAssetsInfo> getChsFixedAssetsInfos() {
        return this.chsFixedAssetsInfos;
    }
    
    public void setChsFixedAssetsInfos(Set<ChsFixedAssetsInfo> chsFixedAssetsInfos) {
        this.chsFixedAssetsInfos = chsFixedAssetsInfos;
    }
   








}