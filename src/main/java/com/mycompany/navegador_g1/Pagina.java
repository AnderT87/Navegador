/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navegador_g1;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Calavera
 */
public class Pagina {

    private String actual;
    private Stack<String> adelante;
    private Stack<String> atras;
    private ArrayList<String> visitar;

    public Pagina(String actual) {
        this.actual = actual;
        adelante = new Stack<>();
        atras = new Stack<>();
        visitar = new ArrayList<>();
        visitar.add(actual);
    }

    public void visitarPagnina(String url) {
        if(actual != null){
            atras.push(actual);
        }
        actual = url;
        adelante.clear();
        visitar.add(url);
        System.out.println("Te encuentras en:"+url);
    }

    public boolean navegarAdelante() {
        if (adelante.isEmpty()) {
            return false;
        } else {
            atras.push(actual);
            actual = adelante.peek();
            adelante.pop();
            
            System.out.println("---AVANZASTE---");
            System.out.println("Te encuentras en:"+actual);
            return true;
        }

    }

    public boolean navegarAtras() {
        if (atras.isEmpty()) {
            return false;
        } else {
            adelante.push(actual);
            actual = atras.peek();
            atras.pop();
            System.out.println("---RETOCEDISTE---");
            System.out.println("Te encuentras en:"+actual);
            return true;
        }
    }

}
