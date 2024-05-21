#Exercice 3.6 : Et le plus grand est…

Érire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui inqique ensuite quel est le plus grand parmi ces 20 nombres.

##Algorithmes

```
VARIABLES
nombre est un ENTIER
i est un ENTIER
pg est un ENTIER
ipg est un ENTIER

TRAITEMENT

POUR i <-- 1 à 20

ECRIRE "Entrez un nombre :"
LIRE nombre

SI i = 1 ou nombre > pg ALORS
pg <-- nombre
ipg <-- i
FIN SI

RESULTAT

ECRIRE "Le plus grand des nombre saisis est :", pg, "."
ECRIRE pg, "était le nombre numéro", nombre, "."

```