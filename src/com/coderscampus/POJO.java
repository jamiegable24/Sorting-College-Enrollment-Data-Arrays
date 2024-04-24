package com.coderscampus;


public class POJO implements Comparable<POJO>{

	
		private String studentID;
		private String studentName;
		private String course;
		private Integer grade; 
		
		public POJO (String course, Integer grade) {
			this.course = course;
			this.grade = grade;
						
		}

		public String getStudentID() {
			return studentID;
		}
		public void setStudentID(String studentID) {
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
		public int compareTo(POJO that) {
			if (this.grade.compareTo(that.grade) == 0) {
			return that.course.compareTo(this.course);			
			} else {
				return that.grade.compareTo(this.grade);
			}
		}
				
}
