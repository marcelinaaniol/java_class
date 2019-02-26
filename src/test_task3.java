public class test_task3 {

    static int count=0;

    test_task3()

    {
        count++;
    }

    public static void main(String[] args)

    {

        test_task3 A = new test_task3();
        test_task3 B = new test_task3();
        test_task3 C = new test_task3();
        test_task3 D = new test_task3();
        test_task3 E = new test_task3();

        System.out.println("Number of existing objects: "+count);

    }

}