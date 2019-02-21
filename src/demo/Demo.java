package demo;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Arrays;
import java.util.Scanner;

import sort.*;

public class Demo {

	public static void main(String[] args)throws FileNotFoundException { //Do not forget exception!
		

		
		
		
		Scanner in = new Scanner(new File("in.txt"));
		List<Integer> al = new ArrayList<Integer>();
		PrintWriter out = new PrintWriter(new File("out.txt"));
		Sort objSrt = new Sort();
	    
		 
		
	       while (in.hasNext()) {
	    	  
	    	   in.useDelimiter(", |\n");
	    	   String currentTok = in.next();
	    	
	    	   char curTokArr[] = currentTok.toCharArray();  
	    	   
	    	   //-- The last token (but the last token in the file) in the line is found --
	    	   if(curTokArr[curTokArr.length-1]=='\r'){				 //-- with in.useDelimiter(", |\n"); Last word in the line ends with \r\n  		
	    		   currentTok = currentTok.replaceAll("(\\r)|(\\n)", "");
	    		   int currentTokInt= Integer.parseInt(currentTok);  
	    		   al.add(currentTokInt);
	    		   Integer digits[] = al.toArray(new Integer[al.size()]);  // Standard transformation from list to the Integer array (For primitive: int[] arr = ArrayUtils.toPrimitive((Integer[])integerArrayList.toArray());)
		        
	    			    		
	    		   Integer[] sortedArr = objSrt.createSortedArr(digits);
	    		   al.clear();
		        
	    		   out.println(Arrays.toString(sortedArr));
	    		   continue;
	    	   }
	    	   else{
	    		
	    		int currentTokInt= Integer.parseInt(currentTok); 
	        	al.add(currentTokInt);
	        	
	    	   }
	    	
	    	//System.out.print(" Tok="+currentTokInt+" ");
	      
   	       }
	       
	       
	       Integer digits[] = al.toArray(new Integer[al.size()]);
	       Integer[] sortedArr = objSrt.createSortedArr(digits);
	       al.clear();
	        
	       out.print(Arrays.toString(sortedArr)); 				//Without new line

	       in.close();
	       out.close();
	       
		}

}
