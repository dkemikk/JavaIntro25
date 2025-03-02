package oop;

public class Breed {
    private String name;
    private String possibleIllnesses;
    private String characteristics;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: invalid entry for breed name!");
        }
    }

    public String getPossibleIllnesses() {
        return possibleIllnesses;
    }

    public void setPossibleIllnesses(String possibleIllnesses) {
        if (!possibleIllnesses.isEmpty()){
            this.possibleIllnesses = possibleIllnesses;
        }else {
            System.out.println("Error: invalid entry for illnesses!");
        }
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        if (!characteristics.isEmpty()){
            this.characteristics = characteristics;
        }else {
            System.out.println("Error: invalid entry for characteristics!");
        }
    }

    @Override
    public String toString() {
        return "Breed{name='" + name + "', possibleIllnesses='" + possibleIllnesses + "', characteristics='" + characteristics + "'}";
    }
}
