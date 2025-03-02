package oop;

public class Test {

    public static void main(String[] args) {
        Address aytos = new Address();
        aytos.setCity("Aytos");
        aytos.setPostalCode(8500);
        aytos.setStreetName("12");

        Breed macaw = new Breed();
        macaw.setName("Macaw");
        macaw.setPossibleIllnesses("Stomach issues");
        macaw.setCharacteristics("Large colored parrots with long tail feathers");

        Parrot parrot1 = new Parrot("Kiko", (byte) 3, macaw, aytos, true, true);

        parrot1.isMale = true;
        parrot1.printDetails();
        parrot1.talk();
        parrot1.eat();

        Parrot parrot2 = new Parrot("Lary", (byte) 5, macaw, aytos, false, true);
        parrot2.printDetails();
        parrot2.talk();
        parrot2.eat();
    }
}
