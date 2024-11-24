/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Dinda Rosa
 */
public class MatematikaCanggih extends Matematika {
    private int Modulus;
    void setModulus(int a, int b){
        Modulus = a%b;
    }
    int getModulus(){
        return Modulus;
    }
}
