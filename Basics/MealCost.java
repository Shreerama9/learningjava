public class MealCost {

	public static void TotalMealCost(double tiprate, double taxrate, double ListedMealPrice) {
		double tip = tiprate * ListedMealPrice;
		double tax = taxrate * ListedMealPrice;

		double result = tip + tax + ListedMealPrice;
		System.out.println("Total Tip should be payed : " + result);

	}

	public static void main(String[] args) {
		TotalMealCost(.2, .5, 500);

	}
}