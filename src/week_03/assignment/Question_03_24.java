package week_03.assignment;


public class Question_03_24 {
    public static void main(String[] args) {

        int group = (int) (Math.random() * 3 + 1);
        String groupName = null;

        switch (group) {
            case 1:
                groupName = "Hearts";
                break;
            case 2:
                groupName = "Spades";
                break;
            case 3:
                groupName = "Squares";
                break;
            case 4:
                groupName = "Spades";
                break;
        }

        int number = (int) (Math.random() * 12 + 1);
        String cardNumber = null;
        switch (number) {
            case 1:

                cardNumber = "Ace";
                break;
            case 2:
                cardNumber = "King";
                break;
            case 3:
                cardNumber = "Queen";
                break;
            case 4:
                cardNumber = "Jack";
                break;
            case 5:
                cardNumber = "2";
                break;
            case 6:
                cardNumber = "3";
                break;
            case 7:
                cardNumber = "4";
                break;
            case 8:
                cardNumber = "5";
                break;
            case 9:
                cardNumber = "6";
                break;
            case 10:
                cardNumber = "7";
                break;
            case 11:
                cardNumber = "8";
                break;
            case 12:
                cardNumber = "9";
                break;
            case 13:
                cardNumber = "10";
                break;
        }
        System.out.println("the card of picked is " + groupName + " of " + cardNumber);
    }
}
