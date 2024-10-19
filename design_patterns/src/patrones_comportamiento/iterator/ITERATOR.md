## Iterator
Patron de diseño de comportamiento que permite recorrer elementos de una coleccion sin exponer su representacion subyacente. No expone su estructura interna, sino que proporciona un mecanismo para acceder a los elementos de la coleccion de manera secuencial.

## Proposito
La idea central es extraer el comportamiento de recorrido de una coleccion y colocarlo en un objeto independiente llamado iterador. 

Los iteradores implementan varios algoritmos de recorrido. Varios ojbjetos iteradores pueden recorrer la misma coleccion al mismo tiempo.
Ademàs, un objeto iterador encapsula todos los detalles del recorrido, como la posicion actual y cuantas posiciones quedan hasta el final.

Todos los iteradores deben implementar la misma interfaz. Esto hace que el codigo cliente sea compatible con cualquier iterador, siempre y cuando siga la interfaz.

## Analogia en el mundo real
Una biblioteca es un buen ejemplo de iterador:
Imagina que la biblioteca tiene estanterías llenas de libros (la colección de objetos), pero no puedes acceder a todos los libros a la vez, y tampoco sabes cómo están organizados. Entonces, el bibliotecario (el Iterador) te acompaña y te entrega un libro a la vez, guiándote a través de la colección. Cada vez que terminas con un libro, te da el siguiente, sin necesidad de que conozcas los detalles de cómo están organizados en las estanterías (cómo la colección está estructurada internamente). Tú solo interactúas con el bibliotecario, y él se encarga de recorrer la colección.

## Estructura
1. Iterador: Declara una interfaz para acceder a los elementos de la colección.
2. ConcreteIterator: Implementa la interfaz Iterador y mantiene la posición actual en la secuencia de elementos.
3. Aggregate: Declara una interfaz para crear un objeto iterador.
4. ConcreteAggregate: Implementa la interfaz Aggregate y devuelve una instancia del objeto iterador concreto.

## Aplicabilidad
Se ve un ejemplo en el codigo del repositorio.


