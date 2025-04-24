package com.guillevier.resumen.clases.models;

/* myMethod() es un método default que se hereda automáticamente de MyInterface a MyClass.
Cuando se ejecuta este código, se imprimirá "Hello from MyInterface".
myStaticMethod() es un método estático que se define directamente en la interfaz MyInterface.
Puede ser llamado directamente en la interfaz sin instanciarla. Al ejecutar este código, se imprimirá
"Hello from MyInterface static method".
*/
// LISTO
public class MyClass implements MyInterface {
  /* En este ejemplo, la clase MyClass tiene un método metodoPrivado().
  Este método no puede ser llamado directamente desde otras clases, solo puede ser llamado dentro de la misma clase.
  El método metodoPublico() en la misma clase MyClass puede llamar al método metodoPrivado() porque ambos están en la misma clase.
  */
  private void metodoPrivado() {
    System.out.println("Método privado llamado...");
  }

  public void metodoPublico() {
    this.metodoPrivado();
  }

  // MÉTODO PROVENIENTE DE MyInterface
  @Override
  public void myMethod() {
    // Implementación personalizada del método definido como default.
    System.out.println("Hello from MyClass @Override MyInterface");
  }

  public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.myMethod();
    obj.metodoPublico();
    MyInterface.myStaticMethod();
  }
}