package raphas_baellebad;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
public class JavaGrep{
	public static void main(String[] args) throws Exception{
		 String  thisLine = null
			      try{
			         // open input stream test.txt for reading purpose.
			    	  BufferedReader br = new BufferedReader("D:/Dropbox/Studium/Eclipse Workspace/HDMSE1BONUS/SE1Bonus/Spielwiesen/raphas_baellebad/text.txt");
			         while ((thisLine = br.readLine()) != null) {
			            System.out.println(thisLine);
			         }       
			      }catch(Exception e){
			         e.printStackTrace();
			      }
		
		
	}	
}
