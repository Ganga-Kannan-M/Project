package com.ust.skillhive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.skillhive.model.Instructor;
import com.ust.skillhive.service.InstructorService;



@RestController
@RequestMapping("/instructor")
public class InstructorController {
		
		@Autowired
	    private  InstructorService instructorService;

	 
	    @PostMapping
	    public ResponseEntity<Instructor> saveInstructor(@RequestBody Instructor instructor) {
	        
	        return new ResponseEntity<>(instructorService.createInstructor(instructor), HttpStatus.CREATED);
	    }

	    @GetMapping("/{instructorId}")
	    public ResponseEntity<Instructor> retrieveInstructorById(@PathVariable Long instructorId) {
	        // Retrieve the user by ID
	        Instructor instructor = instructorService.getInstructorById(instructorId);
	        
	        // Return the user with a 200 OK status
	        return ResponseEntity.ok(instructor);
	    }


	    @GetMapping
	    public ResponseEntity<List<Instructor>> retrieveAllInstructor() {
	        // Retrieve all users
	        List<Instructor> instructor = instructorService.getAllInstructor();

	        // Return the list of users with a 200 OK status
	        return ResponseEntity.ok(instructor);
	    }

	    @PutMapping("/{instructorId}")
	    public ResponseEntity<Instructor> modifyLearner(@PathVariable Long instructorId, @RequestBody Instructor instructor) {
	        // Update the user with the given ID
	    	Instructor updatedUser = instructorService.updateInstructor(instructorId, instructor);

	        // Return the updated user with a 200 OK status
	        return ResponseEntity.ok(updatedUser);
	    }	
	
	
	
	
	
	
	
	
	
	
	

}
