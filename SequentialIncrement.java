class SequentialIncrement{
    public static void main(String [] args){
        int n = 8;
        int output = 1;
        for(int i = 0; i < n; i++){
             for(int j = 0; j < i; j++){
              System.out.print(output);
              output++;}
        System.out.println();}}
}