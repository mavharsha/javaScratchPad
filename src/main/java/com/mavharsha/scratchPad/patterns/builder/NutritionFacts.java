package com.mavharsha.scratchPad.patterns.builder;

public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;


    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters
        private  int calories = 0;
        private  int fat = 0;
        private  int sodium = 0;
        private  int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int value){
            calories = value;
            return this;
        }

        public Builder fat(int value){
            fat = value;
            return this;
        }

        public Builder sodium(int value){
            sodium = value;
            return this;
        }

        public Builder carbohydrate(int value){
            carbohydrate = value;
            return this;
        }


        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }


    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
