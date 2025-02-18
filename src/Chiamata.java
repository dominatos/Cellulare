

public class Chiamata {
    public String numchiamata;
    public double durata;




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
        return this.numchiamata+" "+this.durata;
    }
    public double randomdur(){
        double min=Math.random()*10;
        return min;
    }
}
