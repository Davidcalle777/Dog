package Dog.miapp;

public class Dog {
    // Atributos
    private String name;
    private String raza;

    // Constructor
    public Dog(String name, String raza) {
        this.name = name;
        this.raza = raza;
    }

    // Metodo
    public void ladrar() {
        System.out.println(name + " dice: ¡Guau!");
    }
}
    // Definimos una clase llamada Dog.
    // Declaramos atributos: nombre y raza.
    // Creamos un constructor para asignarle valores.
    // Creamos un metodo ladrar() que hace que el perro "ladre".
