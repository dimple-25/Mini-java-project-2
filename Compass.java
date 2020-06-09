package compass;

public class Compass {

String[] dir = new String[] {"NORTH","EAST","SOUTH","WEST"};
int i=0,objectNum,gSequenceNumber=0;
String state;
Compass()
{
	//objectNum=gSequenceNumber;
	//gSequenceNumber++;
	//System.out.println("Object no. :" + objectNum);
	state="NORTH";
	System.out.println("initial state : "+state);
}

public void rotate()
{
	if(i<3)
	{
		++i;
	}
	else
	{
		i=0;
	}
	state=dir[i];
}
public void print()
{
	System.out.println("state : "+state);
}
}
