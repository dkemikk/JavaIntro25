package oop;

public class Pet implements PetActions {
    private String name;
    private byte age;
    public boolean isMale;
    private Breed breed;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: invalid entry for name!");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0){
            this.age = age;
        }else{
            System.out.println("Error: invalid entry for age!");
        }
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (breed != null) {
            this.breed = breed;
        } else {
            System.out.println("Error: invalid entry for breed!");
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (address != null) {
            this.address = address;
        } else {
            System.out.println("Error: invalid entry for address!");
        }
    }

    public Pet(String name, byte age, Breed  breed, Address address, boolean isMale){
        setName(name);
        setAge(age);
        setBreed(breed);
        setAddress(address);
        this.isMale = isMale;
    }

    public void eat(){
        System.out.printf("%s is eating...%n", name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Not implemented yet");
    }

    public void printDetails(){
        System.out.printf("Parrot name is %s, age is %d, breed is %s, sex is %s  and address is %s%n",
                name, age, breed, getSex(), address);
    }

    private String getSex(){
        if(isMale){
            return "male";
        }else {
            return "female";
        }
    }
}
