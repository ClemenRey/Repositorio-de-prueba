package TDACola;




import Excepciones.*;


public class ColaConEnlaces<E> implements Queue<E> {
	
	
	
	protected Nodo<E> head;
	protected Nodo<E> tail;	
	protected int tamaño;
	
	
	public ColaConEnlaces() {
		
		
		head=null;
		tail=null;
		tamaño=0;
		
		
	}
	
	
	
	//Operaciones
	
	
	
	public void enqueue(E elem) {
		
		
		Nodo<E> aux= new Nodo<E> ();
		aux.setElemento(elem);
		aux.setSiguiente(null);
		
		
		if (tamaño==0)  {
			
			head=aux;
			
			
			
		}
		
		else 
			
			tail.setSiguiente(aux);
		    
		
		
		tail=aux;
		tamaño++;
		
		
		
		
		
	}
	
	
	
	public E dequeue() throws EmptyQueueException {
		
		
		
		if (isEmpty()) throw new EmptyQueueException("Nada que desencolar: Cola vacía");
		
		
		E aux= head.getElemento();
		head=head.getSiguiente();
	    tamaño--;
	    return aux;
		
		
		
		
		
		
		
	}
	
	
	public E front() throws EmptyQueueException {
		
		
		
		
		if (isEmpty()) throw new EmptyQueueException("No hay front: cola vacía");
		
		
		return head.getElemento();
		
		
		
	} 
	
	
	
	public boolean isEmpty() {
		
		return tamaño==0;
		
		
	}
	
	
	public int size() {
		
		
		return tamaño;
		
		
	}
	
	
	
	
	public void imprimirCola() {
		
		
		Nodo<E> aux= head;
		
		
		while (aux.getSiguiente()!=null)
			
		{
			
			System.out.println(aux.getElemento().toString());
			aux=aux.getSiguiente();
		
		}
		
		System.out.println(aux.getElemento().toString());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
