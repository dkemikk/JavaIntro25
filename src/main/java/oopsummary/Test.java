package oopsummary;

public class Test {

    public static void main(String[] args) {
        Team barca = new Team("Barcelona");

        PlayerStats messiStats = new PlayerStats((byte) 75, (byte) 85, (byte) 84, (byte) 92, (byte) 67);
        Player messi = new Player("Messi", messiStats);
        System.out.println("Before adding Messi: ");
        System.out.printf("%s - %d%n",barca.getName(),barca.getRating());

        barca.addPlayer(messi);

        System.out.println("After adding Messi: ");
        System.out.printf("%s - %d%n",barca.getName(),barca.getRating());

        PlayerStats piqueStats = new PlayerStats((byte)95, (byte)82, (byte)82, (byte)89, (byte)68);
        Player pique = new Player("Pique", piqueStats);

        barca.addPlayer(pique);
        System.out.println("After adding Pique: ");
        System.out.printf("%s - %d%n",barca.getName(),barca.getRating());

        barca.removePlayer(pique);
        System.out.println("After removing Pique: ");
        System.out.printf("%s - %d%n",barca.getName(),barca.getRating());

        System.out.printf("%s - %d%n",barca.getName(),barca.getRating());
    }
}
