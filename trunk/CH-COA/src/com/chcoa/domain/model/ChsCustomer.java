package com.chcoa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * ChsCustomer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_CUSTOMER"
    ,schema="CH_COA"
)

public class ChsCustomer  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsApplyGift chsApplyGift;
     private String name;
     private String company;
     private String tel;
     private String position;


    // Constructors

    /** default constructor */
    public ChsCustomer() {
    }

	/** minimal constructor */
    public ChsCustomer(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsCustomer(String id, ChsApplyGift chsApplyGift, String name, String company, String tel, String position) {
        this.id = id;
        this.chsApplyGift = chsApplyGift;
        this.name = name;
        this.company = company;
        this.tel = tel;
        this.position = position;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="APPLY_ID")

    public ChsApplyGift getChsApplyGift() {
        return this.chsApplyGift;
    }
    
    public void setChsApplyGift(ChsApplyGift chsApplyGift) {
        this.chsApplyGift = chsApplyGift;
    }
    
    @Column(name="NAME", length=50)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="COMPANY", length=50)

    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    @Column(name="TEL", length=20)

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    @Column(name="POSITION", length=50)

    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
   








}