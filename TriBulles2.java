public class TriBulles2{

    public static void main ( String[] args){
        int comparaison=0;
        int affectation=0;
        int echange=0;

        int[] tab = {10,5,9,8,0,1,3,2,4};
     /*   int i,j,val;
        for(i= tab.length - 1; i >= 1 ; i--){
            affectation+=1;
            comparaison++;

            for (j=1;j <= i;j++){
                affectation+=1;
                comparaison++;
                if ( tab [ j - 1] > tab [j]){
                    comparaison++;
                    // permutation
                    val= tab[j-1];

                    tab[j-1]=tab[j];
                    tab[j]=val;
                     affectation+=3 ;
                }
            }
        }
*/


        comparaison= Bulles_opti(tab );

        System.out.println("Il y a eu " + comparaison + " comparaisons, "
                + affectation +" affectations  ");




    }


       public static int Bulles_opti(int []tab)
    {
        int comparaison=0;
        int affectation=0;
        int i=0,j,val;boolean fin= true;
        while (fin){
            fin=false;
            affectation+=1;
            comparaison++;

            for (j=1;j <= tab.length-1;j++){
                affectation+=1;
                comparaison++;
                if ( tab [ j - 1] > tab [j]){
                    comparaison++;
                    fin=true;
                    // permutation
                    val= tab[j-1];

                    tab[j-1]=tab[j];
                    tab[j]=val;
                    affectation+=3 ;
                }
            }
        }
        return comparaison;
    }


}



