package com.chcoa.domain.model;

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * ChsMetadata entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_METADATA"
    ,schema="CH_COA"
)

public class ChsMetadata  implements java.io.Serializable {


    // Fields    

     private ChsMetadataId id;
     private ChsMetadataGroup chsMetadataGroup;
     private String metaName;
     private BigDecimal orderNum;
     private String isEditable;
     private String isDefault;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsMetadata() {
    }

	/** minimal constructor */
    public ChsMetadata(ChsMetadataId id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsMetadata(ChsMetadataId id, ChsMetadataGroup chsMetadataGroup, String metaName, BigDecimal orderNum, String isEditable, String isDefault, String remark) {
        this.id = id;
        this.chsMetadataGroup = chsMetadataGroup;
        this.metaName = metaName;
        this.orderNum = orderNum;
        this.isEditable = isEditable;
        this.isDefault = isDefault;
        this.remark = remark;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="metaCode", column=@Column(name="META_CODE", nullable=false, length=20) ), 
        @AttributeOverride(name="metaValue", column=@Column(name="META_VALUE", nullable=false, length=20) ) } )

    public ChsMetadataId getId() {
        return this.id;
    }
    
    public void setId(ChsMetadataId id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="META_GROUP")

    public ChsMetadataGroup getChsMetadataGroup() {
        return this.chsMetadataGroup;
    }
    
    public void setChsMetadataGroup(ChsMetadataGroup chsMetadataGroup) {
        this.chsMetadataGroup = chsMetadataGroup;
    }
    
    @Column(name="META_NAME", length=20)

    public String getMetaName() {
        return this.metaName;
    }
    
    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }
    
    @Column(name="ORDER_NUM", precision=22, scale=0)

    public BigDecimal getOrderNum() {
        return this.orderNum;
    }
    
    public void setOrderNum(BigDecimal orderNum) {
        this.orderNum = orderNum;
    }
    
    @Column(name="IS_EDITABLE", length=1)

    public String getIsEditable() {
        return this.isEditable;
    }
    
    public void setIsEditable(String isEditable) {
        this.isEditable = isEditable;
    }
    
    @Column(name="IS_DEFAULT", length=1)

    public String getIsDefault() {
        return this.isDefault;
    }
    
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
    
    @Column(name="REMARK", length=50)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}