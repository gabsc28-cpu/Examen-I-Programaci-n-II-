/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */

import java.io.IOException;

public class ServicioUsuario {

    private UsuarioDAOArchivo archivo = new UsuarioDAOArchivo();

    public void registrar(String nombre, String correo) throws IOException {

        Usuario usuario = new Usuario(nombre, correo);
        archivo.guardar(usuario);
    }

    public void listarUsuarios() throws IOException {
        archivo.listar();
    }
}
   
