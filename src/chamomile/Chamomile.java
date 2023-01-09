package chamomile;

import enums.*;

import java.util.Objects;

public class Chamomile implements FortuneTellingOnChamomile {
    private final static String name = "ромашка";
    private static final int maxOutcomesOfChamomile = 4;
    public static class Wishing {                              //статический вложенный класс
        public static String getMaxOutcomesOfChamomile() {
            return "Возможно " + maxOutcomesOfChamomile + " исхода. Делаем ставки, дамы и господа. ";
        }
    }
    public void resultOfChamomile(PossibleOutcomesOfChamomile result) {
        if (result.toString() == "плюнет") {
            System.out.println("Оказалось, что " + result);
        }
        else if (result.toString() == "не любит") {
            System.out.println("Оказалось, что " + result + " (тоже грустно)");
        }
        else System.out.println("Оказалось... Такое продолжение запрещено в РФ");
    }
    public void allVariants() {
        String s;
        s="Варианты: ";
        for (PossibleOutcomesOfChamomile outcome : PossibleOutcomesOfChamomile.values()) {
            s = s + (outcome + ", ");
        }
        String news = s.substring(0, s.length() - 2);
        System.out.println(news);
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
