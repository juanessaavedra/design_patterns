# Chain of Responsibility
Te permite pasar solicitudes a lo largo de una cadena de manejadores. Al recibir una solicitud, cada manejador decide si la procesa o si la pasa al siguiente manejador en la cadena.

## Ejemplo:
- Sistema de quejas

## Justificación
Descopla el remitente y el receptor de la solicitud

## Analogía en la vida real
En un call center de soporte técnico, el cliente llama con un problema y el primer nivel de soporte intenta resolverlo. Si no puede, lo pasa al siguiente nivel de soporte, y así sucesivamente, hasta que el problema se resuelve.

