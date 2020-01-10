package com.hakimglints;

//Input(Scan) ---
import java.util.Scanner;

//Regex ---
import java.util.regex.*;

public class RomantoArabic {

    public static String regexIt = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

    public static int romanNumber(){
      String roman = "";
      roman = inputs();
      boolean MatchIt = roman.matches(regexIt);

      int arabic = 0;
      int lastNumber = 0;

      if(MatchIt == true){
        for(int i=roman.length()-1; i>=0; i--){
          char thischar = roman.charAt(i);
          arabic = countIt(changeChar(thischar), lastNumber, arabic);
          lastNumber = changeChar(thischar);
        }
      } else {
        System.out.println("Your RomanNumber is false");
        return 0;
      }

      System.out.println("Convert to Arabic is = "+arabic);
      return arabic;
    }

    public static String inputs(){
      String inp = "";
      Scanner scanIn = new Scanner(System.in);
      inp = scanIn.nextLine();

      return inp;
    }

    public static int changeChar(char change){
      int values = -1;
      int[] romanListValue = {1,5,10,50,100,500,1000};
      switch(change){
        case 'I': values = romanListValue[0]; break;
        case 'V': values = romanListValue[1]; break;
        case 'X': values = romanListValue[2]; break;
        case 'L': values = romanListValue[3]; break;
        case 'C': values = romanListValue[4]; break;
        case 'D': values = romanListValue[5]; break;
        case 'M': values = romanListValue[6]; break;
      }
      //System.out.println(values);

      return values;
    }

    public static int countIt(int Total, int LastLett, int LastDec){
      if(LastLett > Total){
        return LastDec - Total;
      } else {
        return LastDec + Total;
      }
    }

}
