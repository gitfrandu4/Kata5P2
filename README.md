# Kata4

## Representación gráfica de un Histograma leyendo los datos desde un fichero. 

**Objetivo**:
* Dado un conjunto de direcciones de email almacenadas en un fichero de texto mostrar el histograma de los dominios y visualizarlo.

El proyecto **Kata4** se construirá a partir de la versión 2 de [Kata3](https://github.com/gitfrandu4/Kata3#kata3-versi%C3%B3n-2).

### Kata4 versión 1

<img src="https://github.com/gitfrandu4/Kata4/blob/master/imgs/kata4_v1.png" alt="Kata3_v1" width="720" height="486" />

El proyecto Kata4 consta de 3 paquetes:

* **`kata4.main`** => En este paquete se tendrá la **clase de Controlador**, Kata4.
* **`kata4.model`** => En este paquete se tendrá las **clases de Modelo**: 
    * `Histogram` (la copiamos de la [versión 2 de Kata 3](https://github.com/gitfrandu4/Kata3/blob/master/src/kata3/Histogram.java)).
    * `Mail`. Nueva clase cuya función será separar de una cadena con una dirección de email, la correspondiente subcadena con el dominio.
* **`kata4.view`=> En este paquete insertamos las **clases de Vista**:
    * `HistogramDisplay` (la copiamos de la [versión 2 de Kata3](https://github.com/gitfrandu4/Kata3/blob/master/src/kata3/HistogramDisplay.java)).
    * `MailListReader`. Nueva clase cuya función será leer del fichero de texto los emails y crear una lista de correos válidos. Debemos tener en cuenta que en fichero [email.txt](https://github.com/gitfrandu4/Kata4/blob/master/email.txt) hay cadenas que no se corresponden con direcciones de email. 
    * `MailHistogramBuilder`. Nueva clase cuya función será construir un Histograma a partir de una lista de emails válidos. 

### Kata4 versión 2

<img src="https://github.com/gitfrandu4/Kata4/blob/master/imgs/kata4_v2.png" alt="Kata3_v1" width="720" height="486" />

Se debe reestructurar la clase de Control, **Kata 4** usando el **Modelo CIPO** (_Control-Input-Process-Output_) y para hacerlo se deben crear los módulos `execute()`, `input()`, `process()` y `output()` moviendo el correspondiente código a estos módulos. Ver figura.
