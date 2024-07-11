package com._minutes.springboot.learn_jpa_and_hibernate.course;

import com._minutes.springboot.learn_jpa_and_hibernate.course.jpa.CoursejpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CoursejdbcRepository repository;

    @Autowired
    private CoursejpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn fullstack development", "Sharma"));
        repository.insert(new Course(2, "Learn spring booot", "Saurav"));
        repository.insert(new Course(3, "Learn dsa with java", "Gaurav"));
        repository.delete(2);
        System.out.println(repository.getById(1));
    }
}
