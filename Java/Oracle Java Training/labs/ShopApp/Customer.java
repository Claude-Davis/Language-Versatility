public class Customer {
    String name;
    String size;
    int measurement=3;

    //constructor
    public Customer(String n, String s){
        this.name=n;
        this.size=s;}

    //getter
    public String getName(){
        return name;}
    public int getMeasure(){
        return measurement;}
    public String getSize(){
        return size;}
    
    //setter
    public void setName(String n){
        this.name=n;
    }

    //other methods
    public void greeting(){
        System.out.println("Hello " +name+ "!");}
}
