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
        for (int i = 0; i < this.listach.length; i++) {
            this.listach[i] = new Chiamata(); // Создаем объект для каждой ячейки
        }

    }
    private int currentIndex = 0; // Indice per la riscrittura ciclica

    public void effetuachiama(Chiamata chiamata) {
        if (this.credito > 0) { // Controlla se c'è credito sufficiente
            // Verifica se il credito è sufficiente per effettuare la chiamata
            if (chiamata.getDurata() * this.prmin <= this.credito) {
                listach[currentIndex] = chiamata; // Aggiunge la chiamata nell'indice corrente
                this.acreditarechiamata(chiamata); // Deduce il costo della chiamata dal credito
                System.out.println("Chiamata n." + currentIndex+1 + " effettuata con successo"); // Messaggio di conferma

                // Incrementa l'indice in modo ciclico
                currentIndex = (currentIndex + 1) % listach.length; // Torna a 0 se l'indice raggiunge la lunghezza dell'array
            } else {
                System.out.println("Non hai abbastanza credito per effettuare la chiamata."); // Messaggio per credito insufficiente
            }
        } else {
            System.out.println("Non hai credito sufficiente per effettuare la chiamata."); // Messaggio se il credito è zero
        }
    }

    public void info() {
        System.out.println("SIM: " + this.numero + " con credito: " + this.credito);
                System.out.println("Il prezzo di minuta : " + this.prmin);




        for(int i=0;i<this.listach.length;i++) {
            if(this.listach[i]!=null && !this.listach[i].getNumchiamata().equals("non e fatta la chiamata")){
                System.out.println("**************************");
                int n=i+1;
                System.out.println("Chiamata "+n);
                System.out.println(this.listach[i].stampchiamata());
                System.out.println("Costo di chiamta:"+this.prmin*this.listach[i].getDurata());
                System.out.println("**************************");

            }
            else if(this.listach[i].getNumchiamata().equals("non e fatta la chiamata") ) {
                //System.out.println("Nessun chiamata e si effetuata");
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


