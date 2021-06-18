public class medium {
    public static void main(String[] args) {
     int sum = 0;
     int count = 1;

     while (count<=100){ // среднеарифметическое от 1 до 100
         sum = sum+count; // можно еще написать sum +=count;
         System.out.println(sum);// наглядно покажет что происходит с переменной sum
         count++;

     }
        float result = sum/(float) count;
        System.out.println(result);

    }
}
