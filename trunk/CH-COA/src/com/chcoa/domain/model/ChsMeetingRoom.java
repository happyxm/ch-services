package com.chcoa.domain.model;

import java.math.BigDecimal;
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
 * ChsMeetingRoom entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_MEETING_ROOM"
    ,schema="CH_COA"
)

public class ChsMeetingRoom  implements java.io.Serializable {


    // Fields    

     private String id;
     private String name;
     private String type;
     private String address;
     private BigDecimal accommodate;
     private String remark;
     private Set<ChsMeeting> chsMeetings = new HashSet<ChsMeeting>(0);


    // Constructors

    /** default constructor */
    public ChsMeetingRoom() {
    }

	/** minimal constructor */
    public ChsMeetingRoom(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsMeetingRoom(String id, String name, String type, String address, BigDecimal accommodate, String remark, Set<ChsMeeting> chsMeetings) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.accommodate = accommodate;
        this.remark = remark;
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
    
    @Column(name="TYPE", length=2)

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="ADDRESS", length=100)

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="ACCOMMODATE", precision=22, scale=0)

    public BigDecimal getAccommodate() {
        return this.accommodate;
    }
    
    public void setAccommodate(BigDecimal accommodate) {
        this.accommodate = accommodate;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsMeetingRoom")

    public Set<ChsMeeting> getChsMeetings() {
        return this.chsMeetings;
    }
    
    public void setChsMeetings(Set<ChsMeeting> chsMeetings) {
        this.chsMeetings = chsMeetings;
    }
   








}