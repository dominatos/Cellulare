import java.util.Scanner;

public class SIM {
static Scanner sc=new Scanner(System.in);


    public String numero;
    public double credito=0;
    public double durata;
    public Chiamata[] listach;

    public double prmin;
//;kl;k;lk;l

    public double getCredito() {
        return credito;
    }

    public SIM(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.listach= new Chiamata[5];
        this.prmin = 0.10;

    }
    public void effetuachiama(Chiamata chiamata){
        for(int i=0;i<listach.length;i++) {
            if (listach[i] == null) {
                if( this.credito>0){
                this.listach[i]=chiamata;
                this.acreditarechiamata(chiamata);
                    System.out.println("chiamata n."+i+" effetuata con successo");
                //System.out.println(this.listach[i].getNumchiamata()+" "+this.listach[i].getDurata());
                return;}
                else{ System.out.println("Non hai credito sufficiente per effetuare la chiamata");
                return;}
            }
//            else if (listach[listach.length-1] != null) {
//                if( this.credito>0){
//                    this.listach[0+i]=chiamata;
//                    this.acreditarechiamata(chiamata);
//                    System.out.println("chiamata n."+i+" effetuata con successo");
//                    //System.out.println(this.listach[i].getNumchiamata()+" "+this.listach[i].getDurata());
//                    return;}
//                else{ System.out.println("Non hai credito sufficiente per effetuare la chiamata");}
//            }

        }

    }

    public void info() {
        System.out.println("SIM: " + this.numero + " con credito: " + this.credito);
                System.out.println("Il prezzo di minuta : " + this.prmin);
        for(int i=0;i<this.listach.length;i++) {
            if(this.listach[i]!=null){
                System.out.println(this.listach[i].stampchiamata());

            }
            else{
                System.out.println("Nessun chiamata e si effetuata");
                break;}
        }


    }


public void acreditarechiamata(Chiamata chiamata) {

            this.credito = this.credito - (chiamata.getDurata() * this.prmin);
            //System.out.println(this.credito);

}
    public void ricarica(double soldi)
    {
        this.credito=this.credito+soldi;
        System.out.println("La ricarica di EUR"+soldi+" e andata a buon fine!");


    }









}


