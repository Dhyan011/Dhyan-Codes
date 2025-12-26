import java.util.Scanner;

class practise {
    int sum() {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int result = (a + b + c) / 3;
        return result;
    }

        void Grade (int result) {
            if (result >= 80) {
                System.out.println("the grade is A");
            } else {
                System.out.println("the grade is B");
            }
            }



        public static void main (String[]args){
            practise obj = new practise();
            int result = obj.sum();
            System.out.println("the result is " + result);
            obj.Grade(result);
        }

    }
