public class Roman
{
    public static int convert(String romanNumeral)
    {
        if ("IV".equals(romanNumeral))
            return 4;
        else if ("IX".equals(romanNumeral))
            return 9;
        else if ("XL".equals(romanNumeral))
            return 40;
        else if ("XC".equals(romanNumeral))
            return 90;
        else if ("CD".equals(romanNumeral))
            return 400;

        int total = 0;
        int length = romanNumeral.length();
        for (int i = 0; i < length - 1; i++)
        {
            int curr = convertSingleDigit(romanNumeral.substring(i,i+1));
            int next = convertSingleDigit(romanNumeral.substring(i+1,i+2));

            if (curr >= next)
            {
                total += convertSingleDigit(romanNumeral.substring(i, i + 1));
            }
            else
            {
                total -= convertSingleDigit(romanNumeral.substring(i, i + 1));
            }
        }

        return total + convertSingleDigit(romanNumeral.substring(length-1, length));
    }

    private static int convertSingleDigit(String romanNumeral)
    {
        if ( "I".equals(romanNumeral) )
        {
            return 1;
        }
        else if ( "V".equals(romanNumeral) )
        {
            return 5;
        }
        else if ( "X".equals(romanNumeral))
        {
            return 10;
        }
        else if ( "L".equals(romanNumeral))
        {
            return 50;
        }
        else if ( "C".equals(romanNumeral))
        {
            return 100;
        }
        else if ( "D".equals(romanNumeral) )
        {
            return 500;
        }
        else
        {
            return 1000;
        }
    }
}
