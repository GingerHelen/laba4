package heroes;

import enums.Place;
import heroesSkills.FairyCreature;

import java.util.Objects;

public class Kenga extends Hero implements FairyCreature {
    private final static String name = "Кенга";

    public Kenga(Place location) {
        super(name, location);
    }
    @Override
    public java.lang.String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
