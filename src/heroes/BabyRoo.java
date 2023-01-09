package heroes;

import enums.Place;
import heroesSkills.FairyCreature;

import java.util.Objects;

public class BabyRoo extends Hero implements FairyCreature {
    private final static String name = "Крошка Ру";

    public BabyRoo(Place location) {
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