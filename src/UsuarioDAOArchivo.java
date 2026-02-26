/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class UsuarioDAOArchivo {
            
    private String archivo = "usuarios.txt";
        
    public void guardar(Usuario usuario) throws IOException {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(usuario.toString());
            bw.newLine();
        }
    }

    
    
   public void listar() throws IOException {

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        
        System.out.println("LISTA DE USUARIOS REGISTRADOS EN datos.txt");
        String linea;

        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
            }
        }
    }
}
