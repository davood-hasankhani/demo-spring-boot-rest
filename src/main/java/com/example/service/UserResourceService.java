package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserRepository;

@RestController
@RequestMapping(name="/springRest")
public class UserResourceService  { /* implements ErrorController */

/*
	private static final String PATH = "/error";
    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }

    public String getErrorPath() {
        return PATH;
    }
	*/
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	
	@Autowired
	UserRepository userRepository ;
	
	@GetMapping(value="/all")
	public List<User> getAll()
	{
		return userRepository.findAll();
		
	}
	
	@PostMapping(value="/load")
	public List<User> persist( @RequestBody final User user)
	{
		userRepository.save(user);
		return userRepository.findAll();
	}
	
	
}
