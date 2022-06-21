import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int liczba;
    Scanner klaw=new Scanner(System.in);
    System.out.print("Wpisz liczbę: ");
    liczba=klaw.nextInt();
    int wynik=silnia(liczba);
    System.out.print(liczba);
    System.out.print("! = ");
    System.out.println(wynik);
  }
   
  static int silnia(int liczba){
    if(liczba>1)
      return liczba*silnia(liczba-1);
    else
      return 1;    
  }
}