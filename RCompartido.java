
package condicionescompetenciafinal;
import java.util.ArrayList;

public class RCompartido {
    private String rc;              
    private Cerradura cerradura;
    private ArrayList<Interrupcion> interrupciones;
    private boolean state;
    private boolean H[] = {false, false, false, false};
    private int turno;
    
    RCompartido(){
        //Condiciones competencias
        this.state = true;
        //Interrupciones
        this.interrupciones = new ArrayList<Interrupcion>();
        for(int i = 0; i<4; i++){
            interrupciones.add(new Interrupcion());
        }
        //Cerradura
        this.cerradura = new Cerradura();        //Creamos nuestra cerradura
        
    }
    
    public void cerrarCerradura(){     //Bloqueamos nuestro rc cerrando la cerradura
        cerradura.cerrar();
    }
    
    public void abrirCerradura(){      //Desbloqueamos nuestro rc abriendo la cerradura
        cerradura.abrir();
    }
    
    public String getrc() {         //Obtenemos el rc
        return rc;
    }
    
    public boolean statusCerradura(){           //Para verificar si podemos entrar, verificamos la cerradura
        return cerradura.estado();
    }
    
    public void setrc(String rc) {       //Establecemos neustro rc
        this.rc = rc;
    }
    public boolean estadoDeLasInterrupciones(){    //Función para saber el estado de las interrupciones, si han sido bloqueadas o no
        for(Interrupcion i: interrupciones){
            if(i.estado() == false){
                return false;
            }
        }
        return true;
    }
    
    public void desactivarInterrupciones(){     //Manejo de interrupciones
        for(Interrupcion i: interrupciones){
            i.desactivar();
        }
    }
    public void activarInterrupciones(){    
        for(Interrupcion i: interrupciones){
            i.activar();
        }
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    public boolean[] getH() {
        return H;
    }
    public void setH(int p, boolean f) {
        this.H[p] = f;
    }
    
    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }

    
}
