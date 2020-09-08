/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import java.io.File;

/**
 *
 * @author luisangelcuriel
 */
public class PruebaArchivo {
    public static void main(String[] args) {
        File archivo = new File(System.getProperty("user.dir"));
        
        System.out.println(archivo);
    }
}
