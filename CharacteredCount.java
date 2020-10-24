class CharacteredCount {
    public static void main(String[] args) {
        String str="aaaaaabbbbbbcccdeeee";
        String cc="";
        int count=0;
        int n=str.length();
        for(int i=1;i<n;i++) {
            if((str.charAt(i)==str.charAt(i-1))&&(i!=n-1)){
                count++;
            }
            else {
                cc=cc+str.charAt(i-1)+Integer.toString(count);
                count=1;
            }
        }
        System.out.println(cc);
    }
}