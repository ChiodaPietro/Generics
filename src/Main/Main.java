package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        InputStream stream;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.equals("")){
            System.out.println("jumped");
        }else {
            System.out.println(s);
            System.out.println("bomb");
        }
        GenericList<Contact> list = new GenericList(new Contact[10]);
        while (true) {
            System.out.println("add, remove, modify, find");
            switch (reader.readLine()) {
                case "add":
                    for (int i = 0; i < list.get().length; i++) {
                        if (list.get()[i] == null) {
                            System.out.println("insert the name");
                            String name = reader.readLine();
                            System.out.println("insert a number");
                            int number = reader.read();
                            reader.readLine();
                            System.out.println("surname");
                            String surname=reader.readLine();
                            System.out.println("address");
                            String address=reader.readLine();
                            System.out.println(address);
                            list.set(new Contact(number,name,surname,address),i);
                            break;
                        }
                    }
                    break;
                case "modify":
                    System.out.println("insert a number: ");
                    //i use the try catch so when he inserts a number everything is fine
                    // when he inserts a String i get the exception and i use the catch body
                    // to find stuff with the String
                    try{
                        int number= sc.nextInt();
                        for (int i = 0; i < list.get().length; i++) {
                            if(list.get()[i].getNumber()==number){
                                System.out.println("insert the name");
                                String name = reader.readLine();
                                System.out.println("insert a number");
                                int n = reader.read();
                                reader.readLine();
                                System.out.println("surname");
                                String surname=reader.readLine();
                                System.out.println("address");
                                String address=reader.readLine();
                                System.out.println(address);
                                list.set(new Contact(n,name,surname,address),i);
                                break;
                            }
                        }
                    }catch (Exception e){
                        System.out.println("you have inserted a name");
                        String name= sc.nextLine();
                        for (int i = 0; i < list.get().length; i++) {
                            if(list.get()[i].getName().toLowerCase().equals(name.toLowerCase())){
                                System.out.println("insert the name");
                                String navn = reader.readLine();
                                System.out.println("insert a number");
                                int n = reader.read();
                                reader.readLine();
                                System.out.println("surname");
                                String surname=reader.readLine();
                                System.out.println("address");
                                String address=reader.readLine();
                                System.out.println(address);
                                list.set(new Contact(n,navn,surname,address),i);
                                break;
                            }
                        }
                    }
                    break;
                case "remove":
                    System.out.println("insert a number: ");
                    try{
                        int number= sc.nextInt();
                        for (int i = 0; i < list.get().length; i++) {
                            if(list.get()[i].getNumber()==number){
                                System.out.println(list.remove(i));
                                break;
                            }
                        }
                    }catch (Exception e){
                        System.out.println("you have inserted a name");
                        String name= sc.nextLine();
                        for (int i = 0; i < list.get().length; i++) {
                            if(list.get()[i].getName().toLowerCase().equals(name.toLowerCase())){
                                System.out.println(list.remove(i));
                                break;
                            }
                        }
                    }
                    break;
                case "find":
                    System.out.println("insert a number, or a name");
                    try {
                        int number = sc.nextInt();
                        for (int i = 0; i < list.get().length; i++) {
                            if(list.get()[i]!=null){
                                if(list.get()[i].getNumber()==number){
                                    System.out.println(list.get()[i].toString());
                                    break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("you inserted a name");
                        String name = sc.nextLine();
                        for (int i = 0; i < list.get().length; i++) {
                            if (list.get()[i]!= null) {
                                if (list.get()[i].getName().toLowerCase().equals(name.toLowerCase())) {
                                    System.out.println(list.get()[i].toString());
                                    break;
                                }
                            }
                        }
                    }
                    break;

            }
        }
    }
}
