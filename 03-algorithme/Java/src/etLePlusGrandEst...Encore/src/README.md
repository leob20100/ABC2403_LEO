#Exercice 3.7 : Et le plus grand est… encore.
Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur souhaite saisir de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.

##Algorithmes

```
VARIABLES

nombre est un ENTIER
i est un ENTIER
pg est un ENTIER
ipg est un ENTIER

TRAITEMENT

nombre <-- 1
i <-- 0
pg <-- 0

TANT QUE nombre <> 0
ECRIRE "Entrez un nombre :"
LIRE nombre
i <-- i+1
SI i = 1 ou nombre > pg ALORS
pg <-- nombre
ipg <-- i
FIN SI
FIN TANT QUE

RESULTAT

ECRIRE "Le nombre le plus grand était : ", pg
ECRIRE " Il a été saisi en position numéro : ", ipg
FIN
```