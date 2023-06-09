package Lesson4.Fan;

public class Fan {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        private int speed = MEDIUM;
        private boolean on = false;
        private double radius = 5;
        private  String color = "blue";


        public Fan(){
        }
        public Fan(int speed, double radius, String color, boolean on){
            this.speed = speed;
            this.radius = radius;
            this.color = color;
            this.on = on;
        }

        @Override
        public String toString() {
            if (on){
                return "Fan{'" +
                        "speed=" + speed +
                        ", color=" + color +
                        ", radius=" + radius +
                        ", fan is on" + '\'' +
                        '}' +"\n"
                        ;
            }
            else {
                return "Fan{'" +
                        "color=" + color +
                        ", radius=" + radius +
                        ", fan is off" + '\'' +
                        '}' +"\n"
                        ;
            }
        }
    }

