package com.enigmacamp.repo;

import com.enigmacamp.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

public interface ILecturerRepo extends JpaRepository<Lecturer, Long> {
}
