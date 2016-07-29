/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1bd;

/**
 * Clase que gestiona la informacion de las personas
 * @author Paula
 */
public class Person{
    protected String id;
    protected String name;
    /*
    Constructor de la clase
    @param id Identificacion unica de la persona
    @param name Nombre de la persona
    */


    public Person  (String id, String name) {
        this.id =id;
        this.name = name;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
