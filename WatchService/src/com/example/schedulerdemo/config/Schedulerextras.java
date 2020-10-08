package com.example.schedulerdemo.config;

public class Schedulerextras {
	
	
//	@Scheduled(fixedDelay=30000)
//	public void WatchService(){
//		 try {
//			 	String watchfolder = ScheduledTasks.watch; 
//	            WatchService watcher = FileSystems.getDefault().newWatchService();
//	            Path dir1 = Paths.get(watchfolder);
//	            dir1.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
//	            
//	            PrintStream originalOut1 = System.out;
//
//	            PrintStream fileOut1 = new PrintStream("C:\\Users\\845058\\OneDrive - Cognizant\\Documents\\pep\\SpringBootScheduler\\Watchservice\\out.txt");
//
//	            System.setOut(fileOut1);
//	            
//	            originalOut1.println(" Text out--Program exist. ");
//	            System.out.println(" System out prinln--Program exist. ");
//	            	             
//	            originalOut1.println(" watch service dir");
//	            System.out.println("Watch Service registered for dir1: " + dir1.getFileName());
//	             
//	            while (true) {
//	                WatchKey key;
//	                try {
//	                    key = watcher.take();
//	                } 
//	                catch (InterruptedException ex) {
//	                    return;
//	                }
//	                 
//	                for (WatchEvent<?> event : key.pollEvents()) {
//	                    WatchEvent.Kind<?> kind = event.kind();
//	                     
//	                    @SuppressWarnings("unchecked")
//	                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
//	                    Path fileName1 = ev.context();
//	                     
//	                    System.out.println(kind.name() + ": " + fileName1);
//	                     
//	                    if (kind == ENTRY_MODIFY &&
//	                        fileName1.toString().equals("DirectoryWatchDemo.java")) {
//	                    	originalOut1.println(" watch service-- source file changed");
//	                        System.out.println("My source file has changed!!!");
//	                    }
//	                }
//	                 
//	                boolean valid = key.reset();
//	                if (!valid) {
//	                    break;
//	                }
//	            }
//	           System.setOut(originalOut1);
//	        } 
//		 	catch (IOException ex) {
//	            System.err.println(ex);
//		 	}
//	}
	
	
//	@Scheduled(fixedDelay=120000)
//    public void Delete() throws IOException
//    {
//        String d=ScheduledTasks.dispatch;
//       
//    }
	
	

	//private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

	//private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

//    @Scheduled(fixedRate = 2000)
//    public void scheduleTaskWithFixedRate() {
//        logger.info("Fixed Rate Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()) );
//    }

//    @Scheduled(fixedDelay = 2000)
//    public void scheduleTaskWithFixedDelay() {
//        logger.info("Fixed Delay Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException ex) {
//            logger.error("Ran into an error {}", ex);
//            throw new IllegalStateException(ex);
//        }
//    }

//    @Scheduled(fixedRate = 2000, initialDelay = 5000)
//    public void scheduleTaskWithInitialDelay() {
//        logger.info("Fixed Rate Task with Initial Delay :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
//    }

//    @Scheduled(cron = "0 * * * * ?")
//    public void scheduleTaskWithCronExpression() {
//        logger.info("Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
//    }

//	@Scheduled(fixedDelay = 60000)
//	public void file() {
//		try {
//			FileInputStream sourceFile = new FileInputStream(
//					"C:\\Users\\845058\\OneDrive - Cognizant\\Documents\\pep\\SpringBootScheduler\\copy.txt");
//			FileOutputStream targetFile = new FileOutputStream(
//					"C:\\Users\\845058\\OneDrive - Cognizant\\Documents\\pep\\SpringBootScheduler\\paste.txt");
//			int bytevalue;
//			while ((bytevalue = sourceFile.read()) != -1) {
//				targetFile.write(bytevalue);
//			}
//			sourceFile.close();
//			targetFile.close();
//			//System.out.println("file copied");
//		} catch (IOException e) {
//			System.out.println("exception: " + e.toString());
//		}
//	}

}
