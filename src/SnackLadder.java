public class SnackLadder {
    public static void main(String[] args) {
        int Position = 0;
        System.out.println("Welcome to Snack Ladder Game");
        System.out.println("Your Start position is " + Position);


        int dice=(int)( Math.random()* 10)%6+1;
        System.out.println("Dice value is" +dice);

        int value=(int)(Math.random()*10) %3+1;
        System.out.println("Case Number"+value);


        switch (value){
            case 1:
                System.out.println("OOPs you are on same place Roll again");
            case 2;
            Position=(Position+dice);
                System.out.println("Your position after Ladder"+Position);
            case 3:
            Position=(Position-dice);
        }
    }
    }