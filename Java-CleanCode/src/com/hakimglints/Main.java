package com.hakimglints;

//Input(Scan) ---
import java.util.Scanner;

//ArrayStack ---
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
      System.out.println("Welcome to Planet Language Converter");

      //String choose = "";
      //choose = inputs();
      //String ch = choose.toUpperCase();
      //System.out.println("choose = "+choose);
      //System.out.println("ch = "+ch);

      //ArabictoRoman.arabicNumber();

     
      //String inputTo = "";
      //inputTo = inputs();

      //PlanettoArabic arabic = new PlanettoArabic();

      //inputit.storingNumber();
      //inputit.storingCredits();
      //inputit.howMuchQuestion();
      //inputit.howManyCreditsQuestion();
 
      //System.out.println("Input Roman to Convert Arabic: ");
      //RomantoArabic.romanNumber();

      Scanner scan1 = new Scanner(System.in);

      System.out.println("Just input your roman number and press enter");
      System.out.println("if you want to stop input, just type 'ok'");

      Stack<String> romanValue = new Stack<String>();

      Stack<Stack<String>> tes = new Stack<Stack<String>>();

      romanValue.push("one");
      String lastRoman = romanValue.get(romanValue.size()-1);

      while(lastRoman != "ok"){
        System.out.print("Input your Roman Number = ");
        romanValue.push(scan1.nextLine());
        String lastRoman2 = romanValue.get(romanValue.size()-1);
        if(lastRoman2.equals("ok")){
          tes.push(romanValue);
          //for(int i
            // 0; i<romanValue.size(); i++){
            romanValue.pop();
            romanValue.remove(0);
            RomantoArabic.romanNumber(romanValue); 
          return;
        }
      }

      for(String r : romanValue){
        System.out.print(r);
      }


      //Example:
      //Scanner scan = new Scanner(System.in);

      //String[] romanConverted = new String[5];
      //for(int i=0; i<romanConverted.length; i++ ){
        //System.out.print("Example "+i+" Input Here : ");
        //romanConverted[i] = scan.nextLine();
      //}

      //System.out.print("OUTPUT HERE--------------");

      //for(String r : romanConverted){
        //System.out.println(r);
      //}

    }

    public static String inputs(){
      String inp = "";
      Scanner scanIn = new Scanner(System.in);
      inp = scanIn.nextLine();

      return inp;
    }





}
