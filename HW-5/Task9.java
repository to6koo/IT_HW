package homework5;
import java.util.Scanner;

public class Task9 {
   /* �� �� ������� ��������, ���� ����� �� ������� ��� �������� �����,
    * �����, ���� ����� '-' �� ������� ������ �� ���������� ����� ���� ��
    * ������ ������ '-' ���� ����������� �����.
    * ����: asd-12sdf45-56asdf100
    * �����:
    * -12
    *  45
    *  -56
    *  100
    *  ���� = 77
    */
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      Scanner sc = new Scanner(System.in);

      String stringA;
      int sum = 0;

      System.out.print("Insert first string:");
      stringA = sc.next();

      char[] str = stringA.toCharArray();
      String temp = "";
      int i=0;

      while (i < stringA.length())
      {
         if(str[i] == '-')
         {
            if(temp.length() != 0)
            {
               sum+=Integer.valueOf(temp);
               System.out.println(temp);
            }
            temp = "-";
         }
         else if(str[i] >= '0' && str[i] <= '9')
         {
            temp += str[i];
         }
         else if (temp.length() != 0)
         {
            sum += Integer.valueOf(temp);
            System.out.println(temp);
            temp = "";
         }
         i++;
      }
      if(temp.length() != 0 )
         sum += Integer.valueOf(temp);
      System.out.println("Sum is: "+sum);
   }
}
