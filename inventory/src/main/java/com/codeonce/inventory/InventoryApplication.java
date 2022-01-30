package com.codeonce.inventory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codeonce.inventory.dao.CategoryRepository;
import com.codeonce.inventory.dao.CompanyRepository;
import com.codeonce.inventory.dao.InventoryRepository;
import com.codeonce.inventory.dao.ProductRepository;
import com.codeonce.inventory.model.Category;
import com.codeonce.inventory.model.Company;
import com.codeonce.inventory.model.Inventory;
import com.codeonce.inventory.model.Product;

import static com.codeonce.inventory.utils.TestUtils.*;

@SpringBootApplication
public class InventoryApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private InventoryRepository inventoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Company company = new Company("CompanyName1");
		company.setCode("CompanyName1");
		companyRepository.save(company);

		Category category = new Category("tshirt", "This is a TShirt Category");
		category.setCode("tshirt");

		Category category2 = new Category("trousers", "This is a Trousers Category");
		category2.setCode("trousers");
		categoryRepository.saveAll(List.of(category, category2));

		Product product1 = createProduct("P1", "Black TShirt Size S", company, category, 14);

		Product product2 = createProduct("P2", "White TShirt Size M", company, category, 11);

		Product product3 = createProduct("P3", "Red TShirt Size S", company, category, 5);

		Product product4 = createProduct("P4", "White TShirt Size L", company, category, 7);

		Product product5 = createProduct("P5", "Black Trousers Size S", company, category2, 7);

		Product product6 = createProduct("P6", "White Trousers Size M", company, category2, 11);

		Product product7 = createProduct("P7", "Red Trousers Size S", company, category2, 13);

		Product product8 = createProduct("P8", "White Trousers Size L", company, category2, 14);

		productRepository
				.saveAll(List.of(product1, product2, product3, product4, product5, product6, product7, product8));

		Inventory inventory1 = createInventory("INV1", 12D, "P1");

		Inventory inventory2 = createInventory("INV2", 12D, "P2");

		Inventory inventory3 = createInventory("INV3", 12D, "P3");

		Inventory inventory4 = createInventory("INV4", 12D, "P4");

		Inventory inventory5 = createInventory("INV5", 12D, "P5");

		Inventory inventory6 = createInventory("INV6", 12D, "P6");

		Inventory inventory7 = createInventory("INV7", 12D, "P7");

		Inventory inventory8 = createInventory("INV8", 12D, "P8");

		inventoryRepository.saveAll(List.of(inventory1, inventory2, inventory3, inventory4, inventory5, inventory6,
				inventory7, inventory8));

	}

}
