package heroes;

import enums.*;
import heroThings.*;
import heroesSkills.ChristopherRobbinSkills;
import exceptions.*;

public class ChristopherRobbin extends Hero implements ChristopherRobbinSkills {
    private final static String name = "Кристофер Роббин";

    public ChristopherRobbin(Place location) {
        super(name, location);
    }

    public void putsOnBoots(Hero ownerOfTheBoots) {
        class Boots { // локальный класс
            private final static String name = "походные сапоги";
            private final Hero owner;
            private boolean isPutten = false;

            public Boots(Hero owner) {
                this.owner = owner;
            }

            public void setCondition(boolean isPutten) {
                this.isPutten = isPutten;
            }

            public String getCondition() {
                if (isPutten) return "Он натягивает " + name;
                else return name + " уже надеты";
            }

            public String getOwner() {
                return ", владельцем которых является собственно сам " + owner.getName();
            }
        }
        Boots boots = new Boots(ownerOfTheBoots);
        boots.setCondition(true);
        System.out.print(boots.getCondition());
        System.out.println(boots.getOwner());
    }
    public void resultOfPuttingOn(boolean isResult) {
        if (isResult) {
            System.out.println("Сапоги сдались!");
        } else throw new BootsNotWearExceptions();
    }
    public void heard(SomethingYouCanHeard thing) {
        thing.setHeardValue(true);
    }
    public String tryToPut() {
        return " и пытался натянуть свои сапоги";
    }
}
