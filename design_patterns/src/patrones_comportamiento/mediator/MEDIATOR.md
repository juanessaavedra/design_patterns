# Mediator
Define un objeto que encapsula como interactuan un conjunto de objetos. Este patron promueve un bajo acoplamiento entre los objetos, ya que estos no se conocen entre si, sino que se comunican a traves del objeto mediador.
- Es una especie de fachada, es un patron, pero tambien antipatron. 

## Cuando usarlo
- Cuando un conjunto de objetos se comunican entre si, pero no se conocen entre si
- Cuando se quiere desacoplar la comunicacion entre objetos
- Cuando se quiere centralizar la comunicacion entre objetos

## Componentes
1. Mediator: Define una interfaz para comunicarse con los objetos
2. ConcreteMediator: Implementa la interfaz Mediator y mantiene una referencia a los objetos que se comunican
3. Colleague: Define una interfaz para comunicarse con el Mediator
4. ConcreteColleague: Implementacion de los objetos que utilizan el mediador

## Analogia mundo real
Imaginemos una aplicacion de chat, donde varios usuarios se comunican entre si. En este caso, el servidor de chat seria el mediador, y los usuarios serian los colegas. Los usuarios no se conocen entre si, pero se comunican a traves del servidor de chat.

