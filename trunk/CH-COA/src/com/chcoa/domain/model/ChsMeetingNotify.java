package com.chcoa.domain.model;

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
 * ChsMeetingNotify entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_MEETING_NOTIFY"
    ,schema="CH_COA"
)

public class ChsMeetingNotify  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsMeeting chsMeeting;
     private String notifyPeople;
     private Date createTime;
     private String meetingTitle;
     private String meetingContent;
     private String meetingAddress;
     private Date beginTime;
     private Date endTime;
     private String contactPersion;
     private String isRead;
     private String isFeedback;


    // Constructors

    /** default constructor */
    public ChsMeetingNotify() {
    }

	/** minimal constructor */
    public ChsMeetingNotify(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsMeetingNotify(String id, ChsMeeting chsMeeting, String notifyPeople, Date createTime, String meetingTitle, String meetingContent, String meetingAddress, Date beginTime, Date endTime, String contactPersion, String isRead, String isFeedback) {
        this.id = id;
        this.chsMeeting = chsMeeting;
        this.notifyPeople = notifyPeople;
        this.createTime = createTime;
        this.meetingTitle = meetingTitle;
        this.meetingContent = meetingContent;
        this.meetingAddress = meetingAddress;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.contactPersion = contactPersion;
        this.isRead = isRead;
        this.isFeedback = isFeedback;
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
        @JoinColumn(name="MEETING_ID")

    public ChsMeeting getChsMeeting() {
        return this.chsMeeting;
    }
    
    public void setChsMeeting(ChsMeeting chsMeeting) {
        this.chsMeeting = chsMeeting;
    }
    
    @Column(name="NOTIFY_PEOPLE", length=500)

    public String getNotifyPeople() {
        return this.notifyPeople;
    }
    
    public void setNotifyPeople(String notifyPeople) {
        this.notifyPeople = notifyPeople;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="CREATE_TIME", length=7)

    public Date getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    @Column(name="MEETING_TITLE", length=100)

    public String getMeetingTitle() {
        return this.meetingTitle;
    }
    
    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }
    
    @Column(name="MEETING_CONTENT", length=500)

    public String getMeetingContent() {
        return this.meetingContent;
    }
    
    public void setMeetingContent(String meetingContent) {
        this.meetingContent = meetingContent;
    }
    
    @Column(name="MEETING_ADDRESS", length=100)

    public String getMeetingAddress() {
        return this.meetingAddress;
    }
    
    public void setMeetingAddress(String meetingAddress) {
        this.meetingAddress = meetingAddress;
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
    
    @Column(name="CONTACT_PERSION", length=20)

    public String getContactPersion() {
        return this.contactPersion;
    }
    
    public void setContactPersion(String contactPersion) {
        this.contactPersion = contactPersion;
    }
    
    @Column(name="IS_READ", length=1)

    public String getIsRead() {
        return this.isRead;
    }
    
    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }
    
    @Column(name="IS_FEEDBACK", length=1)

    public String getIsFeedback() {
        return this.isFeedback;
    }
    
    public void setIsFeedback(String isFeedback) {
        this.isFeedback = isFeedback;
    }
   








}