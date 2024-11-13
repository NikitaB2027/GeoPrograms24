public class B3_HalfTheRed extends World {
    //public 
    public int red;

    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("hallow.jpg");
        plane.showBackGround();

        for (int y = 1; y < 800; y = y + 1) {
            for (int x = 1; x < 800; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if(red<120 && green>70 && blue<100) {
                    plane.setPixelColor(red * 2, green / 4, blue + red);
                }

                if (red>120 && red<240 && green<240 && blue>110) {
                    plane.setPixelColor(red/5, green*(5/7), blue/3);
                }

            }
        }
    }
}

