package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_general_goods_and_sell_greater_than_0() {
        Item item = new Item("foo", 1, 5);
         item.update_quality();
        assertEquals("foo", item.getName());
        assertThat(item.getQuality(), is(4));
        assertThat(item.getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_general_goods_and_sell_less_than_0() {
        Item item = new Item("foo", -2, 6);
        item.update_quality();
        assertEquals("foo", item.getName());
        assertThat(item.getQuality(), is(4));
        assertThat(item.getSellIn(), is(-3));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_sell_greater_than_0() {
        Item item = new Item("Aged Brie", 1, 5);
        item.update_quality();
        assertEquals("Aged Brie", item.getName());
        assertThat(item.getQuality(), is(6));
        assertThat(item.getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_sell_less_than_0() {
        Item item = new Item("Aged Brie", -2, 6);
        item.update_quality();
        assertEquals("Aged Brie", item.getName());
        assertThat(item.getQuality(), is(8));
        assertThat(item.getSellIn(), is(-3));
    }


    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_quality_greater_than_50() {
        Item item = new Item("Aged Brie", -1, 55);
        item.update_quality();
        assertEquals("Aged Brie", item.getName());
        assertThat(item.getQuality(), is(55));
        assertThat(item.getSellIn(), is(-2));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Sulfuras_and_sell_greater_than_0() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 1, 5);
        item.update_quality();
        assertEquals("Sulfuras, Hand of Ragnaros", item.getName());
        assertThat(item.getQuality(), is(5));
        assertThat(item.getSellIn(), is(1));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Sulfuras_and_sell_less_than_0() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", -2, 6);
        item.update_quality();
        assertEquals("Sulfuras, Hand of Ragnaros", item.getName());
        assertThat(item.getQuality(), is(6));
        assertThat(item.getSellIn(), is(-2));
    }


    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Sulfuras_and_quality_greater_than_50() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 55);
        item.update_quality();
        assertEquals("Sulfuras, Hand of Ragnaros", item.getName());
        assertThat(item.getQuality(), is(55));
        assertThat(item.getSellIn(), is(-1));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Sulfuras_and_quality_greater_than_50_and_sell_is_0() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 55);
        item.update_quality();
        assertEquals("Sulfuras, Hand of Ragnaros", item.getName());
        assertThat(item.getQuality(), is(55));
        assertThat(item.getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_greater_than_0() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 5);
        item.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
        assertThat(item.getQuality(), is(8));
        assertThat(item.getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_greater_than_6() {
        Item item =  new Item("Backstage passes to a TAFKAL80ETC concert", 7, 5);
        item.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
        assertThat(item.getQuality(), is(7));
        assertThat(item.getSellIn(), is(6));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_greater_than_11() {
        Item item =  new Item("Backstage passes to a TAFKAL80ETC concert", 12, 5);
        item.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
        assertThat(item.getQuality(), is(6));
        assertThat(item.getSellIn(), is(11));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_less_than_0() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", -2, 6);
        item.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
        assertThat(item.getQuality(), is(0));
        assertThat(item.getSellIn(), is(-3));
    }


    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_quality_greater_than_50() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 55);
        item.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.getName());
        assertThat(item.getQuality(), is(55));
        assertThat(item.getSellIn(), is(0));
    }


}
