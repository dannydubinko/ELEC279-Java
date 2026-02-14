// Daniel Dubinko 20229482
package PersonAndDate;

import java.util.Objects;

public class Entity {
    private String name;
    private Date born;

    public Entity(String name, Date born) {
        this.name = name;
        this.born = new Date(born.getMonth(),
                born.getDay(),
                born.getYear());
    }

    // copy constructor
    public Entity(Entity entity) {
        if (entity == null)// Not a real entity.
        {
            System.out.println("Fatal Error.");
            System.exit(0);
        }
        this.name = entity.name;
        this.born = new Date(entity.born);
    }

    // --- Accessors (Getters) ---

    public String getName() {
        return this.name;
    }

    public Date getBirthDate() {
        return new Date(this.born);
    }

    // --- Mutators (Setters) ---

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date born) {
        if (born == null) {
            System.out.println("Fatal Error: Birth date cannot be null.");
            System.exit(0);
        }
        this.born = new Date(born);
    }

    // --- Utility Methods ---

    @Override
    public String toString() {
        return (name + ", " + "born on " + born);
    }

    public boolean equals(Entity entity) {
        if (entity == null)
            return false;

        // compares two Entities and if both the name and date match,
        // then they are the same.
        boolean namesMatch = Objects.equals(this.name, entity.name);
        boolean datesMatch = Objects.equals(this.born, entity.born);

        return namesMatch && datesMatch;
    }
}
