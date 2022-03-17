
public class Collatz {
    public static void main(String[] args) {
        long numero = 3831L; //numero que se quiere saber cuantas veces se hace una modificacion para llegar a 1 
        long bandera = 45L;
        int contador = 0;
        while (numero != 1) {// aqui se ven las potencias
            if (numero % 2 == 0) {
                if (numero % 16 == 0) {
                    contador = contador + 4;
                    numero = numero / 16;
                } else if (numero % 8 == 0) {
                    contador = contador + 3;
                    numero = numero / 8;
                } else if (numero % 4 == 0) {
                    contador = contador + 2;
                    numero = numero / 4;
                } else {
                    contador = contador + 1;
                    numero = numero / 2;
                }
            } else {
                numero = numero * 3 + 1;
                contador++;
            }
        }
        System.out.println(contador);

    }

}
// determinación de la cantidad n de números que se necesitan para llegar a 1
// según la conjetura de Collatz.
// necesariamente la conjetura se cumple porque siempre se llega a un número par
// y potencia par
