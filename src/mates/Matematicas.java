package mates;

//Clase Matematicas
public class Matematicas {
    //Atributos
    public static double radio = 1;
    public static int c = 0;
    //Método generarNumeroPiRecursivo
    public static double generarNumeroPiRecursivo (long pasos)
    {
        //Si pasos es menor o igual a 0, se retorna 0
        if (pasos <= 0)
        {
            return 0;
        }else{
            //Se generan números aleatorios
            double x = -radio + Math.random() * radio;
            double y = -radio + Math.random() * radio;
            double comprobacion = x * x + y * y;
            //Si la comprobación es menor o igual al radio al cuadrado, se incrementa c
            if (comprobacion <= radio * radio) 
            {
                c++;
            }
            generarNumeroPiRecursivo(--pasos);
        }
        //Se retorna el valor de pi
        double numeroPi = 4.0 * c / pasos;
        return numeroPi;
    }
}