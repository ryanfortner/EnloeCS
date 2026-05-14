import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<ComplexNum> cnList = new ArrayList<ComplexNum>();
        
        ComplexNum n1 = new ComplexNum(4, 5);
        ALUtil.push(cnList, n1);
        
        for (int i = 1; i < 6; i++) {
            int x = 1;
            if (i % 2 == 0) x = -x;
            ALUtil.push(cnList, new ComplexNum(i * x, i * i));
        }
        
        System.out.println("1. " + cnList);
        System.out.println("2. " + ALUtil.popQ(cnList));
        System.out.println("3. " + ALUtil.popS(cnList));
        System.out.println("4. " + cnList);
        ALUtil.reverse(cnList);
        System.out.println("5. " + cnList);
        System.out.println("6. " + ALUtil.popS(cnList));
        ComplexNum n2 = n1.minus(ALUtil.popQ(cnList));
        System.out.println("7. " + n2.toString());
        ALUtil.push(cnList, n2);
        System.out.println("8. " + cnList);
        ALUtil.reverse(cnList);
        System.out.println("9. " + cnList);
        n2 = n1.plus(n2);
        ALUtil.push(cnList,n2);
        System.out.println("10. " + cnList);

    }
}
