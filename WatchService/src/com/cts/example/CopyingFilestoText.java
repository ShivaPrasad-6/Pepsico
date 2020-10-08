package com.cts.example;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CopyingFilestoText {

	public static void main(String[] args) {
		try {
				PrintStream originalOut = System.out;
				PrintStream fileOut = new PrintStream("C:\\Users\\845058\\Documents\\DispatchLoad\\DispatchLoadlog1.txt");
				System.setOut(fileOut);
				Path dir = Paths.get("C:\\Users\\845058\\Documents\\WatchFolder");
				Stream<Path> list = Files.list(dir);
				list.forEach(System.out::println);
				System.setOut(originalOut);
		} 
		catch (IOException ex) {
			System.err.println(ex);
		}
	}

}
