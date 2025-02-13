import java.util.Scanner;

public class SIM {
static Scanner sc=new Scanner(System.in);


    public String numero;
    public double credito=0;
    public double durata;
    public String[] listach;
    public Chiamata chiamata;
    public double prmin=0.05;
//;kl;k;lk;l

    public SIM(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.listach= new String[5];
        this.chiamata=new Chiamata("5");
        this.prmin = 0.05;
    }

    public void info() {
        System.out.println("SIM: " + this.numero + " con credito: " + this.credito);
        System.out.println("Credito: " + this.credito);
        System.out.println("Il prezzo pr minuta di chiamata : " + this.prmin);



    }



    public void ricarica(double soldi)
    {
        this.credito=this.credito+soldi;



    }









}


