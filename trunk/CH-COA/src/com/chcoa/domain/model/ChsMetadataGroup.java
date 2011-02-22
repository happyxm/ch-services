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
 * ChsMetadataGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_METADATA_GROUP"
    ,schema="CH_COA"
)

public class ChsMetadataGroup  implements java.io.Serializable {


    // Fields    

     private String metaGroup;
     private String metaGroupName;
     private String defaultValue;
     private String isEdit;
     private String remark;
     private Set<ChsMetadata> chsMetadatas = new HashSet<ChsMetadata>(0);


    // Constructors

    /** default constructor */
    public ChsMetadataGroup() {
    }

	/** minimal constructor */
    public ChsMetadataGroup(String metaGroup) {
        this.metaGroup = metaGroup;
    }
    
    /** full constructor */
    public ChsMetadataGroup(String metaGroup, String metaGroupName, String defaultValue, String isEdit, String remark, Set<ChsMetadata> chsMetadatas) {
        this.metaGroup = metaGroup;
        this.metaGroupName = metaGroupName;
        this.defaultValue = defaultValue;
        this.isEdit = isEdit;
        this.remark = remark;
        this.chsMetadatas = chsMetadatas;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="META_GROUP", unique=true, nullable=false, length=20)

    public String getMetaGroup() {
        return this.metaGroup;
    }
    
    public void setMetaGroup(String metaGroup) {
        this.metaGroup = metaGroup;
    }
    
    @Column(name="META_GROUP_NAME", length=20)

    public String getMetaGroupName() {
        return this.metaGroupName;
    }
    
    public void setMetaGroupName(String metaGroupName) {
        this.metaGroupName = metaGroupName;
    }
    
    @Column(name="DEFAULT_VALUE", length=20)

    public String getDefaultValue() {
        return this.defaultValue;
    }
    
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    @Column(name="IS_EDIT", length=1)

    public String getIsEdit() {
        return this.isEdit;
    }
    
    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit;
    }
    
    @Column(name="REMARK", length=50)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsMetadataGroup")

    public Set<ChsMetadata> getChsMetadatas() {
        return this.chsMetadatas;
    }
    
    public void setChsMetadatas(Set<ChsMetadata> chsMetadatas) {
        this.chsMetadatas = chsMetadatas;
    }
   








}