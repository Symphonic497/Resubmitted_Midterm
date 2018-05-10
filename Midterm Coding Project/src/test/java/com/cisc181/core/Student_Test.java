package com.cisc181.core;
import java.util.Date;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Course> Course = new ArrayList<Course>();
		ArrayList<Semester> Semester = new ArrayList<Semester>();
		Course a = new Course(UUID.randomUUID(),"Chem",70,eMajor.CHEM);
		Course b = new Course(UUID.randomUUID(),"Cisc181",20,eMajor.COMPSI);
		Course c = new Course(UUID.randomUUID(),"Econ",100,eMajor.BUSINESS);
		Date Neutraldate = new Date();
		Semester Spring = new Semester(UUID.randomUUID(),Neutraldate,Neutraldate) ;
		Semester Fall = new Semester(UUID.randomUUID(),Neutraldate,Neutraldate);
		Course.add(a);
		Course.add(b);
		Course.add(c);
		Semester.add(Fall);
		Semester.add(Spring);
		ArrayList<Section> Section = new ArrayList<Section>();
		UUID SectionID = UUID.randomUUID();
		int RoomID1 = 204;
		int RoomID2 = 100;
		int RoomID3 = 309;
		int RoomID4 = 400;
		int RoomID5 = 007;
		int RoomID6 = 205;
		Section d = new Section(a.getCourseID(), Fall.getSemseterID(), SectionID, RoomID1);
		Section e = new Section(a.getCourseID(), Spring.getSemseterID(), SectionID, RoomID2);
		Section f = new Section(b.getCourseID(), Fall.getSemseterID(), SectionID, RoomID3);
		Section g = new Section(b.getCourseID(), Spring.getSemseterID(), SectionID, RoomID4);
		Section h = new Section(c.getCourseID(), Fall.getSemseterID(), SectionID, RoomID5);
		Section i = new Section(c.getCourseID(), Spring.getSemseterID(), SectionID, RoomID6);
		Section.add(d);
		Section.add(e);
		Section.add(f);
		Section.add(g);
		Section.add(h);
		Section.add(i);
		Student gary = new Student(null, null, null, Neutraldate, null, null, null, null);
		Student gary1 = new Student(null, null, null, Neutraldate, null, null, null, null);
		Student gary2 = new Student(null, null, null, Neutraldate, null, null, null, null);
		Student gary3 = new Student(null, null, null, Neutraldate, null, null, null, null);
		Student gary4 = new Student(null, null, null, Neutraldate, null, null, null, null);
		Student gary5 = new Student(null, null, null, Neutraldate, null, null, null, null);
		Student gary6 = new Student(null, null, null, Neutraldate, null, null, null, null);
		Student gary7 = new Student(null, null, null, Neutraldate, null, null, null, null);
		Student gary8 = new Student(null, null, null, Neutraldate, null, null, null, null);
		Student gary9 = new Student(null, null, null, Neutraldate, null, null, null, null);
		Enrollment Enrollgary = new Enrollment(gary.getStudentID(),d.getSectionID());
		Enrollment Enrollgary1 = new Enrollment(gary1.getStudentID(),d.getSectionID());
		Enrollment Enrollgary2 = new Enrollment(gary2.getStudentID(),d.getSectionID());
		Enrollment Enrollgary3 = new Enrollment(gary3.getStudentID(),d.getSectionID());
		Enrollment Enrollgary4 = new Enrollment(gary4.getStudentID(),d.getSectionID());
		Enrollment Enrollgary5 = new Enrollment(gary5.getStudentID(),d.getSectionID());
		Enrollment Enrollgary6 = new Enrollment(gary6.getStudentID(),d.getSectionID());
		Enrollment Enrollgary7 = new Enrollment(gary7.getStudentID(),d.getSectionID());
		Enrollment Enrollgary8 = new Enrollment(gary8.getStudentID(),d.getSectionID());
		Enrollment Enrollgary9 = new Enrollment(gary9.getStudentID(),d.getSectionID());
		Enrollgary.SetGrade(70);
		Enrollgary1.SetGrade(80);
		Enrollgary2.SetGrade(90);
		Enrollgary3.SetGrade(100);
		Enrollgary4.SetGrade(60);
		Enrollgary5.SetGrade(50);
		Enrollgary6.SetGrade(70);
		Enrollgary7.SetGrade(95);
		Enrollgary8.SetGrade(85);
		Enrollgary9.SetGrade(70);
		
		
	}

	@Test
	public void test() {
		assertEquals(1,1);
		
	}
}