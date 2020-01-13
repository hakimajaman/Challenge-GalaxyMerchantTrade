package com.hakimglints;

import java.util.Stack;

public class InputNotes {

/*
 *
 * this for storing number
 *
 */
  
  //public static final Stack<String> planetLanguageWords = new Stack<String>();
  //public Stack<String> planetLanguageValues = new Stack<String>();

  //public int storingNumber() {
    //String inputLanguage = "glob is I";
    //boolean MatchItLanguage = inputLanguage.matches(String.valueOf(regexIs));

    //if(MatchItLanguage == false){
      //System.out.println("Read README.md for how to use it");
      //return 0;
    //} else {
      //Matcher matcherLanguage = regexIs.matcher(inputLanguage);
      //if(matcherLanguage.find()){
        //this.planetLanguageWords.push(matcherLanguage.group(1));
        //this.planetLanguageValues.push(matcherLanguage.group(2));
      //}
      //System.out.println(planetLanguageValues);
    //}

    //String getPlanetLanguageValuesToChar = "";
    //String changeCharact = "";
    //for(int i=0; i<planetLanguageValues.size(); i++){
      //getPlanetLanguageValuesToChar += planetLanguageValues.get(i);
      //changeCharact += changeChar2(getPlanetLanguageValuesToChar.charAt(i));
    //}
    //return 0;
  //}

  //public String planetChangeChar(String change){
    //for(int i=0; i<this.planetLanguageValues.size(); i++){
      //String thisChange = change;
      //String values = "";
      //if(thisChange.equals(this.planetLanguageWords.get(i))){
        //values = this.planetLanguageValues.get(i);
      //} else {
        //System.out.println("No not = "+thisChange);
      //}
      //return values;
    //}
    //return null;
  //}

/*
 *
 * this for storing credits
 *
 */

  //public static Stack<Integer> planetCreditsCountRomanValues = new Stack<Integer>();


  //public static Stack<String> planetCreditsWords = new Stack<String>();
  //public int storingCredits(){

    //String planetCreditsValues = "0";
    //String planetCreditsRomanValues = "";
    //String planetCreditsCount = "";
    //String[] planetCreditsCountArr = {};
    //Stack<String> planetCreditsCountArrStack = new Stack<String>();
    //String inputCredits = "glob glob Silver is 34 Credits";
    //boolean MatchItCredits = inputCredits.matches(String.valueOf(regexCredits));

    //if(MatchItCredits == false){
      //System.out.println("Please Read README.md for how to use it");
      //return 0;
    //} else {
      //Matcher matcherCredits = regexCredits.matcher(inputCredits);
      //if(matcherCredits.find()){
        //String[] aftersplitCredits = (matcherCredits.group(2).split(" "));
        //String lastArrCredits = aftersplitCredits[aftersplitCredits.length-1];
        //planetCreditsWords.push(lastArrCredits);
        //planetCreditsValues = matcherCredits.group(3);
        //planetCreditsCount += matcherCredits.group(1); planetCreditsCount += matcherCredits.group(2);
        //planetCreditsCountArr = planetCreditsCount.split(" ");
      //}
      //for(int i=0; i<planetCreditsCountArr.length; i++){
        //planetCreditsCountArrStack.push(planetCreditsCountArr[i]);
      //}
      //planetCreditsCountArrStack.pop();

      //int index = 0;
      //for(int i=0; i<planetCreditsCountArrStack.size(); i++){
        //for(int j=0; j<this.planetLanguageWords.size(); j++){
          //index = planetCreditsCountArrStack.get(i).indexOf(this.planetLanguageWords.get(j));
          //while(index == -1){
            //System.out.println("I have no idea what you are talking about");
            //return 0;
          //}
          //planetCreditsRomanValues += this.planetChangeChar(planetCreditsCountArrStack.get(i));
          //System.out.println("stackcount = "+planetCreditsCountArrStack.get(i));
        //}
      //}
      //System.out.println("roman values = "+planetCreditsRomanValues);

      //int countPlanetCreditsValue1 = 0;
      //for(int i=0; i<planetCreditsRomanValues.length(); i++){
        //countPlanetCreditsValue1 += changeChar2(planetCreditsRomanValues.charAt(i));
      //}

      //int countPlanetCreditsValue2 = Integer.parseInt(planetCreditsValues) / countPlanetCreditsValue1;
      //planetCreditsCountRomanValues.push(countPlanetCreditsValue2);
      //System.out.println("Silvernya - "+planetCreditsCountRomanValues);
    //}


    //return 0;
  //}

  //public int planetCreditsChangeChar(String change){
    //for(int i=0; i<planetCreditsCountRomanValues.size(); i++){
      //String thisChange = change;
      //int values = 0;
      //if(thisChange.equals(this.planetCreditsWords.get(i))){
        //values = this.planetCreditsCountRomanValues.get(i);
      //} else {
        //System.out.println("No not = "+thisChange);
      //}
      //return values;
    //}
    //return 0;
  //}


/*
 *
 * this for how much question
 *
 */

  //public int howMuchQuestion(){
    //Stack<String> planetHowMuchWords = new Stack<String>();
    //String planetHowMuchRomanValues = "";
    //String inputHowMuch = "how much is glob glob ?";
    //boolean MatchItHowMuch = inputHowMuch.matches(String.valueOf(regexHowMuch));

    //if(MatchItHowMuch == false){
      //System.out.println("I have no idea what you are talking about");
      //return 0;
    //} else {
      //Matcher matcherHowMuch = regexHowMuch.matcher(inputHowMuch);
      //if(matcherHowMuch.find()){
        //String[] aftersplitHowMuch = (matcherHowMuch.group(1).split(" "));
        //for(int i=0; i<aftersplitHowMuch.length; i++){
          //planetHowMuchWords.push(aftersplitHowMuch[i]);
        //}
        //System.out.println("wordsss = "+planetHowMuchWords);
      //}
    //}

    //int index = 0;
    //for(int i=0; i<planetHowMuchWords.size(); i++){
      //for(int j=0; j<this.planetLanguageWords.size(); j++){
        //index = planetHowMuchWords.get(i).indexOf(this.planetLanguageWords.get(j));
        //while(index == -1){
          //System.out.println("Your Planet Word was not found");
          //return 0;
        //}
        //planetHowMuchRomanValues += this.planetChangeChar(planetHowMuchWords.get(i));
        //System.out.println("Muchh == "+planetHowMuchRomanValues);
      //}
    //}

    //int countPlanetHowMuchValue = 0;
    //for(int i=0; i<planetHowMuchRomanValues.length(); i++){
      //countPlanetHowMuchValue += changeChar2(planetHowMuchRomanValues.charAt(i));
    //}
    //System.out.println("countPlanetHowMuchValue = "+countPlanetHowMuchValue);

    //return 0;
  //}

/*
 *
 * this for how many Credits question
 *
 */

  //public int howManyCreditsQuestion(){
    //Stack<String> planetHowManyCreditsWords = new Stack<String>();
    //String planetHowManyCreditsRomanValues = "";
    //String planetHowManyCreditsCWord = "";
    //String inputHowManyCredits = "how many Credits is glob glob Silver ?";
    //boolean MatchItHowManyCredits = inputHowManyCredits.matches(String.valueOf(regexHowManyCredits));

    //if(MatchItHowManyCredits == false){
      //System.out.println("I have no idea what you are talking about");
      //return 0;
    //} else {
      //Matcher matcherHowManyCredits = regexHowManyCredits.matcher(inputHowManyCredits);
      //if(matcherHowManyCredits.find()){
        //String[] aftersplitHowManyCredits = (matcherHowManyCredits.group(1).split(" "));
        //for(int i=0; i<aftersplitHowManyCredits.length; i++){
          //planetHowManyCreditsWords.push(aftersplitHowManyCredits[i]);
        //}
        //System.out.println("Creditswordsss = "+planetHowManyCreditsWords);
        //String lastArr = planetHowManyCreditsWords.get(planetHowManyCreditsWords.size()-1);
        //System.out.println("sizeWords = "+planetCreditsWords);
        //for(int j=0; j<planetCreditsWords.size(); j++){
          //int index = lastArr.indexOf(planetCreditsWords.get(j));
          //while(index == -1){
            //System.out.println("You must input Credits Word Value");
            //return 0;
          //}
        //}
        //System.out.println("lastArr -= "+lastArr);
        //planetHowManyCreditsCWord = lastArr;
        //planetHowManyCreditsWords.pop();
      //}
    //}

    //int index = 0;
    //for(int i=0; i<planetHowManyCreditsWords.size(); i++){
      //for(int j=0; j<this.planetLanguageWords.size(); j++){
        //index = planetHowManyCreditsWords.get(i).indexOf(this.planetLanguageWords.get(j));
        //System.out.println("INDEXS = "+index);
        //System.out.println("PlanetWord = "+planetHowManyCreditsWords.get(i));
        //System.out.println("IndexPlanetWord = "+planetCreditsWords.get(j));
        //while(index == -1){
          //System.out.println("Your Planet Word was not found 1");
          //return 0;
        //}
        //planetHowManyCreditsRomanValues += this.planetChangeChar(planetHowManyCreditsWords.get(i));
        //System.out.println("ManyCredits == "+planetHowManyCreditsRomanValues);
      //}
    //}

    //int countPlanetHowManyCreditsValue1 = 0;
    //for(int i=0; i<planetHowManyCreditsRomanValues.length(); i++){
      //countPlanetHowManyCreditsValue1 += changeChar2(planetHowManyCreditsRomanValues.charAt(i));
    //}
    //int countPlanetHowManyCreditsValue2 = countPlanetHowManyCreditsValue1 * planetCreditsChangeChar(planetHowManyCreditsCWord);

    //System.out.println(planetHowManyCreditsCWord);

    //return 0;
  //}

}
