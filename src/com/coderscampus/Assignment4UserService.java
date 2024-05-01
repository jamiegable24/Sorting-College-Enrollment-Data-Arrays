package com.coderscampus;

public class Assignment4UserService {
	public Student createStudent(String line) {
		Student student = new Student();
		student.setStudentID(Integer.parseInt(line.split(",")[0]));
		student.setStudentName(line.split(",")[1]);
		student.setCourse(line.split(",")[2]);
		student.setGrade(Integer.parseInt(line.split(",")[3]));
		return student;
	}

	public Student[] SortAPMth(Student[] students) {
		Student[] aPMth = new Student[33];
		int i = 0;
		for (Student student : students) {
			if (student.getCourse().contains("APMTH")) {
				aPMth[i++] = new Student(student.getStudentID(), student.getStudentName(), student.getCourse(),
						student.getGrade());
			}
		}
		return aPMth;
	}

	public Student[] SortCompSci(Student[] students) {
		Student[] compSci = new Student[34];
		int i = 0;
		for (Student student : students) {
			if (student.getCourse().contains("COMPSCI")) {
				compSci[i++] = new Student(student.getStudentID(), student.getStudentName(), student.getCourse(),
						student.getGrade());
			}
		}
		return compSci;
	}

	public Student[] SortStat(Student[] students) {
		Student[] stat = new Student[33];
		int i = 0;
		for (Student student : students) {
			if (student.getCourse().contains("STAT")) {
				stat[i++] = new Student(student.getStudentID(), student.getStudentName(), student.getCourse(),
						student.getGrade());
			}
		}
		return stat;
	}

	public String writeStudent(Student student) {
		return student.getStudentID() + "," + student.getStudentName() + "," + student.getCourse() + ","
				+ student.getGrade() + "\n";
	}
}