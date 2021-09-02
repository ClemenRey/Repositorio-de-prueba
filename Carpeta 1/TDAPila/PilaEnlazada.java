package TDAPila;



import Excepciones.*;

public class PilaEnlazada<E> implements Stack<E> {
	
	
	//Atributos
	
	protected Nodo<E> cabeza;
	protected int tamaño;
	
	
	
	
	//Constructor
	
	
	public PilaEnlazada() {
		
		
		cabeza=null;
		tamaño=0;
		
		
		
		
		
	}
	
	
	
	//Operaciones
	
	
	
	
	
	public void push (E elem) {
		
		
		
		Nodo<E> aux= new Nodo<E>();
		aux.setElemento(elem);
		aux.setSiguiente(cabeza);
		cabeza=aux;
		tamaño=tamaño+1;
		
		
		
		
		
	} 
	
	
	
	
	public E pop() throws EmptyStackException {
		
		
		
		if (isEmpty()) throw new EmptyStackException("Nada que desapilar: pila vacía");
		
		E aux= cabeza.getElemento();
		cabeza=cabeza.getSiguiente();
		tamaño=tamaño-1;
		return aux;
				
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public boolean isEmpty() {
		
		
		
		return tamaño==0;
		
		
		
		
	}
	
	
	
	public E top() throws EmptyStackException {
		
		
		
		
		if (isEmpty()) throw new EmptyStackException("No hay tope: pila vacía");
		
		
		
		return cabeza.getElemento();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public int size() {
		
		
		
		return tamaño;
		
		
		
	}
	
	
	
	
	
	

	
}
