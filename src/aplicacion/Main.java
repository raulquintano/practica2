import mates.*;

public class Main {
    
    public static void main(String[] args) {

        //Se llama al método generarNumeroPiRecursivo de la clase Matematicas
        System.out.println("La aproximación al número pi es: " + Matematicas.generarNumeroPiRecursivo(Integer.parseInt("1000")));
    }
}