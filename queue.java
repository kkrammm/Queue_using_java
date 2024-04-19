import java.util.Scanner;

public class queue
{
    private static String[] Queue = new String[5];
    private static int front = 0;
    private static int capacity = 0;

    static void Enqueue(String x)
    {

    }

    static Boolean isFull()
    {
        

    }
    static Boolean isEmpty()
    {
        return front ==

    }


    public static void main(String[] args)
    {
        String x = "";
        System.out.println("---Menu---");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Front");
        System.out.println("4. Print");
        System.out.println("5. Exit");
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter the choice:");
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                    System.out.println("\nEnter the element to enqueue: ");
                    x = sc.nextLine();
                    Enqueue(x);
                    break;
                case 2:
                    String y = Dequeue();
                    System.out.println("\nThe dequeued element is "+ y);
                    break;
                case 3:
                    String z = Front();
                    System.out.println("\nThe Front element is "+z);
                    break;
                case 4:
                    Print();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nEnter the valid choice...");            
            }
        }

    }
}