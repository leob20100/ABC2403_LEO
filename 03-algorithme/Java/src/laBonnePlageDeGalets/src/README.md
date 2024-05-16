#Exercice 3.2 : La bonne plage de galets
Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.

##Algorithme
```
VARIABLES
nombre2 est un ENTIER


TRAITEMENT

FAIRE
ECRIRE " saisissez un nombre entre 10 et 20 : "
LIRE nombre2

SI nombre2 < 10 ALORS
LIRE "Plus grand ! "

SINON nombre2 > 20
LIRE "Plus petit !"

TANT QUE nombre2 < 10 ou nombre2 > 20
LIRE nombre2, "Yes, you dit it !"
```