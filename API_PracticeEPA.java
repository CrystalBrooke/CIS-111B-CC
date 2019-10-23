// okay let's start by using some packages of the Java API you may not have yet seen


import java.net.*;
import java.io.*;

// NOTE::  You probably can't answer these without reading ahead through the code and making some best guesses !
// Question 1 : why are we using java.net package ? What classes are used from that package ? which methods of those classes?
//    -The java.net package provides the classes for implementing network applications. (https://docs.oracle.com/javase/7/docs/api/)
//    -We are uing the URL and URLConnection Classes.
//    -We are using the openConnection method on the URL Class.
// Question 2: why use the java.io package ? Which classes are we using ? why? which methods ? 
//    -The java.io package provides for system input and output through data streams, serialization and the file system,
//     (https://docs.oracle.com/javase/7/docs/api/), and it looks like we are reading in information from an external server.
//    -BufferedReader is being used because it can read text from an outside source and store it, and InputStreamReader which reads bytes and 
//     decodes them into characters.
//    -We are using the getInputStream method and the readLine methods.


public class API_PracticeEPA 
{

   // this first line states that the program may bail out , ie throw an Exception.
   //Q2: using the java api page for the class URL, find what Exception the constructor for the URL class can throw
   //    -MalformedURLException - if no protocol is specified, or an unknown protocol is found, or spec is null.
   
   public static void main(String[] args) throws Exception {
   
       // for later.... ! 
       String[] zipCodes = {"19422", "19464", "87101"}; 
      
      // Now we are going to use a Web Service from the EPA, the Environmental Protection Agency.
      //
      // We'll create a query 
      // and have the EPA server talk to our program and send us the information we request. This is the main
      //mechanism for communication and xmission of information over the Internet, not printing to the screen!
      //
      //
      // Two popular formats that allow two computers to communicate are XML and JSON. As beginners we'll 
      // just use an easier format called CSV.
      // Q3. What is CSV? 
      //    -Comma Seperated Value - a data exchange format that is commonly used to move tabular data, like what is used in a spreadsheet.
      
      // Q4: Go to the documentation page for the EPA API. 
      //   https://www.epa.gov/enviro/web-services#hourlyzip 
      // Run this program with the URL query as it is written below. What happens?
      //    -The program fetches UV data from the EPA and is returning the data from New Mexico(?) for todays date in a form that could be
      //    -entered into a spreadsheet.
      // Copy the URL from the line below into a new tab of your browser. What does it return?
      //    -This downloaded the data that ran inside the program (I'm guessing as a CSV), which my computer opened as and excell file.
    
       //Question 5!
       for(int i = 0; i < zipCodes.length; i++)
       {     
       URL epaServer = new URL("https://iaspub.epa.gov/enviro/efservice/getEnvirofactsUVHOURLY/ZIP/" + zipCodes[i] + "/CSV" );
       
       
       URLConnection ac = epaServer.openConnection();
       
       
             
      InputStreamReader inputStream = new InputStreamReader(ac.getInputStream(), "UTF-8");
      BufferedReader bufferedReader = new BufferedReader(inputStream);
      StringBuilder responseBuilder = new StringBuilder();
      
      
      String line;
       
      while ((line = bufferedReader.readLine()) != null) {
        responseBuilder.append(line + "\n");
         
      } 
      bufferedReader.close();
      
      // would rather just have you look at this in the debugger, but for now we'll print ! 
      System.out.println(responseBuilder.toString() );
      } 
     
       
    
   // Q5:: edit this program so that you query the EPA for UV levels at a list of locations (Central Campus, West Campus and Albuquerque, NM)
   // Your program should automatically run through this list of locations and retrieve the data from the EPA for each.
          
   }  // end of main
}// end of program