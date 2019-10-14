package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String>{
	
	public List<Course> findByTopicId(String topicId);
	
}
