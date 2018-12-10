public class PairOfDice
{
    private NumberCube die1;
    private NumberCube die2;

    public PairOfDice()
    {
        die1 = new NumberCube();
        die2 = new NumberCube();
    }

    public PairOfDice(int side1, int side2)
    {
        die1 = new NumberCube(side1);
        die2 = new NumberCube(side2);
    }

    public PairOfDice(int sides)
    {
        die1 = new NumberCube(sides);
        die2 = new NumberCube(sides);
    }

    public PairOfDice(PairOfDice other)
    {
        this.die1 = other.die1;
        this.die2 = other.die2;
    }

    public NumberCube getDie1()
    {
        return die1;
    }

    public NumberCube getDie2()
    {
        return die2;
    }

    public int roll()
    {
        return (die1.roll() + die2.roll());
    }
}
