// MentorSession.java
package com.learningcontent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MentorSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long mentorId; // ID of the mentor
    private Long userId; // ID of the user scheduling the session
    private Date scheduledTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMentorId() {
		return mentorId;
	}
	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getScheduledTime() {
		return scheduledTime;
	}
	public void setScheduledTime(Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
	public MentorSession(Long id, Long mentorId, Long userId, Date scheduledTime) {
		super();
		this.id = id;
		this.mentorId = mentorId;
		this.userId = userId;
		this.scheduledTime = scheduledTime;
	}
    
    // Constructors, getters, and setters
}

