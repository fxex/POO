package Impresora;

public class Printer {
    private double cantidadTinta;
    private int cantidadHoja;
    private boolean conectada, wifi;

    public Printer(){
        this.cantidadTinta = 0;
        this.cantidadHoja = 0;
        this.conectada = false;
        this.wifi = false;
    }

    public Printer(double tinta, int hoja){
        this.cantidadTinta = tinta;
        this.cantidadHoja = hoja;
        this.conectada = false;
        this.wifi = false;
    }

    public Printer(double tinta, int hoja, boolean conectada, boolean wifi){
        this.cantidadTinta = tinta;
        this.cantidadHoja = hoja;
        this.conectada = conectada;
        this.wifi = wifi;
    }


    public double getCantidadTinta() {
        return this.cantidadTinta;
    }

    public void setCantidadTinta(double cantidadTinta) {
        this.cantidadTinta = cantidadTinta;
    }

    public int getCantidadHoja() {
        return this.cantidadHoja;
    }

    public void setCantidadHoja(int cantidadHoja) {
        this.cantidadHoja = cantidadHoja;
    }

    public boolean isConectada() {
        return this.conectada;
    }

    public boolean getConectada() {
        return this.conectada;
    }

    public void setConectada(boolean conectada) {
        this.conectada = conectada;
    }

    public boolean isWifi() {
        return this.wifi;
    }

    public boolean getWifi() {
        return this.wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void cargarTinta(double tinta){
        this.cantidadTinta += tinta;
    }

    public void cargarPapel(int hojas){
        this.cantidadHoja = hojas;
    }

    public void conectar() {
        this.conectada = true;
    }

    public void desconectar() {
        this.conectada = false;
    }

    public void on_line() {
        this.wifi = true;
    }

    public void of_line() {
        this.wifi = false;
    }

    public void print(Document pdf) throws PrinterException{
        int hojas = pdf.getCantidadHojas();
        int hojasImpresas = 0;
        while (hojas != 0) {
            if (this.conectada) {
                if (this.wifi) {
                    if (this.cantidadTinta>0) {
                        if (this.cantidadHoja>hojas) {
                            hojas--;
                            hojasImpresas++;
                            this.cantidadTinta -= 1/125;
                        } else {
                            throw new PrinterException("No hay suficiente hojas. Se imprimio " + hojasImpresas + " hojas.");
                        }
                    } else {
                        throw new PrinterException("No tiene tinta la impresora");
                    }
                } else {
                    throw new PrinterException("No esta conectado el wifi a la impresora");
                }
            } else {
                throw new PrinterException("No esta conectada la impresora");
            }
        }
    }


}
