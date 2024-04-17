package ejercicios.refactorizacion.ejercicio2;

// Se
public class Human {
        private String name;
        private int age;

        private Address address;
        private IFormatAddress iFormatAddress;



    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, Address address, IFormatAddress iFormatAddress) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.iFormatAddress = iFormatAddress;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Address: " + iFormatAddress.formatAddress(address);
    }
    }



