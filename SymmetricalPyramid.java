class SymmetricalPyramid{
    public static void main(String [] args){
        int n = 9;
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j < i; j++){
                System.out.print(i-j);
            }
             for(int j = 2; j < i; j++){
                System.out.print(j);
              
            }            
            System.out.println("");}

        for(int i = 0; i < n; i++){
             for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
             for(int j = 8; j > i; j--){
                System.out.print(j - i);
            }
             for(int j = 8-1; j > i; j--){
                System.out.print(9 - j);}
             System.out.println(""); }}
}