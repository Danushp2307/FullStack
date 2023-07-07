package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Users;
import com.example.demo.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api/Startup")
@CrossOrigin
public class UserController {
	@Autowired
	UserService userService;
	
	@Operation(summary="Creates a new user")

	@ApiResponses(value= {@ApiResponse(responseCode="201",description="user created successfully"),
			@ApiResponse(responseCode="400",description="user details is invalid")})

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
	public ResponseEntity<Users> create( @RequestBody Users users){
		Users createUser=userService.create(users);
		return ResponseEntity.ok(createUser);
	}


	@Operation(summary="get a user")

	@ApiResponses(value= {@ApiResponse(responseCode="401",description="invalid credentials"),
			@ApiResponse(responseCode="404",description="user not found")
	})

	@GetMapping(value="/{id}",produces="application/json")
	public ResponseEntity<Optional<Users>> read(final @PathVariable Long id){
		Optional<Users> createdCandidate=userService.read(id);
		return ResponseEntity.ok(createdCandidate);
	}

	@Operation(summary="Updates a new user")

	@ApiResponses(value= {@ApiResponse(responseCode="200",description="user updated successfully"),
			@ApiResponse(responseCode="400",description="user details is invalid"),@ApiResponse(responseCode="401",description="invalid credentials"),
			@ApiResponse(responseCode="404",description="user not found")
	})
	@PutMapping(value="/{id}",produces="application/json",consumes="application/json")
	public ResponseEntity<Users> update(final @RequestBody Users user)throws  JsonProcessingException{
		final Users updatedUser=userService.update(user);
		return ResponseEntity.ok(updatedUser);
	}

	@Operation(summary="Deletes the user by given id")
	@ApiResponses(value= {@ApiResponse(responseCode="200",description="user deleted successfully"),
			@ApiResponse(responseCode="401",description="invalid credentials"),@ApiResponse(responseCode="404",description="user not found")})
	@DeleteMapping("/{id}")
	public void delete(final @PathVariable Long id) {
		userService.delete(id);
	}
}