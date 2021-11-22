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
import java.util.Scanner;
/**
 *
 * @author Predator
 */
public class RentalConsole {

    
    public static void main(String[] args) {
       
        // do insert data member
        Others o = new Others();
        o.insertMember();
        
        
        // attribute
        String idMember, dateRent, monthRent, yearRent, dateReturn, monthReturn, yearReturn;
        Scanner input = new Scanner(System.in);
    
        
        // inputan
        System.out.println("+ ========================= Program Pengembalian Console Game Rental ========================= +");
        
        System.out.print("| Masukkan ID Member               | : ");
        idMember = input.nextLine();
        
        System.out.print("| Masukkan Tanggal Pinjam (1 - 31) | : ");
        dateRent = input.nextLine();
        
        System.out.print("| Masukkan Bulan Pinjam (1 - 12)   | : ");
        monthRent = input.nextLine();
        
        System.out.print("| Masukkan Tahun Pinjam            | : ");
        yearRent = input.nextLine();
        
        System.out.print("\n| Masukkan Tanggal Kembali (1 - 31)| : ");
        dateReturn = input.nextLine();
        
        System.out.print("| Masukkan Bulan Kembali (1 - 12)  | : ");
        monthReturn = input.nextLine();
        
        System.out.print("| Masukkan Tahun Kembali           | : ");
        yearReturn = input.nextLine();
        
        
        // do search data member
        System.out.println("\n+ -------------------------------------------------------------------------------------------- +");
        o.searchMember(idMember);
    }
}
