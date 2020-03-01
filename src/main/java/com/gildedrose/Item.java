package com.gildedrose;

public class Item {

    public String name;

    public int sell_in;

    public int quality;

    public Item(String name, int sell_in, int quality){
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    public void update_quality(){
        if (!name.equals("Aged Brie")
            && !name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (quality > 0) {
                if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (sell_in < 11) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }

                    if (sell_in < 6) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                }
            }
        }

        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
            sell_in = sell_in - 1;
        }

        if (sell_in < 0) {
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
