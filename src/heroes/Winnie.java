package heroes;

import enums.*;
import exceptions.NullStringException;
import heroThings.SomethingYouCanHeard;
import heroesSkills.WinnieSkills;

public class Winnie extends Hero implements WinnieSkills {
    private final static String name = "Винни-Пух";
    public Winnie(Place location){
        super(name, location);
    }
    public String winnieAdvent() {
        return "Тут появляется " + name;
    }
    public String think(String thought) throws NullStringException {
        if ((thought == null)||(thought.equals(""))) throw new NullStringException("А о чем вообще думать-то?");
        else return this.getName() + " подумал: " + thought;
    }
    public String winnieRun(Place location, TypesOfWalking walk) {
        return walk.toString() + " " + location.toString() + ".";
    }
    public void heard(SomethingYouCanHeard thing) {
        thing.setHeardValue(true);
    }
    public String winnieLikes() {
        return "Эта шумелка так понравилась ему, что он распевал её всю дорогу, ";
    }
    public String winnieNotUnderstand() {
        return "По правде говоря, " + name + " понял, что ничего не понял. ";
    }
    public String winnieSee(String subject) {
        return name + " увидел " + subject;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public java.lang.String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}