package org.example.menu;


import org.example.model.Usuario;
import org.example.principal.Login;

import java.util.List;
import java.util.Scanner;

public class MenuLogin {
    public static void MenuLogin(List<Usuario> usuarios){
        var menuLogin =
                "****************************************" + "\n" +
                        "**     Bienvenido a su AlkeWallet     **" + "\n" +
                        "****************************************" + "\n" +
                        "** 1.- Login                          **" + "\n" +
                        "** 2.- Salir                          **" + "\n" +
                        "****************************************";

        System.out.println(menuLogin);
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                Usuario usuario = Login.getUsuario(usuarios);
                Menu.Menu(usuarios);
                break;
            case 2:
                System.out.println("¡Gracias por elegir AlkeWallet!");
                break;
            default:
                System.out.println("Opción inválida. Por favor elegir una opción válida.");
                break;
        }
    }
}
