package condicionescompetenciafinal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JTextArea;
public class Hilo extends Thread{
    private JTextArea area;
    private RCompartido rc;
    private final static int inicio = 995;
    private final static int fin = 1000;
    private boolean dead=false;
    private boolean block=false;
    private int elegido, algoritmo;
    private int id;
    private static final int Nthreads = 4;
    //private static volatile boolean[] wannaB = new boolean[Nthreads];
    //private static volatile boolean[] seccionC = new boolean[Nthreads];
    //private static volatile int k = 0;
    private Lock mutexApi;
    private Mutex mutex;
    
    Hilo(JTextArea area,RCompartido rc){
        this.area = area;                   //Creamos el hilo con su respectiva area y rc
        this.rc = rc;
        mutexApi = new ReentrantLock();
        mutex = new Mutex();
    }
    
    public void run(){
        switch(this.algoritmo){
 /////////////////////// CONDICIONES COMPETENCIAS  ////////////////////////////////////////////////////////////////////////////   
            
            case 1:     
                while(true){
                    try{
                        rc.setrc(this.getName());
                        area.append(rc.getrc()+" eats \n");
                        sleep(500);        
                        
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
                
 //********************* DESACTIVACION DE INTERRUPCIONES ****************************************************************               
 //**************************************************************************************************************************
            case 2:     
                while(true){                   
                    
                    try{
                        if(rc.estadoDeLasInterrupciones()){ //Verificamos nuestro estado de nuestras interrupciones
                            rc.desactivarInterrupciones();      //Desactivamos nuestras interrupciones antes de entrar a la sección crítica                         
                            rc.setrc(this.getName());
                            area.append(rc.getrc()+" eats\n");
                            if(isDead()){   
                                stop();     //Método de clase para ejemplificar kill
                            }   
                            rc.activarInterrupciones();      //Activamos las interrupciones una vez salimos de la sección crítica                                           
                        }
                        else{
                            area.append("Esperando...\n");  //Sino puede acceder al recurso se queda en espera
                        }
                        Thread.sleep((int) (inicio+Math.random()*fin));
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
// ---------------------------- VARIABLE DE CERRADURA --------------------------------------------------------------------   
//----------------------------------------------------------------------------------------------------------------------------                
            case 3:     
                while(true){            //Recordando que para bloquear y desbloquear se hace uso de la cerradura
                    try{
                        if(rc.statusCerradura()){      //Verificamos si podemos acceder el rc
                            rc.cerrarCerradura();      //Lo bloqueamos para los demás procesos
                            rc.setrc(this.getName());
                            area.append(rc.getrc()+" eats\n");
                            if(isDead()){   
                                stop();     //Método de clase para ejemplificasr kill
                            }               //El cual NO debe ser usado
                            rc.abrirCerradura();       //Una vez acabamos de usar el recurso lo desbloqueamos
                        }
                        else{
                            area.append("Esperando...\n");  //Sino puede acceder al recurso se queda en espera
                        }
                        Thread.sleep((int) (inicio+Math.random()*fin));
                    }catch(Exception e)
                        {e.printStackTrace();
                    }
                 }
                
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!  ALGORITMO DEKKER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                
                
            case 4:    
                while (true){  // empezamos con el ciclo
                    try{
                        rc.setH(rc.getTurno(), true);   // verificamos el estado de la sc y el proceso en ejecucion.
                        while(Ocupada() != -1){     //le ponemos un marcador al proceso que ingresa
                            rc.setH(rc.getTurno(), false); //
                            Thread.sleep((int)(inicio + Math.random() * fin));  //
                        }
                        rc.setH(rc.getTurno(), true);   
                        rc.setrc(this.getName());
                        area.append(rc.getrc() + "\n");
                        if(isDead()){
                            stop();
                        }
                        rc.setH(rc.getTurno(), false);  // verificamos el estado de la sc y el proceso en ejecucion.
                        if(rc.getTurno() == 3){   //le ponemos un marcador al proceso que ingresa
                            rc.setTurno(0);
                        }
                        else{
                            rc.setTurno(rc.getTurno()+1);
                        }
                        Thread.sleep((int)(inicio + Math.random() * fin));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }    
            case 5:     //Dijkstra
               /*
                dijkstra:
                while (true) {
                    wannaB[id] = true;
                    wannaB = wannaB;
                    while (k != id) {
                        seccionC[id] = false;
                        seccionC = seccionC;
                        if (!wannaB[k]) {
                            k = id;
                        }
                    }
                    //Busca en el arreglo, esperando que ninguno este en la sección crítica, así, si encuentra que uno esta, sigue sin entrar.
                    seccionC[id] = true;
                    seccionC = seccionC;
                    for (int i = 0; i < seccionC.length; i++) {
                        if (i != id && seccionC[i]) {
                            
                            continue dijkstra;
                        }
                    }
                    //Cuando se cumple que al revisar el arreglo puede entrar, intentará esto. Así pudiendo ejecutar su sección c'ritica.
                    try{
                        rc.setrc(this.getName());
                        area.append(rc.getrc()+"\n");
                        if(isDead()){
                            stop();
                        }
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    //Se reinicia su turno
                    seccionC[id] = false;
                    seccionC = seccionC;
                    wannaB[id] = false;
                    wannaB = wannaB;
                }
                */
                
 ////////////////////////////////  M U T E X /////////////////////////////////////////////////////////////////////////               
                
            case 6:    
                while(true){            //Recordando que para bloquear y desbloquear se hace uso de mutex
                    try{
                        if(mutexApi.tryLock()){
                            mutexApi.lock();
                            rc.setrc(this.getName());
                            area.append(rc.getrc()+" eats" + "\n");
                            if(isDead()){   
                                stop();     //Método de clase para ejemplificasr kill
                            }   
                            mutexApi.unlock();
                        }      
                        else{
                            area.append("Esperando...\n");
                        }
                        Thread.sleep((int) (inicio+Math.random()*fin));
                    }catch(Exception e){e.printStackTrace();}
                }  
                
/////////////////////////////  OTRO MUTEX /////////////////////////////////////////////////////////////////////////////////////                
            case 7:   
                while(true){            //Recordando que para bloquear y desbloquear se hace uso de mutex
                    try{
                        if(mutex.trylock()){
                            mutex.lock();
                            rc.setrc(this.getName());
                            area.append(rc.getrc()+" eats" + "\n");
                            if(isDead()){   
                                stop();     //Método de clase para ejemplificasr kill
                            }   
                            mutex.unlock();
                        }
                        else{
                            area.append("Esperando...");
                        }
                        Thread.sleep((int) (inicio+Math.random()*fin));
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }
        }

    }
    public boolean isDead(){
        return dead;
    }
    public void setDead(boolean d){
        dead=d;
    }
    public boolean isBloquear(){
        return block;
    }
    public void setBlock(boolean b){
        block=b;
    }
    public void Elegido(int i){
        elegido=i;
    }

    public int getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(int algoritmo) {
        this.algoritmo = algoritmo;
    }
    
    public int Ocupada(){           // Verificamos el estado del proceso y de la seccion critica 
        boolean b[] = rc.getH();
        for(int i=0;i<b.length;i++){
            if(rc.getTurno() != i){
                if(b[i]){
                    return i; 
                }
            }
        }
        return -1;
    }
    
    public void setID(int i){
        id = i;
    }
}
