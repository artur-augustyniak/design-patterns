/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.implementation.BroadGaugeTrainFactory;
import abstractfactory.implementation.ExternalParametrizedFactory;
import abstractfactory.implementation.NarrowGaugeTrainFactory;
import abstractfactory.implementation.StandardGaugeTrainFactory;
import abstractfactory.model.Train;
import abstractfactory.model.TrainFactory;

/**
 * Przykład użycia tego wzorca to sytuacja, gdy elementy graficzne aplikacji
 * (chodzi mi o widgety takie jak guziki, checkboxy, etc.) powinny być stworzone
 * raz przy wykorzystaniu jednej biblioteki graficznej (powiedzmy, że Gtk), a w
 * innym drugiej (na przykład Fltk). Kontrolki te stanowią pewną grupę, rodzinę
 * obiektów i powinny być tworzone razem. Nie może być takiej sytuacji, że guzik
 * w GUI programu jest z biblioteki Gtk, a checkbox z Fltk. Fabryka abstrakcyjna
 * zapewnia nam właśnie taką spójność.
 * http://pl.wikisource.org/wiki/Fabryka_abstrakcyjna_%28wzorzec_projektowy%29/kod
 *
 * @author artur
 */
public class AbstractFactory {

    public static void client(Train t) {
        t.ride();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Creating by choice");
        TrainFactory bf = new BroadGaugeTrainFactory();
        client(bf.createTrain());

        TrainFactory nf = new NarrowGaugeTrainFactory();
        client(nf.createTrain());

        TrainFactory sf = new StandardGaugeTrainFactory();
        client(sf.createTrain());


        System.out.println("Random creating");
        for (int i = 0; i < 10; i++) {
            TrainFactory f = new ExternalParametrizedFactory();
            Train t = f.createTrain();
            t.ride();
        }
    }
}
