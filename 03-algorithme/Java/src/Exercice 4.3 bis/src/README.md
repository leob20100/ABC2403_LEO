#Exercice 4.7 : Modifier un tableau

Écrire un algorithme qui permet la saisie d’un nombre quelconque de valeurs, sur le principe de l’exercice 4.3.

Toutes les valeurs doivent être ensuite augmentées de 1, et le nouveau tableau sera affiché à l’écran.

## Algorithmes

```
VARIABLES

valeurs est un ENTIER
tableau[] est un TABLEAU D'ENTIER
i est un ENTIER

TRAITEMENT

ECRIRE "Saisissez votre valeur :"
LIRE nombre

POUR i <-- 0 à i < tableau.length à i++
ECRIRE "Entrez le nombre n°", i + 1
LIRE tableau[i]
FIN POUR

ECRIRE "Le nouveau tableau est :"

POUR i <-- 0 à i < tableau.length à i++
tableau[i] <-- tableau[i] + 1
ECRIRE tableau [i]
FIN POUR

```