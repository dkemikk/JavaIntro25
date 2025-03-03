package oopsummary;

import java.security.InvalidParameterException;

public class PlayerStats {
    private byte endurance;
    private byte sprint;
    private byte dribble;
    private byte passing;
    private byte shooting;

    // Getters
    public byte getEndurance() {
        return endurance;
    }

    public byte getSprint() {
        return sprint;
    }

    public byte getDribble() {
        return dribble;
    }

    public byte getPassing() {
        return passing;
    }

    public byte getShooting() {
        return shooting;
    }

    // Setters with validation for each stat
    public void setEndurance(byte endurance) {
        if (endurance >= 0 && endurance <= 100) {
            this.endurance = endurance;
        } else {
            throw new InvalidParameterException("Endurance must be between 0 and 100.");
        }
    }

    public void setSprint(byte sprint) {
        if (sprint >= 0 && sprint <= 100) {
            this.sprint = sprint;
        } else {
            throw new InvalidParameterException("Sprint must be between 0 and 100.");
        }
    }

    public void setDribble(byte dribble) {
        if (dribble >= 0 && dribble <= 100) {
            this.dribble = dribble;
        } else {
            throw new InvalidParameterException("Dribble must be between 0 and 100.");
        }
    }

    public void setPassing(byte passing) {
        if (passing >= 0 && passing <= 100) {
            this.passing = passing;
        } else {
            throw new InvalidParameterException("Passing must be between 0 and 100.");
        }
    }

    public void setShooting(byte shooting) {
        if (shooting >= 0 && shooting <= 100) {
            this.shooting = shooting;
        } else {
            throw new InvalidParameterException("Shooting must be between 0 and 100.");
        }
    }

    // Constructor that initializes all 5 stats
    public PlayerStats(byte endurance, byte sprint, byte dribble, byte passing, byte shooting) {
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    // Method to calculate the overall skill by averaging the stats
    public byte getOverallSkill() {
        int total = endurance + sprint + dribble + passing + shooting;
        int average = total / 5;

        // Ensure we don't overflow the byte range (ensure it's between -128 and 127)
        return (byte) Math.min(Math.max(average, Byte.MIN_VALUE), Byte.MAX_VALUE);
    }
}