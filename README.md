# Práctica de Laboratorio: Polimorfismo y Sobreescritura (`@Override`) en Java

**Asignatura:** Programación Orientada a Objetos (CDS-0201) — ESPAM MFL  
**Carrera:** Carrera de Desarrollo de Software  

## Objetivo de la Práctica
Completar la jerarquía de canales de pago aplicando herencia (`extends`, `super`), sobreescritura de métodos (`@Override`), extensión con `super.metodo()`, redefinición de `toString()` y procesamiento polimórfico mediante `List<MetodoPago>`.

## Pasos de Implementación
1. **Completar `MetodoPago.java`:** Declarar los atributos `protected`, implementar las validaciones en el constructor, `calcularTotal()`, `mostrarComprobante()` y `@Override toString()`.
2. **Completar las 4 subclases (`PagoEfectivo`, `PagoTarjeta`, `PagoTransferencia`, `PagoBilleteraDigital`):**
   - Heredar de `MetodoPago` mediante `extends`.
   - Invocar `super(...)` en la primera línea del constructor.
   - Sobreescribir `calcularComision()`, `procesarPago()`, `mostrarComprobante()` (usando `super.mostrarComprobante()`) y `toString()` con `@Override`.
3. **Completar `Main.java`:**
   - Almacenar instancias de las 4 subclases dentro de una misma colección `List<MetodoPago>`.
   - Recorrer la lista invocando los métodos polimórficos sin condicionales `if/else` ni `instanceof`.

## Compilación y Ejecución
```powershell
javac -encoding utf-8 -d bin src/*.java
java -cp bin Main
```
