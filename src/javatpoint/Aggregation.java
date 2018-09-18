/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint;

 class Circle{
     
     Operation op;
      double pi=3.14; 
     
     double area(int radius){
       
         op = new Operation();
         int square_area = op.square(radius);
         return pi*square_area;
     
    } }


 class Operation{
    
    int square(int n){
        return n*n;
    }
    
    }
public class Aggregation {

  
    public static void main(String[] args) {
     
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
    
}
