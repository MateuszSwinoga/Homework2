import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        String[] happyList=new String[]{"Mateusz","Justyna","Marta","Paulina","Pawel"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your name");
        String name = scanner.nextLine();
        System.out.println("Give me your surname");
        String surname = scanner.nextLine();
        System.out.println("Give me your age");
        int age = scanner.nextInt();



        if (age>=18) {
            System.out.println(name + " " + surname + " " + "You can enter");
            if (age>=18&25>=age) {
                System.out.println("You have free beer for your age");
                for(String person:happyList)
                    if (name.equals(person)) {
                System.out.println("Congratulation! Your name is on the happy list. You have also free shot!");
                break;

            }

            }
                if (age>=30&40>=age) {

                for(String person:happyList)
                if (name.equals(person)) {
                    System.out.println("We want to invate you to VIP room");
                    break;

                }
                else {
                    System.out.println("You're to old for free beer!");
                    break;

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
