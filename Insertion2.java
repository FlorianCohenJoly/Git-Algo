Tri par insertion :

        exemple de tableau où n est la longueur du tableau et n = 5
        pour i = 0 à n-1
        on fait prendre à (tab)i la valeur min donc min=(tab)i
        on a j=i-1
        tant que j > 0 et que (tab) j > min
        on a (tab) j +1 = (tab) j
        puis (tab) j+1 = min
        échange des valeurs dans l'ordre croissant


public class Insertion2 {
        public static void main(String[] args) {
            int [] tab = { -2, 78, 10, 245, 14, 4, 18, 19, 55, 21, 74};
            int n = tab.length;
            for(int i =0; i<n; i++) {
                int min = tab[i];
                int j = i-1;
                while(j>=0 && tab[j]>min) {
                    tab[j+1] = tab[j];
                    j--;
                }
                tab[j+1] = min;
            }
            for(int i =0; i<n; i++) {
                System.out.println(tab[i]);
            }
        }
}

