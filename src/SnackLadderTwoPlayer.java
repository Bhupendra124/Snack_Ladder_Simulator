public class SnackLadderTwoPlayer {
    public static void main(String[] args) {

        int count=0;
        int count1=1;

        int position=0;
        int position1=0;

        while ((position <= 99) && (position1<= 99)){
            System.out.println("position is " +position);

            int die=(int) (Math.random()*10) % 6+1;
            position=(position+die);
            int die1=(int) (Math.random()*10) % 6+1;
            position1=(position1+die1);

            count=(count+1);
            count1=(count1+die1);

            System.out.println("Die value is"+die);
            System.out.println("Die value is"+die1);

            int value=(int) (Math.random()*10) %3+1 ;
            int value2=(int) (Math.random()*10) %3+1;


            switch (value){
                case 1:
                    System.out.println("OOPs You are on same Position");
                    break;
                case 2:
                    position=(position+die);
                    if(position > 100){
                        position=(position-die);
                        continue;

                    }
                        System.out.println("Player one position after Ladder is" +position);
                    break;

                case 3:
                    position=(position-die);
                    if(position < 0){
                        position=0;
                    }
                    System.out.println("Player one position after snake is " +position);
                    break;
            }
            switch(value)
            {
                case 1:
                    System.out.println( "No Play You are in the same position!!!" );
                    break;

                case 2:
                    position1 = (position1 + die1);
                    if(position1>100)
                    {
                        position1 = (position1 - die1);
                        continue;
                    }
                    System.out.println( "Player 2 position after ladder is::" + position1 );
                    break;

                case 3:
                    position1 = (position1 - die1);

                    if(position1<0)
                    {
                        position1 = 0;
                    }
                    System.out.println( "Player 2 Position after snake is::" + position1 );
                    break;
            }

        }
        if(position == 100)
        {
            System.out.println( "Player ONE is the Winner!!!");
            System.out.println( "number of times die rolled is :: " + count );
        }
        else
        {
            System.out.println( "Player TWO is the Winner!!!" );
            System.out.println( "number of times die rolled is :: " + count1 );
        }
        System.out.println( "Die total play number is::" + (count1+count));

    }

        }
