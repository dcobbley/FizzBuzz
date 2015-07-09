package edu.pdx.CS410J.stuff;

import edu.pdx.cs410J.AbstractPhoneBill;

/**
 * The main class for the CS410J Phone Bill Project
 */
public class Project1 {

  public static void main(String[] args) {
    for(int x = 1; x<=100;x++) {
      //check if FizzBuzz - divisibly by 3 and 5
      if(x%3 == 0 && x%5 == 0) {
        System.out.println("FizzBuzz");
      }
      //check if Fizz - divisible by 3
      else if (x%3 == 0) {
        System.out.println("Fizz");
      }
      //check if Buzz - divisible by 5
      else if (x%5 == 0) {
        System.out.println("Buzz");
      }
      else {
        System.out.println(x);
      }
    }
    System.exit(0);
  }

  public static void julius() {
    System.out.println("Good morning Julius...");
  }
}