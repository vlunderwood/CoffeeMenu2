package coffee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.*;

import coffee.beans.Menu;
import coffee.config.MenuBeanConfig;
import coffee.repo.IMenuRepo;

@SpringBootApplication
public class CoffeeMenuApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeMenuApplication.class, args);
	}

	@Autowired
	IMenuRepo repo;

	@Override
	public void run(String... args) throws Exception {

		addItemToMenu();
        
        List<Menu> menuItems = allMenuItems();
        for (Menu item : menuItems) {
            System.out.println(item.toString());
        }
    }

    private void addItemToMenu() {
        Menu menu = new Menu();
        menu.setItemName("Coffee");
        menu.setItemDescription("Black Coffee");
        menu.setItemPrice(2.50);
        
        repo.save(menu);
        System.out.println("Item added to the menu: " + menu.toString());
    }

    private List<Menu> allMenuItems() {
        return repo.findAll();
    }
}
	
	

