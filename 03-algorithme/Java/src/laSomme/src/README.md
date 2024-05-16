#Exercice 3.4 : La somme
Écrire un algorithme qui demande un nombre de départ, et qui calcule et affiche la somme des entiers jusqu’à ce nombre.

Par exemple, si l’utilisateur saisit le nombre 5, le programme doit afficher :

La somme des nombres jusque 5 est: 15

NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.

## Algorithmes

```
VARAIBLES
nombre est un ENTIER
i est un ENTIER
somme est un ENTIER

TRAITEMENT
ECRIRE "Saisissez un nombre"
LIRE nombre
somme <-- 0

POUR i de 1 à nombre, somme de somme + i
ECRIRE "La somme est : ", somme
```