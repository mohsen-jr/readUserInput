/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;
import java.io.*;
/**
 *
 * @author mahmoud_mohsen
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            System.out.println("Enter data:");
            
            FileWriter writer = new FileWriter("D:\\Ai_pro\\java\\test.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            String usrInput;
            do {
                usrInput = br.readLine();
                System.out.println(usrInput);
                
                buffer.write(usrInput);
                buffer.newLine();
            }while(!usrInput.equals("stop"));
            buffer.close();
        }        
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

