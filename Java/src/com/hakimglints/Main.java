package com.hakimglints;

//Input(Scan) ---
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      System.out.println("Select Converter: ");
      System.out.println("choose A : ArabictoRoman\nchoose B : RomantoArabic\nInput: ");
      String choose = "";
      //choose = inputs();
      //String ch = choose.toUpperCase();
      //System.out.println("choose = "+choose);
      //System.out.println("ch = "+ch);

      //if(ch == "A"){
        //System.out.println("Input your ArabicNumber to Convert to Roman: ");
        //ArabictoRoman.arabicNumber();
      //} else if(ch == "B"){
        //System.out.println("Input your RomanNumber to Convert to Arabic: ");
        //RomantoArabic.romanNumber();
      //} else {
        //System.out.println("You can only choose A or B");
        //System.out.println("else ch = "+ch);
      //}


      //ArabictoRoman.arabicNumber();
      //RomantoArabic.romanNumber();
      PlanettoArabic.planetNumber();

    }

    public static String inputs(){
      String inp = "";
      Scanner scanIn = new Scanner(System.in);
      inp = scanIn.nextLine();

      return inp;
    }

}
