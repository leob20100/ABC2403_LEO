#Exercice 3.1 : La bonne plage de sable

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.

##ALGORYTHME
```
VARIABLES
nombre est un ENTIER

TRAITEMENT
LIRE nombre 

FAIRE
ECRIRE "Entrez un nombre entre 1 et 3 : "
LIRE nombre
TANT QUE nombre < 1 OU nombre > 3
LIRE "Bravo, vous avez réussi ! votre nombre est : ", nombre
nombre++
``` 