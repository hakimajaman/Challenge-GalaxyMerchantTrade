package com.hakimglints;

//Input(Scan) ---
import java.util.Scanner;

//ArrayStack ---
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
      InputLine input = new InputLine();
      InputNotes storingPlanet = new InputNotes();

      System.out.println("Welcome to Planet Language Converter");

//this storingPlanet

      System.out.println("Just input your planet word with 'is' and roman number");
      System.out.println("Ex: glob is I");
      System.out.println("If you finished, just type 'ok'");

      Stack<String> planetValue = new Stack<String>();

      Stack<Stack<String>> tes = new Stack<Stack<String>>();

      planetValue.push("one");
      String lastPlanet = planetValue.get(planetValue.size()-1);

      while(lastPlanet != "ok"){
        System.out.print("Input your Planet Number = ");
        planetValue.push(input.inputIt());
        String lastPlanet2 = planetValue.get(planetValue.size()-1);
        if(lastPlanet2.equals("ok") || lastPlanet2.equals("OK") || lastPlanet2.equals("Ok") || lastPlanet2.equals("oK")){
          tes.push(planetValue);
          //for(int i
            // 0; i<romanValue.size(); i++){
            planetValue.pop();
            planetValue.remove(0);
            storingPlanet.storingNumber(planetValue);
          return;
        }
      }


//endThis storingPlanet
     
//this roman
      //System.out.println("Just input your roman number and press enter");
      //System.out.println("if you want to stop input, just type 'ok'");

      //Stack<String> romanValue = new Stack<String>();

      //Stack<Stack<String>> tes = new Stack<Stack<String>>();

      //romanValue.push("one");
      //String lastRoman = romanValue.get(romanValue.size()-1);

      //while(lastRoman != "ok"){
        //System.out.print("Input your Roman Number = ");
        //romanValue.push(input.inputIt());
        //String lastRoman2 = romanValue.get(romanValue.size()-1);
        //if(lastRoman2.equals("ok") || lastRoman2.equals("OK") || lastRoman2.equals("Ok") || lastRoman2.equals("oK")){
          //tes.push(romanValue);
          ////for(int i
            //// 0; i<romanValue.size(); i++){
            //romanValue.pop();
            //romanValue.remove(0);
            //RomantoArabic.romanNumber(romanValue); 
          //return;
        //}
      //}
//endThis roman

    }

}
