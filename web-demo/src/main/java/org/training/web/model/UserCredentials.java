package org.training.web.model;

import org.training.web.model.UserCredentials ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserCredentials {
	private int id;
	private String userName;
	private String Password;
	
}

