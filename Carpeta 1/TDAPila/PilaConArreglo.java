package TDAPila;


import Excepciones.*;




public class PilaConArreglo<E> implements Stack<E> {
	 
	//Atributos
	
	protected E[] datos;
	protected int tamaño;
	
	
	//Constructor
	
	
	public PilaConArreglo(int cant) {
		
		
		datos=  (E[]) new Object[cant];
		tamaño=0;
		
	
		
		
	}
	
	/* CONSTRUCTOR PARA INVERTIR2--> RE CHINO

	public PilaConArreglo( E [] a, int cant) {
		
		
		datos=a;
		tamaño=cant;
		
		
	}
	*/

	
	
	
	//Operaciones
	
	
	public void push (E elem){
		
		/**
		 * Apila elementos en el arreglo. Si está lleno lanza una excepción de tipo
		 * FullStackException
		 * 
		 * @return: void;
		 * @param elemento genérico de tipo E;
		 * @exception FullStackException
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		if (size()==datos.length) datos=copiar(tamaño);
		
		datos[tamaño]=elem;
		tamaño=tamaño+1;
		
		
	}
	
	
	
	private E[] copiar(int c) {
		
		
		E [] aux= (E[]) new  Object[c*2];
		
		for (int i=0; i<tamaño;i++) {
			
			aux[i]=datos[i];
			
		}
		
		
		return aux;
		
		
		
	}
	
	
	
	
	public E pop() throws EmptyStackException {
		
		
		if (tamaño==0) throw new EmptyStackException("Nada que desapilar: pila vacía");
		
		
		
		
		
		E aux = datos[tamaño-1];
		datos[tamaño-1]=null;
		tamaño=tamaño-1;
		return aux;
		
		
		
		
		
		
	}
	
	
	
	public boolean isEmpty() {
		
		
		return tamaño==0;
		
		
		
		
	}
	
	
	
	public E top () throws EmptyStackException {
		
		
		if (isEmpty()) throw new EmptyStackException("No hay tope: pila vacía ");
		
		
		return datos[tamaño-1];
		
		
	}
	
	
	public int size() {
		
		return tamaño;
		
		
	}
	
	
	
	public void imprimirPila () {
		
		
		
		
		for (int i=0; i<tamaño; i++) System.out.println(datos[i]);
		
		
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
	
	



