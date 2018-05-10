package com.cisc181.core;

import java.util.UUID;

public class Section {
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		super();
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	UUID CourseID;
	UUID SemesterID;
	UUID SectionID;
	int RoomID;
	
}
