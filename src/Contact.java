public class Contact implements PhoneInterface{
    private String fullName;
    private long phoneNumber;

    public Contact(String fullName, long phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void call(int number) {

    }

    @Override
    public void call1(String name) {

    }

    @Override
    public Contact searchContact(String name1) {
        return null;
    }

    @Override
    public void upDateName() {

    }

    @Override
    public void getAllContacts() {

    }
}
