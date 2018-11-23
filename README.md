# Mars com.codurance.com.codurance.Rover

A robotic rover is landed by NASA on a plateau on Mars. 
This plateau, which is curiously rectangular, must be navigated by the rover so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.

A rover's position and location is represented by a combination of x and y co-ordinates 
and a letter representing one of the four cardinal compass points. 


The plateau is divided up into a grid to simplify navigation. An example rover might be 1, 1, N, 
which means the rover is in the bottom left corner and facing com.codurance.cardinal.North.
In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading.

Assume that the square directly cNorth from (x, y) is (x, y+1).
The rover wraps around if it reaches the end of the grid.
(Optional)The grid may have obstacles. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point and reports the obstacle e.g. O 2 2 N

#### INPUT:

The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 1,1.

The rest of the input is information about the rover. The first line gives the rovers starting rover, and the second line is a series of instructions telling the rover how to explore the plateau.
The rover is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rovers orientation.

#### OUTPUT:

The output for each rover should be its final co-ordinates and heading.

#### INPUT AND OUTPUT:

##### Test Input:
5 5
1 2 N
LMLMLMLMM


##### Expected Output:
1 3 N
