/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

import java.util.Scanner;
/**
 *
 * @author Predator
 */
public class RentalConsole {

    
    public static void main(String[] args) {
        
        // insert data member to arrayList
        Others o = new Others();
        o.addMember(new DataMember("M001", "Mr. X", "Silver"));
        o.addMember(new DataMember("M002", "Mr. Y", "Gold"));
        o.addMember(new DataMember("M003", "Mr. Z", "Platinum"));
      
        
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
        
    }
    
    static private void showData(String idMember) {

        System.out.println("+ -------------------------------------------------------------------------------------------- +");
        System.out.println(idMember);

        Others o = new Others();
        o.searchMember(idMember);
    }
}
