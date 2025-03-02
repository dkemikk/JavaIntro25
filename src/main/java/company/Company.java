package company;

public class Company {
    private String name;
    private String creationDate;
    private String bulstat;

    public Company(String name, String creationDate, String bulstat) {
        setName(name);
        setCreationDate(creationDate);
        setBulstat(bulstat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("The company must have a valid name.");
        } else {
            this.name = name;
        }
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate; // No specific validation for date in the task
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat != null && bulstat.length() == 10) {
            this.bulstat = bulstat;
        } else {
            System.out.println("Bulstat must be exactly 10 characters long.");
        }
    }
}
