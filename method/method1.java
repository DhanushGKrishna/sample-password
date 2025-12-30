class method1{

    int apple_price = 20;
    int apple_count = 5;
    void total_money(){
        System.out.println(apple_price * apple_count);
    }

    public static void main(String[] args){
        method1 result = new method1();
        result.total_money();
    }
}