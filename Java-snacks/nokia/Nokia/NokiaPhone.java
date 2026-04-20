import java.util.Scanner;

public class NokiaPhone {
public static void menu(){

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
        13. SIM services

        """);

        
        System.out.println("Enter option:");
        int option = input.nextInt();

        switch(option){

            case 1 -> {
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

                option = input.nextInt();

                    switch(option){
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service No's'");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign");
                    case 7 -> System.out.println("Send b'card'");
                    case 8 -> {
                        System.out.println("""
                            Options
                            1. Type of view
                            2. Memory Status
                        """);

                        option = input.nextInt();

                        switch(option){
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory Status");
                        }
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                }
            }
            
             menu();

            case 2 -> {
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

                option = input.nextInt();

                    switch(option){
                    case 1 -> System.out.println("Message");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture Message");
                    case 5 -> System.out.println("Template");
                    case 6 -> System.out.println("Smileys");

                    case 7 -> {
                        System.out.println("Message setting");

                        System.out.println("""
                        1. Set1
                        2. common3
                        """);

                        option = input.nextInt();

                        switch(option){
                            case 1 -> {
                                System.out.println("set");
                                System.out.println("Message centre number");
                                System.out.println("Message sent as ");
                                System.out.println("Message validity");
                                option = input.nextInt();
                            }
                            case 2 -> {
                                System.out.println("common");
                                System.out.println("Delivery reports");
                                System.out.println("Reply via same center");
                                System.out.println("Character support");
                                option = input.nextInt();
                            }
                            
                             menu();
                        }
                    }
                    
                     menu();

                    case 8 -> System.out.println("info service");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                }
            }
            
             menu();
            
            

                        case 3 -> System.out.println("enter chat");

                        case 4 -> {
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

                option = input.nextInt();

                     switch(option){
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Recieved calls");
                    case 3 -> System.out.println("Dialled number");
                    case 4 -> System.out.println("Erase recent call list");

                    case 5 -> {
                        System.out.println("""
                        1. Last call duration
                        2. All calls duration
                        3. Received calls duration
                        4. Dialled calls duration
                        5. Clear counters
                        """);

                        option = input.nextInt();

                            switch(option){
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls duration");
                            case 3 -> System.out.println("Received calls duration");
                            case 4 -> System.out.println("Dialled calls duration");
                            case 5 -> System.out.println("Clear timers");
                        }
                    }
                    
                     menu();

                    case 6 -> {
                        System.out.println("""
                        1. Last call cost
                        2. All calls cost
                        3. clear counters
                        """);

                        option = input.nextInt();

                        switch(option){
                            case 1 -> System.out.println("Last call cost");
                            case 2 -> System.out.println("All calls cost");
                            case 3 -> System.out.println("clear counters");
                        }
                    }
                    
                     menu();

                    case 7 -> {
                        System.out.println("""
                        1. Call cost limit
                        2. Show cost in
                        """);

                        option = input.nextInt();
                    }

                    case 8 -> System.out.println("Prepaid credit");
                }
            }
            
             menu();

            case 5 -> {
                System.out.println("""

                Tone

                1. Ringing tone
                2. Ringing volume
                3. Incoming call alert
                4. Composer
                5. Message alert tone
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating saver

                """);

                option = input.nextInt();

                switch(option){
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating saver");
                }
            }
            
             menu();

            case 6 -> {
                System.out.println("""

                Settings

                1. Call setting
                2. Phone setting
                3. Security settings
                4. Restore factory setting

                """);

                option = input.nextInt();

                switch(option){

                    case 1 -> {
                        System.out.println("""
                        Call settings
                        1. Automatic redial
                        2. Speed dialling
                        3. Call waiting options
                        4. Own number sending
                        5. Phone line in use
                        6. Authomatic answer
                        """);

                        option = input.nextInt();
                    }
                    
                    
                     menu();

                    case 2 -> {
                        System.out.println("""
                        Phone setting
                        1. Language
                        2. Call info display
                        3. Welcome note
                        4. Network selection
                        5. Light
                        6. Confirm SIM service action
                        """);

                        option = input.nextInt();
                    }
                    
                     menu();

                    case 3 -> {
                        System.out.println("""
                        Security setting
                        1. PIN code requests
                        2. Call barring service
                        3. Fixed dialling
                        4. Closed user group
                        5. Phone security
                        6. Change access codes
                        """);

                        option = input.nextInt();
                    }
                    
                     menu();

                    case 4 -> System.out.println("Restore factory setting");
                }
            }

                    case 7 -> System.out.println("Call divert");
                    
                    case 8 -> System.out.println("Games");

                    case 9 -> System.out.println("Calculator"); 

                    case 10 -> System.out.println("Reminders"); 

                    case 11 ->{ 
                    
                        System.out.println("""

                        Clock
                    
                        1. Alarm clock
                        2. clock setting
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of data and time
                                            
                                            """);
                        
                    } 
                    
                     menu();

                      case 12 -> System.out.println("Profiles");
 
                      case 13 -> System.out.println("SIM, service");
                     menu();
 
            }                     


}
    public static void main(String[] args){

                menu();
        }
   } 














