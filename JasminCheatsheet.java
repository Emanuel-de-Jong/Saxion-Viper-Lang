public class JasminCheatsheet {
    public static void main(String[] args) {
        // 0000000000
        System.out.println("Hello World!");


        // 1111111111
        25 - 5 * 6 + 15;


        // 2222222222
        int a = 5;
        int b = 6;
        int c = 25 - (a * b) + 15;


        // 3333333333
        int input = 12;
        boolean b = input % 2 == 0;
        if (b) {
            System.out.println("Value is even!");
        } else {
            System.out.println("Value is odd!");
        }


        // 4444444444
        int input = 12;
        int input2 = 4;
        if (input > 10) {
            System.out.println("Input1 is large!");
        } else if (input2 < 5) {
            System.out.println("Input2 is small!");
        }


        // 5555555555
        int sum = 0;
        int i = 0;
        while (i < 10) {
            sum += i;
            i++;
        }


        // 6666666666
        int a = 10;
        double b = ((a + 5.0d) * a - 2.0d) / 3.0d;
        boolean c = true;


        // 7777777777
        System.out.println("Enter your name: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.print("Hello, ");
        System.out.println(name);


        // 8888888888
        Exercise8 e = new Exercise8();
        e.setValueOne(42);
        System.out.println(e.getSumOfValues());
    }
}


public class Exercise8 {
    private int valueOne;
    private int valueTwo;

    public Exercise8() {
        valueTwo = 99;
    }

    public void setValueOne(int a) {
        valueOne = a;
    }

    public int getSumOfValues() {
        return valueOne + valueTwo;
    }
}