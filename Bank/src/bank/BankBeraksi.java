/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Dinda Rosa
 */
public class BankBeraksi {
    public static void main(String[] args){
        Bank abc = new Bank(100000);
        abc.getSaldo(100000);
        abc.simpanUang(500000);
        abc.ambilUang(150000);
    }
}
