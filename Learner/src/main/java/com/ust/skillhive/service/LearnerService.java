package com.ust.skillhive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.skillhive.exception.UserNotFoundException;
import com.ust.skillhive.model.Learner;
import com.ust.skillhive.repository.LearnerRepository;

@Service
public class LearnerService {
	
	
	private final LearnerRepository learnerRepository;
	
	@Autowired
	public LearnerService(LearnerRepository learnerRepository) {
		
		this.learnerRepository = learnerRepository;
	}
	
    public Learner createLearner(Learner learner) {
        return learnerRepository.save(learner);
    }
    public List<Learner> getAllLearner() {
        return learnerRepository.findAll();
    }
    public Learner getLearnerById(Long learnerId) {
        // Retrieve the user from the database by ID
        return learnerRepository.findById(learnerId)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }
    
    public Learner updateLearner(Long learnerId, Learner updatedLearner) {
        // Retrieve the user from the database by ID
        Learner user = learnerRepository.findById(learnerId)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        
        user.setLearnerUsername(updatedLearner.getLearnerUsername());
        user.setLearnerEmail(updatedLearner.getLearnerEmail());
        user.setLearnerPassword(updatedLearner.getLearnerPassword());
        
 
        // Save the updated user in the database
        return learnerRepository.save(user);
        
       
    }

   
	
	
	
	

}
