import java.util.Scanner;

public class Phone implements PhoneInterface{
    private String name;
    private String brand;
    private int password;
    private Contact [] contacts;

    public Phone(String name, String brand, int password, Contact[] contacts) {
        this.name = name;
        this.brand = brand;
        this.password = password;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public void turnOn() {
        System.out.println("Hello");
        System.out.println("Enter paswword:");
        int password1=new Scanner(System.in).nextInt();
        if(password==password1){
            System.out.println("Phone is on");
        }else {
            System.out.println("Wrong password");
        }
    }

    @Override
    public void call( int number) {
        System.out.println("Please enter number:" +number);
        for (Contact con:contacts) {
            if (con.getPhoneNumber()==number){
                System.out.println("Call to number: "  + con.getFullName() + con.getPhoneNumber());
            }
        }


    }

    @Override
    public void call1(String name) {
        System.out.println("Please enter contact:" + name);
        for (Contact n:contacts) {
            if (n.getFullName().equals(name)){
                System.out.println("Call to contact: " + n.getFullName() + n.getPhoneNumber());
            }
        }
    }

    @Override
    public Contact searchContact(String name1) {
        for (Contact contact: contacts) {
            if(contact.getFullName().equals(name1));
            return contact;
        }
        return null;
    }

    @Override
    public void upDateName() {

    }

    @Override
    public void getAllContacts() {
        for (Contact contact2:contacts) {
            System.out.println(contact2.getFullName()+ contact2.getPhoneNumber());
        }
    }
}
