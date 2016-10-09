Taller Java para desarrollo de colacciones se desarrolla la guia de colecciones compuesto por 4 numero.

Ejercicios Colecciones En JAVA

1. Use la interfaz List<E> para guardar una lista de números. Los números se ingresarán a través de teclado
hasta que se ingrese la palabra fin y los números ingresados se transformarán en enteros con el método parseInt()
o valueOf() de la clase Integer, para luego añadirlos al final de la lista con el método add().
Imprima el número de elementos leídos.
Luego eleve todos al cuadrado (use get() y set()).
Recorra la lista y suprima los números mayores de 100 (use iterator).
Ahora ordénelos (use sort() de la clase Collections).
Una vez hecho esto, saque (use remove()) de la lista los números, respetando su nuevo orden e imprímalos.

2. Defina una lista List<E> con la clase Empleado antes definida(con nombre, apellidos, fecha de contratación y número de empleado). 
Use la función sort de la clase Collections, para ordenar la lista. Use la antigüedad como 
criterio a seguir (es “mayor” si es más antiguo) y si entraron en el mismo día, utilice el número de empleado para desempatar.
Nota: Esta ordenación se reflejará en un método de la clase Empleado, compareTo(Object o), que permite comparar el objeto en curso (this) con el objeto recibido, que devuelve -1 si es menor que el recibido, 0 si son iguales y 1 si es mayor que el recibo.

3. Definauna lista List<E> con la clase que representa una entrada de una agenda, con el nombre, primer apellido, segundo 
apellido, teléfono, e-mail y móvil. Use la función sort() para ordenarla. Use como criterio de ordenación los apellidos y 
luego el nombre.

4. Defina e implemente un directorio de teléfonos (Se sugiere que se implemente mediante un Map<K, V>). En el mismo tendrá
entradas de agenda con los campos anteriores. Se buscará por el nombre y apellidos y devolverá la entrada de agenda 
correspondiente. Pruebe a insertar unas pocas entradas y luego a buscar alguna de ellas. Pruebe a insertar dos nombres 
iguales, que cambie simplemente en el orden de los apellidos.

