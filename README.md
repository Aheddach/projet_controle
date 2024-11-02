# Projet de Catalogue de Produits avec Spring Boot, Thymeleaf, et MySQL

## Aperçu

Ce projet est une application web de gestion de catalogue de produits, développée avec Spring Boot et connectée à une base de données MySQL. Elle permet aux utilisateurs de consulter les produits disponibles, d'ajouter des articles à leur panier, de passer commande, et de visualiser l'historique de leurs achats. Thymeleaf est utilisé pour générer les vues dynamiques de l'application.

## Technologies Utilisées

- **Spring Boot** : Framework Java pour la gestion des requêtes et des opérations back-end.
- **Thymeleaf** : Moteur de template utilisé pour générer les vues HTML dynamiques.
- **Spring Data JPA** : API de persistance pour interagir avec la base de données MySQL.
- **MySQL** : Base de données relationnelle pour le stockage des produits, commandes, et utilisateurs.
- **Maven** : Outil de gestion des dépendances et de compilation du projet.
- **Java** : Langage de programmation principal pour l’application.

## Fonctionnalités Clés

1. **Catalogue de Produits** : Affiche tous les produits disponibles avec leurs informations (nom, description, prix, stock) et permet de les ajouter au panier.
3. **Validation et Passage de Commande** : Présente un récapitulatif des articles dans le panier, affiche le total et enregistre la commande dans la base de données.
4. **Historique des Commandes** : Affiche l’historique des commandes passées par l’utilisateur avec les détails de chaque commande (date, montant total, produits).

## Structure du Code

- `entities/Produit` : Classe représentant un produit avec des attributs comme le nom, la description, le prix, et le stock.
- `entities/Commande` : Classe représentant une commande avec une date, un montant total, les produits associés, et l'utilisateur.
- `repository/ProduitRepository` et `repository/CommandeRepository` : Interfaces pour la gestion des opérations CRUD sur les produits et les commandes.
- `controller/ProduitController` : Contrôleur gérant les requêtes pour afficher le catalogue, gérer le panier, et afficher l'historique des commandes.
- `templates/` : Contient les fichiers Thymeleaf (`catalogue.html`, `validation-commande.html`, `historique.html`) pour l’interface utilisateur.

## Installation et Configuration

### Prérequis

- **Java 17+**
- **MySQL** : Base de données pour stocker les données de produits et de commandes
- **Maven** : Pour gérer les dépendances

### Vidéo démonstartion

https://github.com/user-attachments/assets/0adb2b17-e0ff-486f-8936-bbab6ae263ca



