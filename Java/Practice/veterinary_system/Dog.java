import java.util.Arrays;

public class Dog implements Animal{
    private String name;
    private int age;
    private char sex;
    private Double weight;
    private Double height;
    private Boolean has_owner;
    private Arrays records;

    public Dog(String n, int a, char s, Double w, Double h, Boolean o){
        this.name=n;
        this.age=a;
        this.sex=s;
        this.weight=w;
        this.height=h;
        this.has_owner=o;
    }

//getters
    @Override
    public String getName(){
        return "The patient is named " +name+ ".";}
    @Override
    public String getAge(){
        return "Patient " +name+ " is " +age+ " years of age.";}
    @Override
    public String getSex(){
        String resultS="";
        if (sex=='F'){
            resultS = "Patient " +name+ " is female.";}
        if (sex=='M'){
            resultS = "Patient " +name+ " is male.";}
        return resultS;}
    @Override
    public String getSize(){
        return "Patient " +name+ " is " +weight+ " pounds and " +height+ " inches.";}
    @Override
    public String getHas_owner(){
        String resultO = "";
        if (has_owner){
            resultO = "Patient " +name+ " has an owner.";}
        if (!has_owner){
            resultO = "Patient " +name+ " does not have an owner.";}
        return resultO;}

//setters
    @Override
    public void setName(String name){
        this.name=name;}
    @Override
    public void setAge(int age){
        this.age=age;}
    @Override
    public void setSex(char sex){
        this.sex=sex;}
    @Override
    public void setWeight(Double weight){
        this.weight=weight;}
    @Override
    public void setHeight(Double height){
        this.height=height;}
    @Override
    public void setHas_owner(Boolean has_owner){
        this.has_owner=has_owner;}
}


