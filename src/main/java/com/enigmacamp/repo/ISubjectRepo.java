package com.enigmacamp.repo;

import com.enigmacamp.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

public interface ISubjectRepo extends JpaRepository<Subject, Long> {
}
