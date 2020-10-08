package com.cts.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathReading {

	public static void main(String[] args) throws IOException {
		try {
			String fileName = "C:\\Users\\845058\\Documents\\DispatchLoad\\DispatchLoad1.txt";
			File file = new File(fileName);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				Path src = Paths.get(line);
				Path dest = Paths.get("C:\\Users\\845058\\Documents\\OneDrive\\"+src.getFileName());
				Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING,
						StandardCopyOption.COPY_ATTRIBUTES);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("exception: " + e.toString());
		}
	}

}

//Path path = Paths.get(fileName);
//Scanner scanner = new Scanner(path);
//System.out.println("Read text file using Scanner");
////read line by line
//while(scanner.hasNextLine()){
//    //process each line
//    String line = scanner.nextLine();
//    System.out.println(line);
//}
//scanner.close();