import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your name");
        String name = scanner.nextLine();
        System.out.println("Give me your surname");
        String surname = scanner.nextLine();
        System.out.println("Give me your age");
        int age = scanner.nextInt();
        String[] happyList=new String[]{"Mateusz","Justyna","Marta","Paulina","Pawel"};




        if (age>=18) {
            System.out.println(name + " " + surname + " " + "You can enter");
            if (age>=18&25>=age) {
                for(String person:happyList)
                if (name == person){
                    System.out.println("Congratulation! Your name is on the happy list. You have also free shot!");

                }
                else{
                    System.out.println("You have free beer for your age");



                }
            }
                else {
                    System.out.println("You're to old for free beer");
                }

        }

        else{
            System.out.println(name + " " + surname + " " + "You can't enter");



        }
    }
}