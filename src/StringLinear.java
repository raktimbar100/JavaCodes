import java.util.Scanner;

class StringLinear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        char target=sc.next().trim().charAt(0);
        if(ls(name,target)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
    static boolean ls(String name,char target)
    {
        if(name.length()==0)
            return false;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==target)
            {
                return true;
            }
        }
        return false;
    }
}
