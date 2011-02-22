package com.chcoa.domain.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * ChsMeeting entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="CHS_MEETING"
    ,schema="CH_COA"
)

public class ChsMeeting  implements java.io.Serializable {


    // Fields    

     private String id;
     private ChsMeetingRoom chsMeetingRoom;
     private String name;
     private String type;
     private String theme;
     private String content;
     private String material;
     private Date beginTime;
     private Date endTime;
     private String rate;
     private String anchorerson;
     private String participant;
     private Date applyTime;
     private String notifyType;
     private String remark;
     private Set<ChsMeetingSupplies> chsMeetingSupplieses = new HashSet<ChsMeetingSupplies>(0);
     private Set<ChsMeetingNotify> chsMeetingNotifies = new HashSet<ChsMeetingNotify>(0);


    // Constructors

    /** default constructor */
    public ChsMeeting() {
    }

	/** minimal constructor */
    public ChsMeeting(String id) {
        this.id = id;
    }
    
    /** full constructor */
    public ChsMeeting(String id, ChsMeetingRoom chsMeetingRoom, String name, String type, String theme, String content, String material, Date beginTime, Date endTime, String rate, String anchorerson, String participant, Date applyTime, String notifyType, String remark, Set<ChsMeetingSupplies> chsMeetingSupplieses, Set<ChsMeetingNotify> chsMeetingNotifies) {
        this.id = id;
        this.chsMeetingRoom = chsMeetingRoom;
        this.name = name;
        this.type = type;
        this.theme = theme;
        this.content = content;
        this.material = material;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.rate = rate;
        this.anchorerson = anchorerson;
        this.participant = participant;
        this.applyTime = applyTime;
        this.notifyType = notifyType;
        this.remark = remark;
        this.chsMeetingSupplieses = chsMeetingSupplieses;
        this.chsMeetingNotifies = chsMeetingNotifies;
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
        @JoinColumn(name="MEETING_ROOM")

    public ChsMeetingRoom getChsMeetingRoom() {
        return this.chsMeetingRoom;
    }
    
    public void setChsMeetingRoom(ChsMeetingRoom chsMeetingRoom) {
        this.chsMeetingRoom = chsMeetingRoom;
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
    
    @Column(name="THEME", length=100)

    public String getTheme() {
        return this.theme;
    }
    
    public void setTheme(String theme) {
        this.theme = theme;
    }
    
    @Column(name="CONTENT", length=500)

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    @Column(name="MATERIAL", length=500)

    public String getMaterial() {
        return this.material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
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
    
    @Column(name="RATE", length=2)

    public String getRate() {
        return this.rate;
    }
    
    public void setRate(String rate) {
        this.rate = rate;
    }
    
    @Column(name="ANCHORERSON", length=20)

    public String getAnchorerson() {
        return this.anchorerson;
    }
    
    public void setAnchorerson(String anchorerson) {
        this.anchorerson = anchorerson;
    }
    
    @Column(name="PARTICIPANT", length=2000)

    public String getParticipant() {
        return this.participant;
    }
    
    public void setParticipant(String participant) {
        this.participant = participant;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="APPLY_TIME", length=7)

    public Date getApplyTime() {
        return this.applyTime;
    }
    
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
    
    @Column(name="NOTIFY_TYPE", length=1)

    public String getNotifyType() {
        return this.notifyType;
    }
    
    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }
    
    @Column(name="REMARK", length=100)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsMeetings")

    public Set<ChsMeetingSupplies> getChsMeetingSupplieses() {
        return this.chsMeetingSupplieses;
    }
    
    public void setChsMeetingSupplieses(Set<ChsMeetingSupplies> chsMeetingSupplieses) {
        this.chsMeetingSupplieses = chsMeetingSupplieses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="chsMeeting")

    public Set<ChsMeetingNotify> getChsMeetingNotifies() {
        return this.chsMeetingNotifies;
    }
    
    public void setChsMeetingNotifies(Set<ChsMeetingNotify> chsMeetingNotifies) {
        this.chsMeetingNotifies = chsMeetingNotifies;
    }
   








}