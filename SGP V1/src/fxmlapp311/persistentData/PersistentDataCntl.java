/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp311.persistentData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author SHaynes
 */
public class PersistentDataCntl {
    
    private static PersistentDataCntl thePersistentDataCntl;
    private PeristentDataCollection thePeristentDataCollection;
    private final String EXTERNAL_DATA_PATH = "";
    private final String DATA_FILE_NAME = "AppData.ser";
    
    private PersistentDataCntl(){
        //readSerializedDataModel(); 
        if(thePeristentDataCollection == null){
            thePeristentDataCollection = new PeristentDataCollection();
            writeSerializedDataModel();
            readSerializedDataModel(); 
        }
    }
    
    public static PersistentDataCntl getPersistentDataCntl(){
        if(thePersistentDataCntl == null){
            thePersistentDataCntl = new PersistentDataCntl();
        }
        return thePersistentDataCntl;
    }
    
    public PeristentDataCollection getPeristentDataCollection(){
        return thePeristentDataCollection;
    }
    
    public void readSerializedDataModel(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        String filePath = EXTERNAL_DATA_PATH+DATA_FILE_NAME;
        try
            {
            fis = new FileInputStream(filePath);
            in = new ObjectInputStream(fis);
            thePeristentDataCollection = (PeristentDataCollection) in.readObject();
            in.close();
            }
        catch(IOException ex)
            {
            ex.printStackTrace();
            }
        catch(ClassNotFoundException ex)
            {
            ex.printStackTrace();
            }
       }

    
     public void writeSerializedDataModel(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        String filePath = EXTERNAL_DATA_PATH+DATA_FILE_NAME;
        try
            {
            fos = new FileOutputStream(filePath);
            out = new ObjectOutputStream(fos);
            out.writeObject(thePeristentDataCollection);
            out.close();
            }
        catch(IOException ex)
            {
            ex.printStackTrace();
            }
       }
    
}
