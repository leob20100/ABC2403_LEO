# EXERCICE 1.1 : Hello Word
...

Ecrire "Hello Word"
...



## Exercice 1.2 : Hello you
L’utilisateur est invité à saisir son prénom dans la console.

Le programme affiche “Bonjour “ suivi du prénom saisi.

...

VARIABLES
prenom est une CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saississez votre prénom"
    LIRE prenom
    ECRIRE "bonjour ", prenom, "."
    ...

Alternative avec contrôle sur la longueur du prénom 
...

VARIABLES
prenom est une CHAINE DE CARACTERES

TRAITEMENT 
    ECRIRE "Saississez votre prénom"
    LIRE prenom
    SI prenom.LONGUEUR > 2 ALORS
        ECRIRE "bonjour ", prenom, "."
    SINON
        ECRIRE "Prénom invalide"
    FIN SI
    ...

##Exercice 1.3 : Calcul de la moyenne de 2 nombres.

L’utilisateur est invité à saisir 2 nombres entier.

Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.

...

VARIABLES

nombre1 est un NOMBRE ENTIER 
nombre2  est un NOMBRE ENTIER
moyenne est un NOMBRE REEL




TRAITEMENT
ECRIRE "Veuillez saisir un premier nombre"
LIRE nombre1
ECRIRE "Veuillez saisir un second nombre"
LIRE nombre2

moyenne <-- (nombre1 + nombre2) / 2

RESULTAT

ECRIRE "La moyenne de ", nombre1, "et", nombre2, "est", moyenne, "."

// "La moyenne de 12 et 81 est 46,5"
...

##Exercice 1.4 : Calcul de l’aire et du volume d’une sphère

Lire le rayon R d’une sphère puis calculer et afficher :

Son aire = 4 π R²
Son volume = (4 π R³)/3

...

VARIABLES

rayon est un NOMBRE REEL
aireRayon est NOMBRE REEL
volumeRayon est un NOMBRE REEL

TRAITEMENT

ECRIRE "Veuillez saisir le rayon d'une sphère"
LIRE rayon

aireRayon <-- 4 pi rayon^2

volumeRayon <-- (4 pi rayon^3) / 3

RESULTAT

ECRIRE "L'aire d'une sphère est de", aireRayon, "et le volume d'une sphère est de", volumeRayon, "."