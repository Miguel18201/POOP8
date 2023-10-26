
package poop8;

/**
 *
 * @author Sanchez Ramirez Miguel Angel
 */
public class InstrumentoViento extends Object implements InstrumentoMusica {
    
/**
 * Constructor clase InstrumentoViento
 */    

    public InstrumentoViento() {
    }
    
/**
 * prints de tocar,afinar, tipo de instrumento
 */    

    @Override
    public void tocar() {
        System.out.println("Esta tocando instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Esta afinado");
    }

    @Override
    public String tipoInstrumento() {
        return "InstrumentoViento";
     
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
    
}
