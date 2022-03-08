package com.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("/users") //http://localhost:8080/users
public class UserController {
	
	@GetMapping
	public String getUsers(@RequestParam(value="page", defaultValue="1") int page,
			@RequestParam(value="limit", defaultValue="1") int limit,
			@RequestParam(value="sort", defaultValue="desc", required=false) String sort){
		
			
		return "get user was called page= "+page+" limit= "+limit+" sort = "+sort;
	
	}
	
	@GetMapping(path="/{userId}")
	public UserRest getUser(@PathVariable String userId) {
		UserRest returnValue = new UserRest();
		returnValue.setEmail("test@email.com");
		returnValue.setFirstName("Jean");
		returnValue.setLastName("palomino");
		return returnValue;
	
	}
	@PostMapping
	public String createUser() {
		return "create user was called";
	}
	@PutMapping
	public String updateUser() {
		return "update user was called";
	}
	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
}
