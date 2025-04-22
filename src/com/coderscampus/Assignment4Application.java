package com.coderscampus;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Assignment4Application {

	public static void main(String[] args) throws FileNotFoundException, IOException {


		
		
		FileService fileService = new FileService();
		Assignment4UserService studentService = new Assignment4UserService();
		Student[] students = fileService.readFile();
		
		fileService.writeFile(studentService.SortAPMth(students), "course1.csv");
		fileService.writeFile(studentService.SortCompSci(students), "course2.csv");
		fileService.writeFile(studentService.SortStat(students), "course3.csv");	
	}

}
