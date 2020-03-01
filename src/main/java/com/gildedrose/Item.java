package com.gildedrose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    private static int QUALITY_HIGH = 50;
    private static int QUALITY_ZERO = 0;
    private static int SELL_ZERO = 0;
    private static int SELL_SIX = 6;
    private static int SELL_ELEVEN = 11;


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
            case "Aged Brie":
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
            case "Backstage passes to a TAFKAL80ETC concert":
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
            case "Sulfuras, Hand of Ragnaros":
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
