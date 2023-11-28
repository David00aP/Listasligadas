public class UsaListaLigada{
    Node top;
    //Métodos para los casos de inserción de nodos
    public boolean insertaPrimerNodo(String dato){
        if (top == null) { //La lista no está vacía
	 top = new Node();
	 top.name = dato;
	 top.next = null;
	 return true;
        }
        else {
	 return false;
        }
    }
    public void insertaAntesPrimerNodo(String nombre){
	Node temp; 
	temp = new Node ();
	temp.name = nombre;
	temp.next = this.top;
	this.top = temp;
	temp = null;
    }
    public void insertaAlFinal(String nombre){
	Node temp = new Node ();
	temp.name = nombre;
	temp.next = null;
	//Node temp2;
	Node temp2 = this.top;
	while (temp2.next != null)
		temp2 = temp2.next;
	temp2.next = temp;
	temp = null;
	temp2 = null;
    } 
    public boolean insertaEntreNodos(String nombre, String buscado){
	Node temp = new Node();
	temp.name = nombre;
	Node temp2 = this.top;
	//boolean NodoNoEncontrado = true;
        while ( (temp2 != null)&& temp2.name.equals(buscado) == false ) {	
	 temp2 = temp2.next;
        }
        if (temp2 != null){  
		//Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
        }
        else return false;
    } 
    public void imprimir(){
        for (Node temp = this.top; temp != null; temp = temp.next){
	 System.out.print("[ " + temp.name + " ] -> ");
        }
        System.out.print("[X]\n"); 
    }
    public String toString(){
        String cadAux = "";
        for (Node temp = this.top; temp != null; temp = temp.next){
         cadAux += "[ " + temp.name + " ] -> ";
        }
        cadAux += "[X]\n"; 
        return cadAux;
    }
    //Métodos de borrado
    public void borrarPrimerNodo(){
        this.top = this.top.next;
    }
    //Borrar cualquier nodo que no sea el primero
    public boolean borrarCualquierNodo(String buscado){
        Node temp = this.top;
        while ( (temp != null) && temp.name.equals(buscado) == false ){	
		    temp = temp.next;
        }
        if (temp != null){  //Nodo buscado se encontró
         temp.next = temp.next.next;
         temp = null;	
         return true;
        }
         else return false;
    }
    //Buscar el valor clave y devolver una referencia
    public void devolverReferencia(String clave){
        Node temp = top;
        while ((temp != null) && temp.name.equals(clave) == false){
         temp = temp.next;
        }
        if (temp != null){  //Nodo buscado se encontró
         System.out.print("[ " + temp + " ] -> ");
         temp = null;			
        }
        else System.out.print("El nodo buscado no se encontró o no existe");
    }
    //Buscar el valor clave e insertar un nodo despues de él 
    public void insertaDespues(String clave, String nombre){
    	Node temp = top;
    	Node temp2 = new Node();
	temp2.name = nombre;
    	while ((temp != null) && temp.name.equals(clave) == false){
         temp = temp.next;
        }
        Node temp3 = temp.next;
        temp.next = null;
        temp.next = temp2;
        temp2.next = temp3;
    }
    //intercambiar un nodo por otro nodo buscado
    public void intercambiarNodo(String clave, String nombre){
        Node temp2 = new Node();
	temp2.name = nombre;
	Node temp = top;
	int cont = 0;
	while ((temp != null) && temp.name.equals(clave) == false){
         temp = temp.next;
         cont++;//Cuenta cuantos next se movio
        }
        cont--;//guarda la posicion al nodo anterior al seleccionado
        Node temp3 = temp.next;//Guarda la referencia del nodo siguiente al selccionado
        Node temp4 = top;//empieza desde el comienzo
        for (int cont2=0; cont2 < cont; cont++)
        {
            temp4 = temp4.next;//LLega hasta el nodo anterior al seleccionado
        }
        temp4.next.next = null;//borra la liga con el nodo siguinete
        temp4.next = null;//borra la liga con el nodo anterior
        temp4.next = temp2;//une el anterior con el nuevo nodo
        temp2.next = temp3;//une el nuevo nodo con el siguiente
        temp = null;
        temp2 = null;
        temp3 = null;
        temp4 = null;
    }
}
