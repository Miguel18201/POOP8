
package poop8;

/**
 *
 * @author Sanchez Ramirez Miguel Angel
 */
public class POOP8 {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Poligono poligono;
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero();
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        triangulo.setBase(5.0F);
        triangulo.setAltura(3.0F);
        cuadrilatero.setBase(4.0F);
        cuadrilatero.setAltura(6.0F);
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        System.out.println(triangulo.area());
        System.out.println(cuadrilatero.area());
        /**Poligono poligono = new Triangulo();
        System.out.println(poligono);
        getPoligono(poligono);
        Poligono poligono2 = new Cuadrilatero();
        getPoligono(poligono2);**/
        poligono = new Triangulo();
        System.out.println(poligono);
        getPoligono(poligono);
        poligono = new Cuadrilatero();
        getPoligono(poligono);
        Flauta flauta = new Flauta();
        System.out.println(flauta.tipoInstrumento());
        System.out.println(Math.PI);
        System.out.println(Meses.NOMBRE_MESES[Meses.UNO]);
    }
    /**
     * 
     * @param poligono 
     */
    private static void getPoligono(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("Es un triangulo");
        } else if (poligono instanceof Cuadrilatero) {
            System.out.println("Es un cuadrilatero");
        } else {
            System.out.println("Es un poligono");
        }

    }
}
