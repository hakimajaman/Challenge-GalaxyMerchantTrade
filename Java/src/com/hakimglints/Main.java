package com.hakimglints;

//Input(Scan) ---
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
/*
 *
 * this for Roman
 *
 */
  public static String regexIt = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

/*
 *
 * this for storing number
 *
 */
  public static Pattern regexIs = Pattern.compile("^([a-zA-Z]+) is (I|V|X|L|C|D|M)$");

/*
 *
 * this for storing credits
 *
 */
  public static Pattern regexCredits = Pattern.compile("^([a-zA-Z]+)([a-zA-Z\\s]*) is ([0-9]+) (Credits)$");

/*
 *
 * this for how much question
 *
 */
  public static Pattern regexHowMuch = Pattern.compile("^how much is ([a-zA-Z\\s]*)\\?$");

/*
 *
 * this for how many Credits question
 *
 */
  public static Pattern regexHowManyCredits = Pattern.compile("^how many Credits is ([a-zA-Z\\s]*)\\?$");


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
      InputNotes inputit = new InputNotes();

      inputit.storingNumber();
      inputit.storingCredits();
      inputit.howMuchQuestion();
      inputit.howManyCreditsQuestion();
 
      System.out.println("Input Roman to Convert Arabic: ");
      RomantoArabic.romanNumber();

    }

    //public static String inputs(){
      //String inp = "";
      //Scanner scanIn = new Scanner(System.in);
      //inp = scanIn.nextLine();

      //return inp;
    //}





}
