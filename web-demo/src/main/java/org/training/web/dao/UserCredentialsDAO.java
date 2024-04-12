package org.training.web.dao;

import java.util.List;

import org.training.web.model.UserCredentials;

public interface UserCredentialsDAO {
		UserCredentials getUserNameById(int id);
		List<UserCredentials> getAllUsers();
}
