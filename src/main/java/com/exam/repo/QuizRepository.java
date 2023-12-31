package com.exam.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.exam.Category;
import com.exam.model.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz	, Long> {

	List<Quiz> findBycategory(Category category);

	List<Quiz> findByActive(boolean b);

	List<Quiz> findByCategoryAndActive(Category c, boolean b);

}
