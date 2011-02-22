package com.chcoa.domain.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * ChsMeetingSupplies entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_MEETING_SUPPLIES"
    ,schema="CH_COA"
)

public class ChsMeetingSupplies  implements java.io.Serializable {


    // Fields    

     private String id;
     private String name;
     private BigDecimal num;
     private Set<ChsMeeting> chsMeetings = new HashSet<ChsMeeting>(0);


    // Constructors

    /** default constructor */
    public ChsMeetingSupplies() {
    }

	/** minimal constructor */
    public ChsMeetingSupplies(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsMeetingSupplies(String id, String name, BigDecimal num, Set<ChsMeeting> chsMeetings) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.chsMeetings = chsMeetings;
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
    
    @Column(name="NUM", precision=22, scale=0)

    public BigDecimal getNum() {
        return this.num;
    }
    
    public void setNum(BigDecimal num) {
        this.num = num;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name="CHS_MEETING_SUPPLIES_ASSIGN", schema="CH_COA", joinColumns = { 
        @JoinColumn(name="MEETING_SUPPLIES_ID", updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="MEETING_ID", updatable=false) })

    public Set<ChsMeeting> getChsMeetings() {
        return this.chsMeetings;
    }
    
    public void setChsMeetings(Set<ChsMeeting> chsMeetings) {
        this.chsMeetings = chsMeetings;
    }
   








}