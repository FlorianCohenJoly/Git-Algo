 Tri à bulles normal :

Pour i = 0 à n - 1 et i < tab
on affiche la valeur de tab en ||
on déclare 3 variable i,j, et val
Pour i = val tab -1  et i >= 1
et Pour j = 1 , j <= i  et 
on a (tab) j - 1 > tab j

on permute les valeurs
on a 
   val= tab(j-1)
   tab(j-1) = tab(j)
   tab(j)=val
   puis on ecrit la valeur de tab
   on échange les valeurs du tableau  en appellant la fonction





public class TriBulles {

    public void write (int [] tab) {
        for (int i = 0; i< tab.length;i++){
            System.out.print(tab[i] + "||");
        }
        System.out.println();
    }
    public void bulle (int [] tab){
        int i,j,val;
        for(i= tab.length - 1; i >= 1 ; i--){
            for (j=1;j <= i;j++){
                if ( tab [ j - 1] > tab [j]){
                    // permutation
                    val= tab[j-1];
                    tab[j-1]=tab[j];
                    tab[j]=val;
                }
            }
        }

        write(tab);
    }

    public static void main ( String[] args){

        int[] tab = {10,5,9,8,0,1,3,2,4};
        TriBulles tb = new TriBulles();

        tb.bulle(tab);


    }
}
