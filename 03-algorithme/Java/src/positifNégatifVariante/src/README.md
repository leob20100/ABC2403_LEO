Exercice 2.1 : Positif ou négatif ?

Écrire un algorithme qui demande à l’utilisateur de saisir 1 nombre entier et l’informe ensuite si le nombre est positif ou négatif.

Pour information, le nombre 0 est considéré positif.
VARIABLES

nombreEntier est un ENTIER

TRAITEMENT

ECRIRE "Saisissez un nombre entier"

LIRE nombreEntier;

SI nombreEntier >= 0 ALORS 
    ECRIRE "Ce nombre est positif"

SINON SI nombreEntier < 0 ALORS
	ECRIRE "Ce nombre est négatif"
	
SINON
	ECRIRE "Ni négatif ni positif"
	

