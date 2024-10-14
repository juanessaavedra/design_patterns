# Command
Command es un patrón de diseño de comportamiento que convierte una solicitud en un objeto independiente que contiene toda la información sobre la solicitud. Esta transformación permite parametrizar los métodos con diferentes solicitudes, retrasar la ejecución de un método y hacer que las solicitudes sean reversibles.

El patrón Command sugiere que los objetos GUI no envíen estas solicitudes directamente. En lugar de ello, debes extraer todos los detalles de la solicitud, como el objeto que está sie- ndo invocado, el nombre del método y la lista de argumentos, y ponerlos dentro de una clase comando separada con un único método que activa esta solicitud.

Los objetos de comando sirven como vínculo entre varios obje- tos GUI y de lógica de negocio. De ahora en adelante, el objeto GUI no tiene que conocer qué objeto de la lógica de negocio recibirá la solicitud y cómo la procesará. El objeto GUI activa el comando, que gestiona todos los detalles.

## Analogía en el mundo real
### Realizar un pedido en un restaurante
Cuando vas a un restaurante, no entras en la cocina y le dices al chef cómo cocinar tu comida. En lugar de ello, te sientas en tu mesa y le das tu pedido al camarero. El camarero toma tu pedido y lo pasa al chef, que sabe cómo cocinarlo. El camarero no tiene que saber cómo cocinar la comida, solo tiene que pasar el pedido al chef.

En este ejemplo, el camarero es un objeto de comando. Recibe tu solicitud, el pedido en papel (hace la funcion de un comando) y la pasa al chef, permanece en una cola de espera hasta que el chef esté listo. El chef es el objeto que sabe cómo ejecutar la solicitud y le permite de inmediato empezar a cocinar.

## Estructura
1. Command: Declara una interfaz para ejecutar una operación con el metodo `execute`.
2. ConcreteCommand: Implementa la interfaz Command y define el metodo `execute`, que invoca un metodo en el objeto receptor.
3. Receiver: Sabe cómo llevar a cabo la operación asociada con la solicitud.
4. Invoker: Pide al comando que ejecute la solicitud (invoca el comando).
5. Client: Crea un objeto comando y establece su receptor.

## Aplicabilidad
En el repositorio se encuentra los ejemplos en codigo Java.