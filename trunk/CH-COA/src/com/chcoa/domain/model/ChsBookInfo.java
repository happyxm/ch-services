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
 * ChsBookInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_BOOK_INFO"
    ,schema="CH_COA"
)

public class ChsBookInfo  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsBookClassify chsBookClassify;
     private String bookName;
     private String author;
     private String isbn;
     private BigDecimal page;
     private String publishingHouse;
     private Date publicationTime;
     private BigDecimal words;
     private Double price;
     private String storageAddr;
     private String orgId;
     private BigDecimal counts;
     private Date createTime;
     private String remark;


    // Constructors

    /** default constructor */
    public ChsBookInfo() {
    }

	/** minimal constructor */
    public ChsBookInfo(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsBookInfo(String id, ChsBookClassify chsBookClassify, String bookName, String author, String isbn, BigDecimal page, String publishingHouse, Date publicationTime, BigDecimal words, Double price, String storageAddr, String orgId, BigDecimal counts, Date createTime, String remark) {
        this.id = id;
        this.chsBookClassify = chsBookClassify;
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.page = page;
        this.publishingHouse = publishingHouse;
        this.publicationTime = publicationTime;
        this.words = words;
        this.price = price;
        this.storageAddr = storageAddr;
        this.orgId = orgId;
        this.counts = counts;
        this.createTime = createTime;
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
        @JoinColumn(name="CLASSIFY_ID")

    public ChsBookClassify getChsBookClassify() {
        return this.chsBookClassify;
    }
    
    public void setChsBookClassify(ChsBookClassify chsBookClassify) {
        this.chsBookClassify = chsBookClassify;
    }
    
    @Column(name="BOOK_NAME", length=100)

    public String getBookName() {
        return this.bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    @Column(name="AUTHOR", length=100)

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Column(name="ISBN", length=100)

    public String getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    @Column(name="PAGE", precision=22, scale=0)

    public BigDecimal getPage() {
        return this.page;
    }
    
    public void setPage(BigDecimal page) {
        this.page = page;
    }
    
    @Column(name="PUBLISHING_HOUSE", length=50)

    public String getPublishingHouse() {
        return this.publishingHouse;
    }
    
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="PUBLICATION_TIME", length=7)

    public Date getPublicationTime() {
        return this.publicationTime;
    }
    
    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }
    
    @Column(name="WORDS", precision=22, scale=0)

    public BigDecimal getWords() {
        return this.words;
    }
    
    public void setWords(BigDecimal words) {
        this.words = words;
    }
    
    @Column(name="PRICE", precision=126, scale=0)

    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Column(name="STORAGE_ADDR", length=50)

    public String getStorageAddr() {
        return this.storageAddr;
    }
    
    public void setStorageAddr(String storageAddr) {
        this.storageAddr = storageAddr;
    }
    
    @Column(name="ORG_ID", length=20)

    public String getOrgId() {
        return this.orgId;
    }
    
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
    
    @Column(name="COUNTS", precision=22, scale=0)

    public BigDecimal getCounts() {
        return this.counts;
    }
    
    public void setCounts(BigDecimal counts) {
        this.counts = counts;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CREATE_TIME", length=7)

    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}