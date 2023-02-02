public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("FullName= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setFirstName("john");
        person.setLastName("wick");
        person.setAge(-5);
        System.out.println("FullName= "+person.getFullName());
        System.out.println("teen= "+person.isTeen());
        person.setFirstName("Harsh");
        person.setLastName("Sharma");
        System.out.println("FullName= "+person.getFullName());

        person.setAge(19);
        System.out.println("teen= "+person.isTeen());

    }
}