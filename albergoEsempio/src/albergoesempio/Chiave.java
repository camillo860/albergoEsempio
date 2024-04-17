
package albergoesempio;
    
public class Chiave implements java.io.Serializable {
    private Cliente nominativo;
    private int IdChiave;

    public Chiave(int idChiave, String nome,String cognome){
        Cliente c= new Cliente(nome,cognome);
        IdChiave= idChiave;
        nominativo= c;
    }

   public  Chiave(int idChiave, Dipendente dipendente) {
       IdChiave= idChiave;
       // Up Casting
       nominativo= dipendente;
    }
    public void setNominativo(Cliente nominativo) {
        this.nominativo = nominativo;
    }

   /*public void setIdChiave(int IdChiave) {
        this.IdChiave = IdChiave;
    } */

    public Cliente getNominativo() {
        return nominativo;
    }

    public int getIdChiave() {
        return IdChiave;
    }
    
    public boolean equals ( Chiave key){
        boolean value=false;
        if (nominativo.equals(key.getNominativo()) && IdChiave == key.getIdChiave())
                value = true;
        return  value;
        
    }

    @Override
    public String toString() {
        return "Chiave{" + "nominativo=" + nominativo.toString() + ", IdChiave=" + IdChiave + '}';
    }
    
}
