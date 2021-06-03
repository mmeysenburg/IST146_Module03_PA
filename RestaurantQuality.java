import java.util.ArrayList;
import java.util.Random;

public class RestaurantQuality {
  /**
   * 2D array of ints representing restaurant quality.
   * Rows represent restaurants, columns years. Each entry 
   * is an int in the closed range [1, 5].
   */
  int[][] ratings;

  /**
   * Default constructor. Make a new RestaurantQuality object 
   * filled with the data shown in the assignment.
   */
  public RestaurantQuality() {
    int[][] data = { {5, 5, 5, 5}, 
      {2, 1, 5, 1},
      {3, 1, 3, 1},
      {3, 2, 5, 3},
      {5, 3, 2, 2},
      {3, 3, 5, 4}};

    ratings = new int[6][4];
    for(int row = 0; row < ratings.length; row++) {
      for(int col = 0; col < ratings[row].length; col++) {
        ratings[row][col] = data[row][col];
      } // for col
    } // for row 
  } // Default constructor

  /**
   * Initializing constructor. Make a new RestaurantQuality
   * object with the specified number of rows and columns,
   * filled with random values in [1, 5].
   * 
   * @param numRestaurants Number of restaurants to create.
   * @param numYears Number of years of ratings for each 
   * restaurant. 
   */
  public RestaurantQuality(int numRestaurants, int numYears) {
    // TODO: finish constructor 

  } // Initializing constructor

  /**
   * Find all restaurants that have had a 5-star rating 
   * at any time.
   * 
   * @return ArrayList containing the indices of all 
   * restaurants that have had at least one 5-star rating. 
   * The list does not contain duplicates - e.g., if 
   * restaurant 3 had 4 years of 5-star ratings, it only
   * appears in the returned list one time.
   */
  public ArrayList<Integer> get5StarRestaurants() {
    ArrayList<Integer> results = new ArrayList<>();

    // TODO: implement this method


    return results;
  }

  /**
   * Calculate the mean rating for all restaurants over all 
   * years.
   *
   * @return Average rating for all the data.
   */
  // TODO: write the entire getAverageRating() method.
  // The code will not compile, test, or run until you write this. 

  /**
   * Find all restaurants that had 5-star ratings for every year.
   * 
   * @return ArrayList containing the indices of all restaurants
   * that had 5-star ratings for each year.
   */
  public ArrayList<Integer> getExcellentRestaurants() {
    // TODO: write this method 

  }
}