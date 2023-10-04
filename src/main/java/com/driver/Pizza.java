package com.driver;

public class Pizza {

    private int price=0;
    private Boolean isVeg=true;
    private String bill="";

    //self made parameters.
    private int pizza=0;
    private int extraChees=0;
    private int Toppings=0;
    private int paperBag=0;

    public int getPizza() {
        return pizza;
    }

    public void setPizza(int pizza) {
        this.pizza = pizza;
    }

    public int getExtraChees() {
        return extraChees;
    }

    public void setExtraChees(int extraChees) {
        this.extraChees = extraChees;
    }

    public int getToppings() {
        return Toppings;
    }

    public void setToppings(int toppings) {
        Toppings = toppings;
    }

    public int getPaperBag() {
        return paperBag;
    }

    public void setPaperBag(int paperBag) {
        this.paperBag = paperBag;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg)
            pizza=300;
        else
            pizza=400;

        price+=pizza;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese()
    {
        if(extraChees==0)
            price+=80;

        extraChees=80;
    }

    public void addExtraToppings()
    {
        if(isVeg)
        {
            if(Toppings==0)
                price+=70;
            Toppings = 70;
        }
        else
        {
            if(Toppings==0)
                price+=120;
            Toppings = 120;
        }
    }

    public void addTakeaway(){
        if(paperBag==0)
            price+=20;
        paperBag=20;

    }

    public String getBill(){

        bill="Base Price Of The Pizza: "+pizza+"\n";
        if(extraChees!=0)
            bill+="Extra Cheese Added: "+extraChees+"\n";
        if(Toppings!=0)
            bill+="Extra Toppings Added: "+Toppings+"\n";
        if(paperBag!=0)
            bill+="Paperbag Added: "+paperBag+"\n";

        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
