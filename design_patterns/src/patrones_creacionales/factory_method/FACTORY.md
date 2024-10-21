# Factory Method (Método de fábrica)
Define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar. Permite que una clase delegue en sus subclases la creación de objetos.

## Ejemplo
- Gestión de pagos (tarjeta, paypal) sin acoplar el codigo a clases especificas

## Justificación
Proporciona flexibilidad y extensibilidad en el codigo al permitir que las subclases decidan qué clase instanciar.

## Analogía en la vida real
1. Restaurante como Fábrica: Imagina que tienes un restaurante que actúa como una "fábrica" de comidas. Cuando un cliente hace un pedido, el restaurante decide qué tipo de comida preparar (pizza, hamburguesa, ensalada, etc.).
2. Método de Creación: Dependiendo de la elección del cliente, el restaurante utiliza un método diferente para preparar cada tipo de comida. Por ejemplo:
- Si el cliente pide una pizza, se sigue un proceso específico para hacer la masa, añadir la salsa y los ingredientes.
- Si el cliente pide una hamburguesa, se usa un método diferente para cocinar la carne, preparar el pan y añadir los condimentos.
3. Desacoplamiento: El cliente no necesita saber cómo se preparan internamente las diferentes comidas. Solo hace su elección y el restaurante se encarga de la lógica de cómo se crea cada tipo de comida.