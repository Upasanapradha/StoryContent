package com.learningcontent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningcontent.model.Content;
import com.learningcontent.repository.ContentRepository;

@Service
public class ContentService {
	
	@Autowired
	private ContentRepository contentRepository;

    
    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public Content getContentById(Long id) {
        return contentRepository.findById(id).orElse(null);
    }

    public List<Content> searchContentByTitle(String title) {
        return contentRepository.findByTitleContaining(title);
    }

    public Content createContent(Content content) {
        return contentRepository.save(content);
    }

    // Other CRUD operations can be added here as needed

}



