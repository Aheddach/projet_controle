package com.ensa.catalogue_mvc.controller;

import com.ensa.catalogue_mvc.entities.Commande;
import com.ensa.catalogue_mvc.entities.Produit;
import com.ensa.catalogue_mvc.repository.CommandeRepository;
import com.ensa.catalogue_mvc.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private CommandeRepository commandeRepository;

    private List<Produit> panier = new ArrayList<>();

    @GetMapping("/catalogue")
    public String afficherCatalogue(Model model) {
        model.addAttribute("produits", produitRepository.findAll());
        return "catalogue";
    }

    @PostMapping("/ajouter-au-panier/{id}")
    public String ajouterAuPanier(@PathVariable Long id) {
        produitRepository.findById(id).ifPresent(panier::add);
        return "redirect:/catalogue";
    }

    @GetMapping("/validation-commande")
    public String validerCommande(Model model) {
        double total = panier.stream().mapToDouble(Produit::getPrix).sum();
        model.addAttribute("panier", panier);
        model.addAttribute("total", total);
        return "validation-commande";
    }

    @PostMapping("/passer-commande")
    public String passerCommande() {
        Commande commande = new Commande();
        commande.setProduits(new ArrayList<>(panier));
        commande.setTotal(panier.stream().mapToDouble(Produit::getPrix).sum());
        commande.setDate(new Date());
        commandeRepository.save(commande);
        panier.clear();
        return "redirect:/historique";
    }

    @GetMapping("/historique")
    public String afficherHistorique(Model model) {
        model.addAttribute("commandes", commandeRepository.findAll());
        return "historique";
    }

}
