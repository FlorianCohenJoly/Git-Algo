public class TriSelection {
    public static void main(String[] args) {
        int [] tab = {10, 8, 5, 3, 7, 20, 45, 2, 11, 16};
        int n = tab.length;
        for(int i = 0; i<n-1; i++) {
            int min = i;
            for(int j=i+1; j<=n-1; j++) {
                if(tab[j] < tab[min]) {
                    min = j;
                }
            }
            int y = tab[i];
            tab[i]= tab[min];
            tab[min] = y;
        }
        for(int i=0; i<n; i++) {
            System.out.println(tab[i]);
        }
    }
}
