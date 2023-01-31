import java.util.LinkedList;

public class Employes {
    string name ;
    int sal;
    void get(String s1,int s2)
    {
        name=s1;
        sal=s2;
    }
    void show()
    {
        System.out.println(name);
        System.out.println(sal);
    }
   
    public static void main(String[] args) {
        String s=readLine();
        int a = readInt();
        Employes e = new Employes();
        e.get(s,a);
   
    }
}
