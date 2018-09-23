/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint;

class Employee {
    
    int id;
    String name;
    Address address;
    
  public Employee(int id,String name ,Address address){
    this.id = id;
    this.name=name;
    this.address=address;
    
}
void setAddress(){
    System.out.println(id+" "+name);
    System.out.println(address.no+" "+address.city);
    
}    
    
}
class Address{
    
    int no;
    String city;
    
    
    public Address(int no ,String city){
        this.no = no;
        this.city = city;
    
}
    
}

public class AggregationEx {
    
    public static void main(String[] args) {
        Address myadd = new Address(1,"kurunegala" );
    
    
    Employee man = new Employee(1,"John",myadd);
    man.setAddress();
    }
    
    
}
