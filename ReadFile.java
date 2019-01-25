import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile{
    public static String readFileAsString(String fileName)throws Exception 
    { 
      String data = ""; 
      data = new String(Files.readAllBytes(Paths.get(fileName))); 
      return data; 
    } 

    public static int CountRepeats(String filename)throws Exception{
        String data = readFileAsString(filename); 
        char[] chars=data.toCharArray();
        int count=0;
        for (char ch:chars){
            if(ch=='a'){
                count++;
            }

        }
        return count;
    }
    
    public static void main(String[] args) throws Exception  
    { 
      System.out.println(CountRepeats("/home/anshu/javaPrac/myfile.txt"));
    } 
        
}