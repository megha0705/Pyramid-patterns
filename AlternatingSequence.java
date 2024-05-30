import java.util.Scanner;
class AlternatingSequence{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int output = j + 1;
                if(output % 2 == 0){
                    System.out.print(2);
                }else{
                    System.out.print(1);
                }             
            }
        System.out.println();}
    }
}