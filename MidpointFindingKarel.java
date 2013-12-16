/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * MidpointFindingKarel class 
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

/*
 * Implementation algorithm used in this class is not optimal, new algorithm 
 * will be continue explored.
 * 
 * Implementation details:
 * 
 * 6 * - * -  * -> *
 *   |             |
 * 5 *   * -> *    *
 *   |   |    |    |
 * 4 *   *    *    *
 * 	 |   |    |    |
 * 3 *   *    *    *
 *   |   |    |    |
 * 2 *   *    *    *
 *   |   |         |
 * 1 *   * <- *  - *
 *   1   2    3    4
 *   
 *   a world 4 by 6, middle point is 3 using this algorithm
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {
	
	public void run() {
		
	}
	

}
