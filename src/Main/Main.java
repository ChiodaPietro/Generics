package Main;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Generics<Contact>[] list = new Generics[10];
        while(true){
            System.out.println("insert a number, or a name");
            try {
                int number= sc.nextInt();
            }catch (Exception e){
                System.out.println("you inserted a name");
                String name =sc.nextLine();
            }
//            switch (){
//                list[0]=new Generics(new Contact(1111, "john"));
//            }
        }
    }
}