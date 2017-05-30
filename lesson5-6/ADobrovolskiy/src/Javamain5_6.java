 import java.util.Arrays;
 public class Javamain5_6 {

   public static void main(String[] args) {

     //Input data of Method AND (&&);
     System.out.println("");
     System.out.println("Method AND (&) result:");
     String leftAND = ("0101");
     String rightAND = ("0100");
     BitwiseCalc objAND = new BitwiseCalc();
     System.out.println(objAND.and(leftAND, rightAND));

     //Input data of Method OR (|)
     System.out.println("");
     System.out.println("Method OR (|) result:");
     String leftOR = "0101";
     String rightOR = "0100";
     BitwiseCalc objOR = new BitwiseCalc();
     System.out.println(objOR.or(leftOR, rightOR));

     //Input data of Method XOR (^)
     System.out.println("");
     System.out.println("Method XOR (|) result:");
     String leftXOR = "0101";
     String rightXOR = "0100";
     BitwiseCalc objXOR = new BitwiseCalc();
     System.out.println(objXOR.xor(leftXOR, rightXOR));

     //Input data of Method NOT (~)
     System.out.println("");
     System.out.println("Method NOT (~) result:");
     String binaryNOT = "0100";
     BitwiseCalc objNOT = new BitwiseCalc();
     System.out.println(objNOT.not(binaryNOT));


     System.out.println("_______");
     int[] inputArr = {1,2,3,4,5,6,7,8,9,0};
     ArraysCopier objConstr = new ArraysCopier(inputArr);
     System.out.println("Входной массив = " + Arrays.toString(inputArr));

     System.out.println("_______");
     int dimention = 5;
     int[] result1 = objConstr.copyOf(dimention);
     System.out.println("Массив CopyOf 5 = " + Arrays.toString(result1));


     System.out.println("_______");
     int start = 1;
     int end = 5;
     int[] result2 = objConstr.copyOfRange(start, end);
     System.out.println("Массив CopyOfRange 1 - 5 = " + Arrays.toString(result2));

     System.out.println("_______");
     int fillValue = 7;
     int[] result3 = objConstr.fill(fillValue);
     System.out.println("Массив Filling by 7 = " + Arrays.toString(result3));

     System.out.println("_______");
     int inputDemention = 5;
     System.out.println("Треугольник Паскаля размерности = " + inputDemention);
     PascalTriangle objDemention = new PascalTriangle(inputDemention);
     objDemention.print();

     System.out.println("_______");
     System.out.println("Треугольник Паскаля все Четные равны + ");
     objDemention.print("EVEN");
     System.out.println("_______");
     System.out.println("Треугольник Паскаля все Не четные равны - ");
     objDemention.print("ODD");
// Вызов методов реализованных внутри класса Javamain5_6      objArray.copyOf(aLenght);
/*
     //Input data of Method AND (&&);
      System.out.println("");
      String l = "0101";
      String r = "0101";
      System.out.println("Method AND (&) result:");
      System.out.println(l + " AND " + r + " = " + and(l, r));
      System.out.println("");
      //Input data of Method OR (|)
      String x = "0101";
      String y = "0101";
      System.out.println("Method OR (|) result:");
      System.out.println(x + " OR " + y + " = " + or(x, y));
      System.out.println("");
      //Input data of Method XOR (^)
      String z = "0101";
      String w = "0101";
      System.out.println("Method XOR (^) result:");
      System.out.println(z + " XOR " + w + " = " + or(z, w));
      System.out.println("");
      //Input data of Method NOT (~)
      String binary = "0101";
      System.out.println("Method NOT (~) result:");
      System.out.println(binary + " NOT = " + not(binary));
*/

// Закрытие void main метода

 }


//Методы реализованные внутри класса Main

/*

public static String and(String binaryLeft, String binaryRight) {
       String result = "";
       for(int i = 0; i < binaryLeft.length(); i++) {
         char chLeft = (char) binaryLeft.charAt(i);
         char chRight = (char) binaryRight.charAt(i);
          if (chLeft == '1' && chRight == '1')
          {
             result = result + "1";
          }

          else { result = result + "0"; }

      }
    return  result;
  }

public static String or(String binaryLeft, String binaryRight) {
  String result = "";
  for(int i = 0; i < binaryLeft.length(); i++) {
    char chLeft = (char) binaryLeft.charAt(i);
    char chRight = (char) binaryRight.charAt(i);
     if (chLeft == '0' && chRight == '0')
     {
        result = result + "0";
     }

     else { result = result + "1"; }

   }
  return  result;

}

public static String xor(String binaryLeft, String binaryRight) {
  String result = "";
  for(int i = 0; i < binaryLeft.length(); i++) {
    char chLeft = (char) binaryLeft.charAt(i);
    char chRight = (char) binaryRight.charAt(i);
     if (chLeft != chRight)
     {
        result = result + "0";
     }

     else { result = result + "1"; }

   }
  return  result;

}

public static String not(String binary) {
         String result = "";
         for(int i = 0; i < binary.length(); i++) {
           char chBinary = (char) binary.charAt(i);
            if (chBinary == '1')
            {
               result = result + "0";
            }

            else { result = result + "1"; }
        }
      return  result;
    }


}

*/

// Закрытие Javamain5_6 класса

}

//Отдельные классы с реализованными методами внутри

class BitwiseCalc {

   public String and(String binaryLeft, String binaryRight) {
        String result = "";
        for(int i = 0; i < binaryLeft.length(); i++)
         {
           char chLeft = (char) binaryLeft.charAt(i);
           char chRight = (char) binaryRight.charAt(i);
             if (chLeft == '1' && chRight == '1')
                {
                 result = result + "1";
                }
             else {
                  result = result + "0";
                  }
         }

     return result;

   }

   public String or(String binaryLeft, String binaryRight) {
      String result = "";
      for(int i = 0; i < binaryLeft.length(); i++) {
        char chLeft = (char) binaryLeft.charAt(i);
        char chRight = (char) binaryRight.charAt(i);
         if (chLeft == '0' && chRight == '0')
         {
            result = result + "0";
         }

         else { result = result + "1"; }

       }
      return  result;

    }

   public String xor(String binaryLeft, String binaryRight) {
      String result = "";
      for(int i = 0; i < binaryLeft.length(); i++) {
        char chLeft = (char) binaryLeft.charAt(i);
        char chRight = (char) binaryRight.charAt(i);
         if (chLeft != chRight)
         {
            result = result + "0";
         }

         else { result = result + "1"; }

         }
      return  result;

    }

   public String not(String binary) {
             String result = "";
             for(int i = 0; i < binary.length(); i++) {
               char chBinary = (char) binary.charAt(i);
                if (chBinary == '1')
                {
                   result = result + "0";
                }

                else { result = result + "1"; }
            }
          return  result;
        }

  }

class ArraysCopier {
  int[] arr;
  ArraysCopier(int[]array)
       {
       arr = array;
       }

     public int[] copyOf(int newLength) {          // возвращает новый массив указанной длины.
       int[] result1 = new int[newLength];
         for(int i = 0; i < result1.length; i++)
          {
           result1[i] = arr[i];
          }
     return result1;
     }


     public int[] copyOfRange(int from, int to) {  // возвращает новый массив начиная с элемента from до элемента to
         int[] result2 = new int[to];
         for(int i = 0; i < result2.length; i++)
          {
           result2[i] = arr[from];
           from++;
          }
          return result2;
     }


     public int[] fill(int value) {
       int[] result3 = arr;             // возвращает новый массив заполненный значением параметра value
         for (int i = 0; i < result3.length; i++) {
           result3[i] = value;
         }
    return result3;
     }

}

class PascalTriangle {
   int n;
   PascalTriangle (int nDemention) {
   n = nDemention;
  }

   public void print(){
     int r, num, count;
     for (int i = 0; i <= n; i++) {
        num = 1;
        r = i + 1;
        count = i;
        for (int col = 0; col <= i; col++) {
           if (col > 0) {
              num = num * (r - col) / col;
           }
           do {
                System.out.print("  ");
                count++;
           }
           while (count <= n);
                System.out.print(num + " ");
        }
        System.out.println();
     }
   }

   public void print(String filter) {
          int step = 0;
     if (filter == "EVEN"){
        step = 2;
     }else if (filter == "ODD"){
        step = 1;
     }

     int r, num, count;

     for (int i = 0; i <= n; i++) {
         num = 1;
         r = i + 1;
         count = i;
         for (int col = 0; col <= i; col++) {
            if (col > 0) {
               num = num * (r - col) / col;
            }
            do {
                 System.out.print("  ");
                 count++;
            }
            while (count <= n);
            switch (step) {
                case 2 : if (num%2 == 0) {
                                   System.out.print("+ ");
                               } else {
                                     System.out.print(num + " ");
                               }
                               break;
                case 1 :  if (num%2 != 0) {
                                   System.out.print("- ");
                               } else {
                                     System.out.print(num + " ");
                               }
                               break;
                default : System.out.print(num + " ");
            }

         }
         System.out.println();
      }
    }

          /*  if (num%2 == 0) {
                System.out.print("+");
            } else if (num % 1==0) {
                System.out.print("-");
            }*/

}

class ArraysUtils { }
