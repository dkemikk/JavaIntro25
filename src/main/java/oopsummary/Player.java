package oopsummary;

import java.security.InvalidParameterException;

public class Player {
    private String name;
    private PlayerStats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            throw new InvalidParameterException();
        }
    }

    public byte getStats() {
        if (stats != null) {
            return stats.getOverallSkill();
        }
        throw new InvalidParameterException("Player stats are not set.");
    }

    // Setter for stats with validation
    public void setStats(PlayerStats stats) {
        if (stats != null) {
            this.stats = stats;
        } else {
            throw new InvalidParameterException("Stats cannot be null.");
        }
    }

    public Player(String name, PlayerStats stats){
        setName(name);
        setStats(stats);
    }
}
