package oopsummary;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private byte rating;
    private List<Player> playerList; // List of players in the team

    // Constructor to initialize the team with a name
    public Team(String name) {
        setName(name);
        playerList = new ArrayList<>(); // Initialize player list
    }

    // Getter for the team name
    public String getName() {
        return name;
    }

    // Setter for the team name with validation
    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new InvalidParameterException("Team name cannot be empty.");
        }
    }

    // Getter for the team rating
    public byte getRating() {
        return rating;
    }

    // Internal method to calculate the team rating based on player stats
    private void updateRating() {
        if (playerList.isEmpty()) {
            rating = 0; // If no players, the rating is 0
            return;
        }

        int result = 0;

        // Sum up all player ratings (Overall skill rating)
        for (Player player : playerList) {
            result += player.getStats();
        }

        // Calculate the average rating, ensuring it does not exceed Byte.MAX_VALUE
        rating = (byte) Math.min(result / playerList.size(), Byte.MAX_VALUE);
    }

    // Method to add a player to the team
    public void addPlayer(Player player) {
        playerList.add(player);
        updateRating(); // Update team rating after adding a player
    }

    // Method to remove a player from the team
    public void removePlayer(Player player) {
        if (playerList.contains(player)) {
            playerList.remove(player);
            updateRating(); // Update team rating after removing a player
        } else {
            System.out.printf("Player %s is not in %s team.%n", player.getName(), name);
        }
    }
}