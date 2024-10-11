package decorator2;


public class Decorator2 {
    public static void main(String[] args) {
        Cafe cafe = new CafeBasico();
        System.out.println(cafe.hacerCafe()); // Café simple

        Cafe cafeConLeche = new CafeConLeche(cafe);
        System.out.println(cafeConLeche.hacerCafe()); // Café simple con leche
    }
}