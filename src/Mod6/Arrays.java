package Mod6;

public class Arrays {
    public static void main(String[] args) {
        String[] foods = {"Pizza" , "Mashed Potatoes", "Frijoles", "Greek Salad", "Guac"};
        double[] prices = {11.99, 3.35, 4.00, 7.50, 3.33};
        int[] ratings = new int[5];
        ratings[0] = 3;
        ratings[4] = 4;

        for (int i = 0; i < foods.length; i++){
            System.out.println(foods[i] + " costs: $" + prices[i] + " rated at " + ratings[i]);
        }
    }
}
