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

    public void updateQuality(){
        switch (name) {
            case SULFURAS:
                break;
            case AGED_BRIE:
                agedBrieUpgrade();
                break;
            case TAFKAL80ETC:
                TafkalUpgrade();
                break;
            default:
                defaultGoodUpgrade();
                break;
        }
    }

    private void defaultGoodUpgrade(){
        qualitySubtractOne();
        sellIn = sellIn - 1;
        if (sellIn < SELL_ZERO) {
            qualitySubtractOne();
        }
    }

    private void TafkalUpgrade(){
        sellIn = sellIn - 1;
        if (sellIn < SELL_ZERO) {
            quality = QUALITY_ZERO;
        } else {
            qualityPlusOne();
            if (sellIn < SELL_ELEVEN) {
                qualityPlusOne();
            }
            if (sellIn < SELL_SIX) {
                qualityPlusOne();
            }
        }
    }

    private void agedBrieUpgrade(){
        qualityPlusOne();
        sellIn = sellIn - 1;
        if (sellIn < SELL_ZERO) {
            qualityPlusOne();
        }
    }

    private void qualityPlusOne(){
        if (quality < QUALITY_HIGH) {
            quality++;
        }
    }

    private void qualitySubtractOne(){
        if (quality > QUALITY_ZERO) {
            quality--;
        }
    }
}
