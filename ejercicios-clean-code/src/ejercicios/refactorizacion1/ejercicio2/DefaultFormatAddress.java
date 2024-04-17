package ejercicios.refactorizacion1.ejercicio2;

public class DefaultFormatAddress implements IFormatAddress {
    Address address = new Address();
    @Override
    public String formatAddress(Address address) {
        return  address.getCountry() + ", " +
                address.getCity() + ", " +
                address.getStreet() + ", " +
                address.getHouse() + " " +
                address.getQuarter();
    }
}
