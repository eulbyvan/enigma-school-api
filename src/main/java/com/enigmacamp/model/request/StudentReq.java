package com.enigmacamp.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 01/12/22
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentReq {
	private String firstName;
	private String lastName;
	private String email;
}
