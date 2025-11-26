public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Shop!");

        //create a customer obj
        Customer c1 = new Customer("Jaimie");
        //greet customer
        c1.greeting();
        //change customer name
        c1.setName("Johnny");
        //greet customer
        c1.greeting();
    }
}
