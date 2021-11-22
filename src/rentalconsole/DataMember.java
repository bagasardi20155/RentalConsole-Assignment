/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author Predator
 */
public class DataMember {
    
    // attribute for arrayList
    String idMember, namaMember, jenisMember;
    
    // constructor
    DataMember(String idMember, String namaMember, String jenisMember){
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.jenisMember = jenisMember;
    }
    
    // print method
    void print() {
        System.out.println("\n| ID Member    | : " + this.idMember);
        System.out.println("| Nama Member  | : " + this.namaMember);
        System.out.println("| Jenis Member | : " + this.jenisMember);
    }
}
