package stack;
public class Stack  <T> {
 // atributos del tda pilas 
    private Nodo<T> tope; //<T> clase generica  , este es el puntuero  ->
    private int nElement; // guarda la cant exacta d element
    // clase inter del nodo 
    private static class Nodo<T> // peqña clasedentro q define la estructura de cada caja u objeto d la pila 
    {
    T dato; // guarda la inf o val que se introduce ala pila
    Nodo<T> sig; //flecha que apunta al nodo que esta debajo de la pila 
    public Nodo (T dato){ // construc se ejec cada vez que se crea una caja nueva 
    this.dato = dato; // guarda en var dato del nodo el val recibido 
    this.sig = null; // cndo nodo se crea x 1vez no apunto a ningun nodo debajo de el, x eso empieza en null
    } }
    
    // CONSTRUCTOR
    
    public boolean empty()  { // verifica si la pila esta vacia {
    return this.nElement == 0; // retor true si num de nElement = 0 y false si no 
    }
    
    public Stack(){ // metod construct pila ,se ejecuta cda pila nueva
    this.tope = null; // indica que la pila recien creada esta vacia 
    this.nElement = 0; // valor ini; nElemnt = 0 
    }
    
    /* El PUSH cre un nuevo nodo con el valor
    del primer dato ("Anita") lo acomoda al tope y suma 1 al contador 
    */
    
     public void push (T element) { 
     Nodo <T> nuevo = new Nodo<>(element); // crea nueva caja con el dato
     nuevo.sig = this.tope; // la nueva caja apunta abajo
     this.tope = nuevo; // la nueva caja paso a ser la primera
     this.nElement++; // incrementa nElement
     }
     
     public T pop() { // no recibe ningun parametro 
     if (empty()) { // precondicion d q la lista no debe estar vacia
     throw new RuntimeException("ERROR: La pila esta vacia, no puedes hacer pop :( ");
     }
     
    T eliminado = this.tope.dato; // guardamos el dato a retornar 
    this.tope = this.tope.sig; // se remueve el elemento al tope 
    this.nElement--; // al nElement se le resta uno 
    // salida 
    return eliminado;
     }
     
     
     /* El PEEK Checa la precondicion y accede al nodo que esta en el tope de la pila 
     y devuelve "return" el valor guardado en dato hacia donde fue llamado */
     public T peek(){
     if (empty()) {
     throw new RuntimeException("La lista esta vaciaaaaa");
     } return this.tope.dato;
     }
    
    public static void main(String[] args) {  
        System.out.println("Ando probando mi pila :> ");
        Stack<String> miPila = new Stack<>();
        
        System.out.println("Mi pila esta vacia? " +miPila.empty());
        
        System.out.println("MIS ELEMENTOOSS SON ESTOS NOMBRESSS :3");
         miPila.push("Manuelin"); // insertar nuevo elemento en la cima o tope de la pila y suma 1 en el contador de elemen
         miPila.push("Victorsito");
         miPila.push("Sofita");
         miPila.push("Anita");
          
         System.out.println("Elemento en el tope (peek):  " +miPila.peek()); // obtiene y entrega el valor 
        System.err.println("Elemento eliminado :< " + miPila.pop());
        System.out.println("Nuevo topeee (peek)" + miPila.peek());
        
        System.err.println("Mi pila esta vacia ahora :0? " +miPila.empty());
    }
    
    
}
