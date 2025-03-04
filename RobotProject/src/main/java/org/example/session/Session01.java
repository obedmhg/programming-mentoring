package org.example.session;

public class Session01 {

    // accessor + type + name
    public int alumnos;

    public String nombre;

    /**
     * This is a comment, does nothing.
     * Also comments can be added with //
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hola Clase");
        Session01 clase = new Session01();
        System.out.println("La clase tiene " + clase.alumnos);
        System.out.println("La clase se llama " + clase.nombre);
    }
}
