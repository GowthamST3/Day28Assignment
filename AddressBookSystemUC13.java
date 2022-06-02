package com.BrifgeLabz_Day28Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddressBookSystemUC13 {
	public static void main(String [] args) {
		File file = new File("C\\Users\\gst\\Desktop\\AddressBookSystem\\AddressBookSystem.csv");
		try {
			boolean create = file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bWriter = new BufferedWriter(fileWriter);
			bWriter.write("First Name - Gowtham, ");
			bWriter.newLine();
			bWriter.write("Last Name - ST, ");
			bWriter.newLine();
			bWriter.write("Address - Siddapura");
			bWriter.newLine();
			bWriter.write("City - Tiptur");
			bWriter.newLine();
			bWriter.write("Zip - 572202");
			bWriter.newLine();
			bWriter.write("Phone Number - 8317335902");
			bWriter.newLine();
			bWriter.write("Email - gst@gmail.com.com");
			bWriter.newLine();
			bWriter.close();

			FileReader fileReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fileReader);
			String line = bReader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bReader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
