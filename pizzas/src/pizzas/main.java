/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 *
 * @author Estudiante
 */
public  class main {
    public static void main(String[] args){
    Pizzas Carnes = new Pizzas();
    Pizzas Champiñones= new Pizzas();
    Carnes.SetDiameter(10);
    Carnes.Settoppings("chocolate");
    Carnes.SetPrice(30.000);
    Champiñones.SetDiameter(15);
    Champiñones.Settoppings("oregano");
    Champiñones.SetPrice(50.000);
    System.out.println(Carnes.GetPrice()+" "+Carnes.GetToppings()+ " "+ Carnes.GetSize());
    }
}