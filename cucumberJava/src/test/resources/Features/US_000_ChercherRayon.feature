@tag
Feature: US_000 Chercher le rayon d'un produit
En tant que Vendeur
Je veux savoir le rayon de chaque produit
Afin de pouvoir verfier le stock

	@tag1
	Scenario Outline: le produit est affecté à un rayon
		Given un <produit> de <rayon>
		When le Vendeur en fait la demande
		Then <rayon> est retournee
    
    Examples:
      | produit  | rayon     |
      | "patate" | "Legumes" |
    
  @tag2
	Scenario Outline: le produit n'est pas affecté à un rayon
		Given un <produit> de <rayon>
		When le Vendeur en fait la demande
		Then un <messageErreur> est retournee
    
    Examples:
      | produit  |  rayon | messageErreur  |
      | "Iphone" |  ""    | "Pas de rayon" |