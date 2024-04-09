package com.jakobniinja;

import com.godtsoft.diyjava.DIYWindow;
import java.util.Random;

public class GuessMyNumber extends DIYWindow {

  public GuessMyNumber() {
    Random random = new Random();

    int myNumber = random.nextInt(101);

    int myGuess = promptForInt("Guess my number, between 0 and 100");
    int count = 1;

    while (myGuess != myNumber) {
      String message = (myGuess < myNumber) ? "You guessed too low, try again." : "You guessed too high, try again.";
      myGuess = promptForInt(message);
      count++;
    }

    print("You guessed it in " + count + " tries!");
  }

  private int promptForInt(String prompt) {
    int i = 0;

    print(prompt);
    String s = input();
    try {
      i = Integer.parseInt(s);
    } catch (NumberFormatException e) {
      print(s + " is not a valid number. Try again.");
    }

    return i;
  }

  public static void main(String[] args) {
    new GuessMyNumber();
  }
}


