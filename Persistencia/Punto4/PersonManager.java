package Persistencia.Punto4;

import java.util.Vector;
import java.io.*;

public class PersonManager {

    private Vector<Persona> personas;

    public PersonManager(){
        personas = new Vector<Persona>();
    }

    public void addPersona(Persona p){
        personas.add(p);
    }

    public void deletePersona(String n){
        Persona p;
        for (int i = 0; i < personas.size(); i++) {
            p = personas.get(i);

            if (n.equals(p.getNombre())) {
                personas.remove(i);
                System.out.println("La persona fue eliminada");
                i = personas.size();  
            } 
            
        }
    }

    public Persona searchPersona(String n){
        Persona p;

        for (int i = 0; i < personas.size(); i++) {
            p = personas.get(i);

            if (n.equals(p.getNombre())) {
                return p;
            } 
            
        }
        return null;
    }

    public void savePersona(String file){
        try {
            FileOutputStream pers = new FileOutputStream(file);
            ObjectOutputStream obj = new ObjectOutputStream(pers);
            for (Persona persona : personas) {
                obj.writeObject(persona);
            }
            obj.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public Vector<Persona> retrievePersona(String file){
        Persona p;
        Vector<Persona> aux = new Vector<Persona>();
        try {
            FileInputStream pers = new FileInputStream(file);
            ObjectInputStream obj = new ObjectInputStream(pers);
            while (pers.available() == 0) {
                p = (Persona) obj.readObject();
                aux.add(p);
            }
                
            obj.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        return aux;
    }


    
}
