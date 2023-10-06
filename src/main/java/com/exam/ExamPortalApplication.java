package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.exam.helper.UserFoundException;
import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner {

	@Autowired
    private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) 
	{
		
		SpringApplication.run(ExamPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try {
		System.out.println("Code Starting");
		
		
		
		  User user = new User();
	  
		  user.setFirstName("admin"); 
		  user.setLastName("Kumar");
		  user.setUsername("sk988"); 
		 
		  user.setPassword(this.bCryptPasswordEncoder.encode("admin"));
		  user.setEmail("abcD@gmail.com"); 
		  user.setProfile("default.png");
		   
		  Role role1=new Role(); 
		  role1.setRoleId(4L); 
		  role1.setRoleName("ADMIN");
		  
		  Set<UserRole> userRoleset = new HashSet<>(); 
		  UserRole userRole=new  UserRole();
		 
		  
		  
		  userRole.setRole(role1); userRole.setUser(user);
		  
		  userRoleset.add(userRole);
		  
		  User user1 =this.userService.createUser(user, userRoleset);
		  System.out.println(user1.getUsername());
		
		}catch (UserFoundException e) {
			e.printStackTrace();
		}
		 
	}

}
