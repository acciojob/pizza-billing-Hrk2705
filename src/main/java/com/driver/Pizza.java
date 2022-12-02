package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int total;
    int extraToppings;
    int extraCheese;
    int takeaway;
    boolean addExtraToppings;
    boolean addExtraCheese;
    boolean addTakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg == true) {
            this.price = 300;
            this.extraToppings = 70;
        }
        else {
            this.price = 400;
            this.extraToppings = 120;
        }
        this.extraCheese = 80;
        this.takeaway = 20;
        this.bill = "";
        this.addExtraToppings = false;
        this.addExtraCheese = false;
        this.addTakeaway = false;
        this.total = this.price;
        // your code goes here
    }

    public int getPrice(){

        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(!addExtraCheese) {
            addExtraCheese = true;

            this.total += this.extraCheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addExtraToppings)
        {
            addExtraToppings = true;

            this.total += this.extraToppings;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!addTakeaway)
        {
            addTakeaway = true;

            this.total += this.takeaway;
        }
    }

    public String getBill(){
        // your code goes here
        System.out.println("Base Price Of The Pizza: " + this.price);
        if(addExtraCheese == true)
        System.out.println("Extra Cheese Added: " + this.extraCheese);
        if(addExtraToppings == true)
        System.out.println("Extra Toppings Added: " + this.extraToppings);
        if(addTakeaway == true)
        System.out.println("Paperbag Added: " + this.takeaway);
        this.bill = "Total Price: " + this.total;
        return this.bill;
    }
}
