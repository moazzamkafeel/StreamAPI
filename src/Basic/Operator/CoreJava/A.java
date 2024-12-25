package Basic.Operator.CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ImmutableEmployee {
    private final int id;
    private final String name;
    private final List<String> skills;

    // Constructor to initialize all fields
    public ImmutableEmployee(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        // Make a defensive copy of the mutable List
        this.skills = new ArrayList<>(skills);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Return an unmodifiable view of the list to ensure immutability
    public List<String> getSkills() {
        return Collections.unmodifiableList(skills);
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", skills=" + skills +
               '}';
    }
}
