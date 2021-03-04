package clubdeportivo;
import java.util.Scanner;

/**
 * Creación de los atletas y métodos para edición del atleta, de las modalidades, magnitud, la marca máxima y la marca mínima
 * @author pablobapa
 * @version 2021
 */
public class Marcas {
    protected Atleta atleta1; //Creamos atleta 1
    protected Atleta atleta2; //Creamos atleta 2
    protected Atleta atleta3; //Creamos atleta 3
    
    /**
     * Constructor por parámetros creamos 3 atletas nuevos
     */
    Marcas(){
        atleta1 = new Atleta();
        atleta2 = new Atleta();
        atleta3 = new Atleta();
    }
    
    /**
     * Constructor por parámetros que enviamos un Atleta
     * @param atletacopiaM 
     */
    Marcas(Atleta atletacopiaM){
        atleta1 = new Atleta(atletacopiaM.Modalidad, atletacopiaM.Magnitud, atletacopiaM.Marca_Max, atletacopiaM.Marca_Min);
        atleta2 = new Atleta(atletacopiaM.Modalidad, atletacopiaM.Magnitud, atletacopiaM.Marca_Max, atletacopiaM.Marca_Min);
        atleta3 = new Atleta(atletacopiaM.Modalidad, atletacopiaM.Magnitud, atletacopiaM.Marca_Max, atletacopiaM.Marca_Min);
    }

    /**
     * Devolvemos el atleta1
     * @return atleta1
     */
    public Atleta getAtleta1() {
        return atleta1;
    }

    /**
     * Asignamos el atleta1
     * @param atleta1 
     */
    public void setAtleta1(Atleta atleta1) {
        this.atleta1 = atleta1;
    }

    /**
     * Devolvemos el atleta2
     * @return atleta2
     */
    public Atleta getAtleta2() {
        return atleta2;
    }

    /**
     * Asignamos el atleta2
     * @param atleta2 
     */
    public void setAtleta2(Atleta atleta2) {
        this.atleta2 = atleta2;
    }

    /**
     * Devolvemos el atleta3
     * @return atleta3
     */
    public Atleta getAtleta3() {
        return atleta3;
    }

    /**
     * Asignamos el atleta3
     * @param atleta3 
     */
    public void setAtleta3(Atleta atleta3) {
        this.atleta3 = atleta3;
    }
    
    /**
     * Buscamos el dorsal del atleta y mostramos su marca
     * @see "Mostrar Atleta"
     * @see <a href="https://www.google.com/search?q=atletas&client=ubuntu&hs=bwK&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjPjYy1xOLuAhWJJcAKHaCxCQgQ_AUoAXoECBIQAw&biw=650&bih=641#imgrc=5yk04oTOduog7M">Foto de atletas</a>
     * @param dorsal 
     */
     void mostrarAtleta(int dorsal){
        switch (dorsal){
            case 1:
                atleta1.mostrarMarca();
                break;
            case 2:
                atleta2.mostrarMarca();
                break;
            case 3:
                atleta3.mostrarMarca();
                break;
        }
    }

     /**
      * Introducimos un int dorsal para saber que número es el que vamos a seleccionar más adelante
      * 
      * Creamos una variable int mod para modalidad
      * Creamos una variable char mag para magnitud
      * Creamos una variable double max para la marca máxima
      * Creamos una variable double min para la marca mínima
      * 
      * Si es el dorsal 1 el que tenemos seleccionado
      * Nos pedirá que introduzca su modalidad
      * Nos pedirá que introduzca su magnitud
      * Nos pedirá que introduzca su marca máxima
      * Nos pedirá que introduzca su marca mínima
      * 
      * Y así para los restos de los dorsales.
      * @param dorsal 
      */
    public void marcaInicial(int dorsal){
        Scanner sc = new Scanner(System.in);
        int mod;
        char mag;
        double max;
        double min;
        switch (dorsal){
            case 1:
                System.out.println("INTRODUCE TU MODALIDAD");
                 mod = sc.nextInt();
                atleta1.setModalidad(mod);
                System.out.println("INTRODUCE TU MAGNITUD");
                 mag = sc.next().charAt(0);
                atleta1.setMagnitud(mag);
                System.out.println("INTRODUCE TU MARCA MÁXIMA");
                 max = sc.nextDouble();
                atleta1.setMarca_Max(max);
                System.out.println("INTRODUCE TU MARCA MÍNIMA");
                 min = sc.nextDouble();
                atleta1.setMarca_Min(min);
                break;

            case 2:
                System.out.println("INTRODUCE TU MODALIDAD");
                 mod = sc.nextInt();
                atleta2.setModalidad(mod);
                System.out.println("INTRODUCE TU MAGNITUD");
                 mag = sc.next().charAt(0);
                atleta2.setMagnitud(mag);
                System.out.println("INTRODUCE TU MARCA MÁXIMA");
                 max = sc.nextDouble();
                atleta2.setMarca_Max(max);
                System.out.println("INTRODUCE TU MARCA MÍNIMA");
                 min = sc.nextDouble();
                atleta2.setMarca_Min(min);
                break;

            case 3:
                System.out.println("INTRODUCE TU MODALIDAD");
                mod = sc.nextInt();
                atleta3.setModalidad(mod);
                System.out.println("INTRODUCE TU MAGNITUD");
                mag = sc.next().charAt(0);
                atleta3.setMagnitud(mag);
                System.out.println("INTRODUCE TU MARCA MÁXIMA");
                max = sc.nextDouble();
                atleta3.setMarca_Max(max);
                System.out.println("INTRODUCE TU MARCA MÍNIMA");
                min = sc.nextDouble();
                atleta3.setMarca_Min(min);
                break;
        }
    }

    /**
     * Introducimos por parámetros el dorsal a modificar
     * <ul>
     *  <li>Si es el 1 el atleta1.ultimaMarca() es el que vamos a modificar</li>
     *  <li>Si es el 2 el atleta2.ultimaMarca() es el que vamos a modificar</li>
     *  <li>Si es el 3 el atleta3.ultimaMarca() es el que vamos a modificar</li>
     * </ul>
     * @param dorsal 
     */
    public void modificarMarca(int dorsal){
        switch (dorsal){
            case 1:
                atleta1.ultimaMarca();
                break;
            case 2:
                atleta2.ultimaMarca();
                break;
            case 3:
                atleta3.ultimaMarca();
                break;
        }
    }

    /**
     * En este método vamos a ver las marcas de la modalidad
     * Si el 1 y el 2 son iguales mostrará por pantalla que son iguales y calculará las medias
     * Las media_max cogiendo la marca_max del atleta 1 y 2, sumándolas y dividiéndolas entre 2
     * Por último imprimiría la media máxima y la media mínima
     * 
     * Si ninguno de los 3 atletas está en ninguna modalidad no se entrará en las medias dejandolo impreso por pantalla
     */
    public void medidaMarcasModalidad(){
        if ((atleta1.getModalidad() == atleta2.getModalidad())){
            System.out.println("LOS ATLETAS 1 Y 2 TIENEN LA MISMA MODALIDAD, SUS MEDIAS SON");
            double media_max = (atleta1.getMarca_Max()+atleta2.getMarca_Max())/2;
            double media_min = (atleta1.getMarca_Min()+atleta2.getMarca_Min())/2;
            System.out.println("LA MEDIA MAXIMA ES: "+media_max+ " Y LA MINIMA ES: "+media_min);
        }
        else if (atleta1.getModalidad() == atleta3.getModalidad()){
            System.out.println("LOS ATLETAS 1 Y 3 TIENEN LA MISMA MODALIDAD, SUS MEDIAS SON");
            double media_max = (atleta1.getMarca_Max()+atleta3.getMarca_Max())/2;
            double media_min = (atleta1.getMarca_Min()+atleta3.getMarca_Min())/2;
            System.out.println("LA MEDIA MAXIMA ES: "+media_max+ " Y LA MINIMA ES: "+media_min);
        }
        else if (atleta2.getModalidad() == atleta3.getModalidad()){
            System.out.println("LOS ATLETAS 2 Y 3 TIENEN LA MISMA MODALIDAD, SUS MEDIAS SON");
            double media_max = (atleta2.getMarca_Max()+atleta3.getMarca_Max())/2;
            double media_min = (atleta2.getMarca_Min()+atleta3.getMarca_Min())/2;
            System.out.println("LA MEDIA MAXIMA ES: "+media_max+ " Y LA MINIMA ES: "+media_min);
        }
        else{
            System.out.println("NINGUNO DE LOS 3 ATLETAS ESTÁ COMPITIENDO EN LA MISMA MODALIDAD NO PODEMOS MOSTRAR LAS MEDIAS.");
        }
    }
}
