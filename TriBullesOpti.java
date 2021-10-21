public class TriBullesOpti {
    public static void main(String[] args) {
        int [] tab = {10, 8, 5, 3, 7, 20, 45, 2, 11, 16};
        System.out.print("Avant le tri  ");
        for (int n:tab)
            System.out.print(n+" ");
        tab = tri_a_bulles(tab);
        System.out.print("\nAprès le tri  ");
        for (int n:tab)
            System.out.print(n+" ");
    }

    static int[] tri_a_bulles(int T[])
    {
        int temp;
        for(int i = T.length-1 ; i>=1 ; i--)
        {
            for(int j = 0 ; j<i ; j++)
                if(T[j] > T[j+1])
                {
                    temp = T[j+1];
                    T[j+1]=T[j];
                    T[j]=temp;
                }
        }
        return T;
        }
    }
