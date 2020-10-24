class ReverseNumber {
    public static void main(String[] args) {

        int num= 1212121;
        int temp=num;
        int rev=0;
        while(num!=0) {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev==temp){
            System.out.println("Number is a pallindrome");
        }else {
            System.out.println("Number is not a pallindrome");
        }

        /*StringBuffer rev;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        rev = sb.reverse();
        System.out.println("reverse number is : "+rev);

        StringBuilder sb = new StringBuilder();
        sb.append(num);
        System.out.println("reverse number is : "+sb.reverse());*/
    }
}