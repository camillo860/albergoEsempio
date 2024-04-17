/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albergoesempio;
import java.io.*;
import exception.FileException;
/**
 *
 * @author raffaele
 */
public class TextFile {
    private char mode;
    private BufferedReader reader;
    private BufferedWriter writer;
    public TextFile(String filename, char mode) throws IOException {
        this.mode='R';
        if(mode=='W' || mode =='w'){
            this.mode ='W';
            writer= new BufferedWriter(new FileWriter(filename));
        }
        else {
            reader = new BufferedReader(new FileReader(filename));
        }
    }
    
    public void toFile(String line) throws FileException, IOException{
        if (this.mode =='R') throw new FileException("FILE DI SOLA LETTURA");
        writer.write(line);
        writer.newLine();
    }
    
    public String fromFile() throws FileException, IOException {
        String tmp;
        if (this.mode == 'W') throw new FileException("FILE IN SOLA SCRITTURA");
        tmp= reader.readLine();
        if (tmp ==null) throw new FileException ("FILE FINITO");
        return tmp;
            
    }
    public void closeFile() throws IOException{
        if (this.mode =='W')
                writer.close();
        else 
            reader.close();
        
    }
    
    
}





