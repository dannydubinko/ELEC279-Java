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

    public String getName() {
        return this.name;
    }

    public Date getBirthDate() {
        return new Date(this.born);
    }

    public String toString() {
        return getName() + ", " + "born on " + getBirthDate();
    }

    public boolean equals(Entity entity) {
        if (entity == null)
            return false;

        boolean namesMatch = Objects.equals(this.name, entity.name);
        boolean datesMatch = Objects.equals(this.born, entity.born);

        return namesMatch && datesMatch;
    }
}
