public class TEST1234 {
        public static void main(String[] args) {
            int [] tab = {10, 8, 5, 3, 7, 20, 45, 2, 11, 16};
            int comparaison=0;
            int affectation=0;
            int echange=0;
            int n = tab.length;
            for(int i = 0; i<n-1; i++) {
                comparaison++;
                int min = i;
                affectation+=1;
                for(int j=i+1; j<=n-1; j++) {
                    comparaison++;
                    if(tab[j] < tab[min]) {
                        min = j;
                        affectation+=1;
                    }
                }
                int y = tab[i];
                tab[i]= tab[min];
                tab[min] = y;
                echange+=2;
            }
            for(int i=0; i<n; i++) {
                System.out.println(tab[i]);
                System.out.println("Il y a eu " + comparaison + " comparaisons, " + affectation +" affectations et "+ echange + " echanges.");

            }
            }
        }
