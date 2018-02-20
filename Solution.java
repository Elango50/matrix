import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        //Assume co-ordiantes for true cell
        
        /*int trueCell_X=1;
        int trueCell_Y=1;
        
        String trueCellLocation =trueCell_X+","+trueCell_Y;
        ArrayList diagonalList = new ArrayList();
        
        HashMap diagonalMap = new HashMap();              
          
        
        //Forward Reversal
        for(int i=trueCell_X;i<=100000;i++) {
            for(int j=trueCell_Y;j<=100000;j++) {
                if(i == j ) {
                    diagonalList.add(i+","+j);
                }
                
            }
            
        }
        diagonalMap.put(trueCellLocation,diagonalList);
         for(int i=0;i<diagonalList.size();i++) {
        	 System.out.println("i;;"+diagonalList.get(i));
         }
         System.out.println("i:"+diagonalList.size());*/
    	
    	LinkedHashMap locationMap = new LinkedHashMap();
    	
    	locationMap.put("1","1,1");
    	locationMap.put("2","2,2");
    	locationMap.put("3","3,3");
    	locationMap.put("4","3,1");
    	
    	testTrueCells(locationMap.size(),locationMap);
         
    }
    public static void testTrueCells(int inputCount, LinkedHashMap locationMap) {
    	
    	int result=0;
    	
    	for(int i=1;i<=inputCount;i++) {
    		
    		for(int j=i+1;j<=inputCount;j++) {
    			
    			String input1 =(String) locationMap.get(i+"");
    			String input2 =(String) locationMap.get(j+"");
    			
    			String[] value1 =input1.split(",");
    			String[] value2 =input2.split(",");
    			
    			int x1= Integer.parseInt(value1[0]);
    		    int y1= Integer.parseInt(value1[1]);
    		    
    		    int x2= Integer.parseInt(value2[0]);
    		    int y2= Integer.parseInt(value2[1]);
    		    
    		    if(x1==x2 && y1==y2) {
    		    	continue;
    		    }
    		    
    		    int yaxisDifference = y1-y2;
    		    int xaxisDifference =x1-x2;
    		    int difference=0;
    		    
    		    if(xaxisDifference !=0) {
    		    	 difference=( yaxisDifference /xaxisDifference);  		    
    		    }
    		    
    		   
    		    
    		    if(difference ==1 || difference==-1) {
    		    	result++;
    		    }    			
    			
    		}
    		
    	}
    	
    	System.out.println("result::"+result);
    	
    }
    
}