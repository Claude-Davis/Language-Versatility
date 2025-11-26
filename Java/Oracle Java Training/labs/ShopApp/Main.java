public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Shop!");

        //tax
        double tax=0.2;
        //total cost
        double total=0.0;

        //create a customer obj
        Customer c1 = new Customer("Jaimie", "S");
        //greet customer
        c1.greeting();
        //change customer name
        c1.setName("Johnny");
        //greet customer
        c1.greeting();

    

        //create clothing objs
        Clothing item1= new Clothing();
        Clothing item2= new Clothing();
        //set clothing obj properties
        item1.setDesc("Blue Jacket");
        item2.setDesc("Orange T-Shirt");
        item1.setPrice(20.9);
        item2.setPrice(10.5);
        item2.setSize("S");

        System.out.println(" ");

        //array of clothing objs
        Clothing[] items = {item1, item2, item2};
        System.out.println(items[1].toString());

        System.out.println(" ");

        //total price calculation
        total += tax*(item1.getPrice()+(2*item2.getPrice())) + (item1.getPrice()+(2*item2.getPrice()));
        System.out.println("The total cost for all items purchased is $"+total+".");

        System.out.println(" ");

        //derive the shirt size of the customer obj
        System.out.println(c1.getName() + " is a size " + sizeCalc(c1.getMeasure()));

    }

    public static String sizeCalc(int measurement) {
        String size;
        switch (measurement){
            case 1, 2, 3:
                size="S";
                break;
            case 4, 5, 6:
                size="M";
                break;
            case 7, 8, 9:
                size="L";
                break;
            default:
                size="X";
        }
        return size;
    }
}
