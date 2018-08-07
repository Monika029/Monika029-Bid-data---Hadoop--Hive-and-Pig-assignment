1  //Importing Hive Exec Jar 
2  import org.apache.hadoop.hive.ql.exec.UDF; 
3  //Importing ArrayList from Java Utility 
4  import java.util.ArrayList; 
5  
 
6  //Declaring a public class concat_udf that inherits property of UDF main class 
7  public class concat_udf extends UDF 
8  { 
9  	//Declaration & definition of function evaluate. 
10  	//Takes two parameters, a separator & another array of String which would be separated by the separator provided 
11  	public String evaluate (String SEP, ArrayList<String> array)  
12  	{ 
13  		//Checking if separator or array is empty or not provided. 
14  		//The program would abort by returning, how to run this program. 
15  		if (SEP == null || array == null)  
16  		{ 
17  			return "Provide a separator followed by an array of column name"; 
18  		} 
19  		 
20  		//Declaring an empty string to store the value of final result 
21  		String element=""; 
22  		 
23  		//Iterating through input array by checking till the last element 
24  		for(int i=0; i<array.size();i++) 
25  		{ 
26  			// Fetching array element by array.get(i) at the i'th index & storing it to process further. 
27  			element=element+array.get(i); 
28  			 
29  			//Checking if array contains at least two elements for a separator to be used. 
30  			if(i<array.size()-1) 
31  			{	 
32  				//If array size is greater than 1 then concatenating the separator to element. 
33  				element=element+SEP; 
34  			} 
35  		} 
36  		//returning the concatenated Array elements as a String. 
37  		return element; 
38  	} 
39  } 
