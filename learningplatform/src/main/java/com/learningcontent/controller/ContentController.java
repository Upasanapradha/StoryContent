package com.learningcontent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learningcontent.model.Content;
import com.learningcontent.model.MentorSession;
import com.learningcontent.service.ContentService;
import com.learningcontent.service.MentorSessionService;

@RestController
@RequestMapping("/api/content")
public class ContentController {

	@Autowired
    private  ContentService contentService;
	
	@Autowired
	private MentorSessionService mentorSessionService;


    @GetMapping("/{id}")
    public ResponseEntity<Content> getContentById(@PathVariable ("id") Long contentId) {
       Content content = contentService.getContentById(contentId);
    	
        return ResponseEntity.ok(content);
       
    }

    @GetMapping("/search")
    public ResponseEntity<List<Content>> searchContentByTitle(@RequestParam String title) {
        List<Content> contents = contentService.searchContentByTitle(title);
        return ResponseEntity.ok(contents);
    }
    @PostMapping("/schedule-session")
    public ResponseEntity<MentorSession> scheduleSession(@RequestBody MentorSession mentorSession) {
        // Delegate scheduling to the service class
        MentorSession scheduledSession = mentorSessionService.scheduleSession(mentorSession);
        return new ResponseEntity<>(scheduledSession, HttpStatus.CREATED);
    }
    
}


