/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sala de Sistemas
 */
public class Usuarios {
    private String nombre;
    private String nickname;
    private String clave;
    
    // Lista de usuarios
    private static List<Usuarios> listaUsuarios = new ArrayList<>();
    
    // Constructor
    public Usuarios(String nombre, String nickname, String clave) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.clave = clave;
    
}
     // Método para guardar un usuario en la lista
    public static void SaveUsuario(String nombre, String nickname, String clave) {
        Usuarios usuario = new Usuarios(nombre, nickname, clave);
        listaUsuarios.add(usuario);
    }
    
    // Método para listar usuarios
    public static List<Usuarios> listarUsuarios() {
        return listaUsuarios;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public String getClave() {
        return clave;
    }
}