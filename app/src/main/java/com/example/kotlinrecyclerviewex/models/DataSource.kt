package com.example.kotlinrecyclerviewex.models

class DataSource {
    companion object{
        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    " Daylong™ - Protection solaire haute précision",
                    "body",
                    "https://raw.githubusercontent.com/Nihelviseo/testApp/master/daylong.jpg",
                    "Laboratoires Galderma, dermatologie, solaire, protection de la peau, prévention solaire, innovation solaire."
                )
            )
            list.add(
                BlogPost(
                    "Klorane - Soins cheveux et corps",
                    "body",
                    "https://raw.githubusercontent.com/Nihelviseo/testApp/master/shop-pharmacie-parapharmacie-en-ligne-pas-cher-medicaments-soins-beaute-sante-6.png",
                    "Klorane- Découvrez les produits Klorane proposés par nos parapharmacies partenaires. Vente en ligne de la gamme Klorane chez 1001pharmacies"
                )
            )

            list.add(
                BlogPost(
                    "Nuxe - Soins visage et corps",
                    "body",
                    "https://raw.githubusercontent.com/Nihelviseo/testApp/master/nuxe-body.jpg",
                    "Retrouvez tous nos Soins visage et corps, Anti-Age et Spa NUXE sur le site Officiel. Livraison point relais offerte pour toute commande!\n"
                )
            )
            list.add(
                BlogPost(
                    "Furterer - Shampoings & soins capillaires René Furterer",
                    "body",
                    "https://raw.githubusercontent.com/Nihelviseo/testApp/master/5A-furterer.jpg",
                    "Rene Furterer - Une gamme complète de produits de soins pour les cheveux. Les produits de la marque René Furterer. René Furterer propose une gamme ..."
                )
            )
            list.add(
                BlogPost(
                    "Bioderma - Soins dermatologiques",
                    "body",
                    "https://raw.githubusercontent.com/Nihelviseo/testApp/master/bioderma.png",
                    "En proposant des gammes spécifiques à chaque sensibilité de peau, BIODERMA s'engage dans une approche complémentaire où produits de soin et d'hygiène, ..."
                )
            )
            list.add(
                BlogPost(
                    "La Roche Posay - produits de beauté, soins dermatologiques",
                    "body",
                    "https://raw.githubusercontent.com/Nihelviseo/testApp/master/cosmetiques.jpg",
                    "Découvrez les produits de beauté et soins dermatologiques La Roche-Posay. Bénéficiez de conseils d'experts selon votre type de peau."
                )
            )
            list.add(
                BlogPost(
                    "Rogé Cavaillès - Soin du corps et du visage pour peaux",
                    "body",
                    "https://raw.githubusercontent.com/Nihelviseo/testApp/master/camille.png",
                    "Rogé Cavaillès, marque historique de l'hygiène corporelle pour le soin du corps et du visage dédiés à la toilette et aux peaux délicates et sensibles.Découvrez ..."
                )
            )
            list.add(
                BlogPost(
                    "La Roche Posay - produits de beauté, soins dermatologiques",
                    "body",
                    "https://raw.githubusercontent.com/Nihelviseo/testApp/master/solaires-LRP.jpg",
                    "La Roche-Posay Laboratoire Dermatologique change la vie des peaux sensibles. Découvrez toutes nos offres exclusives ecommerce sur site officiel. Évaluez vos imperfections..."
                )
            )
            list.add(
                BlogPost(
                    "Avène - Soins visage Avène",
                    "body",
                    "https://raw.githubusercontent.com/Nihelviseo/testApp/master/1479906662jpg_5b3c9c072094b.jpg",
                    "AVENE. Nourrir et protéger sa peau avec l'eau thermale Avène. Depuis leur création, les laboratoires Avène s'efforcent de ..."
                )
            )
            return list
        }

    }
}