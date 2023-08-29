package week_04.assignment;


public class Question_04_06 {
    public static void main(String[] args) {

        System.out.println("The three angles are : ");

        double angle1 = (Math.random() * Math.PI) * 2;
        double angle2 = (Math.random() * Math.PI) * 2;
        double angle3 = (Math.random() * Math.PI) * 2;

        final double RADIUS = 40;

        double xOfPoint1 = RADIUS * Math.cos(angle1);
        double yOfPoint1 = RADIUS * Math.sin(angle1);

        double xOfPoint2 = RADIUS * Math.cos(angle2);
        double yOfPoint2 = RADIUS * Math.sin(angle2);

        double xOfPoint3 = RADIUS * Math.cos(angle3);
        double yOfPoint3 = RADIUS * Math.sin(angle3);

        double sideAOfBetweenPoint1AndPoint2 = Math.sqrt(Math.pow(xOfPoint1 - xOfPoint2, 2)
                + Math.pow(yOfPoint1 - yOfPoint2, 2));

        double sideBOfBetweenPoint1AndPoint2 = Math.sqrt(Math.pow(xOfPoint2 - xOfPoint3, 2)
                + Math.pow(yOfPoint2 - yOfPoint3, 2));

        double sideCOfBetweenPoint1AndPoint2 = Math.sqrt(Math.pow(xOfPoint1 - xOfPoint3, 2)
                + Math.pow(yOfPoint1 - yOfPoint3, 2));

        double angleA = Math.acos((sideAOfBetweenPoint1AndPoint2 * sideAOfBetweenPoint1AndPoint2
                - sideBOfBetweenPoint1AndPoint2 * sideBOfBetweenPoint1AndPoint2
                - sideCOfBetweenPoint1AndPoint2 * sideCOfBetweenPoint1AndPoint2)
                / (-2 * sideBOfBetweenPoint1AndPoint2 * sideCOfBetweenPoint1AndPoint2));


        double angleB = Math.acos((sideBOfBetweenPoint1AndPoint2 * sideBOfBetweenPoint1AndPoint2
                - sideAOfBetweenPoint1AndPoint2 * sideAOfBetweenPoint1AndPoint2
                - sideCOfBetweenPoint1AndPoint2 * sideCOfBetweenPoint1AndPoint2)
                / (-2 * sideAOfBetweenPoint1AndPoint2 * sideCOfBetweenPoint1AndPoint2));


        double angleC = Math.acos((sideCOfBetweenPoint1AndPoint2 * sideCOfBetweenPoint1AndPoint2
                - sideBOfBetweenPoint1AndPoint2 * sideBOfBetweenPoint1AndPoint2
                - sideAOfBetweenPoint1AndPoint2 * sideAOfBetweenPoint1AndPoint2)
                / (-2 * sideAOfBetweenPoint1AndPoint2 * sideBOfBetweenPoint1AndPoint2));

        System.out.printf("the three angles are : %5.2f  %5.2f  %5.2f " ,  Math.toDegrees(angleA)
                , Math.toDegrees(angleB) , Math.toDegrees(angleC) );
    }
}
