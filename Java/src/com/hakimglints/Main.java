package com.hakimglints;

//Input(Scan) ---
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Main {

      enum Validator{
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
      
      String romanNumbers = "";
      //System.out.println("Enum Length = "+Validator.values().length);

      System.out.println("Input your ArabicNums to Convert to Roman: ");
        
      Scanner scanIn = new Scanner(System.in);
      String numberArabic = scanIn.nextLine();
      scanIn.close();
      int arabic = Integer.parseInt(numberArabic);

      //Looping
      for(int i=0; i<Validator.values().length; i++){
      //for(Validator validator : Validator.values()){
        //System.out.println("This for = "+i);
        //System.out.println("Validator getValue by [i] = "+Validator.values()[i].getValue());
        //System.out.println("Validator value by [i] = "+Validator.values()[i]);
        //System.out.println("validator lowcase = "+validator.length);
        int ValidatorGetValue = Validator.values()[i].getValue();
        String ValidatorValue = ""+Validator.values()[i];
        while(arabic >= ValidatorGetValue){
          romanNumbers += ValidatorValue;
          arabic -= ValidatorGetValue;
        }
      }

      System.out.println(numberArabic+" to roman = "+romanNumbers);


      //scanIn.close();
      //System.out.println("Here's your text: "+whatever);
    }

}
