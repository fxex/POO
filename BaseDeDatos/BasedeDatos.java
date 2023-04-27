package BaseDeDatos;

import java.util.Vector;

public class BasedeDatos {
    private Vector<Tabla> tablas;
    private String nombre;
    private boolean abierta;

    public BasedeDatos(){
        this.tablas = new Vector<Tabla>();
        this.nombre = nombre;
        this.abierta = false;
    }

    public BasedeDatos(String nombre){
        this.tablas = new Vector<Tabla>();
        this.nombre = nombre;
        this.abierta = false;
    }

    public Vector<Tabla> getTablas() {
        return this.tablas;
    }

    public void setTablas(Vector<Tabla> tablas) {
        this.tablas = tablas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAbierta() {
        return this.abierta;
    }

    public boolean getAbierta() {
        return this.abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public void abrir(){
        this.abierta = true;
    }
    public void cerrar(){
        this.abierta = false;
    }

    public void agregarTabla(Tabla t) throws DBException, TableException{
        if (!abierta) {
            throw new DBException("La base de datos no esta abierta");
        }

        if (tablas.contains(t)) {
            throw new TableException("Ya existe esta tabla en la base de datos");
        }

        this.tablas.add(t);
    }

    public void eliminarTabla(String n) throws DBException, TableException{
        boolean esta = false;
        Tabla t;
        if (!abierta) {
            throw new DBException("La base de datos no esta abierta");
        }
        for (int i = 0; i < this.tablas.size(); i++) {
            t = tablas.get(i);
                if (n.equals(t.getNombre())) {
                    esta = true;
                    tablas.remove(i);
                }
        }

        if (!esta) {
            throw new TableException("No existe la tabla que intenta eliminar");
        }
    }

    public void listarTablas() throws DBException{
        if (!abierta) {
            throw new DBException("La base de datos no esta abierta");
        }

        for (Tabla tabla : tablas) {
            System.out.println(tabla.toString());
        }
    }


}
