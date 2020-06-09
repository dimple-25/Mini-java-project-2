Problem Statement:

If we go for hiking, we may need a compass to give us the directions. A Compass object will be endowed with two distinct behaviours, one called rotate, which will change the state of a Compass object by advancing the value of its state variable in the clockwise direction, and one called print, which will announce its orientation by printing a string to standard output, "NORTH" for NORTH, and so on.

Initially, objects of type Compass will have only one data member to record their states, and that member will be allowed to assume only four distinct values, NORTH, EAST, SOUTH and WEST. Since it can take on only an enumerated set of values you will represent it with an enum.

In addition you are required to provide for initialization of Compass objects through a constructor which sets the state variable (a.k.a. data member) to the value NORTH.
