1. Una cola es una lista lineal en la cual los datos se insertan por un extremo( final) y se
extraen por el otro extremo (frente). Es una estructura FIFO (first-in, first-out, primero en
entrar-primero en salir).
2. Las operaciones básicas que se aplican sobre colas son: crearCola, colaVacia, colaLlena,
insertar, frente, retirar.
3. crearCola inicializa a una cola sin elementos. Es la primera operación que realizar con una
cola.
4. colaVacia determina si una cola tiene o no elementos. Devuelve true si no tiene
elementos.
5. colaLlena determina si no se pueden almacenar más elementos en una cola. Se aplica
esta operación cuando se utiliza un array para guardar los elementos de la cola.
6. insertar añade un nuevo elemento a la cola, siempre por el extremo final.
7. frente devuelve el elemento que está en el extremo frente de la cola sin extraerlo.
8. retirar extrae el elemento frente de la cola.
9. El TAD Cola se puede implementar con arrays y con listas enlazadas. La implementación
con un array lineal es muy ineficiente; se ha de considerar el array como una estructura
circular y aplicar la teoría de los restos para avanzar el frente y el final de la cola.
10. La realización de una cola con listas enlazadas permite que el tamaño de la estructura se
ajuste al número de elementos. La cola puede crecer indefinidamente, con el único tope
de la memoria libre.
