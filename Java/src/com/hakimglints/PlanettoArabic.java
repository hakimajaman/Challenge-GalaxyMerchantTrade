package com.hakimglints;

//Import Scanner ---
import java.util.Scanner;

//Import Push to Array func ---
import java.util.Stack;

//Import Regex
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlanettoArabic {

  //public static String regexIt = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

  //public static int planetNumber(){
    //String roman = "";
    //roman = inputs();
    
    //String[] romanOfStr = roman.split(" ");
    //Stack<String> thisRomanArr = new Stack<String>();
    //for(String a : romanOfStr){
      //thisRomanArr.push(a);
    //}
    //int thisRomanArrLength = thisRomanArr.size();

    //String changeCharac = "";
    //for(int i=0; i<thisRomanArrLength; i++){
      //changeCharac += changeChar2(thisRomanArr.get(i));
    //}

    //boolean MatchIt = changeCharac.matches(regexIt);

    //int arabic = 0;
    //int lastNumber = 0;

    //if(MatchIt == true){
      //for(int i=thisRomanArrLength-1; i>=0; i--){
        //char thischar = changeCharac.charAt(i);
        //arabic = countIt(changeChar(thischar), lastNumber, arabic);
        //lastNumber = changeChar(thischar);
      //}
    //} else {
      //System.out.println("Your RomanNumber is false");
      //return 0;
    //}

    //System.out.println("Convert to Arabic is = "+arabic);
    //return arabic;
  //}

  //public static String inputs(){
    //String inp = "";
    //Scanner scanIn = new Scanner(System.in);
    //inp = scanIn.nextLine();

    //return inp;
  //}

  //public static int changeChar(char change){
    //int values = -1;
    //int[] romanListValue = {1,5,10,50,100,500,1000};
    //switch(change){
      //case 'I': values = romanListValue[0]; break;
      //case 'V': values = romanListValue[1]; break;
      //case 'X': values = romanListValue[2]; break;
      //case 'L': values = romanListValue[3]; break;
      //case 'C': values = romanListValue[4]; break;
      //case 'D': values = romanListValue[5]; break;
      //case 'M': values = romanListValue[6]; break;
    //}
    ////System.out.println(values);

    //return values;
  //}

  //public static String changeChar2(String change){
    //String values = "";
    //switch(change){
      //case "glob": values = "I"; break;
      //case "prok": values = "V"; break;
      //case "pish": values = "X"; break;
      //case "tegj": values = "L"; break;
    //}
    ////System.out.println(values);

    //return values;
  //}
  //public static int countIt(int Total, int LastLett, int LastDec){
    //if(LastLett > Total){
      //return LastDec - Total;
    //} else {
      //return LastDec + Total;
    //}
  //}

/*
 *
 * this for Roman
 *
 */
  public static String regexIt = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

  public static int changeChar2(String change){
    int values = -1;
    int[] romanListValue = {1,5,10,50,100,500,1000};
    switch(change){
      case "I": values = romanListValue[0]; break;
      case "V": values = romanListValue[1]; break;
      case "X": values = romanListValue[2]; break;
      case "L": values = romanListValue[3]; break;
      case "C": values = romanListValue[4]; break;
      case "D": values = romanListValue[5]; break;
      case "M": values = romanListValue[6]; break;
    }
    System.out.println(values);

    return values;
  }

/*
 *
 * this for storing number
 *
 */
  public static Pattern regexIs = Pattern.compile("^([a-zA-Z]+) is (I|V|X|L|C|D|M)$");

  public static int storingNumber() {
    Stack<String> planetLanguageWords = new Stack<String>();
    Stack<String> planetLanguageValues = new Stack<String>();
    String inputLanguage = "glob is I";
    boolean MatchItLanguage = inputLanguage.matches(String.valueOf(regexIs));
    System.out.println(MatchItLanguage);

    if(MatchItLanguage == false){
      System.out.println("Read README.md for how to use it");
      return 0;
    } else {
      Matcher matcherLanguage = regexIs.matcher(inputLanguage);
      if(matcherLanguage.find()){
        planetLanguageWords.push(matcherLanguage.group(1));
        planetLanguageValues.push(matcherLanguage.group(2));
      }
      System.out.println(planetLanguageWords);
      System.out.println(planetLanguageValues);
    }

    String changeCharact = "";
    for(int i=0; i<planetLanguageValues.size(); i++){
      changeCharact += changeChar2(planetLanguageValues.get(i));
    }
      System.out.println(changeCharact);


    return 0;
  }

/*
 *
 * this for storing credits
 *
 */
  public static Pattern regexCredits = Pattern.compile("^([a-zA-Z]+)([a-zA-Z\\s]*) is ([0-9]+) (Credits)$");

  public static int storingCredits(){
    Stack<String> planetCreditsWords = new Stack<String>();
    String planetCreditsValues = "0";
    String planetCreditsRomanValues = "";
    Stack<Integer> planetCreditsCountRomanValues = new Stack<Integer>();
    String planetCreditsCount = "";
    String[] planetCreditsCountArr = {};
    Stack<String[]> planetCreditsCountArrStack = new Stack<String[]>();
    String inputCredits = "glob glob Silver is 34 Credits";
    boolean MatchItCredits = inputCredits.matches(String.valueOf(regexCredits));

    if(MatchItCredits == false){
      System.out.println("Please Read README.md for how to use it");
      return 0;
    } else {
      Matcher matcherCredits = regexCredits.matcher(inputCredits);
      if(matcherCredits.find()){
        String[] aftersplitCredits = (matcherCredits.group(2).split(" "));
        String lastArrCredits = aftersplitCredits[aftersplitCredits.length-1];
        planetCreditsWords.push(lastArrCredits);
        planetCreditsValues = matcherCredits.group(3);
        System.out.println(planetCreditsWords);
        planetCreditsCount += matcherCredits.group(1); planetCreditsCount += matcherCredits.group(2);
        planetCreditsCountArr = planetCreditsCount.split(" ");
      }
      int lenggg = planetCreditsCountArr.length;
      for(int i=0; i<planetCreditsCountArr.length; i++){
        if(planetCreditsCountArr[i] === lastArrCredits){
          planetCreditsCountArr.splice(i, 1);
        }
      }
      //planetCreditsCountArrStack.push(planetCreditsCountArr);
      //planetCreditsCountArrStack.pop();
      System.out.println(lenggg);
    }

    return 0;
  }
}
