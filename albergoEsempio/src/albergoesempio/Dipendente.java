/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albergoesempio;



import java.time.LocalDate;



public class Dipendente extends Cliente {


    
    private String ruolo;
    private LocalDate date;

    public Dipendente (){
        super();
        date=null;
        ruolo=null;
    }
    public Dipendente(String nome, String cognome, String ruolo, LocalDate date) {
        super(nome, cognome);
        this.date=date;
        this.ruolo=ruolo;
    }

    @Override
    public String toString() {
        return "Dipendente{" + "ruolo=" + ruolo + ", date=" + date + '}';
    }
    
        public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
     
}
