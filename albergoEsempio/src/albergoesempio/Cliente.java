
package albergoesempio;

public class Cliente {
        private String nome;
        private String cognome;

    Cliente(String nome, String cognome) {
        this.nome=nome;
        this.cognome = cognome;
    }

  
    public Cliente(){
        nome=null;
        cognome=null;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
        
    
    public boolean equals(Cliente obj) {
       boolean value = false;
       if ( obj.getCognome().equals(cognome) && nome.equals(obj.getNome()))
            value = true;
       return value;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cognome=" + cognome + '}';
    }

        
}
