public class Main {
    public static void main(String[] args) {
        Contact [] contacts={new Contact("Ernazar Asanbekov",706887799l),
        new Contact("Eldan Turgunbaev",708556644l),
         new Contact("Meerim Talanbekova",705543322l),
         new Contact("Begimai Duisheeva",704332244l)};

        Phone phone =new Phone("Redmi","MIU",1303,contacts);
        phone.turnOn();
        phone.call(706887799);
        phone.call1("Eldan Turgunbaev");
        phone.searchContact("Meerim Talanbekova");
        phone.getAllContacts();




    }
}