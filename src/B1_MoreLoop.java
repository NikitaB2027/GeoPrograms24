public class B1_MoreLoop extends World {

    public void go() {

        //background
        plane.pausetime = 0;
        //sky
        plane.teleport(0, 0);
        //plane.isTrail=true;
        //plane.trailWidth=350;
        //m=m+1 = m++
        for (int m = 0; m < 351; m = m + 1 ) {
            for (int n = 0; n < 1001; n = n + 1) {
                plane.teleport(n, m);
                plane.setPixelColor(m / 2, m / 4, 248);
            }
        }
        //plane.setColor(112,121, 194);
        //plane.startingAngle(0);
        ///plane.move(700);
        //ground
        plane.teleport(0, 350);
        plane.startingAngle(0);
        plane.setColor(58, 201, 116);
        plane.trailWidth = 30;
        plane.isTrail = true;
        plane.move(1050);
        plane.isTrail = false;
        for (int o = 380; o < 630; o = o + 1) {
            for (int p = 0; p < 1001; p = p + 1) {
                plane.teleport(p, o);
                plane.setPixelColor(o/3, 150, 100);
            }
        }
                //plane.teleport(0,380);
                //plane.setColor(110,82,40);
                //plane.trailWidth=250;
                //plane.move(850);
                //water
        for (int o = 630; o <1001; o = o + 1) {
            for (int p = 0; p < 1001; p = p + 1) {
                plane.teleport(p, o);
                plane.setPixelColor(o/5, o/4, 248);
            }
        }
                //plane.teleport(0, 600);
                //plane.setColor(72, 107, 232);
                //plane.trailWidth = 250;
                //plane.move(850);

                for (int x = 0; x < 4; x = x + 1) {
                    plane.teleport(plane.random(50, 950), plane.random(50, 210));
                    star();
                }

                for (int x = 0; x < 3; x = x + 1) {
                    plane.teleport(plane.random(50, 950), plane.random(400, 450));
                    tree();
                }

                for (int x = 0; x < 4; x = x + 1) {
                    plane.teleport(plane.random(50, 950), plane.random(650, 750));
                    fish();
                }

            }

            //string=letter
            //integer=number
            public void star () {
                plane.setColor(249, 222, 12);
                plane.trailWidth = 10;
                plane.isTrail = true;
                plane.move(100);
                plane.turn(145);
                plane.move(100);
                plane.turn(145);
                plane.move(100);
                plane.turn(145);
                plane.move(100);
                plane.turn(145);
                plane.move(100);

            }

            public void tree () {
                plane.setColor(74, 50, 7);
                plane.trailWidth = 40;
                plane.isTrail = true;
                plane.startingAngle(90);
                plane.move(100);
                plane.setColor(15, 92, 25);
                plane.trailWidth = 50;
                plane.isTrail = false;
                plane.startingAngle(270);
                plane.move(200);
                plane.startingAngle(180);
                plane.move(80);
                plane.circle(10);
                plane.startingAngle(0);
                plane.move(60);
                plane.startingAngle(90);
                plane.move(35);
                plane.circle(20);
                plane.startingAngle(0);
                plane.move(20);
                plane.circle(8);
                plane.trailWidth = 65;
                plane.startingAngle(90);
                plane.move(10);
                plane.startingAngle(0);
                plane.move(30);
                plane.startingAngle(180);
                plane.move(130);
            }

            public void fish () {
                plane.setColor(237, 129, 28);
                plane.trailWidth = 30;
                plane.startingAngle(180);
                plane.move(50);
                plane.startingAngle(325);
                plane.move(30);
                plane.startingAngle(35);
                plane.move(40);
                plane.startingAngle(315);
                plane.move(10);
                plane.startingAngle(90);
                plane.move(15);
                plane.startingAngle(225);
                plane.move(10);
                plane.startingAngle(145);
                plane.move(40);
                plane.startingAngle(215);
                plane.move(30);
                plane.startingAngle(0);
                plane.trailWidth = 10;
                plane.move(7);
                plane.setColor(0, 0, 0);
                plane.move(3);
            }
            public void square ( int distance){
                for (int z = 0; z < 4; z = z + 1) {
                    plane.isTrail = true;
                    plane.move(distance);
                    plane.turn(90);
                    System.out.println("z: " + z);
                }
            }
        }
