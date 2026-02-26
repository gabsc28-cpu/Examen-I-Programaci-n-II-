/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laboratorio
 */

import java.util.Scanner;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        ServicioUsuario su = new ServicioUsuario();

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Ingrese su correo: ");
            String correo = sc.nextLine();

            su.registrar(nombre, correo);
            su.listarUsuarios();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}