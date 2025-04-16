package custom_immutableclass;

import javax.naming.OperationNotSupportedException;

final class User {
    private final String firstName;
    private final String lastName;
    private final Address address;

    public User(String firstName, String lastName, Address address) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public Address getAddress() throws CloneNotSupportedException {
        //return new Address((Address) address.clone());
        //return (Address) address.clone();
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Address implements Cloneable {
    String firstLine;
    String secondLine;
    String city;

    public Address(String firstLine, String secondLine, String city) {
        super();
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.city = city;
    }

    public Address(Address address){
        this.firstLine = address.getFirstLine();
        this.secondLine = address.getSecondLine();
        this.city = address.getCity();
    }

    public String getFirstLine() {
        return firstLine;
    }

   /* public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }*/

    public String getSecondLine() {
        return secondLine;
    }

    /*public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }*/

    public String getCity() {
        return city;
    }

    /*public void setCity(String city) {
        this.city = city;
    }*/

    @Override
    public String toString() {
        return "Address [firstLine=" + firstLine + ", secondLine=" + secondLine
                + ", city=" + city + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       /* try {
            throw new OperationNotSupportedException("We can not create clone of this object");
        } catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }*/
        return super.clone();
    }
}


public class CustomImmutable {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Address address = new Address("Lane no 11", "Karve Nagar", "Pune");
        User u1 = new User("Nikita", "Kadam",  new Address("Lane no 11", "Karve Nagar", "Pune"));

        System.out.println(u1.toString()); //

        //Original Vivek =>
        Address address = u1.getAddress(); // original or cloned ?
        //Cloned Vivek   =>
        //address.setFirstLine("Shahu colony lane no 10");  //Modifying Mutable object

        System.out.println(u1.toString()); //
    }
}
