package com.cts.example;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TextFileOutput {
	
	
	public static void main(String[] args) {

		try {
            // Save original out stream.
            PrintStream originalOut = System.out;

            // Create a new file output stream.
            PrintStream fileOut = new PrintStream("C:\\Shiva\\in.txt");


            // Redirect standard out to file.
            System.setOut(fileOut);
            
            originalOut.println(" Text out--Program exist. ");
            System.out.println(" System out prinln--Program exist. ");

            // Do not forget set original output stream back again.
            System.setOut(originalOut);
		}
		catch (FileNotFoundException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
	}
}
