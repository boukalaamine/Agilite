#Author: Amin Boukala & Taric Gandi
@tag
Feature: US01 Ajouter un enfant
  En tant que futur utilisateur de l'application blanche neige, je dois 
  pouvoir ajouter un enfant pour respecter la fin de l'histoire à savoir:
  ils eurent beaucoup d'enfants  
  @tag1
  Scenario: Ajout automatique d'un nouvel enfant
    Given Le mariage de la princesse <blanche Neige> avec le prince <charmant>
    When l'utilisateur decide de creer un nouvel enfant avec un <kirikou> et un age 0 
    Then Creation d'un nouvel enfant et ajout de cet enfant une liste

   
  