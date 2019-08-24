package mentor_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;


public class Csv_parser extends TimerTask{
	
	@Override
	public void run() {
		try {
			checkSubscriptionsForToday();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	void checkSubscriptionsForToday() throws IOException{
		 //BufferedReader csvReader = new BufferedReader(new FileReader("src/test.csv"));
		   BufferedReader csvReader = new BufferedReader(new FileReader("src/test.csv"));
		    String row = "";
		    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/dd/yyyy");
		  	LocalDate localDate = LocalDate.now();
		  	String formattedLocalDate = dtf.format(localDate);
		  	
		  	
//		  	System.out.println(dtf.format(localDate)); //2016/11/16
		    while ((row = csvReader.readLine()) != null) {
		      String[] rowData = row.split(",");
//		      System.out.println(rowData[0]);
		      
		     
		      if(rowData[1].equals(formattedLocalDate)) {
		    	  System.out.println("subscription id: "+rowData[0]);
		      }
		    }
		    csvReader.close();    
	}
}



