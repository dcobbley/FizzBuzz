package edu.pdx.CS410J.stuff;

import edu.pdx.cs410J.AbstractPhoneBill;

/**
 * The main class for our FizzBuzz in class programming
 * We pair programmed this in a group of Three.
 * Author's : Jonathan Shepardson, Dustin Reynolds and David Cobbley.
 */
public class Project1 {

  public static void main(String[] args) {
    for(int not_x = 1; not_x<=100;not_x++) {
      //check if FizzBuzz - divisibly by 3 and 5
      if(not_x%3 == 0 && not_x%5 == 0) {
        System.out.println("FizzBuzz");
      }
      //check if Fizz - divisible by 3
      else if (not_x%3 == 0) {
        System.out.println("Fizz");
      }
      //check if Buzz - divisible by 5
      else if (not_x%5 == 0) {
        System.out.println("Buzz");
      }
      else {
        System.out.println(not_x);
      }
    }
    System.exit(0);
  }

  public static void julius() {
    System.out.println("Good morning Julius... = )");
  }
}