package com.hakimglints;

//Input(Scan) ---
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Main {

      private enum Validator{
        M(1000), 
        CM(900), 
        D(500), 
        CD(400), 
        C(100), 
        XC(90), 
        L(50), 
        XL(40), 
        X(10), 
        IX(9), 
        V(5), 
        IV(4), 
        I(1);

        private int value;

        Validator(int value){
          this.value = value;
        }

        public int getValue(){
          return this.value;
        }
      }

    public static void main(String[] args) {

      //System.out.println("Enum Length = "+Validator.values().length);

      System.out.println("Input your ArabicNums to Convert to Roman: ");
        
      Scanner scanIn = new Scanner(System.in);
      String numberArabic = scanIn.nextLine();
      scanIn.close();
      int arabic = arabicNumber(2);
      System.out.println("ArabicNumbers = "+arabic);

    }

    //public static int conv(int convv){
      //int input = 7;
      //int tehe = arabicNumber(input);
      //System.out.println("tehe = "+tehe);
      //return tehe;
    //}

    public static int arabicNumber(int arabics){
 
      String romanNumbers = "";
      int rr = 0;


      //if(arabic > 3999 || arabic == 0){
        //System.out.println("This application just count 1 to 3999");
        //return;
      //}
      ////Looping
      //for(int i=0; i<Validator.values().length; i++){
      ////for(Validator validator : Validator.values()){
        ////System.out.println("This for = "+i);
        ////System.out.println("Validator getValue by [i] = "+Validator.values()[i].getValue());
        ////System.out.println("Validator value by [i] = "+Validator.values()[i]);
        ////System.out.println("validator lowcase = "+validator.length);
        //int ValidatorGetValue = Validator.values()[i].getValue();
        //String ValidatorValue = ""+Validator.values()[i];
        //while(arabic >= ValidatorGetValue){
          //romanNumbers += ValidatorValue;
          //arabic -= ValidatorGetValue;
        //}
      //}

      //System.out.println(numberArabic+" to roman = "+romanNumbers);
      System.out.println("rr = "+rr);
      return rr;

    } 
}
