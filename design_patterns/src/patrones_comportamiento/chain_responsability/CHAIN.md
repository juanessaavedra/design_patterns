# Chain of Responsibility
Te permite pasar solicitudes a lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa o si la pasa al siguiente manejador en la cadena.

## Estructura 
1. **Handler:** Define una interfaz para manejar solicitudes y un metodo para establecer el siguiente manejador.
2. **ConcreteHandler:** Implementa la interfaz Handler y define como pasar la solicitud al siguiente manejador.
3. **Client:** Inicia la solicitud a un objeto manejador de la cadena.

