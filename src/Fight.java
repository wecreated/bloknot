public class Fight {

    public static void main(String[] args) {
        Pulya pulya = new Pulya();
        Pitbull pitbull = new Pitbull();
        fight(pulya, pitbull);
    }

    private static void fight(Pulya pulya, Pitbull pitbull) {
        while (true) {
            if (!pulya.isPulyaAlive && pitbull.isPutbullALive) {
                System.out.println("Pulya dead, Pitbull win");
                break;
            } else if (pulya.isPulyaAlive && !pitbull.isPutbullALive) {
                System.out.println("Pitbull is dead, Pulya win");
                break;
            } else if (!pulya.isPulyaAlive && !pitbull.isPutbullALive) {
                System.out.println("All dead");
                break;
            }
            if (pulya.health < 0) {
                pulya.isPulyaAlive = false;
            } else {
                pulya.health -= pitbull.power;
            }
            if (pitbull.health < 0) {
                pitbull.isPutbullALive = false;
            } else {
                pitbull.health -= pulya.power;
            }
        }
    }
}