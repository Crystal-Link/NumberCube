public class DiceProbability
{
    private PairOfDice myDice;
    private int numberOfRolls;
    private int[] distribution;
    private double[] theoreticalProb;

    public DiceProbability(int numOfRolls)
    {
        numberOfRolls = numOfRolls;

        myDice = new PairOfDice();

        int sides1 = myDice.getDie1().getNumOfSides();
        int sides2 = myDice.getDie2().getNumOfSides();

        distribution = new int[sides1 + sides2 + 1];
        theoreticalProb = new double[distribution.length];

        int rollsSoFar = 0;
        while (rollsSoFar < numberOfRolls)
        {
            distribution[myDice.roll()]++;
            rollsSoFar++;
        }
        getTheoreticalProb(sides1 ,sides2);
        printDistribution();
    }

    public void getTheoreticalProb(int s1, int s2)
    {
        int[] theoreticalOutcome = new int[distribution.length];

        for(int i = 1; i <= s1; i++)
        {
            for (int j = 1; j <= s2; j++)
                theoreticalOutcome[i + j]++;
        }

        int numOfEvents = s1 * s2;
        for (int i = 2; i < theoreticalOutcome.length; i++)
            theoreticalProb[i] = theoreticalOutcome[i]/(double)numOfEvents;
    }

    public void printDistribution()
    {
        for (int i = 2; i < distribution.length; i++)
        {
            //double experimental = (double)distribution[i]/numberOfRolls;
            System.out.print("outcome[" + i + "] = ");
            System.out.println(distribution[i]);
            //System.out.println("Experimental Probability[" + i + "] =" + experimental);
            System.out.println("Theoretical Probability[" + i + "] = " + (theoreticalProb[i] * 100) + "%");
        }
    }
}
