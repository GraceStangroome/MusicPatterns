package SoundDrawer;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author Richard
 */
public class PythonDataLoader {
    // Set up a String to identify what is being used as a delimiter 
    // this could be passed as a parameter if you wanted to process
    // a file with a different character 
    private final String COMMA_DELIMITER = ",";
    
    //This is my design for a method to process the data file. It allows for multiple lines in the file and 
    //returns a List - see notes below for the "extractedData" variable for more details of it's contents.
    public List readFileAndReturnList(String fileName) throws IOException {

        //The String variable, "line" will contain each line of data as it's read from the file specified.
        String line;
        
        //This syntax is a bit confusing, but what it's doing is declaring "extractedData" as an ArrayList
        //However, it's specifying that each entry in that array list will itself be a List object that contains
        //Strings!
        //What it will contain is an entry for each line read from the file, each entry of which will be a list of the values
        //that have been extracted from the line based on the delimiter.
        List<List<String>> extractedData = new ArrayList<>();


        //set up a FileReader for the specified file
        FileReader fr = new FileReader(fileName);
        
        //set up a BufferedReader for the FileReader - this makes reading the file more efficient
        BufferedReader br = new BufferedReader(fr);

        //The while loop works through all lines in the file being processed. 
        //At present there is only one line, but this code allows for more than one.
        while ((line = br.readLine()) != null) {
            
            //Split the data in the line that has been read into a String Array, using the comma as the delimiter
            String[] valuesExtractedFromTheLine = line.split(COMMA_DELIMITER);

            // Ths "split" method of the String object returns a String array. We will convert it to a List
            List extractedValuesAsAList = Arrays.asList(valuesExtractedFromTheLine);

            //Add the list of extracted values to the extractedData List
            extractedData.add(extractedValuesAsAList);
        }
            

        //Having processed all the lines in the file, return the List of extracted data
        return extractedData;
    }
    
    //This method is an attempt to replicate the existing loadStrings() code. It assumes only one
    //line in the file being processed and returns the values of that line as an array of strings.
    //Note that this may not exactly replicate the loadStrings() code and thus may influence the 
    //behaviour of the SoundDrawer.processDataAsStringArray() method.
    public String[] readFileAndReturnStringArray(String fileName) throws IOException {
        String[] valuesExtractedFromTheLine = null;
        
        //The String variable, "line" will contain each line of data as it's read from the file specified.
        String line;        
        
        //set up a FileReader for the specified file
        FileReader fr = new FileReader(fileName);
        
        //set up a BufferedReader for the FileReader - this makes reading the file more efficient
        BufferedReader br = new BufferedReader(fr);     
        
        
        //For simplicity, I'm only processing one line in order to replicate the existing code
        if ((line = br.readLine()) != null) {
            
            //Split the data in the line that has been read into a String Array, using the comma as the delimiter
            valuesExtractedFromTheLine = line.split(COMMA_DELIMITER);

        }        
        return valuesExtractedFromTheLine;
    }
}




