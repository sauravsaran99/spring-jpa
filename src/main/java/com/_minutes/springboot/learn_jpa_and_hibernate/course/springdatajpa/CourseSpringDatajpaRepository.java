package com._minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import com._minutes.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDatajpaRepository extends JpaRepository<Course, Long> {
}
