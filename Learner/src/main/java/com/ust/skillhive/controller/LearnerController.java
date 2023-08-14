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

import com.ust.skillhive.model.Learner;
import com.ust.skillhive.service.LearnerService;


@RestController
@RequestMapping("/learner")
public class LearnerController {
		
		@Autowired
	    private  LearnerService learnerService;

	 
	    @PostMapping
	    public ResponseEntity<Learner> saveLearner(@RequestBody Learner learner) {
	        
	        return new ResponseEntity<>(learnerService.createLearner(learner), HttpStatus.CREATED);
	    }

	    @GetMapping("/{learnerId}")
	    public ResponseEntity<Learner> retrieveLearnerById(@PathVariable Long learnerId) {
	        // Retrieve the user by ID
	        Learner learner = learnerService.getLearnerById(learnerId);

	        // Return the user with a 200 OK status
	        return ResponseEntity.ok(learner);
	    }


	    @GetMapping
	    public ResponseEntity<List<Learner>> retrieveAllLearner() {
	        // Retrieve all users
	        List<Learner> learner = learnerService.getAllLearner();

	        // Return the list of users with a 200 OK status
	        return ResponseEntity.ok(learner);
	    }

	    @PutMapping("/{learnerId}")
	    public ResponseEntity<Learner> modifyLearner(@PathVariable Long learnerId, @RequestBody Learner learner) {
	        // Update the user with the given ID
	    	Learner updatedUser = learnerService.updateLearner(learnerId, learner);

	        // Return the updated user with a 200 OK status
	        return ResponseEntity.ok(updatedUser);
	    }	
	
	
	
	
	
	
	
	
	
	
	

}
