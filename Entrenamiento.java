package clubdeportivo;
import java.util.Scanner;
/**
 * Clase Entrenamiento sirve para el menú del ejercicio y tener todos los métodos en esta clase
 * @author pablobapa
 * @version 2021
 */
public class Entrenamiento {
    /**
     * Creamos una marca nueva llamada entrenamiento
     * un int con el nombre resp
     * E imprimimos por pantalla un menú con selección a partir de números
     * Switch de la respuesta y en el caso 1
     * <ul>
     *  <li>Caso 1: Enseñamos las marcas iniciales de los 3 atletas</li>
     *  <li>Caso 2: Preguntamos que atleta queremos cambiar y modificamos su marca</li>
     *  <li>Caso 3: Visualizamos las medias de las modalidades en las que entrenan</li>
     *  <li>Caso 4: Enseña los atletas que han mejorado su tiempo</li>
     *  <li>Caso 5: Mostramos las marcas finales de los atletas en el entrenamiento</li>
     *  <li>Caso 6: Guardamos los datos del entrenamiento</li>
     *  <li>Caso 7: Salimos de la aplicación</li>
     * </ul> 
     * @param args 
     */
    public static void main(String[] args) {
        Marcas entrenamiento = new Marcas();
        //Marcas histórico = new Marcas(entrenamiento);

        int resp;
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("1. INTRODUCIR LAS MARCAS INICIALES DE LOS ATLETAS EN ESTA JORNADA DE ENTRENAMIENTO");
        System.out.printf("2. MODIFICAR LA MARCA DEL ATLETA");
        System.out.println("3. VISUALIZAR LA MEDIA DE LAS MARCAS EN LAS MODALIDADES QUE ENTRENAN");
        System.out.println("4. ATLETAS QUE HAN MEJORADO SU MEJOR MARCA");
        System.out.println("5. MOSTRAR LAS MARCAS FINALES DE LOS ATLETAS EN EL ENTRENAMIENTO");
        System.out.println("6. GUARDAR DATOS DEL ENTRENAMIENTO EN HISTÓRICO");
        System.out.println("7. SALIR");
        resp=sc.nextInt();

        switch (resp){
            case 1:

                entrenamiento.marcaInicial(1);
                entrenamiento.marcaInicial(2);
                entrenamiento.marcaInicial(3);
                break;
            case 2:
                System.out.println("QUE ATLETA QUIERES CAMBIAR SU MARCA");
                int num_atleta=sc.nextInt();
               entrenamiento.modificarMarca(num_atleta);
                break;

            case 3:
                entrenamiento.medidaMarcasModalidad();
                break;
            case 4:
                System.out.println("tengo que hacerlo");
                break;
            case 5:

                entrenamiento.mostrarAtleta(1);
                entrenamiento.mostrarAtleta(2);
                entrenamiento.mostrarAtleta(3);
                break;
            case 6:

                System.out.println("tengo qu");
                break;
        }
        }while (resp !=7);
    }
}
