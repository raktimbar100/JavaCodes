 class MethodOverloading {
     public static void main(String[] args) {
         fun("Raktim");
         fun(10);
     }
     static void fun(String name){
         System.out.println(name);
     }
     static void fun(int num){
         System.out.println(num);
     }
}
