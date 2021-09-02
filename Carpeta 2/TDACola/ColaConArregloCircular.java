package TDACola;

import Excepciones.*;


public class ColaConArregloCircular<E> implements Queue<E> {
	
	
	protected E[] q;
	protected int f,r;
	
	/**
	 * Constructor de ColaConArregloCircular.
	 * 
	 * Inicializa :
	 *  el arreglo de elementos con 10 espacios disponibles.
	 *  f y r en 0.
	 */
	public ColaConArregloCircular() {
		q = (E[]) new Object[10];
		f = 0;
		r = 0;
	}
	
	public int size() {
		return((q.length - f + r) % q.length) ;
	}

	public boolean isEmpty() {
		return f == r;
	}
	
	public E front() throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException("Cola vac�a.");
		}
		else {
			return q[f];
		}
	}

	public void enqueue(E element) {
		if(size() == q.length-1) {
			E[] aux = copiar(f);
			r = size();
			f = 0;
			q = aux;
		}
			q[r] = element;
			r = (r + 1) % q.length;
	}
	
	/**
	 * Duplica el tama�o del arreglo de la cola circular, e inserta en el los elementos que conten�a 
	 * anteriormente.
	 * @param start posici�n en el arreglo, a partir del cual se realizar� la copia de los elementos.
	 * @return arreglo de elementos con un el doble de tama�o que el que se ten�a anteriormente. 
	 */
	private E[] copiar(int start) {
		int j = 0;
		E[] aux = (E[]) new Object[q.length*2];
		for(int i = f;!(start == r);i++) {
			start = i % q.length;
			aux[j++] = q[start];
		}
		return aux;
	} 

	
	public E dequeue() throws EmptyQueueException {
		if( isEmpty()) {
			throw new EmptyQueueException("Cola vac�a.");
		}
		else {
			E temp = q[f];
			q[f] = null;
			f = (f + 1) % (q.length);
			return temp;
		}
	}
	

}
