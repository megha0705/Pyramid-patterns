import java.util.Scanner;
class DescendingStep{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(9 - j);
            }
        System.out.println();}
    }
}