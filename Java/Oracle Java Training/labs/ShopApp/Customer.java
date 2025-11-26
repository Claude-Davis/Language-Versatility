public class Customer {
    String name;

    //constructor
    public Customer(String n){
        this.name=n;}

    //getter
    public void getName(){
        System.out.println("This customer is " +name);}
    
    //setter
    public void setName(String n){
        this.name=n;
    }

    //other methods
    public void greeting(){
        System.out.println("Hello " +name+ "!");}
}
