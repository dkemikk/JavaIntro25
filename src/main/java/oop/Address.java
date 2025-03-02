package oop;

public class Address {
    private String city;
    private String streetName;
    private int postalCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty()){
            this.city = city;
        }else {
            System.out.println("Error: invalid entry for city!");
        }
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        if (!streetName.isEmpty()){
            this.streetName = streetName;
        }else {
            System.out.println("Error: invalid entry for street name!");
        }
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        if (postalCode >= 1000 && postalCode <= 9999){
            this.postalCode = postalCode;
        }else {
            System.out.println("Error: invalid entry for postal code!");
        }
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "', streetName='" + streetName + "', postalCode=" + postalCode + "}";
    }
}
