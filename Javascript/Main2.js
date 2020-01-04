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
    //while(arabic >= Validator[i]){
      //romanNumbers += i;
      //arabic -= Validator[i];
      //console.log(i);
    //}
  //}

  //console.log(romanNumbers);
//}

//roman(402);

//const roman = (language) => {
 
  //var regexIt = /^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$/

  //var languageList = ["I", "V", "X", "L", "C", "D", "M"];
  //var romanListValue = [1,5,10,50,100,500,1000];

  //var MatchIt = regexIt.test(language);

  //var romanChar = "";
  //romanChar = language;
  //console.log("FromTOP: "+romanChar.length)
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
      //return LastDec - Total;
    //} else {
      //return LastDec + Total;
    //}
  //}
//if(MatchIt == true){
  //var decimal = 0;
  //var lastNumber = 0;

  //for(var i=romanChar.length-1; i>=0; i--){
    //var string = romanChar.charAt(i);
    //console.log(romanChar.length)
    //decimal = countIt(changeChar(string), lastNumber, decimal);
    //lastNumber = changeChar(string);
  //}

  //console.log("TotalDecimal: "+decimal);
  //return decimal;
  //}
//else {
  //console.log("Wrong Input");
  //}

//}

//roman("II");

const planet = (language) => {
  
  var PlanetlanguageList = ["glob", "prok", "pish", "tegj"];
  var languageList = ["I", "V", "X", "L"];
  var romanListValue = [1,5,10,50];
  var index = 0;
  var result = 0;

  var romanChar = "";
  romanChar = language;
 
  var decimal = 0;
  var lastNumber = 0;
  var arrayLength = [];
  var parseIt = [];

  for(var i in language){
    index = language.indexOf(PlanetlanguageList[i]);
    while(index != -1){
      result += parseInt(romanListValue[i]);
      console.log("ResultI: "+result);
      arrayLength.push(result);
      parseIt.push(result);

      for(var j=arrayLength.length-1; j>=0; j--){
        decimal = countIt(parseInt(parseIt[i]), lastNumber, decimal);
        lastNumber = parseInt(parseIt[i]);
        console.log("Parsing: "+parseIt[i]);
      }

      language = language.replace(PlanetlanguageList[i], "");
      index = language.indexOf(PlanetlanguageList[i]);
    }
  }

  //for(var j=arrayLength.length-1; j>=0; j--){
    //decimal = countIt(parseInt(parseIt[j]), lastNumber, decimal);
    //lastNumber = parseInt(parseIt[j]);
    //console.log("Parsing: "+parseIt[j]);
  //}

  function countIt(Total, LastLett, LastDec){
    if(LastLett > Total){
      return LastDec - Total;
    } else {
      return LastDec + Total;
    }
  }


  console.log("ResultOut: "+result);

  console.log("ArrayLength: "+arrayLength.length);
  console.log("TotalDecimal: "+decimal);
  console.log(result);
  return result;
}

planet("prokglob");
 
