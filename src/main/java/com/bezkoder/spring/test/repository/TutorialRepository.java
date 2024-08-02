package com.bezkoder.spring.test.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.test.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
