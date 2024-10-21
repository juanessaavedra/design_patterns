# Patron Prototype
Es un patron de diseño creacional que permite copiar objetos evitando el proceso de creacion desde cero. Es util para evitar creaciones nuevas de objetos y permite la creacion a traves de clonacion de un prototipo

### Ejemplo teórico: Sistema de libros
### Ejemplo de laboratorio: Sistema de personajes de videojuegos


## Diferencia entre clonacion superficial y profunda
La clonacion superficial copia solo los valores de los atributos primitivos, mientras que la clonacion profunda copia los valores de los atributos primitivos y los objetos que contienen

## Justificación
Mejora el rendimiento al evitar la creación de objetos costosos desde cero

## Analogía en la vida real
Imagina que tienes un molde para hacer galletas. Una vez que haces la primera galleta, puedes usar el molde para hacer muchas más galletas idénticas sin tener que hacer la masa desde cero cada vez.