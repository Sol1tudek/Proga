import Character.*;
import Objects.*;

public class Main {
    public static void main(String[] args) {
        Malish malish = new Malish("Он");
        System.out.print("У " + malish);
        Eyes eyes = new Eyes("глаза");
        eyes.abilities();

        // от удивления
        Enum enum1 = Enum.Surpise;
        System.out.print(enum1.getName());

        malish.actions();
        Fille_and_Rulle filleAndRulle = new Fille_and_Rulle("Филле и Рулле");
        System.out.print(filleAndRulle); filleAndRulle.actions();

        System.out.print(" что ");

        Carlson carlson = new Carlson("Карлсон");
        System.out.print(carlson); carlson.actions();

        // у Свантесонов?
        Enum enum2 = Enum.Svanteson;
        System.out.print(enum2.getName());

        System.out.println("");
        System.out.print(carlson); carlson.actions();

        Roof roof = new Roof("на крыше, ");
        roof.getName();

        Home home = new Home();
        System.out.print(carlson.toString()); home.abilities();
        System.out.print("у себя");System.out.print(home);

        //полной безопасности
        Enum enum3 = Enum.Safety;
        System.out.print("и ");
        System.out.print(enum3.getName());
        System.out.println("");

        Fille_and_Rulle filleAndRulle1 = new Fille_and_Rulle("Они");
        System.out.print(filleAndRulle1); filleAndRulle1.actions();

        // Никто, кроме
        Enum enum4 = Enum.except;
        System.out.print(enum4.getName());
        Chimney_sweep chimneySweep = new Chimney_sweep("Трубочист");
        System.out.print(chimneySweep); chimneySweep.actions(); System.out.print(roof);

        //  Бедняга
        Enum enum5 = Enum.Poor;
        System.out.println(enum5.getName());


        System.out.print(carlson);System.out.print(" за ним");
        Haunt haunt = new Haunt(); haunt.starts();System.out.print(haunt);
        System.out.print(carlson);System.out.print(" никогда ");;carlson.hide();
    }
}