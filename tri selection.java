procédure tri_selection(tableau t)
      n ← longueur(t) 
      pour i de 0 à n - 2
          min ← i       
          pour j de i + 1 à n - 1
              si t[j] < t[min], alors min ← j
          fin pour
          si min ≠ i, alors échanger t[i] et t[min]
      fin pour
  fin procédure


Pour i variant de 1 à n-1 faire
Trouver[j] le plus petit element de [i+1:n] Echanger [j] et [i]



Java=

public static void tri_selection (int[] t){
        int n=t.length;
        int c;

        for (int i=0; i< n-2; i++ ){
            int min=i;

            for( int j=i+1; j< n-1; j++){
                if(t[j]<t[min]){
                    min = j;
                }

            }

        if(min!=i){
            c=i;

        }

        }
        System.out.println(t);
