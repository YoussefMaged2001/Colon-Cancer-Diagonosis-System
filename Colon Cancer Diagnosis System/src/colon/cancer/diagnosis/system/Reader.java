
package colon.cancer.diagnosis.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Reader {
    String fileName;
    File file;
    Scanner inputStream;
    private int rows,columns;
    String[] Data;
    
    public Reader(String fileName, int columns, int rows) {
        this.fileName = fileName;
        this.rows = rows;
        this.columns = columns;
        file = new File(fileName);
        String filedata = new String("");
        
        try {
            inputStream = new Scanner(file);
            boolean corrector = true;
            while(inputStream.hasNext())
            {
               
                filedata += inputStream.next();
                
                if(!corrector)
                {
                    corrector = false;
                    filedata +=",";
                }
                corrector = false;
            }
            
            Data = filedata.split(",");
            inputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Wrong File path");
        }       
    }
    
    public String ReadPatientGeneValue(int patient, int gene)
    {
        int index = columns*(patient) + (gene);
      
        return Data[index];
    }
    
    public String ReadPatientCondition(int patient)
    {
        return ReadPatientGeneValue(patient, columns-1);
    }
    
    public String ReadGeneName(int gene)
    {
        return ReadPatientGeneValue(0, gene);
    }
    
}
