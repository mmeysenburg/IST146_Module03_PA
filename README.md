# IST146_Module03_PA

Now that you have gotten your hands on some Java coding with the Module 3 Hands-On Activity (HOA 3), it is time to put your skills to the test in this module's Programming Assignment (PA 3). In this PA, you will finish the implementation of a class that encapsulates the change in quality ratings of various restaurants over several years. Restaurant ratings are represented by a number of stars, which vary from one (worst quality) to five (best quality).

To complete this PA, look for the "TODO" comments and complete the indicated methods in the `RestaurantQuality.java` file.

## Instructions

1. Log on to your replit account. 
2. Click the "+ New repl" button to create a new repl. 
3. Click on the "Import from GitHub" tab. 
4. Type or paste the following URL into the "Paste any repository URL" text field: 
`github.com/mmeysenburg/IST146_Module03_PA`
5. Click on the "Import from github" button.
6. Click the "Done" button in the ".replit" dialog that appears.
7. From the "Console" tab, enter the following command: `rm .replit` *If you omit this step, the "Run" button will not work as it should!*
8. Select the `RestaurantQuality.java` file. Search for the keyword "TODO", and write the specified code.
9. At any time you can run the code from the user's perspective, or, from a developer's point of view, execute the unit tests that have been provided.
    * To run the code, click the "Run" button.
    * To execute the unit tests, enter the following command in the "Console" tab: bash test.sh
10. Once you have completed the code correctly, the unit tests should pass, and running the code should produce results that make sense.
11. When you are finished, submit your `RestaurantQuality.java` file via the HOA 3 Canvas assignment.


## Files in the repository

* `RestaurantQuality.java`: Class encapsulating restaurant ratings; this is the only file you should modify
* `RestaurantQualityTest.java`: JUnit4 unit tests for the `RestaurantQuality` class. These tests are executed when you enter the `bash test.sh`
command.
* `LICENSE`: GNU General Public License v3.0 for these materials.
* `Main.java`: Main program to run the code from a user's perspective. This file's `main()` method is invoked when you click the "Run" button.
* `README.md`: This README file.
* `test.sh`: Bash script to execute the JUnit4 unit tests in `RestaurantQualityTest.java`.

