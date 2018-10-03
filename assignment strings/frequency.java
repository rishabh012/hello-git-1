import java.util.*;
class Freq {
  public static void main(String[] args) 
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=scan.nextLine();

    char[] arr=s.toCharArray();
    int size=arr.length;
    int max=0;
    

    for(int i=0;i<size;i++)
    {
      int count=0;  
      for(int j=0;j<size;j++)
      {
        if(arr[i]==arr[j])
        {
          count++;
        }
      }
        max=count;
    }
    System.out.println(max);
  }
}
