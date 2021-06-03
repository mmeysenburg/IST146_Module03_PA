/**
 * Main method for IST 146 PA 3.
 */
public class Main {
  /**
   * Application entry point. Instantiates a RestaurantQuality object
   * and tests its three methods.
   *
   * @param args Command-line arguments; ignored by this app
   */
  public static void main(String[] args) {
    // default data
    RestaurantQuality rq = new RestaurantQuality();
    System.out.println("Default data:");
    System.out.printf("\tRestaurants with at least one five star " +
      "rating: %s\n", rq.get5StarRestaurants());
    System.out.printf("\t Average rating: %.2f\n", rq.getAverageRating());
    System.out.printf("\tRestaurants will all five star ratings: %s\n",
      rq.getExcellentRestaurants());

    // random data
    rq = new RestaurantQuality(7, 10);
    System.out.println("\nRandom data:");
    System.out.printf("\tRestaurants with at least one five star " +
      "rating: %s\n", rq.get5StarRestaurants());
    System.out.printf("\t Average rating: %.2f\n", rq.getAverageRating());
    System.out.printf("\tRestaurants will all five star ratings: %s\n",
      rq.getExcellentRestaurants());

  }
}
