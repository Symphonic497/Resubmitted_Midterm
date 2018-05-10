package com.cisc181.core;

import java.util.Date;

import java.util.UUID;

public class Semester {
	public UUID getSemseterID() {
		return SemseterID;
	}
	public void setSemseterID(UUID semseterID) {
		SemseterID = semseterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public Semester(UUID semseterID, Date startDate, Date endDate) {
		super();
		SemseterID = semseterID;
		StartDate = startDate;
		EndDate = endDate;
	}
	UUID SemseterID;
	Date StartDate;
	Date EndDate;
}
