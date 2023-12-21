package Day1.Part1;

import java.io.*;
import java.util.Scanner;

public class v1{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner keyboard = new Scanner(new File("Day1/input.txt"));
        String lineTemp = "";
        String out = "";
        String tempOut = "";
        int sum = 0;
        while(keyboard.hasNextLine()){
            lineTemp = keyboard.nextLine();
            for(int i = 0; i < lineTemp.length(); i++){
                if(i == lineTemp.length() - 1 && isNumeric(lineTemp.substring(i))){
                    tempOut += lineTemp.substring(i);
                } else if(isNumeric(lineTemp.substring(i, i + 1))){
                    tempOut += lineTemp.substring(i, i + 1);
                }
            }
            out += tempOut.substring(0, 1) + tempOut.substring(tempOut.length()-1);
            tempOut = "";
            sum += Integer.parseInt(out.substring(0,2));
            System.out.println(out);
            out = "";
        }
        System.out.println(sum);
    }
    
    public static boolean isNumeric(String str) { 
        try {  
            Integer.parseInt(str);
            return true;
        } 
        catch(NumberFormatException e){  
        return false;  
        }  
    }
}

