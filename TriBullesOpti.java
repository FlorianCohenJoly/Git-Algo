Tri à bulles optimisé :
 on declare la taille du tableau
   Dans la premiere boucle
Pour n , on lui donne la valeur tab
on affiche la valeur de tab avant  le tri

on affecte
   val= tab
   on affiche la valeur de tab après  le tri 

on declare les variales i,j,Temp et val
dans le deuxieme boucle 
Pour i = taille du tableau - 1 et i < tab
  on a i >= 1
dans la deuxieme boucle on refait une boucle
Pour j = 0 ; 
  on a j < i 

on permute les valeurs
   on a  (j) > T(j+1)
     temp = (j+1);
     T(j+1)=T(j);
     T(j)=temp;
     index du tab est inferieux on 
     permutte les 2 et on termine la boucle

  puis on return la valeur de T









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
