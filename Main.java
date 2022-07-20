

public class Main{

    static int funcionSuma(int n1, int n2, int n3){
        int resultado;
        resultado= n1+n2+n3;
        return resultado;
    }

    public static void main(String args[]){
        int num1, num2, num3;
        num1=3;
        num2=4;
        num3=7;
        System.out.println("El resultado de la suma es: " + funcionSuma(num1, num2, num3));

        //CREACION DE OBJETO
        coche miCoche = new coche();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        System.out.println("El numero de puertas es de: " + miCoche.numeroPuertas);
    }
}

class coche{
    public int numeroPuertas=0;
    
    public int incrementarPuertas(){
        numeroPuertas+=1;
        return numeroPuertas;

    }    
}