package com.learningcontent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningcontent.model.MentorSession;
import com.learningcontent.repository.MentorSessionRepository;

@Service
public class MentorSessionService {
	
	@Autowired
	
	private MentorSessionRepository mentorSessionRepository;

	public MentorSession scheduleSession(MentorSession mentorSession) {
		return mentorSessionRepository.save(mentorSession);
	}
	

}
