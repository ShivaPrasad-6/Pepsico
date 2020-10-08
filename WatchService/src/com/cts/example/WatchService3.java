package com.cts.example;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

 

public class WatchService3 {
 
    public static void main(String[] args) {
        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();
            Path dir = Paths.get("C:\\test");
            dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
            
            PrintStream originalOut = System.out;


            PrintStream fileOut = new PrintStream("C:\\Shiva\\out.txt");

            System.setOut(fileOut);
            
            originalOut.println(" Text out--Program exist. ");
            System.out.println(" System out prinln--Program exist. ");
            
            originalOut.println(" watch service dir");
            System.out.println("Watch Service registered for dir: " + dir.getFileName());
             
            while (true) {
                WatchKey key;
                try {
                    key = watcher.take();
                } catch (InterruptedException ex) {
                    return;
                }
                 
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                     
                    @SuppressWarnings("unchecked")
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path fileName = ev.context();
                     
                    System.out.println(kind.name() + ": " + fileName);
                    if (kind == ENTRY_MODIFY &&
                            fileName.toString().equals("DirectoryWatchDemo.java")) {
                    	
                    	originalOut.println(" watch service-- source file changed");
                        System.out.println("My source file has changed!!!");
                    }
                }
                 
                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
           System.setOut(originalOut);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}