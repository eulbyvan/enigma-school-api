package com.enigmacamp.repo;

import com.enigmacamp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

public interface IStudentRepo extends JpaRepository<Student, Long> {
}
