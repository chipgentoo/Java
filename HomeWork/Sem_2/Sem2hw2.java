/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
package HomeWork.Sem_2;

import javax.sound.sampled.DataLine;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem2hw2 {
    public static int[] getArray(int length, int min, int max){
        Random rand = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) array[i] = rand.nextInt((max - min) + 1) + min;
        return array;
    }
    public static int[] bobbleSortArray(int[]array){
        // подключение логирования
        Logger logger = Logger.getLogger(Sem2hw2.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        boolean isSorted = false;
        int buf;
        int count = 0;
        while(!isSorted) {
            logger.info("Проход №" + count);
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                    logger.info(String.format("%d <=> %d", array[i], array[i + 1]));
                }
            }
            count++;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = getArray(20,1,20);
        System.out.println("Исх. массив: " + Arrays.toString(array));
        bobbleSortArray(array);
        System.out.println("Рез. массив: " + Arrays.toString(array));
    }
}
