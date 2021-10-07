#include "funcionalidad.h"

int factorial (int n) {

if (n==0) return 1;

   else return n*factorial(n-1);


}



void reset (int *a, int b) {

   *a +=10; b+=10;



}













void cambiar(int p, int *q) {
 p += 2;
 *q += p;
}
