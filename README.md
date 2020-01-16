# Kata5P2

Kata 5: Segunda parte

## Representación gráfica de un Histograma leyendo los datos desde una base de datos. 



### Kata5P2: versión 1

1. Clonar el proyecto Kata4.
2.  A partir de Kata4, crear un nuevo proyecto (Kata5P2).
3. Crear un repositorio local, añadir los archivos, commit nº1.



### Kata5P2: versión 2

1. Copiar en la carpeta del proyecto Kata5P2 la BD Kata5
2. Crear una nueva clase (`MailListReaderBD`) en el paquete de clases de Vista que obtenga las direcciones de email desde la tabla MAIL de la BD Kata5. Ver diagrama UML de clases.
3. Modificar la clase principal en el paquete de Controlador:
   * Por medio del método `read()` de la clase `MailListReaderBD` cargar en un ArrayList\<String> los email.
   * Invocar el método `build()` de `MailHistogramBuilder`.
   * Invocar el método `execute()` de `HistogramDisplay`.
4. Añadir archivos, commit nº2 y subirlo al repositorio remoto. 



<img src="https://github.com/gitfrandu4/Kata5P2/blob/master/imgs/Diagrama_kata5p2.png" alt="Diagrama_kata5p2" style="zoom:75%;" />
