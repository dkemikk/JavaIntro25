package oop;

public class Parrot extends Pet {
    public boolean isBeautiful;

    public Parrot(String name, byte age, Breed breed, Address address, boolean isMale, boolean isBeautiful) {
        super(name, age, breed, address, isMale);
        this.isBeautiful = isBeautiful;
    }

    public void printDetails(){
        super.printDetails();
        System.out.printf("And the parrot is %s%n", getParrotLaziness());
    }

    public void talk(){
        System.out.printf("%s is talking...%n", getName());
    }

    private String getParrotLaziness(){
        if (isBeautiful){
            return "beautiful";
        }else {
            return "ugly";
        }
    }
}
