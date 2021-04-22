package Projects.Physics;

public class PhysicsObject {

    //mass (in kg)
    private float mass;

    //positions (in meters)
    private float xPos;
    private float yPos;

    //velocities (in meters/second)
    private float xVel;
    private float yVel;

    //constants
    private final float g = -9.8f;

    public PhysicsObject(float mass, float xPos, float yPos, float xVel, float yVel) {
        this.mass = mass;
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    public PhysicsObject(float mass, float xPos, float yPos) {
        this.mass = mass;
        this.xPos = xPos;
        this.yPos = yPos;
        xVel = 0;
        yVel = 0;
    }

    public PhysicsObject(float mass) {
        this.mass = mass;
        xPos = 0;
        yPos = 0;
        xVel = 0;
        yVel = 0;
    }

    public PhysicsObject() {
        mass = 1;
        xPos = 0;
        yPos = 0;
        xVel = 0;
        yVel = 0;
    }

    /**
     *
     * @param dt the time step of the calculations, in seconds.
     */
    public void tick(float dt) {
        yVel = yVel + g*dt;
        yPos = yPos + yVel*dt;
    }

    public String toString(){
        return (
                "mass: " + mass + "\n" + "xPos: " + xPos + "\n" + "yPos: " + yPos + "\n" + "xVel: " + xVel + "\n" + "yVel: " + yVel + "\n"
                );
    }

    public static void main(String[] args) {
        PhysicsObject bowlingBall = new PhysicsObject(1f);
        System.out.println("An object falling under earth's gravity:");
        for (int i = 0; i < 10; i++) {
            if (i > 0){
                for (int j = 0; j < 1000; j++) {
                    bowlingBall.tick(0.001f);
                }
            }
            System.out.println("At " + i + " seconds, the object's values are: ");
            System.out.println(bowlingBall);
        }
    }
}
