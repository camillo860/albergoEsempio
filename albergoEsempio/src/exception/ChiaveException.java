package exception;


public class ChiaveException extends Exception {
    private String msx;
    public ChiaveException (String msx){
        this.msx=msx;
    }
    public String getMsx(){ return msx;} 
}

