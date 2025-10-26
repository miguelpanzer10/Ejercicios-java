public class Main {
    public static void main(String[] args) {
        // El for con sus tres secciones:
        // 1. Inicialización (int i = 1)
        // 2. Condición (i <= 100)
        // 3. Incremento (i++) <-- ¡Aquí está!
        for (int i = 1; i <= 100; i++) {

            // La condición IF se encarga de DETECTAR el número par.
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            // El cuerpo del bucle NO necesita el i++ porque ya está en la cabecera.
        }
    }
}


