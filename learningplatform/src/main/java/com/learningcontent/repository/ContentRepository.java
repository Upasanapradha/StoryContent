// ContentRepository.java
package com.learningcontent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningcontent.model.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {
    // Additional methods for content retrieval can be added here if needed
	List<Content> findByTitleContaining(String title);
}
