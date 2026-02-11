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
        this.born = entity.born;
    }

    public String getName() {
        return this.name;
    }

    public Date getBirthDate() {
        return new Date(this.born);
    }

    public String toString() {
        return (name + ", " + "born on " + born);
    }

    public boolean equals(Entity entity) {
        if (entity == null)
            return false;

        boolean namesMatch = Objects.equals(this.name, entity.name);
        boolean datesMatch = Objects.equals(this.born, entity.born);

        return namesMatch && datesMatch;
    }
}
