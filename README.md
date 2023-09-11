# Actividad 02 - Semana 04: Patrones de Diseño

DESARROLLO DE PREGUNTAS

1. ¿Qué patron de diseño aplicaste para resolver el caso del app SimUDuck?
   - El patrón de diseño que se utilizó fue el patron de diseño "Strategy" (Estrategia). 
3. ¿Qué beneficios trajo a la compañía?
   - Mayor flexibilidad para el sistema que nos permitió encapsular una familia de algoritmos en su propio conjunto de clases y también cambiar el comportamiento en tiempo de ejecución .
4. ¿Cómo trabaja el patrón que se aplicó en el caso?
   - Strategy es un patrón de diseño de comportamiento que te permite definir una familia de algoritmos, colocar cada uno de ellos    en una clase separada y hacer sus objetos intercambiables.
5. ¿Cuántos principios de diseño se aplicaron?
   - Se aplicaron 4 principos de diseño: Responsabilidad Única, Abierto y cerrado, segregación de inferfaces e inversión de dependencias.
6. ¿Por qué se crearon las interfaces FlyBehavior y QuackBehavior?
   - Las interfaces FlyBehavior y QuackBehavior se crearon para promover la flexibilidad, la reutilización del código y la separación de preocupaciones en el diseño de "SimUDuck". Estas interfaces permiten que los comportamientos de vuelo y graznido sean fácilmente configurables y cambiables sin afectar las clases de patos concretos, lo que hace que el código sea más mantenible y extensible.
7. ¿Por qué se dice que el cambio del comportamiento de un pato puede ser en tiempo de ejecución?
   - La capacidad de cambiar dinámicamente el comportamiento de un pato en tiempo de ejecución es una característica importante del patrón "Strategy" en "SimUDuck". 
     
