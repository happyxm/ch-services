package com.chcoa.domain.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsCalendar entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_CALENDAR"
    ,schema="CH_COA"
)

public class ChsCalendar  implements java.io.Serializable {


    // Fields    

     private String id;
     private String title;
     private String type;
     private Date beginTime;
     private Date endTime;
     private String address;
     private String nature;
     private String status;
     private String repeat;
     private String rate;
     private Set<ChsCalendarAlert> chsCalendarAlerts = new HashSet<ChsCalendarAlert>(0);


    // Constructors

    /** default constructor */
    public ChsCalendar() {
    }

	/** minimal constructor */
    public ChsCalendar(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsCalendar(String id, String title, String type, Date beginTime, Date endTime, String address, String nature, String status, String repeat, String rate, Set<ChsCalendarAlert> chsCalendarAlerts) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.address = address;
        this.nature = nature;
        this.status = status;
        this.repeat = repeat;
        this.rate = rate;
        this.chsCalendarAlerts = chsCalendarAlerts;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="ID", unique=true, nullable=false, length=32)

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Column(name="TITLE", length=100)

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Column(name="TYPE", length=2)

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="BEGIN_TIME", length=7)

    public Date getBeginTime() {
        return this.beginTime;
    }
    
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="END_TIME", length=7)

    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    @Column(name="ADDRESS", length=200)

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="NATURE", length=2)

    public String getNature() {
        return this.nature;
    }
    
    public void setNature(String nature) {
        this.nature = nature;
    }
    
    @Column(name="STATUS", length=1)

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="REPEAT", length=1)

    public String getRepeat() {
        return this.repeat;
    }
    
    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }
    
    @Column(name="RATE", length=100)

    public String getRate() {
        return this.rate;
    }
    
    public void setRate(String rate) {
        this.rate = rate;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsCalendar")

    public Set<ChsCalendarAlert> getChsCalendarAlerts() {
        return this.chsCalendarAlerts;
    }
    
    public void setChsCalendarAlerts(Set<ChsCalendarAlert> chsCalendarAlerts) {
        this.chsCalendarAlerts = chsCalendarAlerts;
    }
   








}