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
 * ChsOfficeSuppliesClassify entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_OFFICE_SUPPLIES_CLASSIFY"
    ,schema="CH_COA"
)

public class ChsOfficeSuppliesClassify  implements java.io.Serializable {


    // Fields    

     private String id;
     private String name;
     private String remar;
     private Set<ChsOfficeSupplies> chsOfficeSupplieses = new HashSet<ChsOfficeSupplies>(0);


    // Constructors

    /** default constructor */
    public ChsOfficeSuppliesClassify() {
    }

	/** minimal constructor */
    public ChsOfficeSuppliesClassify(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsOfficeSuppliesClassify(String id, String name, String remar, Set<ChsOfficeSupplies> chsOfficeSupplieses) {
        this.id = id;
        this.name = name;
        this.remar = remar;
        this.chsOfficeSupplieses = chsOfficeSupplieses;
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
    
    @Column(name="REMAR", length=100)

    public String getRemar() {
        return this.remar;
    }
    
    public void setRemar(String remar) {
        this.remar = remar;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsOfficeSuppliesClassify")

    public Set<ChsOfficeSupplies> getChsOfficeSupplieses() {
        return this.chsOfficeSupplieses;
    }
    
    public void setChsOfficeSupplieses(Set<ChsOfficeSupplies> chsOfficeSupplieses) {
        this.chsOfficeSupplieses = chsOfficeSupplieses;
    }
   








}