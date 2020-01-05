package linear_Structure.recursion.fibonacci;

public class Febonacci {

    public static void main(String[] args) {
        //斐波那契数列：1 1 2 3 5 8 13 21
        int febonacci = febonacci(6);
        System.out.println(febonacci);
    }

    //打印第n个斐波那契数
    public static int febonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return febonacci(i - 1) + febonacci(i - 2);
        }
    }

}
