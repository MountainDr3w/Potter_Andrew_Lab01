import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//000001, Pipeweed, Long Bottom Leaf, 600.0
//000002, Lembas, Elven Wayfare Bread, 200.0
//000003, Wine, Woodland Elf Wine, 400.0
//000004, Mushrooms, Farmer Took’s Finest, 125.0
//000005, Mithril, Enchanted Dwarven Armor, 3000.0


class ProductTest {

    Product p1;

    @BeforeEach
    void setUp(){
        p1 = new Product("A", "A", "1", 10.0);

    }

    @org.junit.jupiter.api.Test
    void setName() {
        p1.setName("Pipeweed");
        assertEquals("Pipeweed",p1.getName());
    }

    @org.junit.jupiter.api.Test
    void setDescription() {
        p1.setDescription("Long Bottom Leaf");
        assertEquals("Long Bottom Leaf",p1.getDescription());
    }

    @org.junit.jupiter.api.Test
    void setID() {
        p1.setID("000001");
        assertEquals("000001",p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setCost() {
        p1.setCost(600.0);
        assertEquals(600.0,p1.getCost());
    }

    @org.junit.jupiter.api.Test
    void toCSV() {assertEquals("1 , A , A , 10.0",p1.toCSV());
    }
}