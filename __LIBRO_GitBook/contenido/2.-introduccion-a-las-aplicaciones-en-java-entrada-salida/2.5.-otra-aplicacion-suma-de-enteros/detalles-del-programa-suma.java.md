# Detalles del programa suma.java

{% embed url="https://github.com/Deivis44/UD_Java/blob/main/CAP_2/Ejercicios_libro/_5_Suma.java" %}

### 2.5.1. Declaraciones import

Para no tener que reinventarnos la rueda, existen clases predefinidas en Java que cumplen una función en específico, y estas se agrupan en paquetes dependiendo de su funcionalidad. Por ende, han de ser declaradas antes de hacer uso de la clase main y verificar que estás estén correctamente convocadas.

### 2.5.2. Declaración de la clase _Suma_

```java
public class Suma {
	// code
}
```

### 2.5.3. Declaración y creación de un objeto Scanner para obtener la entrada del usuario mediante el teclado

```java
Scanner entrada = new Scanner(System.in);

// code

entrada.close();
```

“_El signo ‘=’ indica que es necesario inicializar la variable entrada tipo Scanner (es decir, hay que prepararla para utilizarla en el programa) en su declaración con el resultado de la expresión a la derecha del signo igual: `new Scanner(System.in)`. Esta expresión emplea la palabra clave new para crear un objeto Scanner que lee los datos escritos por el usuario mediante el teclado. El objeto de entrada estándar, `System.in`, permite a las aplicaciones leer los bytes de datos escritos por el usuario. El objeto Scanner traduce estos bytes en tipos (como int) que se pueden usar en un programa.”_

### 2.5.4. Declaración de variables para almacenar enteros

```java
int numero1, numero2, suma;
```

### 2.5.5. Cómo pedir la entrada al usuario

```java
System.out.print("Escriba el primer numero entero: ");
```

Hablando de la clase _**System**_:

“_El paquete **java.lang** se importa de manera predeterminada en todos los programas de Java; por ende, las clases en **java.lang** son las únicas en la API de Java que no requieren una declaración import.”_

### 2.5.6. Cómo obtener un valor int como entrada del usuario

```java
numero1 = entrada.nextInt();
```

_“Utiliza el método **nextInt()** del objeto ‘entrada’ de la clase Scanner para obtener un entero del usuario mediante el teclado. En este punto, el programa espera a que el usuario escriba el número y oprima Intro para enviar el número al programa.”_

#### 2.5.7. Cómo pedir e introducir un segundo int

```java
System.out.print("Escriba el segundo numero entero: ");
```

#### 2.5.8. Uso de variables en un cálculo

```java
suma = numero1 + numero2;
```

“_De hecho, una expresión es cualquier parte de una instrucción que tiene un valor asociado. Por ejemplo, el valor de la expresión **`numero1 + numero2`** es la suma de los números.”_

#### 2.5.9. Cómo mostrar el resultado del cálculo

```java
System.out.printf("La suma es de %d\\n", suma);
```

#### 2.5.10. Documentación de la API de Java

