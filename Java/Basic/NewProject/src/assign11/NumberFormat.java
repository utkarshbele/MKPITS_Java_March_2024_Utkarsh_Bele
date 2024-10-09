package assign11;

public class NumberFormat {
    public void numberFormatStringIndex(String str) throws NumberFormatException
    {
        try {
            int a = Integer.parseInt(str);
            System.out.println(str);
        }
        catch (Exception e)
        {
            System.out.println("You get a NumberFormatException");
        }


    }
    }

