package TDACola;




import Excepciones.*;


public class ColaConEnlaces<E> implements Queue<E> {
	
	
	
	protected Nodo<E> head;
	protected Nodo<E> tail;	
	protected int tama�o;
	
	
	public ColaConEnlaces() {
		
		
		head=null;
		tail=null;
		tama�o=0;
		
		
	}
	
	
	
	//Operaciones
	
	
	
	public void enqueue(E elem) {
		
		
		Nodo<E> aux= new Nodo<E> ();
		aux.setElemento(elem);
		aux.setSiguiente(null);
		
		
		if (tama�o==0)  {
			
			head=aux;
			
			
			
		}
		
		else 
			
			tail.setSiguiente(aux);
		    
		
		
		tail=aux;
		tama�o++;
		
		
		
		
		
	}
	
	
	
	public E dequeue() throws EmptyQueueException {
		
		
		
		if (isEmpty()) throw new EmptyQueueException("Nada que desencolar: Cola vac�a");
		
		
		E aux= head.getElemento();
		head=head.getSiguiente();
	    tama�o--;
	    return aux;
		
		
		
		
		
		
		
	}
	
	
	public E front() throws EmptyQueueException {
		
		
		
		
		if (isEmpty()) throw new EmptyQueueException("No hay front: cola vac�a");
		
		
		return head.getElemento();
		
		
		
	} 
	
	
	
	public boolean isEmpty() {
		
		return tama�o==0;
		
		
	}
	
	
	public int size() {
		
		
		return tama�o;
		
		
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
