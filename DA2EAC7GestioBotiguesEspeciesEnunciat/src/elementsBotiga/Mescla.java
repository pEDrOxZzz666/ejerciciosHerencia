/*
 * Classe que defineix una mescla d'espècies i/o herbes aromàtiques. Es defineixen pel seu codi, nom, mestre especier o 
 * mestra especiera que ha creat la mescla, preu, un vector amb les espècies que porta la mescla, un vector amb les
 * les quantitats de cadascuna de les espècies que porta la mescla, un vector amb les herbes aromàtiques
 * que porta la mescla i un vector amb les quantitats de cadascuna de les herbes aromàtiques que porta 
 * la mescla.
 */
package elementsBotiga;
import java.util.Scanner;

/**
 *
 * @author fta
 */
public class Mescla {

    private String codi;
    private String nom;
    private Mestre mestre;
    private double preu;
    private Especia[] especies = new Especia[50];
    private int posicioEspecies = 0; //Priemra posició buida del vector especies
    private double[] quantitatEspecies = new double[50];
    private int posicioQuantitatEspecies = 0; //Priemra posició buida del vector quantitatEspecies
    private HerbaAromatica[] herbes = new HerbaAromatica[50];
    private int posicioHerbes = 0; //Priemra posició buida del vector herbes
    private double[] quantitatHerbes = new double[50];
    private int posicioQuantitatHerbes = 0; //Priemra posició buida del vector quantitatHerbes
    
    private final static Scanner DADES = new Scanner(System.in, "ISO-8859-1");

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe menys els vectors i el mestre especier
     o mestra especiera.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres
     - Quan es crea una mescla no té cap mestre especier o mestra especiera assignat. Penseu
       amb quin valor heu d'inicialitzar aquest atribut en el constructor.
     */
    public Mescla(String codi, String nom, Double preu) {
        this.codi = codi;
        this.nom = nom;        
        this.preu = preu;
        this.mestre = null;
    }

    /*
     TODO Mètodes accessors    
     */
    //Setters
    public void setCodi(String codi){
        this.codi = codi;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setPreu(double preu){
        this.preu = preu;
    }
    
    public void setMestre(Mestre mestre){
        this.mestre = mestre;
    }    
    
    public void setEspecies(Especia[] especies){ //REVISAR SI ES CORRECTO
        this.especies = especies;
    }
    
    public void setPosicioEspecies(int posicioEspecies){ //REVISAR SI ES CORRECTO
        this.posicioEspecies = posicioEspecies;
    }
    
    public void setQuantitatEspecies(double[] quantitatEspecies){  //REVISAR SI ES CORRECTO
        this.quantitatEspecies = quantitatEspecies;
    }
    
    public void setPosicioQuantitatEspecies(int posicioQuantitatEspecies){  //REVISAR SI ES CORRECTO
        this.posicioQuantitatEspecies = posicioQuantitatEspecies;
    }
    
    public void setHerbes(HerbaAromatica[] herbes){  //REVISAR SI ES CORRECTO
        this.herbes = herbes;
    }
    
    public void setPosicioHerbes(int posicioHerbes){  //REVISAR SI ES CORRECTO
        this.posicioHerbes = posicioHerbes;
    }
    
    public void setQuantitatHerbes(double[] quantitatHerbes){  //REVISAR SI ES CORRECTO
        this.quantitatHerbes = quantitatHerbes;
    }
    
    public void setPosicioQuantitatHerbes(int posicioQuantitatHerbes){
        this.posicioQuantitatHerbes = posicioQuantitatHerbes;
    }
    
    //Getters
    public String getCodi(){
        return codi;
    }
    
    public String getNom(){
        return nom;
    }
    
    public Mestre getMestre(){  //REVISAR SI ES CORRECTO
        return mestre;
    }
    
    public double getPreu(){
        return preu;
    }
    
    public Especia[] getEspecies(){  //REVISAR SI ES CORRECTO
        return especies;
    }
    
    public int getPosicioEspecies(){  //REVISAR SI ES CORRECTO
        return posicioEspecies;
    }
    
    public double[] getQuantitatEspecies(){  //REVISAR SI ES CORRECTO
        return quantitatEspecies;
    }
    
    public int getPosicioQuantitatEspecies(){  //REVISAR SI ES CORRECTO
        return posicioQuantitatEspecies;
    }
    
    public HerbaAromatica[] getHerbes(){  //REVISAR SI ES CORRECTO
        return herbes;
    }
    
    public int getPosicioHerbes(){  //REVISAR SI ES CORRECTO
        return posicioHerbes;
    }
    
    public double[] getQuantitatHerbes(){  //REVISAR SI ES CORRECTO
        return quantitatHerbes;
    }
    
    public int getPosicioQuantitatHerbes(){
        return posicioQuantitatHerbes;
    }
    
    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova mescla. Les dades
     a demanar són les que passem per paràmetre en el constructor.
     - També heu de tenir en compte que el nom, pot ser una frases, per exemple, Garam Masala.
    
     Nota important: no controlem que l'usuari introdueixi una opció de tipus numèric, ja que això ho farem amb la
     tècnica de les excepcions que veurem més endavant. Així doncs suposarem que sempre introdueix
     un número.
    
     Retorn: La nova mescla creada.
     */
    public static Mescla addMescla() {        
        String codi = null;
        String nom = null;
        double preu = 0;
        
        System.out.println("\nIntrodueix codi Mescla:");
        codi = DADES.next();
        DADES.nextLine();
        System.out.println("\nIntrodueix nom Mescla:");
        nom = DADES.nextLine();
        System.out.println("\nIntrodueix preu Mescla:");
        preu = DADES.nextDouble();
        DADES.nextLine();
        
        return new Mescla(codi, nom, preu);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual i
       modificar els atributs corresponents d'aquest objecte. Els únics atributs que
       modificarem són els que hem inicialitzat en el constructor amb els paràmetres passats.
     - També heu de tenir en compte que el nom, pot ser una frase, per exemple, Garam Masala.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
    Retorn: cap
     */
    public void updateMescla() {
        String codi = null;
        String nom = null;
        double preu = 0;
        
        System.out.println("\nIntrodueix la modificacio codi Mescla:");
        codi = DADES.next();
        DADES.nextLine();
        System.out.println("\nIntrodueix la modificacio  nom Mescla:");
        nom = DADES.nextLine();
        System.out.println("\nIntrodueix la modificacio  preu Mescla:");
        preu = DADES.nextDouble();
        DADES.nextLine();
        
        setCodi(codi);
        setNom(nom);
        setPreu(preu);
    }

    /*
     TODO
    
     Paràmetres: especia a assignar
    
     Accions:
     - afegeix al vector especies de la mescla actual l'especia passada per paràmetre
       i al vector quantitatEspecies la quantitat també passada per paràmetre, si aquesta
       encara no s'ha afegit a la mescla.
     - Si l'espècia ja està afegida a la mescla, se sobreescriuran amb els valors passats per 
       paràmetre l'espècia del vector espècies i la seva quantitat del vector quantitatEspecies.
     - actualitza les posicions del vector especies i la del vector quantitatEspecies.
    
     Nota important: no controlem que l'usuari introdueixi una opció de tipus numèric, ja que això ho farem amb la
     tècnica de les excepcions que veurem més endavant. Així doncs suposarem que sempre introdueix
     un número.
    
     Retorn: cap
     */
    public void addEspecia(Especia especia, double quantitat) { //REVISAR QUE ES CORRECTO       
        boolean duplicada = false;
        for(int i = 0; i < posicioEspecies; i++){
            if(especies[i].getCodi().equals(especia.getCodi())){
                especies[i] = especia;
                quantitatEspecies[i] = quantitat;
                duplicada = true;
            }
        }
        if(!duplicada){
            especies[posicioEspecies] = especia;
            quantitatEspecies[posicioQuantitatEspecies] = quantitat;
            
            //Actualización posiciones
            posicioEspecies++;
            posicioQuantitatEspecies++;  
        }         
    }

    /*
     TODO
    
     Paràmetres: herba aromàtica a assignar
    
     Accions:
     - afegeix al vector herbes de la mescla actual l'herba aromàtica passada per paràmetre
       i al vector quantitatHerbes la quantitat també passada per paràmetre, si aquesta
       encara no s'ha afegit a la mescla.
     - Si l'herba ja està afegida a la mescla, se sobreescriuran amb els valors passats per 
       paràmetre l'herba aromàtica del vector herbes i la seva quantitat del vector quantitatHerbes.
     - actualitza les posicions del vector herbes i la del vector quantitatHerbes.
    
     Retorn: cap
     */
    public void addHerba(HerbaAromatica herba, double quantitat) { //REVISAR QUE ES CORRECTO
        boolean duplicada = false;
        for(int i = 0; i < posicioHerbes; i++){
            if(herbes[i].getCodi().equals(herba.getCodi())){
                herbes[i] = herba;
                quantitatHerbes[i] = quantitat;
                duplicada = true;
            }
        }        
        if(duplicada == false){
           herbes[posicioHerbes] = herba;
           quantitatHerbes[posicioQuantitatHerbes] = quantitat;
        
           //actualización posiciones
           posicioHerbes++;
           posicioQuantitatHerbes++;             
        }        
    }

    public void showMescla() {
        System.out.println("\nLes dades de la mescla amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nPreu: " + preu);

        if (mestre != null) {
            mestre.showMestre();
        } else {
            System.out.println("\nEncara no s'ha assignat el mestre o mestra.");
        }

        for (int i = 0; i < posicioEspecies; i++) {
            especies[i].showEspecia();
            System.out.println("\nquantitat: " + quantitatEspecies[i]);
        }

        for (int i = 0; i < posicioHerbes; i++) {
            herbes[i].showHerbaAromatica();
            System.out.println("\nquantitat: " + quantitatHerbes[i]);
        }
    }

}