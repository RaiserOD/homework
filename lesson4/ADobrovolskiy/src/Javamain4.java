public class Javamain4
{

//#Объявление трех переменных
  static int a = 0;
  static Float fl = 1.0f;
  static String st = "Test";

//# Вывод переменных на экран;
  public static void main(String[] args)
  {
      System.out.println("________________________");
      System.out.println("Создание трех переменных:");
      System.out.println("Переменная Int = " + a);
      System.out.println("Переменная Float = " + fl);
      System.out.println("Переменная String = " + st);
      System.out.println("__________________");

//#Вызов строки с символами "*****" через вызов метода "strMethod";
      System.out.println("Вызов метода 5 раз: ");
      for (int i = 1; i!=6; i++){
           strMethod("*****", i);}

//#Вызов строки с символами "*****" 5 раз, через вызов метода "strMethodFor";
      System.out.println("____________________________");
      System.out.println("Вывод строки 5 раз через For:");
      strMethodFor("*****");

//#Вызов функции оределиния <високосного> года в интервале с 2001 - 2017;
      System.out.println("___________________________________________");
      System.out.println("Определение високосного/не високосного года:");
      functionLeapYear(2001);

//#Вызов функции оределиния <високосного> года в интервале с 2001 - 2017;
      System.out.println("__________________________________");
      System.out.println("Цикл 'Do - While' с выводом строки:");
//#Бесконечный цикл 'Do-While' с выходом 'Break' после пяти вроходов;
      functionDoWhileBreak();
//#

      String binNumber1 = "10011011";
      System.out.println("______________________________________________________________");
      System.out.println("Преобразование числа из 2й системы в 10ю <Positional Notation>:");
      System.out.print(binNumber1 + "  >>>  ");
      System.out.println(convertBinToDec1(binNumber1));

      String binNumber2 = "1011001";
      System.out.println("__________________________________________________________");
      System.out.println("Преобразование числа из 2й системы в 10ю <Doubling Method>:");
      System.out.print(binNumber2 + "  >>>  ");
      int test = convertBinToDec2(binNumber2);
      System.out.println(String.valueOf(test));


      System.out.println("_________________________________________________________________");
      System.out.println("Преобразование числа из 10й системы в 2ю <SD by 2 with Remainder>:");
      int decNumber1 = 100;
      System.out.print(decNumber1 + "  >>>  ");
      System.out.println(convertDecToBin1(decNumber1));

      System.out.println("__________________________________________________________________");
      System.out.println("Преобразование числа из 10й системы в 2ю <DP of 2 and Subtraction>:");
      int decNumber2 = 156;
      System.out.print(decNumber2 + "  >>>  ");
      System.out.println(convertDecToBin2(decNumber2));


  }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//Methods ...

  public static void strMethod(String star, int count){

        System.out.println("Строка #"+ count +": "  + star);
        }
  public static void strMethodFor(String line){
      for (int i = 1; i !=6; i++){
        System.out.println("Строка #" + i + " " + line);
        }
      }
  public static void functionLeapYear(int year){
         while (year <= 2017){
            if ((year % 4 == 0) || (year % 400 == 0)){
               System.out.println("Год " + year + " Високосный");
            }else { if (year % 100 != 0){
                       System.out.println("Год " + year + " Не високосный");
                                        }
                  }
           year++;
                            }
                                         }
  public static void functionDoWhileBreak(){
                  int cycle = 0;
                  int exit = 1;
              do {System.out.println("It seems that I'm here forever!");
                   if (exit == 5)
                          {
                   break; }
                   exit++;
                  }
             while (cycle == 0);  }
  public static int convertBinToDec1(String binary){
              int k = binary.length()-1;
            //  System.out.println("Степень 'K' равна = " + k);
              int res=0, stepen=0, digit=0 , buff=0;
         for (int i=0; i<binary.length(); i++)
          {
              char ch = binary.charAt(i);
                digit = ch - '0'; // преобразование из символа строки в цифру ASCII
              //     System.out.println("Символ бинарного числа :" + digit);
                stepen = (int)Math.pow(2,k);
              //     System.out.println("Степень бинарного числа :" + stepen);
                buff = digit * stepen;
              //     System.out.println("Результат умножения digit и stepen " + buff);
                res = res + buff;
              //     System.out.println("Результат :" + res);
              //     System.out.println("Значения счетчика после декримента :" + k);
                k--;

            }
         return res; }
  public static int convertBinToDec2(String binary){
                int k = binary.length()-1;
            //    System.out.println("Степень 'K' равна = " + k);
                int res2 = 0, buff = 0, stepen = 2, digit = 0, mult=0;
           for (int i=0; i!=binary.length(); i++)
            {

               char ch = binary.charAt(i);
                  digit = ch - '0'; // преобразование из символа строки в цифру ASCII
                  buff = res2 * stepen + digit;
              //    System.out.println("Values of buffer now: " + buff);
                  res2 = buff;
              //    System.out.println("Results :" + res2);
              //    System.out.println("Степень 'K' в цикле равна = " + k);
                  k--;
            }
           return res2;
  }
  public static String convertDecToBin1(int decimal){
    int a = decimal;
    int b = 0,c = 0;
    String d = "";
    while ( a != 1) {
      c = a / 2;
      b = a % 2;
      a = c;
      d = d + Integer.toString(b);
      if (a == 1){ d = d + Integer.toString(c);}}
    return d;}
  public static String convertDecToBin2(int decimal){
                int k=0, stepen=0, counter=0, res=0;
                String d = "";
         while (true) {
               stepen = (int)Math.pow(2,k);
               counter = k;
               k++;
            if (stepen > decimal){
               counter = counter - 1;
               break;}
               }
               res = decimal;
           for (int i = counter; i != -1 ; i--) {
                 stepen = (int)Math.pow(2,i);

           if (res > stepen || res == stepen){
              d = d + Integer.toString(1);
              res = res - stepen;}
           else if (res < stepen){
              d = d + Integer.toString(0); }

      }
   return d;
 }


}
