class BaseClass {
    static int count;

    BaseClass() {
        if(this.count==5){
            System.out.println("5 Objects already created");
            System.exit(1);
        }
        else {
            this.count+=1;
            System.out.println("object number "+this.count+"created");
        }
    }

    public static void main(String[] args) {
        while(true){
            BaseClass bc = new BaseClass();
        }
    }
}