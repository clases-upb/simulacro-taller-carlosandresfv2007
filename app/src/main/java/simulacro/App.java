/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package simulacro;

public class App {
    public static void main(String[] args) {

    }


    /*
     * 1. Diseña el algoritmo y programa la función Convertir_min_sec que recibe un número entero en minutos 
     * y devuelve en entero, los segundos equivalentes. Si hay un error, devuelve -1. 
     *  Adaptado de edabit
     */

    public static int Convertir_min_sec (int minutos) {

        try {
            
            int tot_segundos = 0;
            final byte segx_min = 60;
            tot_segundos = minutos * segx_min;
            return tot_segundos;



        } catch (Exception e) {

            return -1;

        }

     }
    


     /*
     * 2. Diseña el algoritmo y programa la función Validar_iguales que recibe dos números shorts 
     * y devuelve un booleano true si son iguales, false si no lo son. Si hay un error, devuelve false también.
     *  Adaptado de edabit
     */

    public static Boolean Validar_iguales (short nro1, short nro2) {

       try {

        boolean son_iguales = false;

        if (nro1 == nro2) {
            son_iguales = true;
        } else {
            son_iguales = false;
        }
        return son_iguales;

       } catch (Exception e) {

        return false;

    
       }


     }




    /*
     * 3. Diseña el algoritmo y programa la función Calcular_potencia que recibe en un short el voltaje y en 
     * un byte, la corriente. Devuelve en un float, la potencia (potencia = voltaje * corriente). 
     * Si hay un error, devuelve 0.
     *  Adaptado de edabit
     */

    public static float Calcular_potencia (short voltaje, byte corriente) {

        try {

            float potencia = 0;
            potencia = voltaje * corriente;
            return potencia;

        } catch (Exception e) {

            return 0;

        }

     }




}
