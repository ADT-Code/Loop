public class Loop {
    public static void main(String[] args) {
        int a = 1000;
        while (a >= 0) { // пока а больне или равно 1000
            if (a % 2 == 0) { // если отаток от деления на 2 а = 0 то
                System.out.println(a);
            }
            a--;
        }
    }
}
