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

