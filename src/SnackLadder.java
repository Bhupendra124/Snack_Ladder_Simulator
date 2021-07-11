public class SnackLadder {
    public static void main(String[] args) {





        int Position = 0;
        System.out.println("Welcome to Snack Ladder Game");
        System.out.println("Your Start position is " + Position);


        while (Position <= 99) {

            int dice = 1+(int) (Math.random() *10) %6) ;
            System.out.println("Dice value is" + dice);
            Position=(Position+dice);

            System.out.println("Position is" +Position);
            int value = 1+(int) (Math.random() * 10) %3 ;
            System.out.println("Case Number" + value);





            switch (value) {
                case 1:
                    System.out.println("OOPs you are on same place Roll again");
                case 2:
                    ;
                    Position = (Position + dice);
                    System.out.println("Your position after Ladder" + Position);
                case 3:
                    Position = (Position - dice);

                    if (Position < 0) {
                        Position = 0;

                    } else {

                        
                        System.out.println("Your position after Snake is" + Position);
                        break;
                    }
            }
        }
    }
}