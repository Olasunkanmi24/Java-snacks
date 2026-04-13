import java.util.Scanner;
public class NokiaPhone{

    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

		System.out.println("""

        PHONE MENU

        1. Phone book
        2. Messages
        3. Chat
        4. Call register
        5. Tones
        6. Settings
        7. Call divert
        8. Games
        9. Calculator
        10. Reminders
        11. Clock
        12. profiles
        13. Si services

        """);

        System.out.println("Enter option:");
        int option = input.nextInt();

        switch(option){

            case 1->{
                System.out.println("""

                PhoneBook

                1. Search
                2. Service No's
                3. Add name
                4. Erase
                5. Edit
                6. Assign
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags
                
                """);
                System.out.println("Enter option:");
                option = input.nextInt();
                switch(option){
                    case 1-> System.out.println("Search");
                    case 2-> System.out.println("Service No's'");
                    case 3-> System.out.println("Add name");
                    case 4-> System.out.println("Erase");
                    case 5-> System.out.println("Edit");
                    case 6-> System.out.println("Assign");                
                    case 7-> System.out.println("Send b'card'");
                    case 8->{ 
                        System.out.println("""
                            Options
                            1. Type of view
                            2. Memory Status

                            """);
                        System.out.println("Enter option:");
                        option = input.nextInt();
                        switch(option){
                            case 1-> System.out.println("Type of view");
                            case 2-> System.out.println("Memory Status");
                                    }
                    }
                    case 9-> System.out.println("Speed dials");
                    case 10-> System.out.println("Voice tags");
                    }
            }

            case 2->{
                System.out.println("""

                Messages

                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture Messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info Service
                9. Voice mailbox number
                10. Service command editor
                
                """);
                System.out.println("Enter option:");
                option = input.nextInt();
                switch(option){
                    case 1 -> System.out.println("Message");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture Message");
                    case 5 -> System.out.println("Template");
                    case 6 -> System.out.println("Smileys");
                    case 7 ->{ System.out.println("Message setting");

                        System.out.println("""
                        1. Set1
                        2. common3
                                
                        """);

                    System.out.println("Enter option:");
                    option = input.nextInt();
                    switch(option){
                        case 1 ->{ System.out.println("set");
                            System.out.println("Message centre number");
                            System.out.println("Message sent as ");
                            System.out.println("Message validity");

                            System.out.println("Enter option:");
                            option = input.nextInt();
                            }

                        case 2->{System.out.println("common");

                            System.out.println("Delivery reports");
                            System.out.println("Reply via same center");
                            System.out.println("Character support");

                            System.out.println("Enter option");
                            option = input.nextInt();
                            }               
                        }
                    }    
                    case 8 ->  System.out.println("info service");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                }
                    
            }   

            case 3 -> {System.out.println("enter chat");

            switch(option){
                case 1 -> {
            
                System.out.println("""

                Call register

                
                1. Missed calls
                2. Recieved calls
                3. Dialled number
                4. Erase recent call list
                5. Show call duration
                6. Show call cost
                7. Call cost settings
                8. Prepaid credit
                 
                                    """);
                System.out.println("Enter option:");
                option = input.nextInt();

                switch(option){
                    case 1-> System.out.println("Missed calls");
                    case 2-> System.out.println("Recieved calls");
                    case 3-> System.out.println("Dialled number");
                    case 4-> System.out.println("Erase recent call list");
                    case 5-> {
                        System.out.println("""
                        
                        1. Last call duration
                        2. All calls duration
                        3. Received calls duration
                        4. Dialled calls duration
                        5. Clear counters
                                      
                        """);

                        System.out.println("Enter option: ");
                        option = input.nextInt();
                        System.out.println("Show call duration");

                        switch(option){
                            case 1-> System.out.println(" Last call duration");
                            case 2-> System.out.println("All calls duration");
                            case 3-> System.out.println(" Received calls duration");
                            case 4-> System.out.println(" Dialled calls duration");
                            case 5-> System.out.println("Clear timers");
                        }
                    }


                    case 6-> System.out.println("Show call cost");                
                    case 7-> System.out.println("Call cost settings");
                    case 8-> System.out.println("Prepaid credit");
                }

            }
        }










    

        }       
    }
    }
}
