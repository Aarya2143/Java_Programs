package custom_immutableclass;
/*
final class CustomImmutable {
    private final String firstname ;
    private final String lastname;
    private final Address address;

    CustomImmutable(String firstname, String lastname, Address address) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public Address getAddress()
    {
       return address;
    }


    @Override
    public String toString() {
        return "CustomImmutable{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Address implements Cloneable
{
    String firstline ;
    String lastline ;
    String city;

    Address(String firstname,String lastname, Address address)
    {
        super();
        this.firstline  = firstline ;
        this.lastline = lastline ;
        this.city=city;
    }
    public Address (Address address)
    {
        this.firstline = address.getFirstline();
        this.lastline = address.getLastline();
        this.city=address.getCity();
    }

    public String getFirstline() {
        return firstline;
    }

    public String getLastline() {
        return lastline;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstline='" + firstline + '\'' +
                ", lastline='" + lastline + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class user {
    public void main(String[] args) throws CloneNotSupportedException {
        CustomImmutable c1 = new CustomImmutable
                ("Aarya","jadhav",);
        System.out.println(c1.toString()); //


        Address address = c1.getAddress(); // original or cloned ?


        System.out.println(c1.toString()); //


    }
}

 */


