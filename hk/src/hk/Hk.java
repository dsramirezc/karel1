/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hk;

/**
 *
 * @author Estudiante
 */
public class Hk {
    private String toppings;
    private int diameter;
    private double price;
    public Hk(){
     
     
    }
    public void Settoppings(String t){
        this.toppings= t;
    }
    public void SetDiameter(int t){
        this.diameter= t;
    }
    public void SetPrice(double t){
        this.price= t;
    }
    public int GetSize(){
        return this.diameter;
    }
    public String GetToppings(){
        return this.toppings;
    }
    public double GetPrice(){
        return this.price;
    }
  
  
    
}
