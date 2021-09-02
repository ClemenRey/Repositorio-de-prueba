package TDAPila;



import Excepciones.*;

public class PilaEnlazada<E> implements Stack<E> {
	
	
	//Atributos
	
	protected Nodo<E> cabeza;
	protected int tama�o;
	
	
	
	
	//Constructor
	
	
	public PilaEnlazada() {
		
		
		cabeza=null;
		tama�o=0;
		
		
		
		
		
	}
	
	
	
	//Operaciones
	
	
	
	
	
	public void push (E elem) {
		
		
		
		Nodo<E> aux= new Nodo<E>();
		aux.setElemento(elem);
		aux.setSiguiente(cabeza);
		cabeza=aux;
		tama�o=tama�o+1;
		
		
		
		
		
	} 
	
	
	
	
	public E pop() throws EmptyStackException {
		
		
		
		if (isEmpty()) throw new EmptyStackException("Nada que desapilar: pila vac�a");
		
		E aux= cabeza.getElemento();
		cabeza=cabeza.getSiguiente();
		tama�o=tama�o-1;
		return aux;
				
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public boolean isEmpty() {
		
		
		
		return tama�o==0;
		
		
		
		
	}
	
	
	
	public E top() throws EmptyStackException {
		
		
		
		
		if (isEmpty()) throw new EmptyStackException("No hay tope: pila vac�a");
		
		
		
		return cabeza.getElemento();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public int size() {
		
		
		
		return tama�o;
		
		
		
	}
	
	
	
	
	
	

	
}
