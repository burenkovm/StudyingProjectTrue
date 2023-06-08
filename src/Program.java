public class Program {
    static public  void  main (String[] args)
    {
        Counter evenNumbers = new Counter("Четные числа");
        for(int i = 1; i<= 100; i++)
        {
            if (i % 2 == 1)
            {
                evenNumbers.increace();
            }
        }
        evenNumbers.info();
    }

}
