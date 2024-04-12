
package org.training.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.training.web.config.AppConfigWeb;
import org.training.web.controller.HomeServlet;
import org.training.web.dao.UserCredentialsDAO;
import org.training.web.model.UserCredentials;
@Service
public class LoginService  { 
//	ApplicationContext cont = new AnnotationConfigApplicationContext(AppConfigWeb.class);
//	UserCredentialsDAO proDao = cont.getBean((UserCredentialsDAO.class));
	@Autowired
	UserCredentialsDAO proDao;
	public boolean isValidUser(String username,String password) {
	
		 List<UserCredentials> usercreds = proDao.getAllUsers();
	     //System.out.println("All records  retreived sucessfully"+usercreds);
	     for (UserCredentials user : usercreds) {
	    	 if (user.getUserName().equalsIgnoreCase(username)&& user.getPassword().equals(password)) {
	    		 return true;
			}	     
	     }
 
		return false;

		
	}
	
}
