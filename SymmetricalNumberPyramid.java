class SymmetricalNumberPyramid{
    public static void main(String [] args){
        int n = 9;
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j < i; j++){
                System.out.print(i-j);
            }
             for(int j = 1; j < i; j++){
                System.out.print(j);
            }
        System.out.println();} }
}

