public class B0_BasicLoop extends World {

    public int red;
    public int blue;
    public int green;

    public void go() {
        //background wall
        plane.pausetime=0;
        plane.teleport(0,0);
        for (int y = 1; y < 545; y=y+1 ) {
            for (int x = 1; x< 1000; x++) {
                plane.teleport(x, y);
                plane.setPixelColor(230, 211, 209);
            }
        }
        //background white space
        for (int y = 545; y <648 ; y=y+1 ) {
            for (int x = 1; x< 1000; x++) {
                plane.teleport(x, y);
                plane.setPixelColor(245, 245, 245);
            }
        }
        //background squares on white space
        plane.teleport(-15, 556);
        for(int x = 100; x<1400; x=x+100){
            plane.trailWidth = 10;
            plane.isTrail = true;
            plane.setColor(196, 196, 196);
            plane.square(70);
            plane.teleport(-15+x, 556);
        }
        //background floor
        for (int y = 648; y <801 ; y=y+1 ) {
            for (int x = 1; x< 1000; x++) {
                plane.teleport(x, y);
                plane.setPixelColor(y/5, 90, 51);
            }
        }
        //painting descriptions block
        plane.teleport(45,465);
        plane.setColor(184, 158, 129);
        plane.trailWidth=60;
        plane.startingAngle(180);
        plane.move(25);
        plane.teleport(923,346);
        plane.move(25);

        //painting
        for (int row =1; row<300; row++){
            for(int col=1;col<420; col++){
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.teleport(col+136, row+210);
                //282
                plane.setPixelColor(red, green, blue);
                 if (red>1 && green>55 && blue>40) {
                    plane.setPixelColor(red, green /4, blue/2);
                }
                plane.teleport(col*2.5, row*2.5);



            }
        }
        //painting border
        plane.trailWidth=25;
        plane.setColor(184,130,50);
        plane.teleport(114,186);
        plane.startingAngle(0);
        plane.move(440);
        plane.turn(-90);
        plane.move(320);
        plane.turn(-90);
        plane.move(440);
        plane.turn(-90);
        plane.move(320);

        //dinosaur
        plane.trailWidth=30;
        plane.setColor(245,245,245);
        plane.teleport(907,119);
        plane.circle(10);
        plane.teleport(860,79);
        plane.trailWidth=70;
        plane.startingAngle(150);
        plane.move(180);
        plane.teleport(893,155);
        plane.trailWidth=40;
        plane.startingAngle(130);
        plane.move(100);
        plane.teleport(886,61);
        plane.trailWidth=20;
        plane.startingAngle(290);
        plane.move(20);
        plane.startingAngle(165);
        plane.move(60);
        plane.teleport(800,97);
        plane.startingAngle(270);
        plane.move(60);
        plane.trailWidth=25;
        plane.startingAngle(120);
        plane.move(120);
        plane.teleport(740,152);
        plane.startingAngle(245);
        plane.move(30);
        plane.startingAngle(100);
        plane.move(50);
        plane.teleport(836,91);
        plane.setColor(64,64,64);
        plane.trailWidth=35;
        plane.startingAngle(110);
        plane.square(10);
        plane.teleport(771,137);
        plane.trailWidth=20;
        plane.square(7);
        plane.teleport(736,190);
        plane.trailWidth=10;
        plane.square(4);
        plane.teleport(884,188);
        plane.trailWidth=15;
        plane.startingAngle(130);
        plane.move(30);
        plane.teleport(857,76);
        plane.setColor(245,245,245);
        plane.startingAngle(145);
        plane.trailWidth=20;
        plane.move(70);
    //teeth
        plane.teleport(818,201);
        plane.setColor(243,220,146);
        plane.trailWidth=7;
        topteeth();
        plane.teleport(800,214);
        topteeth();
        plane.teleport(781,228);
        topteeth();
        plane.teleport(842,214);
        bottomteeth();
        plane.teleport(831,232);
        bottomteeth();
        //body
        plane.teleport(917,174);
        plane.setColor(245,245,245);
        plane.trailWidth=30;
        plane.startingAngle(28);
        plane.move(110);
        plane.teleport(960,154);
        plane.startingAngle(110);
        plane.trailWidth=10;
        plane.move(70);
        plane.teleport(982,169);
        plane.startingAngle(110);
        plane.move(70);
        plane.teleport(997, 180);
        plane.startingAngle(108);
        plane.move(70);

        //people code
        for (int x = 0; x < 3; x = x + 1) {
            plane.teleport(plane.random(50, 950), plane.random(650, 750));
            person();
        }



    }

    public void person(){
        plane.setColor(1,1,1);
        plane.startingAngle(270);
        plane.isTrail=true;
        plane.trailWidth=30;
        plane.move(40);
        plane.isTrail=false;
        plane.startingAngle(0);
        plane.move(30);
        plane.startingAngle(90);
        plane.isTrail=false;
        plane.move(40);
        plane.isTrail=true;
        plane.startingAngle(270);
        plane.move(40);
        plane.isTrail=false;
        plane.startingAngle(180);
        plane.move(40);
        plane.trailWidth=85;
        plane.startingAngle(270);
        plane.setColor(51, 19, 87);
        plane.move(40);
        plane.isTrail=true;
        plane.move(50);
        //head
        plane.trailWidth=40;
        plane.setColor(64,41,6);
        plane.isTrail=false;
        plane.startingAngle(0);
        plane.move(20);
        plane.isTrail=true;
        plane.circle(5);
       // plane.startingAngle(180);
        plane.isTrail=false;
        //plane.move(40);
        plane.startingAngle(270);
        plane.move(80);
        plane.startingAngle(180);
        plane.isTrail=true;
        plane.trailWidth=80;
        plane.move(50);
    }

    public void topteeth(){
        plane.startingAngle(90);
        plane.move(10);
        plane.startingAngle(240);
        plane.move(11);
    }

    public void bottomteeth(){
        plane.startingAngle(210);
        plane.move(10);
        plane.startingAngle(60);
        plane.move(11);
    }
}

