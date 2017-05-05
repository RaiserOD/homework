Домашнее задание:

1-я часть

bitwise operators - https://en.wikipedia.org/wiki/Bitwise_operation

Заполнить таблицу истинности для операторов & (AND), | (OR), ^ (XOR) и ~ (NOT). Скопируйте таблицу из этого файла, в README.md вашей директории с ДЗ


| Left | Op | Right | Result |
| :---:  | :---:  | :---:  | :---:  |
| AND |  |  |  |
| 0 | & | 0 | 0 |
| 0 | & | 1 | ? |
| 1 | & | 0 | ? |
| 1 | & | 1 | ? |
| OR |  |  |  |
| 0 | \| | 0 | ? |
| 0 | \| | 1 | ? |
| 1 | \| | 0 | ? |
| 1 | \| | 1 | ? |
| XOR |  |  |  |
| 0 | ^ | 0 | ? |
| 0 | ^ | 1 | ? |
| 1 | ^ | 0 | ? |
| 1 | ^ | 1 | ? |
| NOT |  |  |  |
| n/a  | ~ | 0 | ? |
| n/a  | ~ | 1 | ? |

2-я часть

Напишите класс `BitwiseCalc` и реализуйте следующие методы:

```java
public String and(String binaryLeft, String binaryRight)
public String or(String binaryLeft, String binaryRight)
public String xor(String binaryLeft, String binaryRight)
public String not(String binary)
```
Напишите несколько примеров каждого метода использования в методе main.

> Вы можете создать класс `BitwiseCalc`, добавить в него метод `main`, в котором можно будет получить инстанс `BitwiseCalc` используя оператор `new`.

3-я часть

Напишите класс `ArraysCopier` с конструктором, который принимает массив целых чисел в качестве параметра. Добавьте и реализуйте следующие методы:

```java
public int[] copyOf(int newLength) // возвращает новый массив указанной длины.
public int[] copyOfRange(int from, int to) // возвращает новый массив начиная с элемента from до элемента to
public int[] fill(int value) // возвращает новый массив заполненный значением параметра value
```

В случае неверных значений параметров, возвращайте `null`.

Напишите несколько примеров каждого метода использования в методе main.

> Используйте циклы для копирования массива.

> Используйте метод `Arrays.toString(int[] a)` для вывода полученного массива в методе `main`.

> Обратите внимание на то, что данный класс является `immutable`, так как ни один из его методов не меняет внутреннего состояния объекта


4-я часть

- Создайте класс для работы с "Треугольником Паскаля" высотой {n}, где n - задается через конструктор, при создании класса.
Класс должен содержать следующие методы:
```java
public void print() // печатает в консоль треугольник Паскаля
public void print(String filter) // где переменная filter может быть "EVEN" или "ODD". Печатает треугольник Паскаля, заменяет четные или нечетные числа символами на ваше усмотрение, например пробел или `..`
```

> Подробнее о Треугольнике Паскаля http://www.mathsisfun.com/pascals-triangle.html

- Создайте класс для работы с двумерными массивами. Назовите его `ArraysUtils` со следующими методами:
```java
public static boolean areEqual(int[][] arr1, int[][] arr2) // возвращает true если двумерные массивы одинаковы.
public static int[] linearize(int[][] arr) // "Распрямляет" двумерный массив. Например из {{1, 2}, {1, 2}} делает {1, 2, 1, 2}
public static int[][] createSpiral(int n, int m) // создает и заполняет двумерный массив размерности [n][m] по спирали
public static int[][] transpose(int[][] arr) // Если представить двумерный массив как матрицу из R столбцов и C строк, то результатом будет "матрица" [C][R]
public static void print(int[][] arr) // печатает двумерный массив в консоль
```

> Подробнее о transpose https://en.wikipedia.org/wiki/Transpose

> Заполненный по "спирали" двумерный массив выглядит так (для размерности 4 на 4)
```java
[[1, 2, 3, 4],
 [12,13,14,5],
 [11,16,15,6],
 [10,9, 8, 7]]
```

5-я часть

- Придумайте и создайте два класса: `Book` и `Author` для "книжного магазина". Поля классов на ваше усмотрение. К примеру это может быть название и цена книги, имя и имейл автора. При создании класса `Book` учтите ситуацию, когда авторов книги может быть несколько.

- Напишите методы `equals` и `toString` для классов `Book` и `Author`.

- Создайте класс Main, в котором будет метод main(String ...args). Cоздайте несколько экземпляров книг, авторов. Напишите примеры использования методов `equals` и `toString`.