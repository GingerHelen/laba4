package heroes;

import enums.*;
import heroesSkills.PigletSkills;
import chamomile.*;
import java.util.Objects;


public class Piglet extends Hero implements PigletSkills {
    private final static String name = "Пятачок";

    public Piglet(Place location) {
        super(name, location);
    }

    public String pigletHopes(Hero hero) {
        return " надеется, что не " + hero.toString();
    }

    public String pigletForget() {
        return name + " забыл, кто загадан и";
    }

    public String pigletWonders() {
        return  "Он гадает на ромашке";
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