public class BasicArray
{
    final static int LIMIT = 15;
    final static int MULTIPLE = 10;
    public static void main(String[] args)
    {
        int[] list = new int[LIMIT];
        for (int index = 0; index < LIMIT; index++)
        {
            list[index] = index * MULTIPLE;
        }
        list[5] = 999;
        for (int index = 0; index < LIMIT; index++)
        {
            System.out.print(list[index] + " ");
        }
        System.out.println();

        //added code
        String name = "SHAYLA";
        int limit = name.length();
        char[] letters = new char[limit];

        for (int index = 0; index < limit; index++)
        {
            letters[index] = name.charAt(index);
            System.out.print(letters[index] + " ");
        }
        System.out.println();
    }
}