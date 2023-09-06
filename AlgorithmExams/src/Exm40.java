import java.util.Scanner;

public class Exm40 {
    // kalvyeden girilen stringin palindrom olup olmadığını bulan pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        String value=k.nextLine();
        int bas=0;
        int son=value.length()-1;
        boolean kontrol=true;

        while (bas<son){
            if (value.charAt(bas)!=value.charAt(son)){
                kontrol=false;
                break;
            }bas++;
            son--;
        }
        if (kontrol){
            System.out.println(value+" palindromdur");
        } else{
            System.out.println(value+" palindrom değildir");
        }
    }
}
