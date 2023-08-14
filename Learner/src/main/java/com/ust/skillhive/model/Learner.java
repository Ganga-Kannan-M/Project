package com.ust.skillhive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Learner {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long learnerId;
	    private String learnerUsername;
	    private String learnerEmail;
	    private String learnerPassword;
	    
	    public Learner()
	    {
	    	
	    }
		public Learner(Long learnerId, String learnerUsername, String learnerEmail, String learnerPassword) {
			super();
			this.learnerId = learnerId;
			this.learnerUsername = learnerUsername;
			this.learnerEmail = learnerEmail;
			this.learnerPassword = learnerPassword;
		}
		public Long getLearnerId() {
			return learnerId;
		}
		public void setLearnerId(Long learnerId) {
			this.learnerId = learnerId;
		}
		public String getLearnerUsername() {
			return learnerUsername;
		}
		public void setLearnerUsername(String learnerUsername) {
			this.learnerUsername = learnerUsername;
		}
		public String getLearnerEmail() {
			return learnerEmail;
		}
		public void setLearnerEmail(String learnerEmail) {
			this.learnerEmail = learnerEmail;
		}
		public String getLearnerPassword() {
			return learnerPassword;
		}
		public void setLearnerPassword(String learnerPassword) {
			this.learnerPassword = learnerPassword;
		}
		@Override
		public String toString() {
			return "Learner [learnerId=" + learnerId + ", learnerUsername=" + learnerUsername + ", learnerEmail="
					+ learnerEmail + ", learnerPassword=" + learnerPassword + "]";
		}
	    
	    
	

}
