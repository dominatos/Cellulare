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

        Chiamata c1 = new Chiamata("1111");
        //c1.stampchiamata();

//        one.effetuachiama(c1.stampchiamata());
        Chiamata c2 = new Chiamata("2222");
        //c2.stampchiamata();
//        one.effetuachiama(c2.stampchiamata());
        Chiamata c3 = new Chiamata("3333");
//        one.effetuachiama(c3.stampchiamata());
        Chiamata c4 = new Chiamata("4444");
//       one.effetuachiama(c4.stampchiamata());
        Chiamata c5 = new Chiamata("5555");
//       one.effetuachiama(c5.stampchiamata());
one.info();







        }
    }
