
package condicionescompetenciafinal;
public class Cerradura {
    private boolean cerradura;   //Atributo para denotar el estado de la cerradura
    
    public Cerradura(){         //Cuando se crea comienza "abierta" ya que ningún proceso ha accedido al rc
        this.cerradura = true;
    }
    
    public void cerrar (){      //Método para cerrar cerradura
        this.cerradura = false;
    }
    
    public void abrir (){       //Método para abrir cerradura
        this.cerradura = true;
    }
    
    public boolean estado(){    //Método para verificar el estado de la cerrdaura
        return cerradura;
    }

}

