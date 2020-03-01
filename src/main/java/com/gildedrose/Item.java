package com.gildedrose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

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
                if (quality < 50) {
                    quality = quality + 1;
                }
                sellIn = sellIn - 1;
                if (sellIn < 0) {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                if (quality < 50) {
                    quality = quality + 1;

                    if (sellIn < 11) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }

                    if (sellIn < 6) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                }
                sellIn = sellIn - 1;
                if (sellIn < 0) {
                    quality = 0;
                }
                break;
            case "Sulfuras, Hand of Ragnaros":
                break;
            default:
                if (quality > 0) {
                    quality = quality - 1;
                }
                sellIn = sellIn - 1;
                if (sellIn < 0) {
                    if (quality > 0) {
                        quality = quality - 1;
                    }

                }
                break;
        }
    }
}
