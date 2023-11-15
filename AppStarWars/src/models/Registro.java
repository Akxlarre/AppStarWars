/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author akxlarre
 */
public class Registro {
    
    private ArrayList<Personaje> personajes=new ArrayList();

    public Registro() {
    }

    public ArrayList<Personaje> mostrarPj() {
        return personajes;
    }

    public void setPj(ArrayList<Personaje> pj) {
        this.personajes = personajes;
    }
    
    public void crearPJ(Personaje pj ) throws Exception
    {

        if (pj!=null) {
            for (Personaje perso : personajes) {
                if(perso.getId() == pj.getId())
                {
                    throw new Exception("Esta id ya esta registrada");
                            
                }
            }
            
           personajes.add(pj);
        } else {
            throw new Exception("No es posible agregar personaje");
        }
    }
    public void eliminarPJ(Personaje pj){
        
        personajes.remove(pj);
        
    }
    
    public Personaje buscarPJ(String personajeBuscado){
        
        for(Personaje pj: personajes){
          if(personajeBuscado.equals(pj.getNombre()))  
              return pj;
        }
        return null;       
    }
}
