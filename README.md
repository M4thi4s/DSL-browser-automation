# Projet Browser Automation
## Description
Ce projet a pour but de créer un langage pour tester des applications web. Ce langage permet de décrire des scénarios de test pour des applications web. Les tests sont écrits dans un fichier .browserTest et sont ensuite traduits en code JAVA. Ce code JAVA utilise l'API Selenium pour ouvrir un navigateur, effectuer les actions décrites dans le fichier .browserTest et fermer le navigateur.
Le langage utilise une syntaxe spécifique créer en XText et est interprété par XTend.

## Arborescence du projet :
Nous avons travaillé au sein des packages suivants : 
> org.xtext.browserautomation.mydsl : contient les fichiers décrivant notre syntaxe et le générateur de code Java
> fr.imta.massimotisi.browserautomation.example : contient les fichiers de tests .browserTest, le code Java généré et la librairie permettant l'interface entre selenium et le JAVA généré par nos fichiers .browserTest.

## Comment lancer le projet :
1. Ouvrir les packages suivants dans une instance d'eclipse : 
- org.xtext.browserautomation.mydsl
- org.xtext.browserautomation.mydsl.ide
- org.xtext.browserautomation.mydsl.tests
- org.xtext.browserautomation.mydsl.ui
- org.xtext.browserautomation.mydsl.ui.tests

2. Faire un clic droit sur le src du package org.xtext.browserautomation.mydsl et sélectionner "Run As" -> "Eclipse Application" (sélectionner "continue" si des fenêtres de confirmations s'affichent)

3. Dans la nouvelle instance d'eclipse, ouvrir le package "fr.imta.massimotisi.browserautomation.example"

4. L'extension des fichiers de notre syntaxe est ".browserTest". Les tests existants sont dans le package "fr.imta.massimotisi.browserautomation.example/src/fr/imta/massimotisi/browserautomation/example/browsertests/" et se nomment testNB.browsertest

5. En enregistrant un fichier .browserTest, le code Java correspondant est généré dans le package "fr.imta.massimotisi.browserautomation.example/src-gen/testNB.java"

6. Il est possible de lancer le code généré en faisant un clic droit sur le fichier testNB.java et en sélectionnant "Run As" -> "Java Application". Ce code JAVA ouvre un navigateur, effectue les actions décrites dans le fichier .browserTest et ferme le navigateur. Vous verrez dans la console un message de la forme "[TEST] lien1 => OK" si le test a été réussi. Sinon, une erreur sera affichée.

## Informations utiles
Fichier contenant notre syntaxe :
- src/org.xtext.browserautomation.mydsl/src/org/xtext/browserautomation/mydsl/BrowserTest.xtext

Fichier permettant la génération du code Java à partir du fichier .browserTest :
- src/org.xtext.browserautomation.mydsl/src/org/xtext/browserautomation/mydsl/generator/BrowserTestGenerator.xtend

Comment fonctionne notre librairie JAVA : 
Notre librairie JAVA permet de faire le lien entre le code JAVA généré par notre syntaxe et l'API Selenium. Elle est composée de 3 classes principales :
- ActionLib.java : contient les fonctions permettant d'effectuer les actions sur les éléments HTML
- SelectLib.java : contient les fonctions permettant de sélectionner des éléments HTML
- AssertLib.java : contient les fonctions permettant de vérifier l'existence des éléments HTML sélectionnés.

Les fichiers sont dans le package "fr.imta.massimotisi.browserautomation/lib/"

Limites de notre langage : 
- Notre librairie pourrait être améliorée. En particulier, les actions ne peuvent pas toutes recevoir de liste d'éléments en paramètre. Il faudrait modifier le fichier ActionLib.java et créer les fonctions clickElemen(List<WebElement> elements), setText(List<WebElement> elements), selectOption(List<WebElement> elements)
- Les parents sont remontés un à un, il aurait été interessant de trouver un système plus performant en remontant jusqu'au prochain parent qui utilise plus d'espace que son enfant. Ainsi, parcourir des arborescences HTML plus profondes serait plus rapide.