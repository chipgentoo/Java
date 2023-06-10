package Lections;

import java.util.Arrays;
public class countingSort {
    public static void countsort(int[] arr, int k)
    {
        // создаем целочисленный массив размера `n` для хранения отсортированного массива
        int[] output = new int[arr.length];

        // создать целочисленный массив размером `k + 1`, инициализированный всеми нулями
        int[] freq = new int[k + 1];

        // используя значение каждого элемента входного массива в качестве индекса,
        // сохраняем счетчик каждого целого числа в `freq[]`
        for (int i: arr) {
            freq[i]++;
        }

        // вычисляем начальный индекс для каждого целого числа
        int total = 0;
        for (int i = 0; i < k + 1; i++)
        {
            int oldCount = freq[i];
            freq[i] = total;
            total += oldCount;
        }

        // копируем в выходной массив, сохраняя порядок входов с одинаковыми ключами
        for (int i: arr)
        {
            output[freq[i]] = i;
            freq[i]++;
        }

        // копируем выходной массив обратно во входной массив
        Arrays.setAll(arr, i -> output[i]);
}
    public static void main(String[] args){
        int[] arr = { 4, 9, 7, 2, 6, 10, 8, 3, 1, 4, 2, 1, 10, 5, 7, 6, 5, 9, 8, 3 };
        // диапазон элементов массива
        int k = 10;
        countsort(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
