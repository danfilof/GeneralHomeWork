package ru.gb;

import java.util.Random;
import java.util.Scanner;



    public class TicTacToe {
        public static int SIZE = 3; // Объявляем переменные для: пустого значения, крестика, нолика, игрового поля, сканнера для считвания написанного игроком в консоль, рандомное значение для хода
        public static int DOTS_TO_WIN = 3;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();
        public static int diagonalValue = 0; // Вводим переменные обозночающие количество крестиков и ноликов по-вертикали, по-горизонтали и по диагоналям
        public static int reverseDiagonalValue = 0;
        public static int xAxisValue = 0;
        public static int yAxisValue = 0;

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) { // Запускаем цикл, где, покуда значение boolean += true, выполняются условия
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) { // Если в методе checkWin переменная symb имеет значение крестика, побеждает человек и цикл прерывается
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) { // Если поле полностью заполнено, написать в консоль, что это - ничья и завершить цикл
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) { // Если в методе checkWin переменная symb имеет значение нолика, побеждает машина и цикл прерывается
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) { // Если поле полностью заполнено, написать в консоль, что это - ничья и завершить цикл
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена"); // В конце сообщить в консоль, что игра закончена
        }

        public static boolean checkWin(char symb) {
            if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true; // Выписываем все возможные комбинации для поля 3х3. Если одно из условий срабатывает, возвращаем true
            if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
            if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
            return false;

// Это моя попытка улучшить метод проверки победы

            for (int i = 1; i < SIZE; i++) { // Запускаем цикл по строчкам

                   if (map[i][i] == DOT_X) { // Если в точке находится крестик, увеличивать значение переменной на 1

                   diagonalValue = diagonalValue + 1;

                   } if (map[i][map.length - 1 - i] == DOT_X) { // Если в точке находится крестик, увеличивать значение переменной на 1

                   reverseDiagonalValue = reverseDiagonalValue + 1;

                   } if (map[i][i] == map[i][i + 1]) { // Если соседние ячейки совпадают горизонтально, увеличивать значение переменной на 1

                   xAxisValue = xAxisValue + 1;

                   } if (map[i][i] == map[i + 1][i]) { // Если соседние ячейки совпадают вертикально, увеличивать значение переменной на 1

                   yAxisValue = yAxisValue + 1;

                   }

            }

            if ((diagonalValue | reverseDiagonalValue | xAxisValue | yAxisValue) == SIZE) return true; // Если значение одной из переменных будет равно длине стороны массива - победа, вернуть true

            for (int i = 1; i < SIZE; i++) {

                   if (map[i][i] == DOT_O) { // Если в точке находится нолик, увеличивать значение переменной на 1

                   diagonalValue = diagonalValue + 1;

                   } if (map[i][map.length - 1 - i] == DOT_O) { // Если в точке находится нолик, увеличивать значение переменной на 1

                   reverseDiagonalValue = reverseDiagonalValue + 1;

                   } if (map[i][i] == map[i][i + 1]) { // Если соседние ячейки совпадают горизонтально, увеличивать значение переменной на 1

                   xAxisValue = xAxisValue + 1;

                   } if (map[i][i] == map[i + 1][i]) { // Если соседние ячейки совпадают вертикально, увеличивать значение переменной на 1

                   yAxisValue = yAxisValue + 1;

                   }

            }
            if ((diagonalValue | reverseDiagonalValue | xAxisValue | yAxisValue) == SIZE) return true; // Если значение одной из переменных будет равно длине стороны массива - победа, вернуть true

            return false;

        }

        public static boolean isMapFull() { // Проверка на заполненность поля - если все поля заполнены '•', вернуть false
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

        public static void aiTurn() { // Этот метод создает ход копьютера в ответ на ход игрока. Значение x и y выбираются методом, объявленым ранее
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }

        public static void humanTurn() { // Из консоли выводятся значения, введенные пользователем. Они уменьшаются на 1, так как массив начинается с нуля
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = DOT_X;
        }

        public static boolean isCellValid(int x, int y) { // Метод уточняет, можно ли занять ячейку, уточняя, есть ли в ней '•'
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (map[y][x] == DOT_EMPTY) return true;
            return false;
        }

        public static void initMap() { // Метод заполняет поле '•'
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() { // Метод создает поле и печатает его в консоль
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();

            }
        }
    }

