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
 * ChsInstitution entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_INSTITUTION"
    ,schema="CH_COA"
)

public class ChsInstitution  implements java.io.Serializable {


    // Fields    

     private String id;
     private String institutionType;
     private String name;
     private String content;
     private Set<ChsInstitutionAttach> chsInstitutionAttachs = new HashSet<ChsInstitutionAttach>(0);


    // Constructors

    /** default constructor */
    public ChsInstitution() {
    }

	/** minimal constructor */
    public ChsInstitution(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsInstitution(String id, String institutionType, String name, String content, Set<ChsInstitutionAttach> chsInstitutionAttachs) {
        this.id = id;
        this.institutionType = institutionType;
        this.name = name;
        this.content = content;
        this.chsInstitutionAttachs = chsInstitutionAttachs;
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
    
    @Column(name="INSTITUTION_TYPE", length=2)

    public String getInstitutionType() {
        return this.institutionType;
    }
    
    public void setInstitutionType(String institutionType) {
        this.institutionType = institutionType;
    }
    
    @Column(name="NAME", length=100)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="CONTENT", length=200)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsInstitution")

    public Set<ChsInstitutionAttach> getChsInstitutionAttachs() {
        return this.chsInstitutionAttachs;
    }
    
    public void setChsInstitutionAttachs(Set<ChsInstitutionAttach> chsInstitutionAttachs) {
        this.chsInstitutionAttachs = chsInstitutionAttachs;
    }
   








}