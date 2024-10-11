/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator2;

class CafeConLeche implements Cafe {
    private Cafe cafe;

    public CafeConLeche(Cafe cafe) {
        this.cafe = cafe;
    }

    public String hacerCafe() {
        return cafe.hacerCafe() + " con leche";
    }
}