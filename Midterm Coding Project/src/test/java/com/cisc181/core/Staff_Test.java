package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		ArrayList<Staff> TestCase1 = new ArrayList<Staff>();
		
		String a = "Jerry";
		Date DOB = new Date();
		int Rank = 1;
		double Salary = 1000;
		eTitle title = eTitle.MR;
		Staff Jerry = new Staff(a,a,a,DOB,a,a,a,a,Rank,Salary,DOB,title);
		TestCase1.add(Jerry);
		
		String a2 = "Elma";
		Date DOB2 = new Date();
		int Rank2 = 1;
		double Salary2 = 1250;
		eTitle title2 = eTitle.MRS;
		Staff Elma = new Staff(a2,a2,a2,DOB2,a2,a2,a2,a2,Rank2,Salary2,DOB2,title2);
		TestCase1.add(Elma);
		
		String a3 = "Jeff";
		Date DOB3 = new Date();
		int Rank3 = 1;
		double Salary3 = 2200;
		eTitle title3 = eTitle.MR;
		Staff Jeff = new Staff(a3,a3,a3,DOB3,a3,a3,a3,a3,Rank3,Salary3,DOB3,title3);
		TestCase1.add(Jeff);
		
		String a4 = "Cait";
		Date DOB4 = new Date();
		int Rank4 = 1;
		double Salary4 = 5000;
		eTitle title4 = eTitle.MRS;
		Staff Cait = new Staff(a4,a4,a4,DOB4,a4,a4,a4,a4,Rank4,Salary4,DOB4,title4);
		TestCase1.add(Cait);
		
		String a5 = "Dale";
		Date DOB5 = new Date();
		int Rank5 = 1;
		double Salary5 = 750;
		eTitle title5 = eTitle.MRS;
		Staff Dale = new Staff(a5,a5,a5,DOB5,a5,a5,a5,a5,Rank5,Salary5,DOB5,title5);
		TestCase1.add(Dale);
		
		double AvgSalary = (Jerry.getSalary() + Elma.getSalary() + Jeff.getSalary() + Cait.getSalary() + Dale.getSalary())/5;
		assertEquals(AvgSalary, 2040, 0);
	}	

}
