import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("What's your first Name?");
        String name = scann.next();

        System.out.println("What's your Age?");
        int age = scann.nextInt();

        System.out.println("What's your favorite color?");
        String color = scann.next();
        color += scann.nextLine();

        System.out.println("Very nice to meet you " + name + ", ever so young " + age + " years old");
        System.out.println("And your color is " + color + " pretty");
    }
}