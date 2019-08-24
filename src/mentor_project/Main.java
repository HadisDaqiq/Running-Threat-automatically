package mentor_project;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;






class Main extends Timer{
  public static void main(String[] args) throws IOException, FileNotFoundException{
    
	//new class instance
    Csv_parser csv_parser = new Csv_parser();
    
    
    Timer timer=new Timer();
    timer.scheduleAtFixedRate(csv_parser, 0,5*1000);
    
   
    
  }
  

 
  

  
//see if it will take a url. 
//and file.
//invoke a wget...
//www.google,com pass an d search strin.
//loop over all the dates.
//and check if it matches today's date.
//research what scedule  is.
}













