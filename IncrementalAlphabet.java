class IncrementalAlphabet{
    public static void main(String [] args){
        String  name = "MEGHA";
        for(int i = 0; i <= name.length(); i++){
            for(int j = 0; j < i; j++){
                System.out.print(name.charAt(j));
            }
        System.out.println();}
    }
}