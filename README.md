# Principes de Conception SOLID en Java

Ce dépôt contient des exemples de code Java simples et concrets illustrant les cinq principes de conception **SOLID**. L'objectif est de démontrer la différence entre un code qui ne respecte pas ces principes et un code refactorisé qui les applique.

## Structure de Navigation

Le projet est organisé en cinq dossiers principaux, chacun correspondant à un principe SOLID :

```
.
├── 1- Single Responsibility Principle/
├── 2- Open-Closed Principle/
├── 3- Liskov Substitution Principle/
├── 4- Interface Segragation Principle/
└── 5- Dependency Iversion Principle/
```

Chaque dossier de principe est lui-même divisé en deux sous-dossiers :

-   **`...- sans respect du principe/`** : Contient un exemple de code qui **viole** le principe en question. C'est le "mauvais" exemple, qui met en évidence les problèmes de conception.
-   **`...- avec respect du principe/`** : Contient une version refactorisée du même code, qui **adhère** au principe. C'est le "bon" exemple, qui montre la solution.

À l'intérieur de ces sous-dossiers, vous trouverez les fichiers source Java (`.java`) ainsi qu'un fichier `Main.java` qui sert de point d'entrée pour exécuter et tester le code.

## Diagrammes UML

Pour chaque exemple (avec et sans respect du principe), un **diagramme de classes UML** a été généré afin de visualiser la structure du code, les relations entre les classes et l'impact de l'application des principes.

**Tous les diagrammes UML ont été regroupés dans un unique document PDF nommé `FOTSO_22T2961.pdf.pdf`**, que vous trouverez à la racine de ce projet. Ce document sert de support visuel pour accompagner l'exploration du code.

## Comment Utiliser ce Dépôt

1.  Choisissez un principe SOLID que vous souhaitez étudier (par exemple, `2- Open-Closed Principle/`).
2.  Commencez par explorer le code du dossier **`...- sans respect du principe/`** pour bien comprendre le problème initial.
3.  Consultez le diagramme UML correspondant dans le fichier PDF pour visualiser la structure problématique.
4.  Ensuite, analysez le code du dossier **`...- avec respect du principe/`** pour voir comment le problème a été résolu.
5.  Comparez avec le diagramme UML de la solution dans le PDF pour bien saisir les bénéfices de la nouvelle structure.

## Les 5 Principes SOLID

1.  **S - Single Responsibility Principle (Principe de responsabilité unique)** : Une classe ne doit avoir qu'une seule raison de changer.
2.  **O - Open-Closed Principle (Principe ouvert/fermé)** : Les entités logicielles (classes, modules, fonctions) doivent être ouvertes à l'extension, mais fermées à la modification.
3.  **L - Liskov Substitution Principle (Principe de substitution de Liskov)** : Une instance d'un type de base doit pouvoir être remplacée par une instance d'un de ses sous-types sans que cela n'altère la cohérence du programme.
4.  **I - Interface Segregation Principle (Principe de ségrégation des interfaces)** : Un client ne doit pas être forcé de dépendre de méthodes qu'il n'utilise pas.
5.  **D - Dependency Inversion Principle (Principe d'inversion des dépendances)** : Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau. Les deux doivent dépendre d'abstractions.