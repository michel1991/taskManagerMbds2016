## TaskManagerMbds2016 est un projet de prise en main rapide de JSF
##  OUTIL DE DEVELOPPEMENT

1. Netbeans 8.2.0 Michel Pour me frotter ..

1. Netbeans ... Melissa Begyn

1. Glassfish 4.1.1 Melissa Begyn

1. GlassFish Payara Michel pour me frotter ..
## TECHNOLOGIES UTILISEES

- JEE (EJB, JSF, JPA)
## BIBLIOTHEQUES 

- PrimeFaces

## INSTALLATION
- Créez votre base de donnée 
- Supprimer le fichier persistence.xml qui se trouve dans TaskManagerMBDS2016-ejb/src/conf/
- Créez votre propre fichier de persistance afin de communiquer avec votre base de donnée cela créera
1. Une source de donnée au sein de votre serveur glassfish ou autre;
1. Nettoyer et reconstruire votre projet

1. Déployez votre application
## PS

-  Avec Netbeans 8.0.2 il y a un bug, renommez le fichier glassfish-resources.xml en sun-resources.xml, sinon lors du déploiement, la serveur ne rajoutera pas automatiquement la base de données à ses connexions.

1. Verifiez la création de votre fichier beans.xml pour les Backing beans de JSF
 
