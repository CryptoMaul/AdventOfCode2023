package Day1.Part2;

import java.io.*;
import java.util.Scanner;

public class v2{
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
                } else{
                    tempOut += wordNum(lineTemp.substring(i));
                }
            }
            out += tempOut.substring(0, 1) + tempOut.substring(tempOut.length()-1);
            sum += Integer.parseInt(out.substring(0,2));
            tempOut = "";
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

    public static String wordNum(String str){ 
        if(str.indexOf("zero") == 0){
            return "0";
        }if(str.indexOf("one") == 0){
            return "1";
        }
        if(str.indexOf("two") == 0){
            return "2";
        }
        if(str.indexOf("three") == 0){
            return "3";
        }
        if(str.indexOf("four") == 0){
            return "4";
        }
        if(str.indexOf("five") == 0){
            return "5";
        }
        if(str.indexOf("six") == 0){
            return "6";
        }
        if(str.indexOf("seven") == 0){
            return "7";
        }
        if(str.indexOf("eight") == 0){
            return "8";
        }
        if(str.indexOf("nine") == 0){
            return "9";
        }
        return "";
    }
}

