package com.enigmacamp.service;

import com.enigmacamp.model.Lecturer;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

public interface IBaseService<T> {
	T add(T data);
	List<T> list();
}
