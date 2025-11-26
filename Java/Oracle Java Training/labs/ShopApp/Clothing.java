public class Clothing {
    String description, size="M";
    double price;

    //setter
    public void setDesc(String d){
        this.description=d;}
    public void setPrice(double p){
        this.price=p;}
    public void setSize(String s){
        this.size=s;}

    //getter
    public double getPrice(){return price;}
    public String getDesc(){return description;}

    //toString
    public String toString(){return "This is a size " +size+ ", " +description+ " selling for $" +price+ ".";}
}
