package jav;
//import java.util.Arrays;
class Jav{
    public static void main(String[]args){
       //String vowels [] = {"a","i","u","e","o"};
       String kata = "okeyy";
       int count = 0;
       for(int x = 0 ;x < kata.length() ; x++){
           char s = kata.charAt(x);
           if(s == 'a' || s == 'i' || s == 'u' || s == 'e' || s == 'o'){
               count++;
               //pakai increment untuk menghitung yang benar
           }
       }
        System.out.println(count);
        System.out.println("Hello world");
   }
}
        