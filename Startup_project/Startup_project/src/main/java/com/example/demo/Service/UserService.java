package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Users;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public Users create(Users users) {
		return userRepository.save(users);
	}
	public Optional<Users> read(Long id){
		return userRepository.findById(id);
	}
	public Users update(Users users) {
		return userRepository.save(users);
		
	}
	public void delete(Long Id) {
		userRepository.deleteById(Id);
	}
	
}