package condicionescompetenciafinal;
public class Mutex{
    private boolean pass; //True ocupado, false desocupado
    
    Mutex(){
        this.pass = false;
    }
    
    public synchronized void lock(){
       while(pass){
           try{
               wait();
           }catch(InterruptedException e){
               System.out.println("ERROR" + e.toString());
           }
       }
    }
    
    public synchronized void unlock(){
        this.pass = false;
        notify();
    }
    
    public boolean trylock(){       //Lógica en caso de fallas stop(), interrupt, etc
        if(this.pass == false){
            return true;
        }
        else{
            try{
                wait();
            }catch(Exception e){}
            finally{
                unlock();
                return false;
            }
        }
        
    }
    
    public synchronized boolean getpass(){
        return pass;
    }
    
    public synchronized void setpass(boolean p){
        this.pass = p;
    }
}
