/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaMundo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Farmacia {
   
    //declaro mi ArrayList
    
    public static ArrayList puente;
    
    public Farmacia(){
       
        //Creo  mi ArrayList
        
        puente = new ArrayList();
    }
    
    //Creamos un medicamento
    
    public void CreaMedicamento(int codigomedicamento, String nombremedicamento, String presentacion, double costo, int tiempo, String ruta){
        Medicamento Mimedicamento = new Medicamento(codigomedicamento, nombremedicamento, presentacion, costo, tiempo, ruta);
        
        //Llenamos los datos registrados en el ArrayList
        
        puente.add(Mimedicamento);
    }
    
    //Creamos metodos para retornar cada dato en cada Pocicion
    
    public int DarCodigoMedicamento(int indice){
        Medicamento A = (Medicamento)puente.get(indice);
        return A.DarcodigoMedicamento();
    }
    public String DarNombreMedicamento(int indice){
        Medicamento A = (Medicamento)puente.get(indice);
        return A.DarnombreMedicamento();
    }
    public String DarPresentacion(int indice){
        Medicamento A = (Medicamento)puente.get(indice);
        return A.DarPresentacion();
    }
    public double DarCosto(int indice){
        Medicamento A = (Medicamento)puente.get(indice);
        return A.DarCosto();
    }
    public int DarTiempo(int indice){
        Medicamento A = (Medicamento)puente.get(indice);
        return A.Dartiempo();
    }
     public String Darruta(int indice){
        Medicamento A = (Medicamento)puente.get(indice);
        return A.DarRuta();
    }
    
    //creamos un metodo para retornar la cantidad de empleados
    
    public int DarNumerodeMedicamentos(){
        return puente.size();
    }
    
    //Metodo para la operacion del costo total.
    public double DarCOstoTotal(){
        double costoTotal = 0;
        
        for (int c = 0; c < DarNumerodeMedicamentos(); c++) {
            costoTotal=costoTotal+DarCosto(c);
        }
        return costoTotal;
    }
    
    //metodo para el costo con el 20% de descuento
    
   public double DarDescuento(){
       double Valor;
       if(DarCOstoTotal()>100000){
           Valor = DarCOstoTotal()*0.2;
       }else{
           Valor=0;
       }
       
       return Valor;
   }
   
   //Metodo Para el Valor a Pagar.
   
   public double ValorApagar(){
       double pagar;
       pagar = DarCOstoTotal()-DarDescuento();
       return pagar;
   }
}
