/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 *
 * @author dani_dna83
 */
public class Person {
        protected String name;
        protected String address;
        
        public Person(){
            System.out.println("Inside Person:Constructor");
            name = "";
            address = "";
        }
 
        public Person( String name, String address) {
        this.name = name;
        this.address = address;
        }
  
        public String getName() {
        System.out.println("Person Name : " +name);
        return name;
        }
        public String getAddress() {
        return address;
        }
        public void setName(String name) {
        this.name = name;
        }
        public void setAddress(String add) {
        this.address = add;
        }
}

