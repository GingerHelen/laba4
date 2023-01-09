package heroes;
import heroesSkills.FairyCreature;
import enums.*;
import exceptions.*;

import java.util.Objects;

public abstract class Hero implements FairyCreature {
    private final String name;
    private Place location;

    public Hero(String name, Place location) {
        this.name = name;
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public void setLocation(Place location) {
        if (this.location != location) this.location = location;
        else System.out.println("Ошибка!" + name + " уже " + location.toString());
    }


    public void farewell(Hero hero1, Hero hero2) {
        if (hero1.hashCode() != hero2.hashCode()) {
            System.out.println ("Но вот уже  " + hero1.toString() + " и " + hero2.toString() + " попрощались.");
        } else if ( hero1.equals(hero2)) {
            System.out.println(hero1.toString() + " прощается с самим собой...");
        }
    }
    public void meeting(Hero hero1, Hero hero2) {
        if (hero1.hashCode() != hero2.hashCode()) {
            System.out.println ("Первым, кого встретил " + hero1.toString() + " стал " + hero2.toString() + ".");
        } else if ( hero1.equals(hero2)) {
            System.out.println(hero1.toString() + " ни с кем не встретился...");
        }
    }
    public String helping(Hero hero1, Hero hero2) {
        return hero1.getName() + " упёрся спиной в " + hero2.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(name, hero.name) && location == hero.location;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
    public void activity(Place location, String activity) {
        if (activity == "сидит") {
            System.out.println(name + " сидит " + location.toString());
        } else System.out.println(name + " не сидит, а делает что-то другое :)");
    }
    public String talkAbout(String subjectOfTalking, Hero hero) throws NullStringException {
        if ((subjectOfTalking == null)||(subjectOfTalking.equals(""))) throw new NullStringException("А о чем вообще болтать-то?");
        else return "Они болтали о " + subjectOfTalking + ". Все, кроме " + hero.getName() + ".";
    }
    public String startedWalking (Place location) {
        return "Так они выступили в " + location;
    }
}

