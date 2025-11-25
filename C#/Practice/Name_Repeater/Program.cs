using System;

public class Name_Repeater
{
    public static void Main(string[] args){
        //request name
        Console.Write("What is your name? ");
        string user_name = Console.ReadLine();

        Console.Write("Enter a number: ");
        int repetition = int.Parse(Console.ReadLine());

        name_print(user_name, repetition);
    }

    public static void name_print(string name, int repeat){
        while(repeat>0){
            Console.Write(name);
            repeat--;
        }
        
    }
}

