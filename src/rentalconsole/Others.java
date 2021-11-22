/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

import java.util.ArrayList;
/**
 *
 * @author Predator
 */
public class Others {
    
    ArrayList<DataMember> dataMember = new ArrayList<DataMember>();
    
    // add member to arrayList
    void addMember(DataMember data) {
        this.dataMember.add(data);
    }
    
    // search data on arrayList
    void searchMember(String idMember) {       
        boolean found = false;
        int index = -1;
        
        for(int i = 0; i < this.dataMember.size(); i++) {
            if(this.dataMember.get(i).idMember == idMember) {
                index = i;
                found = true;
            }
        }
        
        if(found == true) {
            this.dataMember.get(index).print();
            
        } else {
            System.out.println("Belum terdaftar sebagai member");
        }
    }
    
    void showMember() {
        boolean found = false;
        int index = 0;
        
        for(int i = 0; i < this.dataMember.size(); i++) {
            if(this.dataMember.get(i).idMember == "M001") {
                index = i;
                found = true;
            }
        }
        
        if(found == true) {
            this.dataMember.get(index).print();
            
        } else {
            System.out.println("Belum terdaftar sebagai member");
        }
    }
}
