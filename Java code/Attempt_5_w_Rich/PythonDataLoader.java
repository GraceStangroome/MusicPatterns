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
    
    //This method is an attempt to replicate the existing loadStrings() code. It assumes only one
    //line in the file being processed and returns the values of that line as an array of strings.
    //Note that this may not exactly replicate the loadStrings() code and thus may influence the 
    //behaviour of the SoundDrawer.processDataAsStringArray() method.
    public String[] readFileAndReturnStringArray(String data) throws IOException {
        String[] valuesExtractedFromTheLine = null;
        
        //The String variable, "line" will contain each line of data as it's read from the file specified.
        String line;        
        
        //set up a FileReader for the specified file
        FileReader fr = new FileReader("/media/grace/Grace/Portfolio/Music Patterns/data.txt");
        
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