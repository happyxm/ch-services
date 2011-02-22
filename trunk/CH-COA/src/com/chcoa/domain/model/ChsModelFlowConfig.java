package com.chcoa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * ChsModelFlowConfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_MODEL_FLOW_CONFIG"
    ,schema="CH_COA"
)

public class ChsModelFlowConfig  implements java.io.Serializable {


    // Fields    

     private String id;
     private String medule;
     private String fileType;
     private String flow;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsModelFlowConfig() {
    }

	/** minimal constructor */
    public ChsModelFlowConfig(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsModelFlowConfig(String id, String medule, String fileType, String flow, String remark) {
        this.id = id;
        this.medule = medule;
        this.fileType = fileType;
        this.flow = flow;
        this.remark = remark;
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
    
    @Column(name="MEDULE", length=20)

    public String getMedule() {
        return this.medule;
    }
    
    public void setMedule(String medule) {
        this.medule = medule;
    }
    
    @Column(name="FILE_TYPE", length=1)

    public String getFileType() {
        return this.fileType;
    }
    
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    
    @Column(name="FLOW", length=20)

    public String getFlow() {
        return this.flow;
    }
    
    public void setFlow(String flow) {
        this.flow = flow;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}