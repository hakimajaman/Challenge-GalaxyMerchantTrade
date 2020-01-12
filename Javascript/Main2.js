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

/*
 *
 * this for storing number
 *
 */
  var regexIs = /^([a-zA-Z]+) is (I|V|X|L|C|D|M)$/

  var planetLanguageValue;
  var input = language;
  var MatchIt = regexIs.test(input);

  if(MatchIt == false){
    console.log("Read README.md for how to use it");
    return;
  } else {
    planetLanguageValue = input.match(regexIs);
    console.log(planetLanguageValue);
    console.log("----\n");
  }

/*
 *
 * this for storing credits
 * regex = /http\:\/\/www\.youtube\.com\/watch\?v=([\w-]{11})/;
 */
  //var regexCredits = /^([a-zA-Z]+) is )$/
var regex = /http\:\/\/www\.youtube\.com\/watch\?v=([\w-]{11})/;
var url = 'http://www.youtube.com/watch?v=Ahg6qcgoay4';
var id = url.match(regex);
  console.log(id);
}

//planet("glob prok");
//planet("glob glob", "silver");
//planet("prok glob glob");
//planet("prok pish");
planet("glob is I", "silver");

