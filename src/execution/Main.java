package execution;

import core.Coche;

public class Main {
    public static void main(String [] args) {

        suma(8,5,4);

        Coche coche= new Coche();
        coche.numTotalPuertas();
        System.out.println(coche.numPuertas);
    }
    public static void suma(int num1,int num2, int num3){
        System.out.println(num1+num2+num3);
    }
}
class Potato{
    public int brazos=0;
    public void QuitarBrazo(){
        this.brazos--;
    }
}