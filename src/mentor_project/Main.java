package mentor_project;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;






class Main extends Timer{
  public static void main(String[] args) throws IOException, FileNotFoundException{
    
	//new class instance
    Csv_parser csv_parser = new Csv_parser();
    
    
    Timer timer=new Timer();
    //set the timer to run csv_parser every 5 seconds. 
    timer.scheduleAtFixedRate(csv_parser, 0,5*1000);
    
  }
  

 
//https://docs.google.com/spreadsheets/d/e/2PACX-1vQDhukToZsrxdHqr6zbbOmAyLCmz8sc6yeuuCRx3DnB4IV_08OP1LgPgTlxZFEeV3nDzv7ajoEgO-8G/pubhtml?gid=0&single=true  

  
//see if it will take a url. 
//invoke a wget...
//www.google,com pass an d search strin.
  
}









