package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addTakeaway();
    System.out.println(dp.getBill());
    System.out.println();

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());
  }
}