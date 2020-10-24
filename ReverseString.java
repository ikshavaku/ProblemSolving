class ReverseString {
    public static void main(String[] args) {
        String a="madam";
        int n=a.length();
        String rev="";
        for(int i =n-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        System.out.println("reversed string is :"+rev);
        if(a.equals(rev)){
            System.out.println("The string is a pallindrome");
        }else {
            System.out.println("String is not a pallindrome");
        }
    }
}