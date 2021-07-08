package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int SLOW = 1;
        int MEDIUM = 2;
        int FAST = 3;
        Fan fan1 = new Fan(FAST,true,10,"YELLOW");
        Fan fan2 = new Fan(MEDIUM,false,5,"Blue");
        System.out.println(fan1.toString());


    }

    public static class Fan {
        int SLOW =1;
        private int Speed;
        private boolean On;
        public double Radius;
        public String color;

        public Fan() {
            Radius = 5;
            color = "Blue";
            Speed = SLOW;
            On = false;
        }

        public Fan(int Speed, boolean On, double Radius, String color) {
            this.Speed = Speed;
            this.On = On;
            this.Radius = Radius;
            this.color = color;
        }

        public int getSpeed() {
            return Speed;
        }

        public boolean isOn() {
            return On;
        }

        public double getRadius() {
            return Radius;
        }

        public String getColor() {
            return color;
        }

        public String toString() {
            String result = this.color + this.Speed + this.Radius;
            if (this.isOn()) {
               result += "fan is on";
            }
            return result;
        }
    }
}
