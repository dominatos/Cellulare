

public class Chiamata {
    public String numchiamata;
    public double durata;




    public Chiamata(String numchiamata ) {
        this.numchiamata = numchiamata;
        this.durata = randomdur();

    }
  public  String stampchiamata() {
        //System.out.println(this.numchiamata);
        return this.numchiamata;
  }
    public double randomdur(){
        double min=Math.random()*10;
        return min;
    }
}
