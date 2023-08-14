package com.ust.skillhive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instructor {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long instructorId;
	    private String instructorUsername;
	    private String instructorEmail;
	    private String instructorPassword;
	    private String instructorQualification;
	    private Long courseId;
	     
	    public Instructor()
	    {
	    	
	    }
	    
	    public Instructor(Long instructorId, String instructorUsername, String instructorEmail,
				String instructorPassword, String instructorQualification, Long courseId) {
			super();
			this.instructorId = instructorId;
			this.instructorUsername = instructorUsername;
			this.instructorEmail = instructorEmail;
			this.instructorPassword = instructorPassword;
			this.instructorQualification = instructorQualification;
			this.courseId = courseId;
		}

		public Long getInstructorId() {
			return instructorId;
		}

		public void setInstructorId(Long instructorId) {
			this.instructorId = instructorId;
		}

		public String getInstructorUsername() {
			return instructorUsername;
		}

		public void setInstructorUsername(String instructorUsername) {
			this.instructorUsername = instructorUsername;
		}

		public String getInstructorEmail() {
			return instructorEmail;
		}

		public void setInstructorEmail(String instructorEmail) {
			this.instructorEmail = instructorEmail;
		}

		public String getInstructorPassword() {
			return instructorPassword;
		}

		public void setInstructorPassword(String instructorPassword) {
			this.instructorPassword = instructorPassword;
		}

		public String getInstructorQualification() {
			return instructorQualification;
		}

		public void setInstructorQualification(String instructorQualification) {
			this.instructorQualification = instructorQualification;
		}

		public Long getCourseId() {
			return courseId;
		}

		public void setCourseId(Long courseId) {
			this.courseId = courseId;
		}

		@Override
		public String toString() {
			return "Instructor [instructorId=" + instructorId + ", instructorUsername=" + instructorUsername
					+ ", instructorEmail=" + instructorEmail + ", instructorPassword=" + instructorPassword
					+ ", instructorQualification=" + instructorQualification + ", courseId=" + courseId + "]";
		}
	    
	    
	    
	    
	    
	    
	

}
