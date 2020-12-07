@tag
Feature: US_001 Chercher le nombre de produits dans un rayon
En tant que Vendeur
Je veux savoir le nombre de prdouits dans chaque rayon
Afin de savoir la diversi� du choix que j'offre � mes clients

	@tag1
	Scenario Outline: le rayon contient des produits
		Given que j ai les produits suivants dans le rayon "Legumes"
      |   "pomme de terre"  |
      |   "ognion"          |
      |   "carotte"         |
		When le Vendeur cherche le nombre de produits
		Then je trouve 3 produits
		
	@tag2
	Scenario Outline: le rayon ne contient pas de produits
		Given que je n ai aucun produits dans le rayon "Legumes"
		When le Vendeur cherche le nombre de produits
		Then je trouve 0 produits