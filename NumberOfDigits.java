class NumberOfDigits {
    public static void main(String[] args) {
        int num=123456;
        int count =0;
        while(num!=0){
            count+=1;
            num=num/10;
        }
        System.out.println(count);
    }
}