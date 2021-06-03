import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test class for BookStore.
 */
public class RestaurantQualityTest {

  RestaurantQuality rq = new RestaurantQuality();

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testInitializingConstructor() {
    RestaurantQuality rq1 = new RestaurantQuality(700, 1000);

    // test size
    assertEquals(700, rq1.ratings.length);
    for(int i = 0; i < rq1.ratings.length; i++) {
      assertEquals(1000, rq1.ratings[i].length);
    }

    // test that ratings are in valid range
    int minRating = Integer.MAX_VALUE;
    int maxRating = Integer.MIN_VALUE;
    for(int i = 0; i < rq1.ratings.length; i++) {
      for(int j = 0; j < rq1.ratings[i].length; j++) {
        assertTrue(rq1.ratings[i][j] >= 1 && rq1.ratings[i][j] <= 5);

        // keep track of minimum and maximum rating values
        if(rq1.ratings[i][j] < minRating) {
          minRating = rq1.ratings[i][j];
        }
        if(rq1.ratings[i][j] > maxRating) {
          maxRating = rq1.ratings[i][j];
        }
      } // for j
    } // for i

    // the array is big enough that we should have at least one 
    // 1 and at least one 5
    assertEquals(minRating, 1);
    assertEquals(maxRating, 5);
  }

  @Test
  public void testGet5StarRestaurants() {
    int[] data = {0, 1, 3, 4, 5};
    ArrayList<Integer> expected = new ArrayList<>();
    for(int i : data) {
      expected.add(i);
    }

    assertEquals(expected, rq.get5StarRestaurants());
  }

  @Test
  public void testGetAverageRating() {
    assertEquals(3.21, rq.getAverageRating(), 0.01);
  }

  @Test
  public void testGetExcellentRestaurants() {
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(0);

    assertEquals(expected, rq.getExcellentRestaurants());
  }

  /**
   * Test launcher.
   *
   * @param args Command-line arguments; ignored by 
   * this application
   */
  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("RestaurantQualityTest");
  }
}