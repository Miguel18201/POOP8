
package poop8;

/**
 *
 * @author Sanchez Ramirez Miguel Angel
 */
public abstract class Poligono  {
/**
 * constructor poligono
 */

    public Poligono() {
    }
    
    public abstract int area();
    public abstract int perimetro();
   /**
    * 
    * @return poligono  
    */ 

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }

    
    
}




