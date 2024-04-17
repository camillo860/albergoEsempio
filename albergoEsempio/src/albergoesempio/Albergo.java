/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albergoesempio;



import exception.ChiaveException;
import java.io.IOException;
import java.time.LocalDate;
 
public class Albergo {

    public static void main(String[] args) {
        System.out.println("##################\nGestione Albergo Chiavi!!\n##################");
        
        Portachiavi pc=new Portachiavi();
        Chiave k1= new Chiave(101,"Mario","Rossi");
        Chiave k2 = new Chiave (102, "Maria","Verdi");
        Chiave k3= new Chiave (201,"Alberto","Red");
        Chiave k4 = new Chiave(203,new Dipendente("Alfred","Yellow","Direttore",LocalDate.parse("2012-12-21")));
        try {
            pc.inserisciChiave(k1);
            pc.inserisciChiave(k2);
            pc.inserisciChiave(k3);
            pc.inserisciChiave(k4);
            System.out.println(pc.toString());
            
             if (pc.cercaChiave("Mario","Rossi", 101)!=null){
                System.out.println("Utente trovato! - Consegnare chiave");
            }
           /* if (pc.cercaChiave("Mario","Rossi", 100)!=null){
                System.out.println("Utente trovato! - Consegnare chiave");
            }*/
             
           } catch (ChiaveException ex) {
           System.out.println(ex.getMsx());
        }
        Portachiavi pc2=new Portachiavi();
        try {
            pc.salvaPortachiavi();
            pc2.caricaPortachiavi();
            System.out.println(pc2.toString());

        } catch (IOException ex) {
            System.out.println (ex.toString()   );
        }
        
            
      
        
        
        
    }
}
