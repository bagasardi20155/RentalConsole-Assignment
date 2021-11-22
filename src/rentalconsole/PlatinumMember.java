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
public class PlatinumMember extends GoldMember{
    
    int bonus;
    
    PlatinumMember() {
        rentCost = 30000;
        point = 5;
        disc = 2;
        cashback = 5000;
    }
    
    protected int getBonus(int rentalDuration) {
        
        bonus = rentalDuration * 5000;
        return bonus;
    }
}
