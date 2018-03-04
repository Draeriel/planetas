Ejercicio
Se trata de calcular el peso de una persona en el resto de planetas de nuestro Sistema Solar, al estilo de este sitio web:
http://www.traducimos.cl/planet/
http://www.traducimos.cl/planet/
Es imporante para evitar que os pase lo de Arnold en Desafio Total (sí, así funciona mi celebro):
https://www.youtube.com/watch?v=86scPKqWFvc
https://www.youtube.com/watch?v=86scPKqWFvc
http://www.flipada.com/wp-content/uploads/2016/01/cabecera-41.jpg

El peso en otro planeta se lo preguntáis a los que han estudiado Física en la universidad y así no tenéis que programar esta semana. Si no se lo saben de memoria, aplicad este sencilla fórmula:
Peso_en_Superficie = tu_Masa * Gravedad_en_superficie
donde 
Gravedad_en_superficie = G * Masa_del_planeta / Radio_del_planeta_al_cuadrado
donde: 
G = 6.67300E-11
y 
tu_masa = tu_peso_en_la_Tierra / gravedad_superficial_tierra;

Los valores de masa y radio de cada planeta (en Kg y m respectivamente) son:
MERCURY (3.303e+23, 2.4397e6),     
VENUS   (4.869e+24, 6.0518e6),     
EARTH   (5.976e+24, 6.37814e6),     
MARS    (6.421e+23, 3.3972e6),     
JUPITER (1.9e+27,   7.1492e7),     
SATURN  (5.688e+26, 6.0268e7),     
URANUS  (8.686e+25, 2.5559e7),     
NEPTUNE (1.024e+26, 2.4746e7);      
La salida del programa en consola es esta (sirve también como caso test), donde 175 es tu peso en la Tierra:
tu_masa = tu_peso_en_la_Tierra / gravedad_superficial_tierra;
$ java Planet 175 
Your weight on MERCURY is 66.107583 
Your weight on VENUS is 158.374842 
Your weight on EARTH is 175.000000 
Your weight on MARS is 66.279007 
Your weight on JUPITER is 442.847567 
Your weight on SATURN is 186.552719 
Your weight on URANUS is 158.397260 
Your weight on NEPTUNE is 199.207413
