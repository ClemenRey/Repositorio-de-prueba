package TDAPila;

public class Nodo<E> {
	
	//Atributos
	
	private E elemento;
	private Nodo<E> siguiente;
	
	
	
	//Constructor
	
	public Nodo() {
		
		
		elemento=null;
		siguiente=null;
		
		
		
	}
	
	public Nodo(E elem) {
		
		
		elemento=elem;
		siguiente=null;
		
		
	}
	
	
	
	public void setSiguiente(Nodo<E> elem) {
		
		
		siguiente=elem;
		
		
	}
	
	
	
	public Nodo<E> getSiguiente() {
		
		return siguiente;
		
		
	}
	
	
	public void setElemento(E elem) {
		
		elemento=elem;
		
		
	}
	
	
	public E getElemento() {
		
		return elemento;
		
		
	}
	
	
	
	

}
