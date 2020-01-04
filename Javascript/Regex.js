const string = "Try regex to Roman";
const regex = /Roman/;
/*
 *
 * Regex practice
 * regex101.com
 * 
  */

//const isExist = regex.test(string);

//console.log(isExist);

//const string = "Try regex to 5Roman5";
//const regex = /regex to [a-zA-Z0-9]+/;
const isExist = regex.exec(string);

console.log(isExist);

//const string = "Try regex to Roman";
//const regex = /regex to ([a-zA-Z]+)/;
//const match = regex.exec(string);
//if(match){
  //const name = match;
  //console.log(name);
//} else {
  //console.log("no match");
//}

