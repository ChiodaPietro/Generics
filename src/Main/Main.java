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
        Lambda test=(a, b) ->{
            return a+b;
        };
        System.out.println(test.sum(10,30));
        InputStream stream;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.equals("")) {
            System.out.println("jumped");
        } else {
            System.out.println(s);
            System.out.println("bomb");
        }
        GenericList<Contact> list = new GenericList(new Contact[10]);
        while (true) {
            int pos = 0;
            System.out.println("add, remove, modify, find");
            switch (reader.readLine()) {
                case "add":
                    pos = find_position(list, false);
                    // i use a different name so that they dont fuck up
                    String[] information_ = contact_information(reader).split("%%%%");
                    list.set(new Contact(Integer.parseInt(information_[1]), information_[0], information_[2], information_[3]), pos);
                    break;
                case "modify":
                    pos = find_position(list, true);
                    // i use a different name so that they dont fuck up
                    String[] information = contact_information(reader).split("%%%%");
                    list.set(new Contact(Integer.parseInt(information[1]), information[0], information[2], information[3]), pos);
                    break;
                case "remove":
                    pos = find_position(list, true);
                    if (pos != -1) {
                        list.remove(pos);
                    }
                    break;
                case "find":
                    pos = find_position(list, true);
                    if (pos != -1) {
                        System.out.println(list.get()[pos].toString());
                    }
                    break;
            }
        }
    }

    static int find_position(GenericList<Contact> list, boolean ask_or_not) {

        try {
            if (ask_or_not) {
                System.out.println("insert a number, or a name");
                int number = sc.nextInt();
                for (int i = 0; i < list.get().length; i++) {
                    if (list.get()[i].getNumber()==number) {
                        return i;
                    }
                }
            } else {
                for (int i = 0; i < list.get().length; i++) {
                    if (list.get()[i] == null) {
                        return i;
                    }
                }
            }


        } catch (Exception e) {
            System.out.println("you inserted a name");
            String name = sc.nextLine();
            for (int i = 0; i < list.get().length; i++) {
                if (list.get()[i].getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static String contact_information(BufferedReader reader) throws IOException {
        boolean exit = true;
        String name;
        int n = 0;
        String surname;
        String address;
        do {
            try {
                System.out.println("insert the name");
                name = reader.readLine();
                System.out.println("insert a number");
                n = Integer.parseInt(reader.readLine());
                System.out.println("surname");
                surname = reader.readLine();
                System.out.println("address");
                address = reader.readLine();
                if (address.equals("")) {
                    return name + "%%%%" + n + "%%%%" + surname + "%%%%" + " ";
                } else {
                    if (surname.equals("")) {
                        return name + "%%%%" + n + "%%%%" + " " + "%%%%" + address;
                    } else {
                        if (surname.equals("") && address.equals("")) {
                            return name + "%%%%" + n + "%%%%" + " " + "%%%%" + " ";
                        }
                    }
                }
                return name + "%%%%" + n + "%%%%" + surname + "%%%%" + address;
            } catch (NumberFormatException e) {
                System.out.println("you must insert number");
                exit = false;
            }
        } while (!exit);

        return null;
    }
}
