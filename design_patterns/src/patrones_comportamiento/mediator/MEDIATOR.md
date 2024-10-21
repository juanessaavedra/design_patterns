# Mediator
Define un objeto que encapsula como interactuan un conjunto de objetos. Este patron promueve un bajo acoplamiento entre los objetos, ya que estos no se conocen entre si, sino que se comunican a traves del objeto mediador.
- Es una especie de fachada, es un patron, pero tambien antipatron. 

## Cuando usarlo
- Cuando un conjunto de objetos se comunican entre si, pero no se conocen entre si
- Cuando se quiere desacoplar la comunicacion entre objetos
- Cuando se quiere centralizar la comunicacion entre objetos

## Justificación
Reduce las dependencias entre los objetos, mejorando la mantenibilidad

## Analogia mundo real
Imaginemos una aplicacion de chat, donde varios usuarios se comunican entre si. En este caso, el servidor de chat seria el mediador, y los usuarios serian los colegas. Los usuarios no se conocen entre si, pero se comunican a traves del servidor de chat.

*Segundo ejemplo:*
Piensa en un coordinador de eventos que organiza una fiesta. En lugar de que todos los invitados se comuniquen entre sí, hablan con el coordinador, quien organiza todo.