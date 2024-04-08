package com.jakobniinja;

import com.godtsoft.diyjava.DIYWindow;

public class Calculator extends DIYWindow {

  public Calculator() {

    String s = "Y";
    while (s.startsWith("Y") || s.startsWith("y")) {
      int a = promptForInt("Enter a number");
      String operation = promptForString("Enter +,-,* or /");
      int b = promptForInt("Enter another number");

      int c = 0;

      switch (operation) {
        case "+":
          c = a + b;
          print(a + "+" + b + "=" + c);
          break;
        case "-":
          c = a - b;
          print(a + "-" + b + "=" + c);
          break;

        case "*":
          c = a * b;
          print(a + "*" + b + "=" + c);
          break;

        case "/":
          c = a / b;
          print(a + "/" + b + "=" + c);
          break;

        default:
          print(operation + " is not valid operation");
          break;
      }

      s = promptForString("Do you want to do another?");
    }
  }

  private int promptForInt(String prompt) {
    int i = 0;
    print(prompt);
    String s = input();

    try {
      i = Integer.parseInt(s);
    } catch (NumberFormatException e) {
      print(s + " is not a valid number. Try again.");
      i = promptForInt(prompt);
    }
    return i;
  }

  private String promptForString(String prompt) {
    print(prompt);
    String s = input();
    return s;
  }

  public static void main(String[] args) {
    new Calculator();
  }
}
