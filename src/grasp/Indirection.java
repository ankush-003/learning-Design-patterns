package grasp;

public class Indirection {
    public static void main(String[] args) {
        EnemyTank enemyTank = new EnemyTank();
        enemyTank.attack();

        EnemyRobot enemyRobot = new EnemyRobot();
        enemyRobot.smashWithHands();
        enemyRobot.walkForward();

        EnemyRobotAdapter enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);
        enemyRobotAdapter.attack();
    }
}

interface EnemyAttacker {
    void attack();

}

class EnemyTank implements EnemyAttacker {
    @Override
    public void attack() {
        System.out.println("Enemy Tank: Attack");
    }
}

// EnemyRobot does not implement EnemyAttacker, so we need to create an adapter
class EnemyRobot {
    void smashWithHands() {
        System.out.println("Enemy Robot: Smash with hands");
    }

    void walkForward() {
        System.out.println("Enemy Robot: Walk forward");
    }
}

// Adapter class
class EnemyRobotAdapter implements EnemyAttacker {
    private EnemyRobot enemyRobot;

    EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void attack() {
        enemyRobot.smashWithHands();
    }
}
