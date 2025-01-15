package immutable;

import java.util.Date;

public final class ImmutableClass {
	
	private final int id;
    private final String name;
    private final Date dob; // Mutable field

    // Constructor with defensive copy for Date
    public ImmutableClass(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = new Date(dob.getTime()); // Defensive copy
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime()); // Return a copy to maintain immutability
    }
}
