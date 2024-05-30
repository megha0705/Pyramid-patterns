import java.util.Scanner;
class IncrementalAlphabet{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String  name = sc.next();
        for(int i = 0; i <= name.length(); i++){
            for(int j = 0; j < i; j++){
                System.out.print(name.charAt(j));
            }
        System.out.println();}
    }
}