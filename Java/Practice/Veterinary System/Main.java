import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main (String[] arg){
        Scanner scan = new Scanner(System.in);
        ArrayList<Dog> k9Patients = new ArrayList<>();
        /*
        System.out.println("[ Veterinary System ]");
        System.out.println(" ");

        System.out.println("Refer to the options below to continue:");

        System.out.println("--For Patients--");
        System.out.println("1. Register new patient");
        System.out.println("2. Checkin guest patient");
        System.out.println("3. Remove guest");
        System.out.println("4. List all registered patients");
        System.out.println("5. Schedule appointment");


        System.out.println("--For Employees--");
        System.out.println("1. List all employees");
        System.out.println("2. Register new employee");
        System.out.println("3. Remove employee ");    */

        //register a Dog
        System.out.println("Provide the following information to register a new canine patient:");
        System.out.print("Name: ");
        String n=scan.nextLine();
        System.out.print("Age (years): ");
        int a=scan.nextInt();
        System.out.print("Sex (F/M): ");
        char s=scan.next().charAt(0);
        System.out.print("Weight: ");
        Double w=scan.nextDouble();
        System.out.print("Height: ");
        Double h=scan.nextDouble();
        scan.nextLine();
        System.out.print("Does the animal have an owner? (Y/N): ");
        String owner_check = scan.nextLine();
        
        Boolean o=true;
        if (owner_check.equalsIgnoreCase("yes") || owner_check.equalsIgnoreCase("y")){
            o=true;}
        if (owner_check.equalsIgnoreCase("no") || owner_check.equalsIgnoreCase("n")){
            o=false;}
    
        Dog dog = new Dog(n, a, s, w, h, o);

        //add dog to registered patients
        k9Patients.add(dog);

        //print all registed k9 patients
        for (int x=0; x<k9Patients.size(); x++){
            System.out.println(k9Patients.get(x));
        }

    /*
    void updatePatientRecords(String name) {
        //search for the object with matching name var and specifiy which attribute to update
        for (x=0; x<records.len(); x++){
            //
        }
    };

    void pullPatientRecords(){
        //
    };

    void registerPatient(){
        //
    };

    void checkinGuest(){
        //
    }; */
    }
}
