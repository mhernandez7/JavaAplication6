/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Miguel
 */
public class Ponderacion {
    
    private double number1;
    
    public Ponderacion (double number1)
    {
        this.number1 = number1;
    }
    public Ponderacion()
    {
        this.number1 = 0;
    }
    public double getPonderacion()
    {
        return number1;
    }
    public void setPonderacion(double number1)
    {
        this.number1 = number1;
    }
    public String PondNota(){
        String msn = "";
    
      if (this.number1 >= 0 && this.number1 <= 40)
            {
           msn = "Pesimo, aplazado sin oportunidad: ";
            }
        else if (this.number1 >= 41 && this.number1 <= 45)
            {   
            msn = "Deficiente, aplazado a reparacion: ";     
            }
        else if (this.number1 >= 46 && this.number1 <= 50)
            {   
            msn = "Bajo, aplazado repetir examen: ";       
            }
        else if (this.number1 >= 51 && this.number1 <= 60)
            {
           msn = "regular, no aplazado - remedial: ";
            }
        else if (this.number1 >= 61 && this.number1 <= 70)
             {
            msn = "Bien ";
            }
        else if (this.number1 >= 71 && this.number1 <= 80)
             {
            msn = "Muy Bien ";
            }
        else if (this.number1 >= 81 && this.number1 <= 100)
            {
           msn = "Excelente ";   
            }
        else 
            {
            msn = "fuera del rango de notas";
            }
         return msn;
    } 
    
}
