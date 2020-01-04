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

//const arabic = (roman) => {
  
  //roman = roman.toUpperCase();
  //var romanList = ["CM", "M", "CD", "D", "XC", "C", "XL", "L", "IX", "X", "IV", "V", "I"];
  //var romanListValue = [900, 1000, 400, 500, 90, 100, 40, 50, 9, 10, 4, 5, 1];
  //var index = 0;
  //var num = 0;
  //for(var i in romanList){
    //index = roman.indexOf(romanList[i]);
    //while(index != -1){
      //num += parseInt(romanListValue[i]);
      //roman = roman.replace(romanList[i], "-");
      //index = roman.indexOf(romanList[i]);
    //}
  //}

  //console.log(num);
  //return num;
//}

//arabic("IV");

//const planet = (language) => {
  
  //var languageList = ["glob", "prok", "pish", "tegj"];
  //var romanListValue = [1,5,10,50];
  //var index = 0;
  //var num = 0;
  //for(var i in languageList){
    //index = language.indexOf(languageList[i]);
    //while(index != -1){
      //num += parseInt(romanListValue[i]);
      //language = language.replace(languageList[i], "-");
      //index = language.indexOf(languageList[i]);
    //}
  //}

  //console.log(num);
  //return num;
//}

//planet("glob");

const arabic = (roman) => {
  
  roman = roman.toUpperCase();
  var romanList = ["I", "V", "X", "L", "C", "D", "M"];
  var romanListValue = [1, 5, 10, 50, 100, 500, 1000];
  var index = 0;
  var num = 0;
  for(var i in romanList){
    index = roman.indexOf(romanList[i]);
    console.log("Index: "+index)
    while(index != -1){
      console.log("RomanListValue: "+romanListValue[i])
      //if(num){
        //num += parseInt(romanListValue[i]);
      //}
      var romanValue = parseInt(romanListValue[i]);
      //if(romanValue >= num ){
        num += romanValue;
      //}
      //else {
        //num = romanValue - num;
      //}
      roman = roman.replace(romanList[i], "-");
      index = roman.indexOf(romanList[i]);
      console.log("IndexInWhile: "+index);
      console.log("RomanInWhile: "+roman);
    }
  }

  console.log("Result: "+num);
  return num;
}

arabic("XXII");


