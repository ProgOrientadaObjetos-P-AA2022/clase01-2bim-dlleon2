/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCosto(10000);
        // Crear un objeto de tipo Empresa:
        Edificio edf2 = new Edificio("Edificio csur");
        edf2.establecerCosto(20000);}
        Edificio edf3 = new Edificio("Edificio norte");
        edf3.establecerCosto(30000);
        
        Edificio edf4 = new Edificio("Edificio Secundaria");
        edf4.establecerCosto(20000);
        
        Edificio [] edificio = new Edificio(4);
        edificio[0] = edf1;
        edificio[1] = edf2;
        edificio[2] = edf3;
        edificio[3] = edf4;
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        // Imprimir el costo de los bienes inmuebles de la empresa
        Empresa miempresa = Empresa();
        miempresa.establecerNombre("Empresa de hojas");
        miempresa.establecerEdificio(edifricio);
        miempresa.establecercostoBienesInmuebles();
        
        
        System.out.printf("% 2f\n", miempresa.obtenercostoBienesInmuebles());
        System.out.printf("%s", miempresa);
    }
}



































