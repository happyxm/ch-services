package com.chcoa.domain.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * ChsCalendarAlert entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_CALENDAR_ALERT"
    ,schema="CH_COA"
)

public class ChsCalendarAlert  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsCalendar chsCalendar;
     private String alertType;
     private BigDecimal interval;
     private String alertRate;


    // Constructors

    /** default constructor */
    public ChsCalendarAlert() {
    }

	/** minimal constructor */
    public ChsCalendarAlert(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsCalendarAlert(String id, ChsCalendar chsCalendar, String alertType, BigDecimal interval, String alertRate) {
        this.id = id;
        this.chsCalendar = chsCalendar;
        this.alertType = alertType;
        this.interval = interval;
        this.alertRate = alertRate;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="CALENDAR_ID")

    public ChsCalendar getChsCalendar() {
        return this.chsCalendar;
    }
    
    public void setChsCalendar(ChsCalendar chsCalendar) {
        this.chsCalendar = chsCalendar;
    }
    
    @Column(name="ALERT_TYPE", length=1)

    public String getAlertType() {
        return this.alertType;
    }
    
    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }
    
    @Column(name="INTERVAL", precision=22, scale=0)

    public BigDecimal getInterval() {
        return this.interval;
    }
    
    public void setInterval(BigDecimal interval) {
        this.interval = interval;
    }
    
    @Column(name="ALERT_RATE", length=1)

    public String getAlertRate() {
        return this.alertRate;
    }
    
    public void setAlertRate(String alertRate) {
        this.alertRate = alertRate;
    }
   








}