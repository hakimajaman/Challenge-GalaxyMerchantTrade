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

const planet = (language, money) => {
  
  var PlanetlanguageList = ["glob", "prok", "pish", "tegj"];

  var romanListValue = [1,5,10,50];
  var index = 0;
  var indexLength = 0;
  var result = [];
  var resultLength = 0;

  var planetChar = "";
  planetChar = language;
 
  var decimal = 0;
  var lastLett = 0;
  var total = 0;
  var arrayLength = [];
  var pushIt = [];
  var angka = [];

  //function countIt(Total, LastLett, LastDec){
    //if(LastLett > Total){
      //console.log("Total-: "+Total);
      //console.log("LastLett-: "+LastLett);
      //console.log("LastDec-: "+LastDec);
      //return LastDec - Total;
    //} else {
      //console.log("Total+: "+Total);
      //console.log("LastLett+: "+LastLett);
      //console.log("LastDec+: "+LastDec);
      //return LastDec + Total;
    //}
  //}
  var arrayChar = []; 
  var indexArrayChar = [];
  var arrayNum = [];
  for(var i in planetChar){
    index = planetChar.indexOf(PlanetlanguageList[i]);
    while(index != -1){
      pushIt.push(result);
      var LoopValue = arrayLength.length-pushIt.length;

      arrayChar.push(PlanetlanguageList[i]);
      indexArrayChar.push(index);
      planetChar = planetChar.replace(PlanetlanguageList[i], "-");
      index = planetChar.indexOf(PlanetlanguageList[i]);
    }
  }
  
  indexArrayChar.sort(function(a,b){
    return b-a
  });

  function sortWithIndeces2(toSortt) {
    for(var i=0; i < indexArrayChar.length; i++){
      var y = indexArrayChar[i];
      toSortt[i] = [toSortt[i], y];
      console.log("toSortt[y]: "+toSortt[i]);
    }
    toSortt.sort(function(left, right){
      return left[0] > right[0] ? -1 : 1;
    });
    toSortt.sortWithIndeces2 = [];
    for(var j=0; j < indexArrayChar.length; j++){
      toSortt.sortWithIndeces2.push(toSortt[j][1]);
      toSortt[j] = toSortt[j][0];
    }
    console.log("\nSortChar: "+toSortt+"\n");
    return toSortt;
  }

sortWithIndeces2(arrayChar);

  //console.log("IndexArrayChar: "+indexArrayChar);
  //console.log("ArrayChar: "+arrayChar);
  //console.log("PlanetlanguageList: "+PlanetlanguageList);
  //console.log("PlanetCharFromFor: "+planetChar+"\n");
  for(var z in language){
    var indexof = PlanetlanguageList.indexOf(arrayChar[z]);
    //var indexof = arrayChar.indexOf(PlanetlanguageList[z]);
    //console.log("BeforeIndexOf: "+indexof);
    if(indexof != -1){
      //console.log(romanListValue[indexof]);
      arrayNum.push(romanListValue[indexof]);
    }
    //console.log("indexof: "+indexof);
  }
  console.log("ArrayChar: "+arrayChar);
  console.log("Result: "+result);
  console.log("ArrayNum: "+arrayNum);

  function countIt(Total, LastLett, LastDec){
    if(LastLett > Total){
      console.log("Total: "+Total);
      console.log("LastLett: "+LastLett);
      console.log("LastDec: "+LastDec);
      return LastDec - Total;
    } else {
      console.log("Total: "+Total);
      console.log("LastLett: "+LastLett);
      console.log("LastDec: "+LastDec);
      return LastDec + Total;
    }

  }

  for(var j=arrayNum.length-1; j>=0; j--){
    var k = j;
    //console.log("K: "+k);
    //console.log("Loop "+j);
    total = arrayNum[k];
    decimal = countIt(total, lastLett, decimal);
    //if(lastLett > total){
      //decimal = decimal - total
      //console.log("\n");
      //console.log("lastLett- :"+lastLett);
      //console.log("Decimal- : "+decimal);
      //console.log("Total- : "+total);
    //} else if(lastLett < total) {
      //decimal = decimal + total
      //console.log("\n");
      //console.log("lastLett+ : "+lastLett)
      //console.log("Decimal+ : "+decimal);
      //console.log("Total+ : "+total);
    //}
    lastLett = arrayNum[k];
    //console.log("\n");
  }

  if(money == "silver"){
    decimal = decimal * 17
  } else if(money == "gold"){
    decimal = decimal * 14450
  } else if(money == "iron"){
    decimal = decimal * 782
  }

  console.log("TotalDecimal: "+decimal);

}

//planet("globprok");
planet("globglob", "silver");
//planet("prokglobglob");
//planet("prokpish");
//planet("tegjtegjglob");
 
