package Main;

public class Contact {
    private int number;
    private String name;
    private String surname;
    private String address;
    public Contact(int number, String name, String surname, String address){
        this.number=number;
        this.name=name;
        this.surname=surname;
        this.address=address;
    }
    public Contact(int number, String name, String surname){
        this.number=number;
        this.name=name;
        this.surname=surname;
    }
    public Contact(int number, String name){
        this.name=name;
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getAddress(){
        return address;
    }
}
