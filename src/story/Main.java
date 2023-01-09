package story;

import heroes.*;
import enums.*;
import chamomile.*;
import heroThings.*;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        Winnie winnie = new Winnie(Place.RABBITHOUSE);
        Rabbit rabbit = new Rabbit(Place.RABBITHOUSE);
        Piglet piglet = new Piglet(Place.GROUND);
        Kenga kenga = new Kenga(Place.POLE);
        BabyRoo babyRoo = new BabyRoo(Place.POLE);
        ChristopherRobbin christopherRobbin = new ChristopherRobbin(Place.GROUND);
        Chamomile chamomile = new Chamomile();
        Song song = new Song(winnie);
        Expedition expedition = new Expedition();
        winnie.heard(song);
        System.out.print(song.getCondition());
        System.out.print(song.getOwner(winnie, "Её напевает "));
        System.out.print(winnie.winnieLikes());
        System.out.println(winnie.winnieRun(Place.FOREST, TypesOfWalking.WALK));
        try {
            System.out.println(winnie.think("если он будет петь ее дальше, то как раз придет время" +
                    " чем-нибудь подкрепиться, и тогда последняя строчка будет неправильной..."));
        } catch (NullStringException exception){
            exception.printException();
        }
        System.out.println(song.getOwner(winnie, "Тогда уже без слов её замурлыкал "));

        christopherRobbin.activity(Place.DOORSTEP, "сидит");

        christopherRobbin.putsOnBoots(christopherRobbin);
        System.out.println(winnie.winnieSee("сапоги"));
        try {
            System.out.println(winnie.think("О, так нас ждет Приключение! Я готов!"));
        } catch (NullStringException exception){
            exception.printException();
        }

        winnie.activity(Place.GROUND, "сидит");
        System.out.println(winnie.helping(winnie, christopherRobbin));
        System.out.print(winnie.helping(christopherRobbin, winnie));
        System.out.println(christopherRobbin.tryToPut());
        christopherRobbin.resultOfPuttingOn(true);
        System.out.print(winnie.winnieNotUnderstand());
        System.out.print(winnie.getName());
        System.out.println(winnie.winnieRun(Place.NEXT, TypesOfWalking.CONTINUE));
        winnie.meeting(winnie, rabbit);
        winnie.farewell(winnie, rabbit);
        System.out.print(winnie.getName());
        System.out.println(winnie.winnieRun(Place.PIGLETHOUSE, TypesOfWalking.RUN));
        piglet.activity(Place.GROUND, "сидит");
        System.out.println(piglet.pigletWonders());
        System.out.print(Chamomile.Wishing.getMaxOutcomesOfChamomile());
        chamomile.allVariants();
        chamomile.resultOfChamomile(PossibleOutcomesOfChamomile.SPIT);
        System.out.print(piglet.pigletForget());
        System.out.println(piglet.pigletHopes(winnie));
        winnie.setLocation(Place.PIGLETHOUSE);
        System.out.println(winnie.winnieAdvent());
        expedition.startOrWait(true);
        System.out.println(expedition.getCondition());
        expedition.firstMembers(christopherRobbin,  rabbit);
        expedition.secondMembers(piglet, winnie);
        expedition.thirdMembers(kenga, babyRoo);
        SomethingYouCanHeard scream = new SomethingYouCanHeard("Крик", christopherRobbin) {
            @Override
            public String getMovement(){
                return "В голове колонны прозвучал " + name;
            }
        }; // анонимный класс
        christopherRobbin.heard(scream);
        System.out.print(scream.getCondition());
        System.out.println(scream.getOwner(", его издал "));
        System.out.println(christopherRobbin.startedWalking(Place.POLE));
        try {
            System.out.println(winnie.talkAbout("разных разностях", winnie));
        } catch (NullStringException exception){
            exception.printException();
        }
        winnie.heard(song);
        System.out.print(song.getCondition());
        System.out.print(song.getOwner(winnie, "Её снова радостно напевает " ));
    }
}

