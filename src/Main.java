import java.time.LocalDate;
import java.time.Duration;
import java.time.Period;
import java.time.LocalDateTime;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
SIM one= new SIM("34234234");
one.info();
one.ricarica(5);

//        Chiamata c1 = new Chiamata("1111");
//
//
//        one.effetuachiama(c1.stampchiamata());
//        Chiamata c2 = new Chiamata("2222");
//
//        c2.stampchiamata();
//
//        Chiamata c3 = new Chiamata("3333");
//        c3.getNumchiamata()
//
//        Chiamata c4 = new Chiamata("4444");
//
//        Chiamata c5 = new Chiamata("5555");
//
//        one.effetuachiama(c2);
//        one.effetuachiama(c3);
//        one.effetuachiama(c2);
//        one.effetuachiama(c4);
//        one.effetuachiama(c5);
        Chiamata[] arrch= new Chiamata[5];
        for (int i = 0; i < arrch.length; i++) {
            arrch[i]= new Chiamata("10"+i);

            one.effetuachiama(arrch[i]);
        }

one.info();


            //System.out.println("********************************");
            //System.out.println("Credito finale e: "+one.getCredito());








        }
    }
