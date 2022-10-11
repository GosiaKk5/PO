package agh.ics.oop;

public class Word {

    public static void move(String[] directions, direction_type[] conv_directions){
        for(int i = 0; i < directions.length; i++) {
            switch(directions[i]) {
                case "f":
                    conv_directions[i] = direction_type.FORWARD;
                    break;
                case "b":
                    conv_directions[i] = direction_type.BACKWARD;
                    break;
                case "l":
                    conv_directions[i] = direction_type.LEFT;
                    break;
                case "r":
                    conv_directions[i] = direction_type.RIGHT;
                    break;
            };
        }
    }
    public static void run (direction_type[] conv_directions){

        for(int i = 0; i < conv_directions.length; i++){
            System.out.println("zwierzak idzie " + conv_directions[i]);
        }
        }


    public static void main(String[] args) {
        System.out.println("system wystartował");
        direction_type[] directions = new direction_type[args.length];
        move(args, directions);
        run(directions);
        System.out.println("system zakończył działanie");

    }

}
