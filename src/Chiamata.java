import java.math.BigDecimal;
import java.math.RoundingMode;

public class Chiamata {
    public String numchiamata;
    public double durata;

    public Chiamata() {
        this.numchiamata = "non e fatta la chiamata";
        this.durata = 0;

    }


    public Chiamata(String numchiamata ) {
        this.numchiamata = numchiamata;
        this.durata = randomdur();

    }

    public String getNumchiamata() {
        return this.numchiamata;
    }

    public double getDurata() {
        return this.durata;
    }

    public  String stampchiamata() {
        //System.out.println(this.numchiamata);
        BigDecimal bdDUr = new BigDecimal(this.durata);
        bdDUr = bdDUr.setScale(2, RoundingMode.HALF_UP);
        return "Numero: "+this.numchiamata+"\nDurata: "+bdDUr;
    }
    public double randomdur(){
        double min=Math.random()*10;
        return min;
    }
}
