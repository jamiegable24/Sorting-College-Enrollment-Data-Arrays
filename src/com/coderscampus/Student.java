package com.coderscampus;


public class Student implements Comparable<Student>{

	
		private Integer studentID;
		private String studentName;
		private String course;
		private Integer grade; 
		public Student() {}
		
		public Student (Integer studentID, String studentName, String course, Integer grade) {
			this.course = course;
			this.grade = grade;
			this.studentID = studentID;
			this.studentName = studentName;
						
		}

		public Integer getStudentID() {
			return studentID;
		}
		public void setStudentID(Integer studentID) {
			this.studentID = studentID;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public Integer getGrade() {
			return grade;
		}
		public void setGrade(Integer grade) {
			this.grade = grade;
		}
		
		//sorts by grade in ascending order
		@Override
		public int compareTo(Student that) {
			if (this.grade.compareTo(that.grade) == 0) {
			return this.course.compareTo(that.course);			
			} else {
				return that.grade.compareTo(this.grade);
			}
		}
				
}
