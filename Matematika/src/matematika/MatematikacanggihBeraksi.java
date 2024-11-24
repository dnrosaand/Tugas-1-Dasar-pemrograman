/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Dinda Rosa
 */
public class MatematikacanggihBeraksi {
    public static void main(String[] args){
        MatematikaCanggih Call = new MatematikaCanggih();
        
        Call.setPertambahan(30, 20);
        System.out.println("Hasil penjumlahan =" + Call.getResult());
        Call.setPerkalian(40, 3);
        System.out.println("Hasil perkalian =" + Call.getResult());
        Call.setPembagian(32, 2);
        System.out.println("Hasil pembagian =" + Call.getResult());
        Call.setModulus(30, 4);
        System.out.println("Hasil modulus =" + Call.getModulus());
    }
}
