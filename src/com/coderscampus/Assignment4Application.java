package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.coderscampus.assignment3.POJO;

public class Assignment4Application {

	public static void main(String[] args) {

		// Instantiates Assignment4UserService
		// Assignment4UserService userService = new Assignment4UserService();

		BufferedReader csvInput = null; // Instantiates fileReader with a null value
		POJO user = new POJO(null, null); // Instantiates user from POJO
		POJO[] users = new POJO[101]; // Instantiates users array

		{
			try { // Reads student-master-list file and assigns to variable csvInput
				File csvFile = new File("C:\\Users\\jamie\\OneDrive\\Desktop\\student-master-list.csv");
				csvInput = new BufferedReader(new FileReader(csvFile));
				String line;

				// Splits student-master-list.csv by comma into separate lines
				int i = 0;

				while ((line = csvInput.readLine()) != null) {
					String[] count = line.split(",");
					// Prints column headers (i.e. ﻿Student ID,Student Name,Course,Grade)
					System.out.println(line);

					// Assigns each column into array
					String studentID = count[0];
					String studentName = count[1];
					String course = count[2];
					String grade = count[3];

					user = new POJO(course, null);

					user.setStudentID(studentID);
					user.setStudentName(studentName);
					user.setCourse(course);
					user.setGrade(null);

					users[i] = user;

					for (String token : count) {
						BufferedWriter writer = new BufferedWriter(new FileWriter(token));
						writer.write(token);
						writer.close();
					}
					// Sorts students by course
					POJO[] temp = new POJO[101];

					// Creates new user for every iteration through the loops
					user = new POJO(grade, i);

					// Iterates through each user in the array
					users[i] = user;
					i++;

					Arrays.sort(temp);
					for (POJO student : temp) {
						System.out.println(student.getCourse());
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
