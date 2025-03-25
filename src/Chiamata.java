

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
        return "Numero: "+this.numchiamata+"\nDurata: "+this.durata;
    }
    public double randomdur(){
        double min=Math.random()*10;
        return min;
    }
}
