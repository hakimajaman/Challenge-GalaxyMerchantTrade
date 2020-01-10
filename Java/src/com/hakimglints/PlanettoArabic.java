package com.hakimglints;

//Import Scanner ---
import java.util.Scanner;

//Import Push to Array func ---
import java.util.Stack;

public class PlanettoArabic {

  public static String regexIt = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

  public static int planetNumber(){
    String roman = "";
    roman = inputs();
    
    String[] romanOfStr = roman.split(" ");
    Stack<String> thisRomanArr = new Stack<String>();
    for(String a : romanOfStr){
      thisRomanArr.push(a);
    }
    int thisRomanArrLength = thisRomanArr.size();

    String changeCharac = "";
    for(int i=0; i<thisRomanArrLength; i++){
      changeCharac += changeChar2(thisRomanArr.get(i));
    }

    boolean MatchIt = changeCharac.matches(regexIt);

    int arabic = 0;
    int lastNumber = 0;

    if(MatchIt == true){
      for(int i=thisRomanArrLength-1; i>=0; i--){
        char thischar = changeCharac.charAt(i);
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

  public static String changeChar2(String change){
    String values = "";
    switch(change){
      case "glob": values = "I"; break;
      case "prok": values = "V"; break;
      case "pish": values = "X"; break;
      case "tegj": values = "L"; break;
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
