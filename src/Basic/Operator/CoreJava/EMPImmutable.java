package Basic.Operator.CoreJava;

import java.util.Objects;

public final class EMPImmutable {
	
    // Fields should be private and final
    private final int id;
    private final String name;
    private final String department;

    // Constructor to initialize all fields
    public EMPImmutable(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getter methods to access fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Override equals() for logical equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EMPImmutable emp = (EMPImmutable) o;
        return id == emp.id &&
                Objects.equals(name, emp.name) &&
                Objects.equals(department, emp.department);
    }

    // Override hashCode() for consistent hashing
    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }

    // Override toString() for meaningful representation
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
