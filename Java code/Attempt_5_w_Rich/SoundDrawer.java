/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoundDrawer;

import java.io.IOException;
import java.util.List;
import java.util.Iterator;
import PythonDataLoader.java;


/**
 *
 * @author Richard
 */
public class SoundDrawer {
    
    private final String DEFAULT_FILE_NAME = "/media/grace/Grace/Portfolio/Music Patterns/data.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instantiate a new SoundDrawer object
        SoundDrawer g = new SoundDrawer();
        
        //Here you can choose to run either of the methods depending on which one you comment out.
        
        //g.processDataAsList();
        g.processDataAsStringArray();
    }
    
    //This method pretty much replicates what was in the original code
    //As the loadStrings() method is unavailable I have used my PythonDataLoader but this time
    //just returned a string array.
    //I've not done anything clever with this - just done what was needed to make it work.
    public void processDataAsStringArray() {
        PythonDataLoader pdl = new PythonDataLoader();
        
        try {
            String[] data = pdl.readFileAndReturnStringArray(DEFAULT_FILE_NAME);
            
            int i =0;

            for(int n = 20; n > 0; n--) {   
           

                String rawValueOfData = data[i];
                int valueAsInteger = Integer.parseInt(rawValueOfData);
                int valueAsAbs     = Math.abs(valueAsInteger);
                System.out.println("raw content is " + rawValueOfData);
                System.out.println("value as an Integer is " + valueAsInteger);
                System.out.println("value as an abs Integer is " + valueAsAbs);

                if(valueAsInteger < -182) {
                  //fill(0, 89, 132);
                  //ellipse(size, size, size, size);
                  System.out.println("I am reaching this line of code 2");
                } 
                else if(valueAsInteger < -109) { 
                  //fill(105, 94, 171);
                  //ellipse(size, size, size, size);
                  System.out.println("I am reaching this line of code 3");
                }
                else if (valueAsInteger < -36) {
                  //fill(179, 91, 171);
                  //ellipse(size, size, size, size);
                  System.out.println("I am reaching this line of code 4");
                }
                else if(valueAsInteger < 37) {
                  //fill (239, 91, 148);
                  //ellipse(size, size, size, size);
                  System.out.println("I am reaching this line of code 5");
                }
                else if(valueAsInteger < 110) {
                  //fill(255, 111, 110);
                  //ellipse(size, size, size, size);
                  System.out.println("I am reaching this line of code 6");
                }
                else if (valueAsInteger < 183) {
                  //fill(255, 152, 64);
                  //ellipse(size, size, size, size);
                  System.out.println("I am reaching this line of code 7");
                }
                else {
                  //fill(255, 200, 0);
                  //ellipse(size, size, size, size);
                  System.out.println("I am reaching this line of code 8");
                }
                i++; 
            }
             

        }
        catch (Exception e) {
                e.printStackTrace();
        }
                
    }
    
}
