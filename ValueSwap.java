class ValueSwap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp;
        //swap one
        
        temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a+" b: "+b);

        //swap two
        a = a*b;
        b= a/b;
        a= a/b;
        System.out.println("a: "+a+" b: "+b);

        //swap three
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a+" b: "+b);

        //swap four
        b=a+b-(a=b);
        System.out.println("a: "+a+" b: "+b);

        //swap five
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a: "+a+" b: "+b);
    }
}