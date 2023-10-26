
package poop8;

/**
 *
 * @author Sanchez Ramirez Miguel Angel
 */

public class Cuadrilatero extends Poligono {
    private int alfa;
    private int beta;
    private int gamma;
    private float a;
    private float b;
    private float c;
    private float base;
    private float altura;
/**
 * Constructor 
 */
    public Cuadrilatero() {
    }

    public Cuadrilatero(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }
    /**
     * 
     * @return alfa, beta, gamma, a, b, c, altura, area 
     */

    public int getAlfa() {
        return this.alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return this.beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getGamma() {
        return this.gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public float getA() {
        return this.a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return this.b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return this.c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBase() {
        return this.base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
/**
 * 
 * @return
 */
    @Override
    public int area() {
        return (int)(this.base * this.altura);
    }

    @Override
    public int perimetro() {
        return (int)(2.0F * this.a + 2.0F * this.b);
    }

    @Override
    public String toString() {
        String var10000 = super.toString();
        return var10000 + "Cuadrilatero{alfa=" + this.alfa + ", beta=" + this.beta + ", gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", base=" + this.base + ", altura=" + this.altura + "}";
    }
}