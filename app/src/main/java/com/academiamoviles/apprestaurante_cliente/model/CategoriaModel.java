package com.academiamoviles.apprestaurante_cliente.model;

public class CategoriaModel {

    private String id_categoria;
    private String categoria;

    public CategoriaModel() {
    }

    public CategoriaModel(String id_categoria, String categoria) {
        this.id_categoria = id_categoria;
        this.categoria = categoria;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
