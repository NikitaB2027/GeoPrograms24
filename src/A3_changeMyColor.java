public class A3_changeMyColor extends World {

    public void go() {

        System.out.println("This message will be printed to the window below.");
        plane.teleport(182,637);
        plane.startingAngle(45);
        plane.isTrail=true;
        plane.trailWidth=200;
        plane.setColor(94,54,27);
        square();
        plane.teleport(205,305);
        plane.setColor(117,72,41);
        plane.startingAngle(45);
        plane.trailWidth = 150;
        square();
        plane.setColor(242,114,29);
        plane.trailWidth=10;
        plane.teleport(460,415);
        triangle();
        plane.teleport(480,385);
        plane.pausetime=0;
        plane.setColor(5,5,5);
        plane.circle(2);
        plane.teleport(256,385);
        plane.circle(2);





    }
    public void square() {
        plane.pausetime=1;
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
    }

    public void triangle() {
        plane.startingAngle(180);
        plane.move(85);//300
        plane.startingAngle(45);
        plane.move(65);//215
        plane.startingAngle(315);
        plane.move(65);//215
        plane.startingAngle(90);
    }
}
