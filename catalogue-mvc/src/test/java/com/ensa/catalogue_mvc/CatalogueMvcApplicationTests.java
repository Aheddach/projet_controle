package com.ensa.catalogue_mvc;

import com.ensa.catalogue_mvc.repository.CommandeRepository;
import com.ensa.catalogue_mvc.repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CatalogueMvcApplicationTests {

	@Test
	void contextLoads() {
	}


	@Autowired
	private ProduitRepository produitRepository;

	@Autowired
	private CommandeRepository commandeRepository;

}
