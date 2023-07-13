package com.mycompany;

public class CocheCRUDImpl implements  CocheCRUD{
    @Override
    public void save() {
        System.out.println("Guardar");
    }

    @Override
    public void findAll() {
        System.out.println("Encontrar");
    }

    @Override
    public void delete() {
        System.out.println("Eliminar");
    }
}
