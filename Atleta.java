package clubdeportivo;
import java.util.Scanner;
/**
 * Clase Atleta que calcula si existe una marca anterior y te dice si ha mejorado o empeorado.
 * @author pablobapa
 * @version 2021
 */
public class Atleta {
    
    protected int Modalidad; //creamos un entero protegido llamado modalidad
    protected char Magnitud; //creamos un char protegido llamado magnitud
    protected double Marca_Max; //creamos un double marca_max
    protected double Marca_Min; //creamos un double marca_min
    
    //Constructores
    /**
     * Constructor por defecto.
     * Establecemos la Modalidad por defecto en atletismo
     * Marca_Max establecemos 0.0
     * Marca_Min establecemos 0.0
     */
    public Atleta(){
        this.Modalidad=1; //dejo la modalidad de atletismo por defecto
        this.Magnitud='s'; //dejo la magnitud segundos por defecto
        this.Marca_Max=0.0; //dejo la marca_max por defecto en 0.0
        this.Marca_Min=0.0; //dejo la marca_min por defecto en 0.0
    }
    
    /**
     * Constructor por parámetros con los siguientes parámetros:
     * @param ModalidadM
     * @param MagnitudM
     * @param Marca_MaxM
     * @param Marca_MinM 
     */
    public Atleta(int ModalidadM, char MagnitudM, double Marca_MaxM, double Marca_MinM){
        this.Modalidad=ModalidadM;
        this.Magnitud=MagnitudM;
        this.Marca_Max=Marca_MaxM;
        this.Marca_Min=Marca_MinM;
    }
    
    /**
     * Devolvemos la modalidad
     * @return modalidad
     */
    public int getModalidad() {
        return Modalidad;
    }
    
    /**
     * Establece la modalidad si
     * Modalidad == 1 o modalidad == 2 modalidad == 3
     * Haciendo referencia a Modalidad 1 == Atletismo
     * Haciendo referencia a Modalidad 2 == Salto
     * Haciendo referencia a Modalidad 3 == Elevación de Pesas
     * Si no se pone ninguno se establece automáticamente Atletismo
     * @param ModalidadM 
     */
    void setModalidad(int ModalidadM) {
        if (ModalidadM ==1 || ModalidadM==2 || ModalidadM==3){
            this.Modalidad=ModalidadM;
        }else{
            this.Modalidad=1;
        }
    }

    /**
     * Devolvemos la magnitud
     * @return magnitud
     */
    private char getMagnitud() {
        return Magnitud;
    }

    /**
     * Establece la magnitud si
     * Magnitud == 's' o Magnitud == 'm' o Magnitud == 'k'
     * Haciendo referencia a Magnitud 's' == Segundos
     * Haciendo referencia a Magnitud 'm' == Metros
     * Haciendo referencia a Magnitud 'k' == Kilos
     * @param MagnitudM 
     */
    void setMagnitud(char MagnitudM) {
        if (MagnitudM == 's' || MagnitudM == 'm' || MagnitudM == 'k'){
            this.Magnitud=MagnitudM;
        }else{
            this.Magnitud='s';
        }
    }

    /**
     * Devolvemos la marca máxima
     * @return Marca_Max
     */
    double getMarca_Max() {
        return Marca_Max;
    }

    /**
     * Establecemos la marca máxima entregándole por parámetros un double
     * si el parametro es >= 0 establecemos la marca
     * si es menor que 0, nos lo establece como máximo en 0.0
     * @param Marca_MaxM 
     */
    void setMarca_Max(double Marca_MaxM) {
        if (negativoCero(Marca_MaxM)){
            this.Marca_Max=Marca_MaxM;
        }else{
            this.Marca_Max=0.0;
        }
    }

    /**
     * Devolvemos la marca mínima.
     * @return Marca_Min
     */
    public double getMarca_Min() {
        return Marca_Min;
    }

    /**
     * Establecemos la marca mínima entregándosela por parametros
     * si el parámetro es >=0 la establece
     * si el parámetros es menor que 0, establece la marca mínima como 0.0
     * @param Marca_MinM 
     */
    void setMarca_Min(double Marca_MinM) {
        if (negativoCero(Marca_MinM)){
            this.Marca_Min=Marca_MinM;
        }else{
            this.Marca_Min=0.0;
        }
        
    }
    
    /**
     * Verificamos si la temperatura es negativa entregándole un parámetro.
     * Si el parámetro es mayor que 0 establece el boolean correcto como true
     * si el parámetro es menor que 0, establece el boolean correcto en false
     * @param parametro
     * @return <ul>
     *          <li>true: es mayor a 0</li>
     *          <li>false: es menor que 0</li>
     *          </ul>
     */
    public boolean negativoCero(double parametro){
        boolean correcto;
        if (parametro>=0){
            correcto = true;
        }else{
            correcto = false;
        }
        return correcto;
    }
    
    /**
     * Este método muestra la marca del Atleta.
     * Imprime el nº del Atleta y obtiene la modalidad con el método getModalidad
     * y realizamos un switch si es 1 imprimimos atletismo
     * si es 2 imprimimos saltos
     * si es 3 imprimimos elevación de pesas
     * 
     * Y también si la magnitud era 's' imprimimos  "Marca máxima: " + getMarcaMax/Min + " segundos"
     * Si la magnitud era 'm' imprimimos igual que antes pero en metros
     * Si la magnitud era 'k' imprimimos igual que antes pero con kilos
     */
    public void mostrarMarca(){
        System.out.println("nº de atleta"+getModalidad());
        switch (getModalidad()){
            case 1:
                System.out.println("modalidad: ATLETISMO");
                break;
            case 2:
                System.out.println("modalidad: SALTOS");
                break;
            case 3:
                System.out.println("modalidad: ELEVACION DE PESAS");
                break;
        }
        if (Magnitud == 's'){
            System.out.println("Marca Máxima:" + getMarca_Max() + "Segundos");
            System.out.println("Marca Mínima: "+ getMarca_Min() + "Segundos");
        }
        else if(Magnitud == 'm'){
            System.out.println("Marca Máxima: "+getMarca_Max() + "Metros");
            System.out.println("Marca Minima: "+getMarca_Min() + "Metros");
        }
        else if (Magnitud == 'k'){
            System.out.println("Marca Máxima: "+getMarca_Max() + "Kilos");
            System.out.println("Marca Minima: "+getMarca_Min() + "Kilos");
        }
        
    }
    
    /**
     * Este método recoge la última marca que pongamos
     * La pedimos por scanner
     * Si la nueva es mayor que la marca min la registramos en marca Max
     * si no, si la nueva es menor que la marca Min, esta se establecería como la mínima
     * si está entre la maxima y mínima nos imprimiría un mensaje que diría que está comprendida entre la máxima y la mínima.
     */
    public void ultimaMarca(){
        Scanner sc = new Scanner(System.in);
        System.out.print("INTRODUCE TU NUEVA MARCA: ");
        double marca_nueva=sc.nextDouble();
        
        if (marca_nueva>getMarca_Min()){
            System.out.println("---------------------------------\nENHORABUENA TIENES UNA NUEVA MARCA MÁXIMA\n---------------------------------");
            setMarca_Max(marca_nueva);
        }
        else if (marca_nueva<getMarca_Min()){
            System.out.println("LO SIENTO, ESTA ES TU NUEVA PEOR MARCA, TIENES QUE INTENTAR MEJORAR");
            setMarca_Min(marca_nueva);
        }
        else{
            System.out.println("ESTA NUEVA MARCA ESTÁ COMPRENDIDA ENTRE TU MÁXIMA Y TU MINIMA");
        }
    }
    
}
