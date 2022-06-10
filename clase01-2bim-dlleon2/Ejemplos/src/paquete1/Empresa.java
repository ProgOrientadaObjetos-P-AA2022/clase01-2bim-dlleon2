/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private Vehiculo [] vehiculos; // tipo, matricula, valor
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    public void establecerVehiculos(Vehiculo[] v){
        vehiculos = v;
    }
    
    public void establecercostoBienesInmuebles(double cbi){
        double suma = 0;
        costoBienesInmubles = suma;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    public double obtenercostoBienesInmuebles(){
        return costoBienesInmuebles;
    }
    public String toString(){
        String reporte = String format("/nLista de Edificio/n", obtenerNombre());
         for(int i=0; i obtenerEdificio().  )
                 report = String format()
                         reports,
                         1+1,
                         obtenerEdificios()[i].obtenerNombre().toUpperCase();
                         obtenerEdifici os()[i].obtenerCosto();
    }
    return reports;
}
