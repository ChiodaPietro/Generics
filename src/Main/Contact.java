package Main;

public class Contact {
    protected int number;
    private String name;
    private String surname;
    private String address;

    public Contact(int number, String name, String surname, String address) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Contact(int number, String name, String surname) {
        this.number = number;
        this.name = name;
        this.surname = surname;
    }

    public Contact(int number, String name) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        if (surname == "") {
            return "name: " + name + "\n" +
                    "number: " + number + "\n";
        } else {
            if (address == "") {
                return "name: " + name + "\n" +
                        "number: " + number + "\n" +
                        "surname: " + surname + "\n";
            }
        }
        return "name: " + name + "\n" +
                "number: " + number + "\n" +
                "surname: " + surname + "\n" +
                "address: " + address + "\n";
    }
}
