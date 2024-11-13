public class A4_howITurn extends World {

    public void go() {

        plane.pausetime=1;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 25;
        plane.setColor(200, 0, 0);
        plane.teleport(472,301);
        heart();


    }

    public void heart(){
        plane.startingAngle(225);
        plane.move(100);
        plane.startingAngle(180);
        plane.move(80);
        plane.startingAngle(135);
        plane.move(100);
        plane.startingAngle(45);
        plane.move(305);
        plane.startingAngle(315);
        plane.move(305);
        plane.startingAngle(225);
        plane.move(100);
        plane.startingAngle(180);
        plane.move(80);
        plane.startingAngle(135);
        plane.move(100);
    }


}
