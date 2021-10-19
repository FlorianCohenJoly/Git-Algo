

from turtle import*
from random import*

speed ("fastest")




#on définit la fonction poisson avec la taille et la couleur
def poisson(col,e,taille):
    width(e)
    color(col)

    begin_fill()
    


    for i in range(4):
        forward(taille)
        left(90)
        left(7)
    end_fill() 


#on définit la fonction seDeplacer
def seDeplacer(x,y):
    up()
    goto(x,y)
    down()

#on définit une liste de couleurs
couleurs = ['blue', 'red', 'black','orange','grey','purple']

#Pour i allant de 1 à 20 faire
for i in range (20):
    #dessiner aléatoirement le logo
    seDeplacer(randint(-275,250),randint(-250,250))
    #la taille du crayon est aléatoire et la couleur se répète à la fin de la liste couleur
    poisson(couleurs[i%6],randint(2,5),randint(40,100))
