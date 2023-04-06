class Shadowing {
    static int i=100;//this will be shadowed in line no 6
    public static void main(String[] args) {
        System.out.println(i);
        int i=900;
        System.out.println(i);//line number 2 is shadowed by this.
        num();
    }
    static void num(){
        System.out.println(i);
    }
}
/*Output
100
900
100
 */
