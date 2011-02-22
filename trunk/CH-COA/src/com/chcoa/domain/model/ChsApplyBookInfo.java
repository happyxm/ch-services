package com.chcoa.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * ChsApplyBookInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_APPLY_BOOK_INFO"
    ,schema="CH_COA"
)

public class ChsApplyBookInfo  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsApplyAssets chsApplyAssets;
     private String name;
     private String author;
     private String isbn;
     private String unit;
     private Double price;
     private Double amount;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsApplyBookInfo() {
    }

	/** minimal constructor */
    public ChsApplyBookInfo(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsApplyBookInfo(String id, ChsApplyAssets chsApplyAssets, String name, String author, String isbn, String unit, Double price, Double amount, String remark) {
        this.id = id;
        this.chsApplyAssets = chsApplyAssets;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.unit = unit;
        this.price = price;
        this.amount = amount;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="APPLY_ID")

    public ChsApplyAssets getChsApplyAssets() {
        return this.chsApplyAssets;
    }
    
    public void setChsApplyAssets(ChsApplyAssets chsApplyAssets) {
        this.chsApplyAssets = chsApplyAssets;
    }
    
    @Column(name="NAME", length=100)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="AUTHOR", length=100)

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Column(name="ISBN", length=50)

    public String getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    @Column(name="UNIT", length=10)

    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    @Column(name="PRICE", precision=126, scale=0)

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Column(name="AMOUNT", precision=126, scale=0)

    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}