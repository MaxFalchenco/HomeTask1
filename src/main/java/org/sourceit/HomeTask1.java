package org.sourceit;

import java.util.Random;

public class HomeTask1 {

    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number)
    {
        if ( number % 2 == 0)
            return true;
        else
            return false;
    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse(double a, double b)
    {
        if( a <= 0 || b <= 0 )
            return 0;

        double c;
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return c;
    }

    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter(double a, double b, double c)
    {
        double perimetr;
        perimetr = a + b + c;
        return perimetr;
    }

    /**
     * Метод находит площадь треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area(double a, double b)
    {
        double s;
        s = ( 1.0 / 2) * a * b;
        return s;
    }

    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max)
    {
        Random rnd = new Random(System.currentTimeMillis());
        int number;
        number = min + rnd.nextInt(max - min + 1);

        return number;
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number)
    {
        long sum =0;

        if (number > 0)
        {
            while ( number > 0)
            {

                sum = sum + (number % 10);
                number /= 10;

            }
        }else
        if ( number < 0)
        {
            while ( number < 0)
            {

                sum = sum + (number % 10);
                number /= 10;

            }
        }

        return sum;
    }

    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till)
    {
        int part_1 =1 ;
        int part_2 = 1;
        int part_3 = 0;

        while ( till > part_3)
        {

            part_3 = part_1 + part_2;

            if ( part_3 > till )
            {

                part_3 = part_2;
                break;

            }

            part_1 = part_2;
            part_2 = part_3;

        }

        return part_3;
    }

    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket)
    {
        int i;
        long first_part = 0;
        long second_part = 0;

        long [] arr_ticket = new long[6];

        for (i = 0  ; i <= 6 - 1 ; i++)
        {
            arr_ticket [i] = ticket % 10;
            ticket /= 10;
        }

       /* for (i = 0; i<= 6 - 1 ; i++)
             System.out.println(arr_ticket[i]);*/

        for (i = 0; i <= 2; i++)
            first_part = first_part + arr_ticket[i];

        for (i = 3; i <= 6 - 1; i++)
            second_part = second_part + arr_ticket[i];

        /* System.out.println(" ");
         System.out.println(" ");
         System.out.println(first_part);
         System.out.println(second_part);*/

        if (first_part == second_part)
            return true;
        else
            return false;
    }
}
