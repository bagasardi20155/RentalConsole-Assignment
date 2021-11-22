/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Predator
 */
public class Others {
    
    Map<String, List<String>> dataMember = new HashMap<String, List<String>>();
    
    // insert data member values paired with id member key hashmap
    void insertMember() {
        
        // insert M001 to value list
        List<String> valueOne = new ArrayList<String>();
        valueOne.add("Mr. X");
        valueOne.add("Silver");
        
        // insert M002 to value list
        List<String> valueTwo = new ArrayList<String>();
        valueTwo.add("Mr. Y");
        valueTwo.add("Gold");
        
        // insert M003 to value list
        List<String> valueThree = new ArrayList<String>();
        valueThree.add("Mr. Z");
        valueThree.add("Platinum");
        
        // insert all values paired to key
        this.dataMember.put("M001", valueOne);
        this.dataMember.put("M002", valueTwo);
        this.dataMember.put("M003", valueThree);
    }
    
    
    // search data on arrayList
    void searchMember(String idMember) {       
         
        if(dataMember.containsKey(idMember)) {
            
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                String key = entry.getKey();
                List<String> values = entry.getValue();
                
                System.out.println("\n| ID Member                        | : " + key);
                System.out.println("| Nama Member                      | : " + values.get(0));
                System.out.println("| Jenis Member                     | : " + values.get(1));
                
                }
            }
        } else {
                System.out.println("Belum terdaftar sebagai member");
        }
    }
    
    
}
