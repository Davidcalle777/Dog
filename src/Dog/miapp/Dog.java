package Dog.miapp;

public class Dog {
    //  attributes (  characteristics )
     String name;
     String Raza;

    // Constructor (sirve para dar valores a los atributos)
    public Dog(String name, String Raza) {
        this.name = "Pecas";
        this.Raza = "Doberman";
    }
         // Metodo (acción que puede hacer)
        public void ladrar() {
        System.out.println(name + " Dice: ¡Guau!");
    }
}
    // Definimos una clase llamada Dog.
    // Declaramos atributos: nombre y raza.
    // Creamos un constructor para asignarle valores.
    // Creamos un metodo ladrar() que hace que el perro "ladre".

    // crear un objeto
         class Main {
            public static void main(String[] args) {
            // Crear un objeto de la clase Perro
            Dog miDog = new Dog("Pecas", "Doberman");

            // Usar el metodo ladrar
            miDog.ladrar();
        }
    }