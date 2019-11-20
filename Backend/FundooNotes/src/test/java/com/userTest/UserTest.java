package com.userTest;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;

import com.springBoot.response.Response;
import com.springBoot.user.dto.Userdto;
import com.springBoot.user.model.User;
import com.springBoot.user.repository.UserRepo;
import com.springBoot.user.service.UserServiceImpl;

@RunWith(SpringRunner.class)
public class UserTest {

	@Mock
	UserRepo userRepo;
	
	@Mock
	ModelMapper modelMapper;
	
	@Mock
	PasswordEncoder passwordEncoder;
	
	@Mock
	 Response response;
	
	@Mock
	UserServiceImpl userServiceImpl;
	
	@Test
	public void testUserRegistration() {
		User user = new User();
		Userdto userDto=new Userdto();
		user.setFirstName("Dhananjay");
		user.setLastName("Dj");
		user.setMobileNum("8308345886");
		user.setEmailId("*****@gmail.com");
		user.setPassword("Dhanu@1234");
		userRepo.save(user);
		assertEquals(200, response.getStatusCode());
	}
	
}
