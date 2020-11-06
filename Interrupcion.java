// LUIS JESUS REYES VELAZQUEZ 201732135
package condicionescompetenciafinal;
public class Interrupcion {         //Creamos nuestra clase interrupción para hacer un manejo de las mismas
    private boolean estado;
    
    public Interrupcion(){         //Estado inicial de las interrupciones
        this.estado = true;  
    }
    
    public void desactivar(){  //En caso de desactivar las interrupciones, se desactiva el acceso al recurso compartido
        this.estado = false;
    }
    
    public void activar(){    //Cuando se vuelven a activar, se libera el recurso
        this.estado = true;
    }
    public boolean estado(){  //Necesitamos estar verificando el estado de las interrupciones para hacer uso del recurso
        return estado;
    }
}
