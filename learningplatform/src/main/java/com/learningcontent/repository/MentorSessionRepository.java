// MentorSessionRepository.java
package com.learningcontent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningcontent.model.MentorSession;

public interface MentorSessionRepository extends JpaRepository<MentorSession, Long> {
    // Additional methods for mentor session management can be added here if needed
}
