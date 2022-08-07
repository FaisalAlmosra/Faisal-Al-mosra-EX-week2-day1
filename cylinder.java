public class cylinder extends circle {

        private double height=1.0;

        public cylinder(){
            super();
        }

        public cylinder(double radius) {
            super(radius);
        }

        public cylinder(double radius, double height) {
            super(radius);
            this.height = height;
        }

        public cylinder(double radias, String color, double height) {
            super(radias, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
        public double getVolume(){
            return super.getArea()*this.getHeight();
        }

    }