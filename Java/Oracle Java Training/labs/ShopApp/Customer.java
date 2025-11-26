public class Customer {
    String name;
    String size;
    int measurement=3;

    //constructor
    public Customer(String n, String s){
        this.name=n;
        this.size=s;}

    //getter
    public void getName(){
        System.out.println("This customer is " +name);}
    public int getMeasure(){
        return measurement;}
    
    //setter
    public void setName(String n){
        this.name=n;
    }

    //other methods
    public void greeting(){
        System.out.println("Hello " +name+ "!");}
}
