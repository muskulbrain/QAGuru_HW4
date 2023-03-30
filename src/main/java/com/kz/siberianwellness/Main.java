package com.kz.siberianwellness;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        //Арифметические операторы
        //Сложение
        System.out.println("a + b = " + (a + b));
        //Вычитание
        System.out.println("a - b = " + (a - b));
        //Деление
        System.out.println("a / b = " + (a / b));
        //Умножение
        System.out.println("a * b = " + (a * b));
        //Остаток от деления
        System.out.println("b % a = " + (b % a));

        //Логические операторы
        //Равенство
        boolean z = a == b;
        System.out.println("a==b = " + z);
        //Отрицание !
        boolean x = a != b;
        System.out.println("a!=b = " + x);
        //Логическое И (&)
        boolean v = ((a > 0) & (b > 0));
        System.out.println v; // Вернет true, так как оба равернства верны
        //Условное И (&&)
        boolean v = ((a < 0) && (b > 0));
        System.out.println v; // Вернет false, так как операнд, находящийся слева от & является false, и второй операнд не проверяется
        //Логическое ИЛИ (|)
        boolean v = ((a < 0) | (b > 0));
        System.out.println v; //Вернет true
        // Условное ИЛИ (||)
        boolean v = ((a > 0) | (b < 0));
        System.out.println v; //Вернет true
        //Логическое исключающее ИЛИ (^)
        boolean v = ((a < 0) | (b == 0));
        System.out.println v; //Вернет false, потому что оба операнда равны false


        v = ((a >= 50) && (b > c));
        if v == true {
            System.out.println("Правда");
        } else{
            System.out.println("Ложь"); //Выведет ложь
        }
                //https://javarush.com/groups/posts/logicheskie-operacii-v-java

        //Переполнение
        int g = Integer.MIN_VALUE;
        System.out.println(g - 1);


        //вычисления комбинаций типов данных (int и double)
        double d = 3.14;
        System.out.println(g + d);


            }


        }


