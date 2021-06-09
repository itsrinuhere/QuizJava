
import java.util.Scanner;

class Quiz {

    private Scanner sc = new Scanner(System.in);
    private int score[] = new int[5];
    private int i = 0;

    void Enterntainment() {
        int result[] = { 1, 2, 1, 3, 4 };
        int count = 0;
        for (; i < 5; i++) {
            if (i == 0) {
                System.out.println(i + ".\twho is the prime minister of India");
                System.out.println("1.Narendra modi \t2.Rahul gandhi\n3.vajapi\t4.Manhoman singh");
            } else if (i == 1) {
                System.out.println(i + ".\twho is the cheif minister of telangana");
                System.out.println("1.kejriwal \t2.chandrashekar roa\n3.Jagan mohan \t 4.aravindh");
            } else if (i == 2) {
                System.out.println(i + ".\twho is the president Of India");
                System.out.println("1.prathiba patil \t2.Ram nadh Kovindh \n3.Manmohan singh \t 4.aravindh");
            } else if (i == 3) {
                System.out.println(i + ".\twho is the cheif minister of telangana");
                System.out.println("1.kejriwal \t2.chandrashekar roa\n3.Jagan mohan \t 4.aravindh");
            } else if (i == 4) {
                System.out.println(i + ".\twho is the cheif minister of telangana");
                System.out.println("1.kejriwal \t2.chandrashekar roa\n3.Jagan mohan \t 4.aravindh");
            }

            score[i] = sc.nextInt();
            if (score[i] == result[i]) {
                System.out.println("\n" + i + ".True");
                count++;
            } else {
                System.out.println("\n" + i + ".False");
                count--;
            }
            // score[i].equalsto(result[i]) ? "true" + count + + : "false" + count - -;
        }
        System.out.println("Result is " + count);
    }

    private void Sports() {

    }

    private void pyschology() {

    }

    private void Gs() {

    }

    Quiz() {
        System.out.println("QUiz application");
        System.out.println("*******\n1.Entertainment\t\t2.Sports\n3.General science\t4.Pyschology\n>>>>**<<<<");
        int input = sc.nextInt();
        Thread th = new Thread() {
            public void run() {
                try {
                    if (input == 1) {
                        Enterntainment();
                    } else if (input == 2) {
                        Sports();
                    } else if (input == 3) {
                        Gs();
                    } else {
                        pyschology();
                    }
                    new Quiz();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        th.start();
    }

    public static void main(String args[]) {
        new Quiz();
    }
}
