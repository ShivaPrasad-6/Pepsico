package com.cts.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.stream.Stream;

public class Pepsico {

	public static void main(String[] args) {
		LocalDateTime timestamp = LocalDateTime.now(); 
		String str = timestamp.toString().replace(":", "_");
		
		try {
				//--------copying file paths to log.txt file----------------
				PrintStream originalOut = System.out;
				PrintStream fileOut = new PrintStream("C:\\Users\\845058\\Documents\\DispatchLoad\\DispatchLoad"+str+".txt");
				System.setOut(fileOut);
				Path dir = Paths.get("C:\\Users\\845058\\Documents\\WatchFolder");
				Stream<Path> list = Files.list(dir);
				list.forEach(System.out::println);	
				System.setOut(originalOut);
				
				
				//--------
				String fileName = "C:\\Users\\845058\\Documents\\DispatchLoad\\DispatchLoad"+str+".txt";
				File file = new File(fileName);
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
					Path src = Paths.get(line);
					Path dest = Paths.get("C:\\Users\\845058\\Documents\\OneDrive\\"+src.getFileName());
					Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING,
							StandardCopyOption.COPY_ATTRIBUTES);	
					Files.delete(src);
				}
				br.close();
				fr.close();
		} 
		catch (IOException ex) {
			System.err.println(ex);
		}

	}

}
