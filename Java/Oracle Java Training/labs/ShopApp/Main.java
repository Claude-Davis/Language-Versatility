public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Shop!");

        //tax
        double tax=0.2;
        //total cost
        double total=0.0;

        //create a customer obj
        Customer c1 = new Customer("Jaimie");
        //greet customer
        c1.greeting();
        //change customer name
        c1.setName("Johnny");
        //greet customer
        c1.greeting();

        System.out.println(" ");

        //create clothing objs
        Clothing item1= new Clothing();
        Clothing item2= new Clothing();
        //set clothing obj properties
        item1.setDesc("Blue Jacket");
        item2.setDesc("Orange T-Shirt");
        item1.setPrice(20.9);
        item2.setPrice(10.5);
        item2.setSize("S");
        //print the info for the clothingobjs
        System.out.println(item1.toString() + " " + item2.toString());

        System.out.println(" ");

        //total price calculation
        total += tax*(item1.getPrice()+(2*item2.getPrice())) + (item1.getPrice()+(2*item2.getPrice()));
        System.out.println("$"+total);

    }
}
