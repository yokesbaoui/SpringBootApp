/**
 * 
 */
package com.youssef.tutorial.SpringAngularApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youssef.tutorial.SpringAngularApp.model.User;
import com.youssef.tutorial.SpringAngularApp.model.UserRepository;

/**
 * @author Youssef
 *
 */

@RestController
@CrossOrigin(origins = "${environnement.dev.origin.host}")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
}
