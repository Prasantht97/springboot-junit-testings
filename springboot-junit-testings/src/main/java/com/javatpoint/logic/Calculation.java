package com.javatpoint.logic;

import java.util.StringTokenizer;

public class Calculation {  
    //method that returns maximum number  
    public static int findMax(int arr[]){  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
     
            }  
            return max;
        
    }  
    //method that returns cube of the given number  
    public static int cube(int n){  
        return n*n*n;  
    }  
    //method that returns reverse words   
   
    public static String reverseWord(String str){  
        String words[]=str.split("\\s");  
        String reverseWord="";  
        for(String w:words){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse();  
            reverseWord+=sb.toString()+" ";  
        }  
        return reverseWord.trim();  
    }  
    
} 