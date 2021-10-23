tri_insertion(tableau T)
    debut
        entier longueur, i, memoire, compteur;
        booleen marqueur;

        longueur<-taille(T)
        
        pour i=1 à (longueur-1) faire
            memoire<-T(i) //valeur à insérer au tour i
            compteur<-(i-1)
            
            faire
                marqueur=faux //on n'a pas fait de décalage

                si T(compteur)>memoire alors
                    T(compteur+1)<-T(compteur) //décalage des plus grandes valeurs du tableau
                    compteur<-compteur-1
                    marqueur=vrai //on vient de faire un décalage
                fin si

                si (compteur<0) alors //on a atteint la premiére valeur du tableau
                    marqueur=faux //il n'y a plus de décalages possibles
                fin si 
            tantque marqueur

            T(compteur+1)<-memoire //affectation de la valeur à insérer dans la bonne case
        fin pour
    fin
    
    
    
    Java=
          public static void triInsertion(int tableau[])
        {
        int longueur=tableau.length;
        
        for(int i=1;i<longueur;i++)
            {
            int memory=tableau[i];
            int compt=i-1;
            boolean marqueur;
            do
                {
                marqueur=false;
                if (tableau[compt]>memory)
                    {
                    tableau[compt+1]=tableau[compt];
                    compt--;
                    marqueur=true;
                    }
                if (compt<0) marqueur=false;
                }
            while(marqueur);
            tableau[compt+1]=memory;
            }
        }
