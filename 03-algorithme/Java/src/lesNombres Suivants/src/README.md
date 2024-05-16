#Exercice 3.3 : Les nombres suivants
Écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.

Par exemple, si l’utilisateur entre le nombre 17, le programme affichera :

Les 10 nombres après 17 sont: 18, 19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27

Écrire cet algorithme dans un premier temps avec une boucle tant que, puis écrivez une 2nde version avec une boucle pour.

## Algorithmes

```
VARIABLES
nombreDepart est un ENTIER
i est un ENTIER

TRAITEMENT

ECRIRE "Saisissez votre nombre : "
LIRE nombreDepart

LIRE i = 1

TANT QUE i <= 10
LIRE nombreDepart, i, ","
i++
FIN TANT QUE
```

```
VARIABLES
nombreDepart est un ENTIER
i est un ENTIER

TRAITEMENT

ECRIRE "Saisissez votre nombre : "
LIRE nombreDepart

POUR i = 1, i<= 10 , i++
LIRE nombreDepart,i,","
```