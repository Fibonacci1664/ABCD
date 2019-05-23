package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
	    int x = 3;

	    while (x > 0)
        {
            if (x > 2)
            {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 2)
            {
                System.out.print("b c");
            }

//            x = x - 1;                        // There is no need for this second piece of code that deducts 1 from x and prints a hyphen, although it doesn't break the code and still outputs the
//            System.out.print("-");            // exact same result, the while loop achieves this and thus removes the duplicated code, if this code was left in you could remove the while loop as
                                                // it is that that becomes unnecessary.
            if (x == 1)
            {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
