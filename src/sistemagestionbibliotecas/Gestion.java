/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionbibliotecas;

import java.util.ArrayList;

/**
 * 
 * 
 *
 * @author Usuario
 */
public class Gestion {

    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Gestion() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    
    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro no se encontró.");
    }
    
    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro no se encontró.");
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
