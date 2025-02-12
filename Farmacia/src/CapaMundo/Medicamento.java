/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaMundo;

/**
 *
 * @author USUARIO
 */
public class Medicamento {
    
    //creamos nuestros atributos a trabajar.
    private int codigomedicamento;
    private String nombremedicamento;
    private String presentacion;
    private double costo;
    private int tiempo;
    private String ruta;
    
    //creamos el contructor.

    public Medicamento(int codigomedicamento, String nombremedicamento, String presentacion, double costo, int tiempo, String ruta) {
        this.codigomedicamento = codigomedicamento;
        this.nombremedicamento = nombremedicamento;
        this.presentacion = presentacion;
        this.costo = costo;
        this.tiempo = tiempo;
        this.ruta = ruta;
    }
    
    //creamos un metodo de retorno para cada uno.
    
    public int DarcodigoMedicamento(){
        return codigomedicamento;
    }
    
    public String DarnombreMedicamento(){
        return nombremedicamento;
    }
    
     public String DarPresentacion(){
        return presentacion;
    }
     
     public double DarCosto(){
        return costo;
    }
     
     public int Dartiempo(){
         return tiempo;
     }
     
     public String DarRuta(){
         return ruta;
     }
}
