package com.mavharsha.scratchPad;

public enum Directions {
    NORTH("North"){
        @Override
        public Directions move() {
            System.out.println("Travelling north");
            return NORTH;
        }
    },
    SOUTH("South"){
        @Override
        public Directions move() {
            System.out.println("Travelling South");
            return SOUTH;
        }
    },
    EAST("East"){
        @Override
        public Directions move() {
            System.out.println("Travelling East");
            return EAST;
        }
    },
    WEST("West"){
        @Override
        public Directions move() {
            System.out.println("Travelling West");
            return WEST;
        }
    };

    private String title;
    Directions(String title){
         this.title = title;
     }
    public String getTitle(){
         return this.title;
     }

    public abstract Directions move();
}
