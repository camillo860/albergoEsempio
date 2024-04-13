
package albergoesempio;

import exception.ChiaveException;


public class Portachiavi {
    private Chiave contenitore[]=null;
    
    public Portachiavi() { 
        contenitore = new Chiave [10];
    }
    
    public Portachiavi (int dim )
    { contenitore = new Chiave [dim];
    }
    public boolean inserisciChiave( int idChiave, String nome , String cognome) throws ChiaveException{
        Chiave key = new Chiave (idChiave,nome,cognome);
        return inserisciChiave (key);
    }
    public boolean inserisciChiave(Chiave chiave) throws ChiaveException{
        boolean value = false;
        int pos=-1;
        for (int i=0;i<contenitore.length;i++)
        {
            if (contenitore[i]==null){
                pos=i;
                i=contenitore.length;
            //  break;
            }
            
        }
        if ( pos != -1){
            contenitore[pos]=chiave;
            value=true;
        }
        else {
            throw new ChiaveException("Errore !!!");
        }
        return value;
    }
    
    public Chiave cercaChiave(Chiave chiave) throws ChiaveException{
        
        Chiave key=null;
        for (int i =0;i<contenitore.length;i++){
            if (contenitore[i]!=null){
            if (chiave .equals(contenitore[i])){
                 
                key=contenitore[i];
                contenitore[i]=null;
                i=contenitore.length;
            }}
        }
        if (key==null)
                throw new ChiaveException("Errore Utente non trovato");
        return key;
    }
    
    public Chiave cercaChiave(String nome, String cognome, int numeroChiave) throws ChiaveException{
        Chiave key= new Chiave(numeroChiave,nome,cognome);
        return  cercaChiave(key);
    }

    
    @Override
    public String toString() {
        
        String value="";
        for( int i =0;i<contenitore.length;i++){
            if ( contenitore[i]!=null)
                value =value +"\n" +contenitore[i].toString();
        }
        return value;
    }
}
