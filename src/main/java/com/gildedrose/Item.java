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
        if (name.equals("Aged Brie") || name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (quality < 50) {
                quality = quality + 1;

                if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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
            }
        } else {
            if (quality > 0) {
                if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                    quality = quality - 1;
                }
            }
        }

        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if (name.equals("Aged Brie")) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                quality = 0;
            } else {
                if (quality > 0 && !name.equals("Sulfuras, Hand of Ragnaros")) {
                    quality = quality - 1;
                }
            }
        }
    }
}
