package com.gildedrose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    private static final int QUALITY_HIGH = 50;
    private static final int QUALITY_ZERO = 0;
    private static final int SELL_ZERO = 0;
    private static final int SELL_SIX = 6;
    private static final int SELL_ELEVEN = 11;
    private static final String AGED_BRIE = "Aged Brie";
    private static final String TAFKAL80ETC = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";


    public Item(String name, int sellIn, int quality){
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName(){
        return name;
    }

    public int getSellIn(){
        return sellIn;
    }

    public int getQuality(){
        return quality;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void update_quality(){
        switch (name) {
            case AGED_BRIE:
                if (quality < QUALITY_HIGH) {
                    quality = quality + 1;
                }
                sellIn = sellIn - 1;
                if (sellIn < SELL_ZERO) {
                    if (quality < QUALITY_HIGH) {
                        quality = quality + 1;
                    }
                }
                break;
            case TAFKAL80ETC:
                if (quality < QUALITY_HIGH) {
                    quality = quality + 1;

                    if (sellIn < SELL_ELEVEN) {
                        if (quality < QUALITY_HIGH) {
                            quality = quality + 1;
                        }
                    }

                    if (sellIn < SELL_SIX) {
                        if (quality < QUALITY_HIGH) {
                            quality = quality + 1;
                        }
                    }
                }
                sellIn = sellIn - 1;
                if (sellIn < SELL_ZERO) {
                    quality = QUALITY_ZERO;
                }
                break;
            case SULFURAS:
                break;
            default:
                if (quality > SELL_ZERO) {
                    quality = quality - 1;
                }
                sellIn = sellIn - 1;
                if (sellIn < SELL_ZERO) {
                    if (quality > SELL_ZERO) {
                        quality = quality - 1;
                    }

                }
                break;
        }
    }
}
