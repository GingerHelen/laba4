package heroThings;

import exceptions.*;
import heroes.*;

public class Expedition {
    private final static String name = "экспедиция";
    private Group group = new Group();

    class Group { //нестатический вложенный класс
        boolean isAssembled = false;

        void assemble() {
            isAssembled = true;
        }

        void notAssemble() {
            isAssembled = false;
        }

    }

    public String getName() {
        return name;
    }

    public void groupIsAssembled() {
        group.assemble();
    }

    public void groupIsNotAssembled() {
        group.notAssemble();
    }

    protected boolean isStarting = false;

    public void startOrWait(boolean isStarting) {
        this.isStarting = isStarting;
        if (isStarting) {
            this.groupIsAssembled();
        } else this.groupIsNotAssembled();
        if (!isStarting) throw new GroupNotAssembledExceptions();
    }

    public String getCondition() {
        if (isStarting) return "Через некоторое время все были в сборе, " + name + " началась!";
        else return "так ошибка же";
    }

    private final Turn turn = new Turn();

    static class Turn { //статический вложенный класс
        boolean noMatches = false;

        void correctTurn(Hero hero1, Hero hero2) {
            if (hero1.hashCode() != hero2.hashCode()) {
                noMatches = true;
            } else if (hero1.equals(hero2)) {
                noMatches = false;
            }
        }
    }

    public void firstMembers(Hero hero1, Hero hero2) {
        turn.correctTurn(hero1, hero2);
        boolean noMatches = turn.noMatches;
        if (noMatches) {
            System.out.print("Первыми шли " + hero1.getName() + " и " + hero2.getName() + ", ");
        } else System.out.println("Первым шел дублированный " + hero1.getName());
    }

    public void secondMembers(Hero hero1, Hero hero2) {
        turn.correctTurn(hero1, hero2);
        boolean noMatches = turn.noMatches;
        if (noMatches) {
            System.out.print("за ними шли " + hero1.getName() + " и " + hero2.getName() + ", ");
        } else System.out.print("за ним шел дублированный" + hero1.getName() + ", ");
    }

    public void thirdMembers(Hero hero1, Hero hero2) {
        turn.correctTurn(hero1, hero2);
        boolean noMatches = turn.noMatches;
        if (noMatches) {
            System.out.println("далее -  " + hero1.getName() + " и " + hero2.getName() + ". Еще дальше все остальные.");
        } else System.out.println("Далее дублированный " + hero1.getName());
    }
}
