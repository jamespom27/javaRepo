public class JavaVar {
//datatypes
//class level vars

    public static void main(String[] args) throws
    Exception {
        //data type varName [=value];
        int games = 3;
        double allowance = 40.50;
        long battlepass;//We define battlepass
        battlepass = 15;//We assign a value to battlepass

        //Print out out var values along with a string that explains our value
        System.out.println("Number of games I own = " + games);
        System.out.println("My monthly allowance = " + allowance);
        System.out.println("Cost of a single battlepass =" + battlepass);

        //With our current Allowance, how many battle passses will we be able to buy?
        System.out.println("With out current allowance, we should be able to buy 2 battlepasses");


        //What is the total cost of battle passes
        System.out.println("The total costs of the battle pass = " + battlepass);
    }
}
