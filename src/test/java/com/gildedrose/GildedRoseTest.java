package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_general_goods_and_sell_greater_than_0() {
        Item[] items = new Item[] { new Item("foo", 1, 50) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(49));
        assertThat(app.items[0] .getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_general_goods_and_quality_is_0() {
        Item[] items = new Item[] { new Item("foo", -1, 0) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(0));
        assertThat(app.items[0] .getSellIn(), is(-2));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_general_goods_and_sell_less_than_0() {
        Item[] items = new Item[] { new Item("foo", -2, 50) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(48));
        assertThat(app.items[0] .getSellIn(), is(-3));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_sell_greater_than_0() {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Aged Brie", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(6));
        assertThat(app.items[0] .getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_sell_greater_than_0_and_quality_is_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 50) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Aged Brie", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(50));
        assertThat(app.items[0] .getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_sell_less_than_0() {
        Item[] items = new Item[] { new Item("Aged Brie", -2, 47) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Aged Brie", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(49));
        assertThat(app.items[0] .getSellIn(), is(-3));
    }


    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_quality_greater_is_49() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, 49) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Aged Brie", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(50));
        assertThat(app.items[0] .getSellIn(), is(-2));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Sulfuras_and_sell_greater_than_0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(5));
        assertThat(app.items[0] .getSellIn(), is(1));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Sulfuras_and_sell_less_than_0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -2, 6) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(6));
        assertThat(app.items[0] .getSellIn(), is(-2));
    }


    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Sulfuras_and_quality_greater_is_50() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 50) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(50));
        assertThat(app.items[0] .getSellIn(), is(-1));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Sulfuras_and_quality_greater_is_50_and_sell_is_0() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(50));
        assertThat(app.items[0] .getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_greater_than_0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(8));
        assertThat(app.items[0] .getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_greater_than_0_and_quality_is_49() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 49) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(50));
        assertThat(app.items[0] .getSellIn(), is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_greater_than_6() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 7, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(7));
        assertThat(app.items[0] .getSellIn(), is(6));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_greater_than_6_and_quality_is_49() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 7, 49) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(50));
        assertThat(app.items[0] .getSellIn(), is(6));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_greater_than_11() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 12, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(6));
        assertThat(app.items[0] .getSellIn(), is(11));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_greater_than_11_and_quality_is_49() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 12, 49) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(50));
        assertThat(app.items[0] .getSellIn(), is(11));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_sell_less_than_0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -2, 50) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(0));
        assertThat(app.items[0] .getSellIn(), is(-3));
    }


    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_TAFKAL80ETC_and_quality_greater_is_50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0]. getName());
        assertThat(app.items[0] .getQuality(), is(50));
        assertThat(app.items[0] .getSellIn(), is(0));
    }


}
