/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.navegador_g1;

/**
 *
 * @author Calavera
 */
public class Navegador_G1 {

    public static void main(String[] args) {
       
        Pagina paginaUno = new Pagina("Espoch.com");
        paginaUno.visitarPagnina("google.com");
        paginaUno.visitarPagnina("youtubr.com");
        paginaUno.visitarPagnina("facebook.com");
        
        paginaUno.navegarAtras();
        paginaUno.navegarAtras();
        paginaUno.navegarAdelante();
        
        
    }
}
