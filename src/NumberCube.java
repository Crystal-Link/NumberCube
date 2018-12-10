public class NumberCube
{
    private int numOfSides;
    public static final int MIN_SIDES = 4;
    public static final int MAX_SIDES = 20;
    public static final int DEFAULT_SIDES = 6;

    public NumberCube()
    {
        numOfSides = DEFAULT_SIDES;
    }

    public NumberCube(int sides)
    {
        if (sides < MIN_SIDES || sides > MAX_SIDES)
            numOfSides = DEFAULT_SIDES;
    }

    public int getNumOfSides()
    {
        return numOfSides;
    }
    public int roll()
    {
        return (int)(Math.random() * numOfSides) + 1;
    }
}
