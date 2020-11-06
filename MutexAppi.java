package condicionescompetenciafinal;
public class MutexAppi {
    private boolean pass = false;
    
    MutexAppi(){
        
    }
    
    public void lock(){
        try{
            wait();
        }catch(Exception e){
            e.printStackTrace();
        ;}
    }
    
    public void unlock(){
        notify();
    }
    
    public boolean trylock(){       //Lógica en caso de fallas stop(), interrupt, etc
        try{
            wait();
        }catch(Exception e){}
        finally{
            unlock();
            return false;
        }
        
    }
}
