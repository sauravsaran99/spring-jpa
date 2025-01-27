package com._minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import com._minutes.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoursejdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY =
            """
                    insert into course (id, name, author)
                    values(?, ?, ?);   
                    
            """;

    private static String   DELETE_QUERY =
            """
            DELETE FROM course
            WHERE id = ?;
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

}
