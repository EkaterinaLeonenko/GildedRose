import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GuidedRoseMyTest {

	@Test
	public void testUpdateEndOfDay_SellInValueDenotes() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("generic", 5, 10) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemWork = items.get(0);
		assertEquals(9, itemWork.getQuality());
	}
	
	@Test
	public void testUpdateEndOfDay_SellDatePassedQualityDegrades2() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("generic", -2, 10) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemWork = items.get(0);
		assertEquals(8, itemWork.getQuality());
	}
	
	@Test
	public void testUpdateEndOfDay_QualityNotNegative() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("generic", 5, 0) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemWork = items.get(0);
		assertEquals(0, itemWork.getQuality());
	}
	
	@Test
	public void testUpdateEndOfDay_QualityNotNegative2() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("generic", -2, 1) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemWork = items.get(0);
		assertEquals(0, itemWork.getQuality());
	}
	
	@Test
	//this test failed
	public void testUpdateEndOfDay_QualityNotMore50() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("generic", 5, 60) );
		
		// Act
		store.updateEndOfDay();
		
		// Assert
		List<Item> items = store.getItems();
		Item itemWork = items.get(0);
		assertEquals(50, itemWork.getQuality());
	}
	
	@Test
	public void testUpdateEndOfDay_AgedBrieIncreasesQualityOlder() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Aged Brie", 2, 10) );
				
		// Act
		store.updateEndOfDay();
				
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(11, itemBrie.getQuality());
		}
	
	@Test
	public void testUpdateEndOfDay_AgedBrieNotMore50() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Aged Brie", 5, 50) );
				
		// Act
		store.updateEndOfDay();
				
		// Assert
		List<Item> items = store.getItems();
		Item itemBrie = items.get(0);
		assertEquals(50, itemBrie.getQuality());
		}
	
	@Test
	//this test failed
	public void testUpdateEndOfDay_Sulfuras() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Sulfuras", 5, 80) );
				
		// Act
		store.updateEndOfDay();
				
		// Assert
		List<Item> items = store.getItems();
		Item itemSulfuras = items.get(0);
		assertEquals(80, itemSulfuras.getQuality());
		}
	
	@Test
	//this test failed
	//the name of the item is not just "Backstage passes"
	public void testUpdateEndOfDay_Backstagepasses1() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Backstage passes", 20, 10) );
				
		// Act
		store.updateEndOfDay();
				
		// Assert
		List<Item> items = store.getItems();
		Item itemBackstagepasses = items.get(0);
		assertEquals(11, itemBackstagepasses.getQuality());
		}
	
	@Test
	//this test failed
	//the name of the item is not just "Backstage passes"
	public void testUpdateEndOfDay_Backstagepasses2() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Backstage passes", 10, 10) );
				
		// Act
		store.updateEndOfDay();
				
		// Assert
		List<Item> items = store.getItems();
		Item itemBackstagepasses = items.get(0);
		assertEquals(12, itemBackstagepasses.getQuality());
		}
	
	@Test
	//this test failed
	//the name of the item is not just "Backstage passes"
	public void testUpdateEndOfDay_Backstagepasses3() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Backstage passes", 5, 10) );
				
		// Act
		store.updateEndOfDay();
				
		// Assert
		List<Item> items = store.getItems();
		Item itemBackstagepasses = items.get(0);
		assertEquals(13, itemBackstagepasses.getQuality());
		}
	
	@Test
	//this test failed
	//the name of the item is not just "Backstage passes"
	public void testUpdateEndOfDay_Backstagepasses4() {
		// Arrange
		GildedRose store = new GildedRose();
		store.addItem(new Item("Backstage passes", 0, 10) );
				
		// Act
		store.updateEndOfDay();
				
		// Assert
		List<Item> items = store.getItems();
		Item itemBackstagepasses = items.get(0);
		assertEquals(0, itemBackstagepasses.getQuality());
		}
	


}
