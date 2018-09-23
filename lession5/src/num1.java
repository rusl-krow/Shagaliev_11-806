import java.util.Scanner;

public class num1 {

    public static double sum(double k1, double k2) {
        double k;
        k = k1 + k2;
        return k;
    }

    public static double min(double k1, double k2) {
        double k;
        k = k1 - k2;
        return k;
    }

    public static double umn(double k1, double k2) {
        double k;
        k = k1 * k2;
        return k;
    }

    public static double del(double k1, double k2) {
        double k;
        k = k1 / k2;
        return k;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q=1;
        double ans=0;
        System.out.println("Введите первое число:");
        double n1 = sc.nextDouble();
        System.out.println("Введите аргумент:");
        String arg = sc.next();
        System.out.println("Введите второе число:");
        double n2 = sc.nextDouble();
        if (arg.equals("+")) {
            ans = sum(n1, n2);
            System.out.println("Ответ:");
            System.out.println(ans);
        }
        if (arg.equals("-")) {
            ans = min(n1, n2);
            System.out.println("Ответ:");
            System.out.println(ans);
        }
        if (arg.equals("*")) {
            ans = umn(n1, n2);
            System.out.println("Ответ:");
            System.out.println(ans);
        }
        if (arg.equals("/")) {
            ans = min(n1, n2);
            System.out.println("Ответ:");
            System.out.println(ans);
        }
        System.out.println("Продолжить работу? y/n");
        String prod = sc.next();
        if (prod.equals("y")) {
            q = 1;
        } if(prod.equals('n')) {
            q = 0;
        }
        while (1 == 1) {
            if(q==1)
            {n1=ans;
            System.out.println("Введите аргумент:");
            arg = sc.next();
            System.out.println("Введите второе число:");
            n2 = sc.nextDouble();

            if (arg.equals("+")) {
                ans = sum(n1, n2);
                System.out.println("Ответ:");
                System.out.println(ans);
            }
            if (arg.equals("-")) {
                ans = min(n1, n2);
                System.out.println("Ответ:");
                System.out.println(ans);
            }
            if (arg.equals("*")) {
                ans = umn(n1, n2);
                System.out.println("Ответ:");
                System.out.println(ans);

            }
            if (arg.equals("/")) {
                ans = min(n1, n2);
                System.out.println("Ответ:");
                System.out.print(ans);
            }
            System.out.println("Продолжить работу? y/n");
            prod = sc.next();
            if (prod.equals("y")) {
                q = 1;
            } if(prod.equals("n")){
                q = 0;
            }}
            if(q==0)
            {
                System.out.println("Введите первое число:");
                n1=sc.nextDouble();
                System.out.println("Введите аргумент:");
                arg = sc.next();
                System.out.println("Введите второе число:");
                n2 = sc.nextDouble();

                if (arg.equals("+")) {
                    ans = sum(n1, n2);
                    System.out.println("Ответ:");
                    System.out.println(ans);
                }
                if (arg.equals("-")) {
                    ans = min(n1, n2);
                    System.out.println("Ответ:");
                    System.out.println(ans);
                }
                if (arg.equals("*")) {
                    ans = umn(n1, n2);
                    System.out.println("Ответ:");
                    System.out.println(ans);
                }
                if (arg.equals("/")) {
                    ans = min(n1, n2);
                    System.out.println("Ответ:");
                    System.out.print(ans);
                }
                System.out.println("Продолжить работу? y/n");
                prod = sc.next();
                if (prod.equals("y")) {
                    q = 1;
                } if(prod.equals("n")){
                q = 0;
            }
            }
        }

    }

}


