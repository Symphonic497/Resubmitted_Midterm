package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	private Enrollment(){
	}
		
	public Enrollment(UUID StudentID, UUID SectionID)
	{
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();
	}
	public void SetGrade(double grade){
		Grade = grade;
	}
	public double getGrade(){
		return this.Grade;
	}
	}
