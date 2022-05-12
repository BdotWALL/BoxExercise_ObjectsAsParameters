public class Box {
        int width;
        int height;

             public Box(int w, int h) {
                    width = w;
                     height = h;

            }

             public Box(Box b) {
                    this.width = b.width;
                    this.height = b.height;
            }

            public boolean isEqual(Box b) {
                    if(this.width == b.width && this.height ==b.height) {
                        return true;
                    }else {
                        return false;
                    }

            }

            public Box duplicate(){
                    Box temp = new Box(this) ;
                    return temp;
            }

            public static boolean isTwoObjectsEqual(Box b1, Box b2){
                    if(b1.width == b2.width && b1.height == b2.height) {
                        return true;
                    }else{
                        return false;
                    }
                
            }

            public void display() {
                    System.out.println("Width is " + this.width  + " and height is " + this.height);
           }

}