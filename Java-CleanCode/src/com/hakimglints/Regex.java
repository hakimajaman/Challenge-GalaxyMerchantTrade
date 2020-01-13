package com.hakimglints;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

/*
 *
 * this for Roman
 *
 */
  public static String regexIt = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

/*
 *
 * this for storing number
 *
 */
  public static Pattern regexIs = Pattern.compile("^([a-zA-Z]+) is (I|V|X|L|C|D|M)$");

/*
 *
 * this for storing credits
 *
 */
  public static Pattern regexCredits = Pattern.compile("^([a-zA-Z]+)([a-zA-Z\\s]*) is ([0-9]+) (Credits)$");

/*
 *
 * this for how much question
 *
 */
  public static Pattern regexHowMuch = Pattern.compile("^how much is ([a-zA-Z\\s]*)\\?$");

/*
 *
 * this for how many Credits question
 *
 */
  public static Pattern regexHowManyCredits = Pattern.compile("^how many Credits is ([a-zA-Z\\s]*)\\?$");


}
