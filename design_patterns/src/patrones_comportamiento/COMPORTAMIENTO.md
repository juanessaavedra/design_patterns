# Patrones de comportamiento

Los patrones de comportamiento tratan con algoritmos y la asignacion de responsabilidades entre objetos.

## Chain of responsability
Permite pasar solicitudes a lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa o si la pasa al siguiente manejador de la cadena. <br>
 [Chain of responsability>>](./chain_responsability/CHAIN.md) 


## Command
Convierte una solicitud en un objeto independiente que contiene toda la informacion sobre la solicitud. Esta transformacion permite parametrizar los metodos con diferentes solicitudes, retrasar o poner en cola la ejecucion de una solicitud y soportar operaciones que no se pueden deshacer. <br>
[Command>>](./command/COMMAND.md)

## Iterator
Permite recorrer elementos de una coleccion sin exponer su representacion subyacente. <br>
[Iterator>>](./iterator/ITERATOR.md)

## Mediator
Permite reducir las dependencias caoticas entre objetos. El patron restringe las comunicaciones directas entre los objetos. Forzandolos a colaborar unicamente a traves de un objeto mediador. <br>
[Mediator>>](./mediator/MEDIATOR.md)

## Memento
Permite guardar y restaurar el estado previo de un objeto sin revelar los detalles de su implementacion. <br>
[Memento>>](./memento/MEMENTO.md)

## Observer
Permite definir un mecanismo de suscripcion para notificar a varios objetos sobre cualquier evento que le suceda al objeto que estan observando <br>
[Observer>>](./observer/OBSERVER.md)

## State
Permite a un objeto alterar su comportamiento cuando su estado interno cambia. Parece como si el objeto cambiara de clase. <br>
[State>>](./state/STATE.md)

## Strategy
Permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables. <br>
[Strategy>>](./strategy/STRATEGY.md)

## Template Method
Define el esqueleto de un algoritmo en la superclase pero permite a las subclases sobreescribir pasos del algoritmo sin cambiar su estructura. <br>
[Template Method>>](./template_method/TEMPLATE_METHOD.md)

## Visitor
Permite separar algoritmos de la estructura de un objeto sobre el que operan. <br>
[Visitor>>](./visitor/VISITOR.md)
