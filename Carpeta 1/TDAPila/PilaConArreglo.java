package TDAPila;


import Excepciones.*;




public class PilaConArreglo<E> implements Stack<E> {
	 
	//Atributos
	
	protected E[] datos;
	protected int tama�o;
	
	
	//Constructor
	
	
	public PilaConArreglo(int cant) {
		
		
		datos=  (E[]) new Object[cant];
		tama�o=0;
		
	
		
		
	}
	
	/* CONSTRUCTOR PARA INVERTIR2--> RE CHINO

	public PilaConArreglo( E [] a, int cant) {
		
		
		datos=a;
		tama�o=cant;
		
		
	}
	*/

	
	
	
	//Operaciones
	
	
	public void push (E elem){
		
		/**
		 * Apila elementos en el arreglo. Si est� lleno lanza una excepci�n de tipo
		 * FullStackException
		 * 
		 * @return: void;
		 * @param elemento gen�rico de tipo E;
		 * @exception FullStackException
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		if (size()==datos.length) datos=copiar(tama�o);
		
		datos[tama�o]=elem;
		tama�o=tama�o+1;
		
		
	}
	
	
	
	private E[] copiar(int c) {
		
		
		E [] aux= (E[]) new  Object[c*2];
		
		for (int i=0; i<tama�o;i++) {
			
			aux[i]=datos[i];
			
		}
		
		
		return aux;
		
		
		
	}
	
	
	
	
	public E pop() throws EmptyStackException {
		
		
		if (tama�o==0) throw new EmptyStackException("Nada que desapilar: pila vac�a");
		
		
		
		
		
		E aux = datos[tama�o-1];
		datos[tama�o-1]=null;
		tama�o=tama�o-1;
		return aux;
		
		
		
		
		
		
	}
	
	
	
	public boolean isEmpty() {
		
		
		return tama�o==0;
		
		
		
		
	}
	
	
	
	public E top () throws EmptyStackException {
		
		
		if (isEmpty()) throw new EmptyStackException("No hay tope: pila vac�a ");
		
		
		return datos[tama�o-1];
		
		
	}
	
	
	public int size() {
		
		return tama�o;
		
		
	}
	
	
	
	public void imprimirPila () {
		
		
		
		
		for (int i=0; i<tama�o; i++) System.out.println(datos[i]);
		
		
	}
	
	
	
	
	
	
	
	/*
	public void invertir (Stack <E> p) {
		
		
		
		
		Stack<E> aux1= new PilaConArreglo<E>(datos.length);
		Stack<E> aux2= new PilaConArreglo<E>(datos.length);
		
		
		try {
			
		
		while (!p.isEmpty())  aux1.push(p.pop());
		while (!aux1.isEmpty()) aux2.push(aux1.pop());
		while (!aux2.isEmpty()) p.push(aux2.pop());
		
		
		
		
		
		}
		catch (EmptyStackException  | FullStackException e) {System.out.println(e.getMessage());}

}
	
	*/
	
	public void invertir() {
		
		
		

		Stack<E> aux1= new PilaConArreglo<E>(datos.length);
		Stack<E> aux2= new PilaConArreglo<E>(datos.length);
		
		
		try {
			
		
		while (!this.isEmpty())  aux1.push(this.pop());
		while (!aux1.isEmpty()) aux2.push(aux1.pop());
		while (!aux2.isEmpty()) this.push(aux2.pop());
		
		
		
		
		
		}
		catch (EmptyStackException e) {System.out.println(e.getMessage());}
		
		
		
	}
	





}
	
	



