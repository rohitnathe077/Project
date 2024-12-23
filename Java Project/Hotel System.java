import java.util.Scanner;
public class  hotel {
    public static void main(String[] args) {
        boolean res=true;
        Scanner S1 = new Scanner(System.in);
        System.out.println("\\\\=========================================================================////");

        System.out.println("             <||     Welcome To Hotel ching dabag dam dam     ||>"                );

        System.out.println("\\\\=========================================================================////");
        do{
            System.out.println("press 1 for Breakfast  ");
            System.out.println("press 2 for Lunch ");
            System.out.println("press 3 for  Dinner ");
            System.out.println("press 4 for  Colddrink");
            
            int choice=S1.nextInt();
            switch(choice){
                case 1:{
                    Breakfast();
                       break;
                }
                case 2:{
                    Lunch();
                    break;
                }
                case 3:{
                    Dinner();
                    break;
                }
                case 4:{
                    Colddrink();
                    break;
                }
                default:System.out.println("error");
            }
            System.out.println("Do You Want Something Else....?");
            System.out.println(" Say Y for yes.... / N for No...");
            char ch=S1.next().charAt(0);
            if (ch=='Y' || ch=='y' ) {
              res=true;  
            }
            else{
                res=false;
            }
        }
        while(res);
    }
    public static void Breakfast() {
        Scanner S2=new Scanner(System.in);
        System.out.println("\\\\=========================================================================////");
        System.out.println("                       ** welcome to Brekfast item list **                              ");
        System.out.println("\\\\=========================================================================////");
        System.out.println("press 1 for Chai");
        System.out.println("press 2 for Bhajiya");
        System.out.println("press 3 for Samosa");
        System.out.println("press 4 for Vadapav");

        int choice=S2.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("Chai is being prepared");
                System.out.println("enjoy the food");
            }
                break;

                case 2:{
                    System.out.println("Bhajiya is being prepared");
                    System.out.println("enjoy the food");
                }
                    break; 
                case 3:{
                        System.out.println("Samosa is being prepared");
                        System.out.println("enjoy the food");
                    }
                        break;
                        case 4:{
                            System.out.println("Vadapav is being prepared");
                            System.out.println("enjoy the food");
                        }
                            break;     
                            
            default:
            System.out.println("Enter the item only list");
        }
        
        

        
    }
    public static void Lunch() {
        Scanner S3=new Scanner(System.in);
        System.out.println("\\\\=========================================================================////");
            System.out.println("                        ** welcome to Lunch item list **                              ");
            System.out.println("\\\\=========================================================================////");
            System.out.println("press 1 for Masale bhath");
            System.out.println("press 2 for Masala bhendi");
            System.out.println("press 3 for Patato bhaji");
            System.out.println("press 4 for Misal");
            System.out.println("press 5 for Tamato bhaji");
            System.out.println("press 6 for Vang bhaji");

            int choice=S3.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Masale bhath is being prepared");
                    System.out.println("enjoy the food");
                }
                    break;
                    case 2:{
                        System.out.println("Masala bhendi is being prepared");
                        System.out.println("enjoy the food");
                    }
                        break;
                        case 3:{
                            System.out.println("Patato bhaji is being prepared");
                            System.out.println("enjoy the food");
                        }
                            break;
                            case 4:{
                                System.out.println("Misal is being prepared");
                                System.out.println("enjoy the food");
                            }
                                break;
                                case 5:{
                                    System.out.println("Tamato bhaji is being prepared");
                                    System.out.println("enjoy the food");
                                }
                                    break;
                                    case 6:{
                                        System.out.println("Vang bhaji is being prepared");
                                        System.out.println("enjoy the food");
                                    }
                                        break;
                          default:
                             System.out.println("Enter the item only list");
               } 
    }
    public static void Dinner() {
        Scanner S4=new Scanner(System.in);
        System.out.println("\\\\=========================================================================////");
        System.out.println("                      ** welcome to Dinner item list **                              ");
        System.out.println("\\\\=========================================================================////");
        System.out.println("press 1 for Shev bhaji");
        System.out.println("press 2 for Panner masala");
        System.out.println("press 3 for Panner bhaji");
        System.out.println("press 4 for Kaju kari");
        System.out.println("press 5 for Veg cofata");
        System.out.println("press 6 for Jira rice");
        System.out.println("press 7 for Dal tadaka");

        int choice=S4.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Shev bhaji is being prepared");
                System.out.println("enjoy the food");
            }
               break;
               case 2:{
                System.out.println("Panner masala is being prepared");
                System.out.println("enjoy the food");
            }
               break;
               case 3:{
                System.out.println("Panner bhaji is being prepared");
                System.out.println("enjoy the food");
            }
               break;
               case 4:{
                System.out.println("Kaju kari is being prepared");
                System.out.println("enjoy the food");
            }
               break;
               case 5:{
                System.out.println("veg kofata is being prepared");
                System.out.println("enjoy the food");
            }
               break;
               case 6:{
                System.out.println("Jira rice is being prepared");
                System.out.println("enjoy the food");
            }
               break;
               case 7:{
                System.out.println("Dal tadaka is being prepared");
                System.out.println("enjoy the food");
            }
               break;
         default:
               System.out.println("Enter the item only list");     
        }
    }
    public static void Colddrink() {
        Scanner S5=new Scanner(System.in);
        System.out.println("\\\\=========================================================================////");
        System.out.println("                         ** welcome to Cold drink list **                           ");
        System.out.println("\\\\=========================================================================////");
        System.out.println("press 1 for coco cola");
        System.out.println("press 2 for spirte");
        System.out.println("press 3 for jira");
        System.out.println("press 4 for mango juice");

        int choice=S5.nextInt();
        switch (choice){
            case 1:{
                System.out.println("coco cola is coming wait for 2 min");
                System.out.println("enjoy the Cold drink");
            }
               break;
             
               case 2:{
                System.out.println("spirte is coming wait for 2 min");
                System.out.println("enjoy the Cold drink");
            }
               break;
               case 3:{
                System.out.println("jira is coming wait for 2 min");
                System.out.println("enjoy the Cold drink");
            }
               break;
               case 4:{
                System.out.println("Mango juice is coming wait for 2 min");
                System.out.println("enjoy the Cold drink");
            }
               break;
               default:
               System.out.println("Enter the item only list"); 

           }
        System.out.println("\\\\=========================================================================////");

        System.out.println("                           ** Thanks Visit again **                                    ");

        System.out.println("\\\\=========================================================================////");
    }

}
        
