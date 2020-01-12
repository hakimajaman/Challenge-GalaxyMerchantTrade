//const roman = (arabic) => {
  
  //var Validator = {
    //M: 1000,
    //CM: 900,
    //D: 500,
    //CD: 400,
    //C: 100,
    //XC: 90,
    //L: 50,
    //XL: 40,
    //X: 10,
    //IX: 9,
    //V: 5,
    //IV: 4,
    //I: 1
  //}

  //var romanNumbers = "";

  //for(var i in Validator) {
    //console.log("This Validator[i] = "+Validator[i])
    //while(arabic >= Validator[i]){
      //romanNumbers += i;
      //arabic -= Validator[i];
      //console.log("i: "+i);
    //}
  //}

  //console.log("Roman Numbers: "+romanNumbers);
//}

//roman(402);

//const roman = (language) => {
 
  //var regexIt = /^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$/

  //var languageList = ["I", "V", "X", "L", "C", "D", "M"];
  //var romanListValue = [1,5,10,50,100,500,1000];

  //var MatchIt = regexIt.test(language);

  //var romanChar = "";
  //romanChar = language;
  //console.log("RomanChar: "+romanChar);
  //function changeChar(change){
    //var values = -1
    //switch(change){
      //case 'I': values = romanListValue[0]; break;
      //case 'V': values = romanListValue[1]; break;
      //case 'X': values = romanListValue[2]; break;
      //case 'L': values = romanListValue[3]; break;
      //case 'C': values = romanListValue[4]; break;
      //case 'D': values = romanListValue[5]; break;
      //case 'M': values = romanListValue[6]; break;
    //}

    //return values;
  //}
 
  //function countIt(Total, LastLett, LastDec){
    //if(LastLett > Total){
      //console.log("Total: "+Total);
      //console.log("LastLett: "+LastLett);
      //console.log("LastDec: "+LastDec);
      //return LastDec - Total;
    //} else {
      //console.log("Total: "+Total);
      //console.log("LastLett: "+LastLett);
      //console.log("LastDec: "+LastDec);
      //return LastDec + Total;
    //}

  //}
//if(MatchIt == true){
  //var decimal = 0;
  //var lastNumber = 0;

  //for(var i=romanChar.length-1; i>=0; i--){
    //var string = romanChar.charAt(i);
    //decimal = countIt(changeChar(string), lastNumber, decimal);
    //lastNumber = changeChar(string);
    //console.log("LastNumber: "+lastNumber);
    //console.log("Decimal: "+decimal)
  //}

  //console.log("TotalDecimal: "+decimal+"\n");
  //return decimal;
  //}
//else {
  //console.log("Wrong Input");
  //}

//}

//roman("VI");

//const planet = (language, money) => {

  //var regexIt = /^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$/
  
  //var romanListValue = [1,5,10,50];
  //var planetChar = "";
  //planetChar = language;
  //var aftersplit = planetChar.split(" "); 
  //var arrayNum = aftersplit;
  //arrayNum.sort(function(a,b){
    //return b-a
  //});

  //function changeChar(change){
    //var values = null
    //switch(change){
      //case "glob": values = "I"; break;
      //case "prok": values = "V"; break;
      //case "pish": values = "X"; break;
      //case "tegj": values = "L"; break;
    //}
    //return values;
  //}

  //function changeChar2(change){
    //var values = -1
    //switch(change){
      //case 'I': values = romanListValue[0]; break;
      //case 'V': values = romanListValue[1]; break;
      //case 'X': values = romanListValue[2]; break;
      //case 'L': values = romanListValue[3]; break;
    //}
    //return values;
  //}

  //var changCharac = "";
  //for(var i=0; i<arrayNum.length; i++) {
    //changCharac += changeChar(arrayNum[i]);
  //}
  
  //var MatchIt = regexIt.test(changCharac);

  //function countIt(Total, LastLett, LastDec){
    //if(LastLett > Total){
      //return LastDec - Total;
    //} else {
      //return LastDec + Total;
    //}

  //}

  //var total = 0;
  //var lastNumber = 0;
  //if(MatchIt == true){
    //for(var i=arrayNum.length-1; i>=0; i--){
      //total = countIt(changeChar2(changCharac.charAt(i)), lastNumber, total);
      //lastNumber = changeChar2(changCharac.charAt(i));
    //}
    //if(money == "silver"){
      //total = total * 17
    //} else if(money == "gold"){
      //total = total * 14450
    //} else if(money == "iron"){
      //total = total * 782
    //}
  //} else {
    //console.log("wrong input!");
    //return;
  //}
  //console.log("TotalDecimal: "+total);

//}

////planet("glob prok");
////planet("glob glob", "silver");
////planet("prok glob glob");
////planet("prok pish");
//planet("glob glob", "silver");

const planet = (language) => {

/*
 *
 * this for Roman
 *
 */
  var regexIt = /^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$/
  var romanListValue = [1,5,10,50];

  function changeChar2(change){
    var values = -1
    switch(change){
      case 'I': values = romanListValue[0]; break;
      case 'V': values = romanListValue[1]; break;
      case 'X': values = romanListValue[2]; break;
      case 'L': values = romanListValue[3]; break;
    }
    return values;
  }

/*
 *
 * this for storing number
 *
 */
  var regexIs = /^([a-zA-Z]+) is (I|V|X|L|C|D|M)$/

  var planetLanguageWords = [];
  var planetLanguageValues = [];
  var inputLanguage = language;
  var MatchItLanguage = regexIs.test(inputLanguage);

  if(MatchItLanguage == false){
          console.log("Read README.md for how to use it");
    return;
  } else {
    var matcherLanguage = inputLanguage.match(regexIs);
    planetLanguageWords.push(matcherLanguage[1]);
    planetLanguageValues.push(matcherLanguage[2]);
          console.log(planetLanguageWords);
          console.log(planetLanguageValues);
          //console.log(matcherLanguage);
  }

  var changCharac = "";
  for(var i=0; i<planetLanguageValues.length; i++) {
    changCharac += changeChar2(planetLanguageValues[i]);
  }
          console.log(changCharac);
 
  function planetChangeChar(change){
    for(var i in planetLanguageValues){
      var values = ""
      switch(change){
        case planetLanguageWords[i] : values = planetLanguageValues[i]; break;
      }
      return values;
    }
  }
  //planetChangeChar("glob");

          console.log("----END STORING NUMBERS------\n");
/*
 *
 * this for storing credits
 * 
 */
  var regexCredits = /^([a-zA-Z]+)([a-zA-Z\s]*) is ([0-9]+) (Credits)$/
  //var regexCreditsBETA = /^([0-9]+)([a-zA-Z\s]*) is ([0-9]+) (Credits)$/

  var planetCreditsWords = [];
  var planetCreditsValues = 0;
  var planetCreditsRomanValues = "";
  var planetCreditsCountRomanValues = [];
  var planetCreditsCount = "";
  var inputCredits = "glob glob Silver is 34 Credits";
  var MatchItCredits = regexCredits.test(inputCredits);

  if(MatchItCredits == false){
    console.log("Please Read README.md for how to use it");
    return;
  } else {
    var matcherCredits = inputCredits.match(regexCredits);
    var aftersplitCredits = matcherCredits[2].split(" ");
    var lastArrCredits = aftersplitCredits[aftersplitCredits.length-1];
    planetCreditsWords.push(lastArrCredits);
    planetCreditsValues = matcherCredits[3];
    planetCreditsCount += matcherCredits[1]; planetCreditsCount += matcherCredits[2];
    planetCreditsCount = planetCreditsCount.split(" ");
    planetCreditsCount.pop();
          console.log(planetCreditsWords);
          console.log(planetCreditsValues);

  }
  var index = 0;

  for(var i=0; i<planetCreditsCount.length; i++){
    for(var j in planetLanguageWords){
      index = planetCreditsCount[i].indexOf(planetLanguageWords[j])
      while(index == -1){
          console.log("Your Planet Word was not found");
      return;
      }
      planetCreditsRomanValues += planetChangeChar(planetCreditsCount[i]);
    }
  }

  var countPlanetCreditsValue1 = 0;
  for(var i=0; i<planetCreditsRomanValues.length; i++) {
    countPlanetCreditsValue1 += changeChar2(planetCreditsRomanValues.charAt(i));
  }
  var countPlanetCreditsValue2 = planetCreditsValues / countPlanetCreditsValue1;
  planetCreditsCountRomanValues.push(countPlanetCreditsValue2);

          console.log(planetCreditsCountRomanValues);        
          console.log(countPlanetCreditsValue1); 
          console.log(planetCreditsRomanValues);
          console.log(planetCreditsCount);
          console.log(MatchItCredits);
          console.log("----END STORING CREDITS------\n");
}

//planet("glob prok");
//planet("glob glob", "silver");
//planet("prok glob glob");
//planet("prok pish");
planet("glob is I", "silver");

