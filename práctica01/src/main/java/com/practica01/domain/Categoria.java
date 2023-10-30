/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author ferva
 */

@Data
@Entity
@Table(name="arbol")
public class Categoria implements Serializable{ //la serializacion funciona para almacenar varios datos en el disco
    
    private static final long serialVersionUID = 1L;//esta linea funciona como auto increment para la tabla
    
    @Id //tabla categoria tiene un identificador que va a ser el id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// los valores generados que tipo de estrategia utilizan, identico = sea igual en BD y en la clase
    @Column(name="id_arbol")//identifica cual es el numbre en la base de datos
    private long id_arbol;
    private String nombre_comun;
    private String ruta_imagen;
    private String tipo_flor;
    private double dureza_madera;
    private int altura_arbol;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String nombre_comun, boolean activo) {
        this.nombre_comun = nombre_comun;
        this.activo = activo;
    }
    
    
}
