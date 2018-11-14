package hous.of.horrors;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//initialize
public class ScaryHouse {

// intance variables for location, UserName, isove, backpack
    private String location;
    private String UserName;
    public String backpack = "nothing";
    
//initialize Start, String with Switch Statement 
    public int Start() {

        String[] Op1 = {"Yes, im sure"};

        int live = JOptionPane.showOptionDialog(null, "You are stepping in "
                + "the wrong front yard. Do you want to continue walking?",
                "Haunted House ", 0, JOptionPane.PLAIN_MESSAGE, null, Op1,
                null);
        switch (live) {
            case 0:
                System.out.println("The game Start");
                break;

        }

// audio for the background, playing all times till death 
        File Clap = new File("Ghost busters .wav");
        PLaySound(Clap);
        return 0;
    }

    static void PLaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
        } catch (Exception e) {

        }

// Image from the house, the map and icon of person, windows open and suggest 
//the user not to enter the house 
        ImageIcon house = new ImageIcon("Haunted-House.jpg");
        JOptionPane.showMessageDialog(null, " Are you brave enough to enter "
                + "this haunted and scary house "
                + "\n once you open the door there is no turning back, "
                + "to enter"
                + " \n********************* PRESS OK *********************",
                "The House of Horrors", 0,
                house);

    }
// Door initializing, Image, String, Switch Statement

    public void door() {
        ImageIcon user = new ImageIcon("person-icon.png");
        String userName = (String) JOptionPane.showInputDialog(null, "Enter Name: ", "The House of Horrors\n Credentials", 0,
                user, null, "");
        this.UserName = userName;
        ImageIcon map = new ImageIcon("MapStartHere.png");
        String[] OpenDoor = new String[]{"Living room", "Dining room",
            "Up Stairs"};
        int DoorResponse = JOptionPane.showOptionDialog(null,
                "UHHHHH you entered the House and the doors closed behing you\n"
                + "there is no turning back, were do you want to go next"
                + " " + userName, " The House of Horrors\n Follow the map",
                0, 0, map, OpenDoor, 0);
       
        switch (DoorResponse) {
            case 0:
                livingRoom();
                break;
            case 1:
                diningRoom();                    // converti esto en switch check si public void livingroom funciona 
                break;
            case 2:
                upStairs();
                break;

        }
    }
// Living Room initializing 

    private void livingRoom() {

        ImageIcon Mapdeath = new ImageIcon("Living Room .jpg");
        ImageIcon Ghost = new ImageIcon("ghost.jpg");
        String[] OpenDoor2 = new String[]{"Chest", "Bath room"};
        int LivingResponse = JOptionPane.showOptionDialog(null, UserName
                + " Were will you go Next ", "The House of Horrors", 0, 0,
                null, OpenDoor2, null);
        if (LivingResponse == 0) {
            JOptionPane.showMessageDialog(null, " You collect a treasure and place it in your bag... BUUUUH a ghost escapes "
                    + "and scares you to death!", null, LivingResponse, Ghost);
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                    + " You've died here.", "Try Again if you dare",
                    LivingResponse, Mapdeath);
// Bachpack initializing             
           
            backpack = "a tresure";

        } else if (LivingResponse == 1) {
            BathRoom();
        }
    }
// BathR Room initializing, Image, String, If Statement

    public void BathRoom() {
        String[] OpenDoor2 = new String[]{"Shower", "Mirror"};
        ImageIcon Mapdeath = new ImageIcon("Bathroom 1st floor .jpg");
        int LivingResponse = JOptionPane.showOptionDialog(null, UserName
                + " Were will you go Next ", "The House of Horrors", 0, 0,
                null, OpenDoor2, null);
        if (LivingResponse == 0) {
            JOptionPane.showMessageDialog(null, " The room suddenly steams up "
                    + "and you feel fingers touching the back of your neck, you"
                    + " look behind and a zombie kills you ");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName + ""
                    + " You've died here.", "Try Again if you dare",
                    LivingResponse, Mapdeath);

        } else if (LivingResponse == 1) {
            JOptionPane.showMessageDialog(null, "You grab a lamp and place it "
                    + "inside your backpack then See a bloody face looking back"
                    + " at you and eats your brains");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName + " "
                    + "You've died here.", "Try Again if you dare",
                    LivingResponse, Mapdeath);
// Bachpack initializing             
            backpack = "a Lamp";
        }
    }

//Dinning Room initializing Image, String, If Statement 
    private void diningRoom() {
        String[] OpenDoor3 = new String[]{"Candelabro", "Kitchen"};
        ImageIcon Mapdeath = new ImageIcon("Dining Room .jpg");
        int DiningResponse = JOptionPane.showOptionDialog(null, UserName
                + " Were will you go Next ", "The House of Horrors\n "
                + "Your Next Move", 0, 0, null, OpenDoor3, 0);
        if (DiningResponse == 0) {
            JOptionPane.showMessageDialog(null, "You grap a $100 bill and"
                    + " The Candelabro Light up by"
                    + " themselves you see a death Shadow you get scared, you "
                    + "run and "
                    + "hit your head with a metal door");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                    + " You've died here.", "Try Again if you dare",
                    DiningResponse, Mapdeath);
// Bachpack initializing                
            backpack = "a $100 bill";
        } else if (DiningResponse == 1) {

            Kitchen();

        }

    }
// Kitchen initializing, Image, String, Switch Statement

    public void Kitchen() {
        String[] OpenDoor4 = new String[]{"Cabinet", "Refrigerator", "Pantry"};
        ImageIcon Mapdeath = new ImageIcon("Kitchen .jpg");

        int KitchenResponse = JOptionPane.showOptionDialog(null, UserName
                + " Were will you go Next ", "The House of Horrors\nYour Next"
                + " Move", 0, 0, null,
                OpenDoor4, null);
        switch (KitchenResponse) {
            case 0:
                JOptionPane.showMessageDialog(null, "The dished and glasses "
                        + "start flying at you as soon as you open the door."
                        + " " + " gets hit in the head and feels themselves"
                        + " moving towards a light.");
                JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                        + " You've died here.", "Try Again if you dare",
                        KitchenResponse, Mapdeath);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Open the refrigerator and "
                        + "find some deliciouse soul food when you are done you"
                        + " save some chocolate in your backpack. Then a Ghost "
                        + "apears and murder you ");
                JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                        + " You've died here.", "Try Again if you dare",
                        KitchenResponse, Mapdeath);
// Bachpack initializing             
                backpack = "a Delicious Chocolate";
                break;
            case 2:
                pantry();
                break;
            default:
                break;
        }
    }

// Pantry initializing, Image, String, If Statement
    public void pantry() {

        String[] OpenDoor5 = new String[]{"Explore the Dusty Recipe Box",
            "Touch the Broom"};
        ImageIcon Mapdeath = new ImageIcon("Pantry 1st .jpg");

        {
            int pantryResponse = JOptionPane.showOptionDialog(null, UserName
                    + " Were will you go Next ", "The House of Horrors\n "
                    + "Your Next Move", 0, 0, null, OpenDoor5, null);
            if (pantryResponse == 0) {
                JOptionPane.showMessageDialog(null, "open up the recipe for"
                        + " chocolate devils food cake appears out of no where."
                        + " You safe half in yout backpack and eath the rest, "
                        + "You died, they were poison");
                JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                        + " You've died here.", "Try Again if you dare",
                        pantryResponse, Mapdeath);
// Bachpack initializing             
                backpack = "a Half poison";

            } else if (pantryResponse == 1) {
                JOptionPane.showMessageDialog(null, "As soon as you touche "
                        + "the broom, it flies up in the air! and knock you to "
                        + "death");
                JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                        + " You've died here.", "Try Again if you dare",
                        pantryResponse, Mapdeath);
            }
        }

    }

// Up Stairs initializing, Image, String, Switch Statement
    private void upStairs() {
        String[] OpenDoor6 = new String[]{"BedRoom 1", "BedRoom 2",
            "Master Room"};
        int upStairsResponse = JOptionPane.showOptionDialog(null, "you will go to ", "The House of Horrors\n Your Next Move",
                0, 0, null, OpenDoor6, null);
        switch (upStairsResponse) {
            case 0:
                bedRoom1();
                break;
            case 1:
                bedRoom2();
                break;
            case 2:
                MasterRoom();
                break;
            default:
                break;
        }
    }

// Bed Room 1 initializing, Image, String, Switch Statement
    public void bedRoom1() {
        String[] OpenDoor7 = new String[]{"Rocking Chair", "Window",
            "Bathroom 2"};
        ImageIcon Mapdeath = new ImageIcon("Bedroom 1 .jpg");

        int bedResponse = JOptionPane.showOptionDialog(null, "you will go to "
                + "", "The House of Horrors\n Your Next Move", 0,
                0, null, OpenDoor7, null);

        switch (bedResponse) {
            case 0:
                JOptionPane.showMessageDialog(null, "Chair starts rocking by "
                        + "itself with no one in it, you safe a pen in your "
                        + "backpack and a old lady shut you in the head");
                JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                        + " You've died here.", "Try Again if you dare",
                        bedResponse, Mapdeath);
// Bachpack initializing             
                backpack = "a pen";
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Sees a child outside on "
                        + "a swing who suddenly disappears, you save a toy in "
                        + "your backpack. The children appears and murder you");
                JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                        + " You've died here.", "Try Again if you dare",
                        bedResponse, Mapdeath);
// Bachpack initializing                           
                backpack = "a toy";
                break;
            case 2:
                bathRoom2();
                break;
            default:
                break;
        }

    }

//Bed room 2 initializing, Image, String, if Statement
    public void bedRoom2() {
        String[] OpenDoor8 = new String[]{"Doll House", "Dresser"};
        ImageIcon Mapdeath = new ImageIcon("Bedroom 2 .jpg");

        int Bathroom2Response = JOptionPane.showOptionDialog(null, "you will go to ", "The House of Horrors\n Your Next Move",
                0, 0, null, OpenDoor8, null);
        if (Bathroom2Response == 0) {
            JOptionPane.showMessageDialog(null, "The dolls start dancing on "
                    + "their own, and you have a heart attack");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                    + " You've died here.", "Try Again if you dare",
                    Bathroom2Response, Mapdeath);
        } else if (Bathroom2Response == 1) {
            JOptionPane.showMessageDialog(null, "A ghost flies out of the"
                    + " dresser and posses your body and commit suiside");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName + ""
                    + " You've died here.", "Try Again if you dare",
                    Bathroom2Response, Mapdeath);
        }

    }

// Bath Room 2 initializing, Image, String, if Statement
    public void bathRoom2() {
        String[] OpenDoor4545 = new String[]{"Mirror", "Shower"};
        ImageIcon Mapdeath = new ImageIcon("Bathroom .jpg");

        int bathResponse = JOptionPane.showOptionDialog(null, "you will go to",
                "The House of Horrors\n Your Next Move",
                0, 0, null, OpenDoor4545, null);
        if (bathResponse == 0) {
            JOptionPane.showMessageDialog(null, "you grap gun and See a bloody"
                    + " face looking back at you. Before you reallize it "
                    + "you are dead ");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                    + " You've died here.", "Try Again if you dare", bathResponse,
                    Mapdeath);
// Bachpack initializing                      
            backpack = "a gun";
        } else if (bathResponse == 1) {
            JOptionPane.showMessageDialog(null, "Room suddenly steams up "
                    + "and you feel fingers touching the back of your neck and kill you ");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                    + " You've died here.", "Try Again if you dare", bathResponse, Mapdeath);
        }
    }

//Master Room initializing, Image, String, if Statement
    public void MasterRoom() {
        String[] OpenDoor9 = new String[]{"Jewelry Box", "Master Bathroom"};
        ImageIcon Mapdeath = new ImageIcon("Master Bedroom .jpg");

        int MasterResponse = JOptionPane.showOptionDialog(null,
                "Were will you go Next ", "The House of Horrors\nYour Next Move",
                0, 0, null, OpenDoor9, null);
        if (MasterResponse == 0) {
            JOptionPane.showMessageDialog(null, "You find the cursed hope "
                    + "Diamond and feel your doom");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                    + " You've died here.", "Try Again if you dare",
                    MasterResponse, Mapdeath);
        } else if (MasterResponse == 1) {
            MasterBathroom();

        }
    }
// Master bathroom initializing, Image, String, if Statement

    public void MasterBathroom() {
        String[] OpenDoor10 = new String[]{"Intricate oil lamp", "Shower"};
        ImageIcon Mapdeath = new ImageIcon("Master Bathroom .jpg");
        int MasterBathResponse = JOptionPane.showOptionDialog(null, "you will "
                + "go to ", "The House of Horrors\n Your Next Move", 0, 0, null,
                OpenDoor10, null);
        if (MasterBathResponse == 0) {
            JOptionPane.showMessageDialog(null, "Rub the lamp and a genie pops "
                    + "out who says he’ll grant you 3 wishes you decide to leave "
                    + "the house but a ghost hear you and eats your soal");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName
                    + " You've died here.", "Try Again if you dare",
                    MasterBathResponse, Mapdeath);
        } else if (MasterBathResponse == 1) {
            JOptionPane.showMessageDialog(null, "You safe a toothbrush in your "
                    + "backpack and suddenly hear singing in the shower, but no"
                    + " one is there. you turn and a ghost kills you");
            JOptionPane.showMessageDialog(null, "Game Over! " + UserName + ""
                    + " You've died here.", "Try Again if you dare",
                    MasterBathResponse, Mapdeath);
// Bachpack initializing             
            backpack = "a toothbrush";
        }
    }

// return backpack
    String getbackpack() {
        return this.backpack;
    }
}
