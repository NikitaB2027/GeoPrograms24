public class A2_Thickness extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("A2 Thickness");
        plane.pausetime= 1;
        plane.teleport(0,0);
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 1000;
        plane.setColor(78,150,245);
        plane.move(200);

        //walls
        plane.startingAngle(90);
        plane.isTrail=false;
        plane.move(400);
        plane.trailWidth=20;
        plane.setColor(242,190,107);
        plane.isTrail=true;
        plane.move(300);
        plane.startingAngle(0);
        plane.move(300);
        plane.startingAngle(270);
        plane.move(300);
        plane.teleport(207,410);
        plane.startingAngle(0);
        plane.trailWidth=300;
        plane.move(15);

        //grass
        plane.teleport(0,717);
        plane.startingAngle(0);
        plane.setColor(53,189,89);
        plane.trailWidth=100;
        plane.move(1000);

        //roof
        plane.teleport(500,406);//500,406
        plane.trailWidth=20;
        plane.setColor(249,0,0);
        triangle();

        //windows
        plane.isTrail=false;
        plane.move(100);//100
        plane.startingAngle(180);
        plane.move(40);//40
        plane.isTrail=true;
        plane.trailWidth=20;
        plane.setColor(181,213,235);
        square();
        plane.isTrail=false;
        plane.startingAngle(180);
        plane.move(160);
        plane.isTrail=true;
       square();

        //door
        plane.startingAngle(90);
        plane.isTrail=false;
        plane.move(150);
        plane.startingAngle(0);
        plane.move(27);
        plane.startingAngle(270);
        plane.setColor(82,40,17);
        plane.isTrail=true;
        plane.trailWidth=60;
        plane.move(50);

        plane.pausetime=0;
        plane.teleport(800,200);
        plane.setColor(245,228,44);
        plane.fillCircle(20);
        plane.teleport(740,250);
        plane.trailWidth=70;
        plane.move(75);


    }

    public void square() {
        plane.pausetime=1;
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
    }

    public void triangle(){
        plane.startingAngle(180);
        plane.move(300);
        plane.startingAngle(315);
        plane.move(215);
        plane.startingAngle(45);
        plane.move(215);
        plane.startingAngle(90);
    }
}


