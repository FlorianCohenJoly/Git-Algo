public class Insertion3A {
        public static void main(String[] args) {
            int [] tab = { -2, 78, 10, 245, 14, 4, 18, 19, 55, 21, 74, 2000, 154, 27, 12};
            int comparaison = 0;
            int affectation = 0;
            int echange = 0;
            int n = tab.length;
            for(int i =0; i<n; i++) {
                comparaison++;
                int min = tab[i];
                int j = i-1;
                affectation+=2;
                while(j>=0 && tab[j]>min) {
                    comparaison++;
                    tab[j+1] = tab[j];
                    affectation++;
                    echange++;
                    j--;
                }
                tab[j+1] = min;
                affectation++;
            }
            for(int i =0; i<n; i++) {
                System.out.println(tab[i]);
                System.out.println();
            

            }
                System.out.println("Il y a eu " + comparaison + " comparaisons, " + affectation +" affectations et "+ echange + " echanges.");

        }
    }
    
