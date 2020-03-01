package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_general_goods_and_sell_greater_than_0() {
        Item[] items = new Item[] { new Item("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.items[0].name);
        assertThat(app.items[0].quality, is(4));
        assertThat(app.items[0].sell_in, is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_general_goods_and_sell_less_than_0() {
        Item[] items = new Item[] { new Item("foo", -2, 6) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.items[0].name);
        assertThat(app.items[0].quality, is(4));
        assertThat(app.items[0].sell_in, is(-3));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_sell_greater_than_0() {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Aged Brie", app.items[0].name);
        assertThat(app.items[0].quality, is(6));
        assertThat(app.items[0].sell_in, is(0));
    }

    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_sell_less_than_0() {
        Item[] items = new Item[] { new Item("Aged Brie", -2, 6) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Aged Brie", app.items[0].name);
        assertThat(app.items[0].quality, is(8));
        assertThat(app.items[0].sell_in, is(-3));
    }


    @Test
    public void should_sell_minus_1_and_quality_plus_1_given_Aged_Brie_and_quality_greater_than_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 1, 55) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("Aged Brie", app.items[0].name);
        assertThat(app.items[0].quality, is(55));
        assertThat(app.items[0].sell_in, is(0));
    }

}
