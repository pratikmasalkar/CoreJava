class Test{
    void show(float a,int b){
        System.out.println("int float method");
    }
    
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10.6f,15);
    }
}