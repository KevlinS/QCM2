import java.util.Scanner;

public class Qcm {
	public void Testmain() {
		System.out.println("==========Choisissez votre réponse (a,b,ou c)==========");
        Scanner sc = new Scanner(System.in);
        int point = 0;
        int point2 = 0;
        System.out.println("        ==========Question1==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c1 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d1 = sc.next().charAt(0);
        if (c1 == 'c') {
            //System.out.println("Effectivement, la réponse est bien 4 !");
            point = point + 1;
        } else if (d1=='c') {
        	point2 = point2 + 1;
            }
        System.out.println("        ==========Question2==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c2 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d2 = sc.next().charAt(0);
        if (c2 == 'a') {
            //System.out.println("Effectivement, la réponse est bien 20 !");
            point = point + 1;
        } else if (d2=='a') {
        	point2 = point2 + 1;
        }
        System.out.println("        ==========Question3==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c3 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d3 = sc.next().charAt(0);
        if (c3 == 'c') {
            //System.out.println("Oui , c'est Paris.");
            point = point + 1;
        
        }else if (d3=='c') {
        	point2 = point2 + 1;
           }
        System.out.println("        ==========Question4==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c4 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d4 = sc.next().charAt(0);
        if (c4 == 'b') {
            //System.out.println("Oui , c'est Paris.");
            point = point + 1;
        }else if (d4=='b') {
        	point2 = point2 + 1;
        }
        System.out.println("        ==========Question5==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c5 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d5 = sc.next().charAt(0);
        if (c5 == 'b') {
            //System.out.println("Oui , c'est Paris.");
            point = point + 1;
        
        }else if (d5=='b') {
        	point2 = point2 + 1;
        }
        System.out.println("        ==========Question6==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c6 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d6 = sc.next().charAt(0);
        if (c6 == 'a') {
            //System.out.println("Oui , c'est Paris.");
            point = point + 1;
        }else if (d6=='a') {
        	point2 = point2 + 1;
        }
        System.out.println("        ==========Question7==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c7 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d7 = sc.next().charAt(0);
        if (c7 == 'c') {
            //System.out.println("Oui , c'est Paris.");
            point = point + 1;
        
        }else if (d7=='c') {
        	point2 = point2 + 1;
        }
        System.out.println("        ==========Question8==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c8 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d8 = sc.next().charAt(0);
        if (c8 == 'b') {
            //System.out.println("Oui , c'est Paris.");
            point = point + 1;
        
        }else if (d8=='b') {
        	point2 = point2 + 1;
        }
        System.out.println("        ==========Question9==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c9 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d9 = sc.next().charAt(0);
        if (c9 == 'c') {
            //System.out.println("Oui , c'est Paris.");
            point = point + 1;
        
        }else if (d9=='c') {
        	point2 = point2 + 1;
        }
        System.out.println("        ==========Question10==========");
        System.out.print("\nJoueur 1 veuillez entrer votre réponse: ");
        char c10 = sc.next().charAt(0);
        System.out.print("\nJoueur 2 veuillez entrer votre réponse: ");
        char d10 = sc.next().charAt(0);
        if (c10 == 'a' || d10 == 'a') {
            //System.out.println("Oui , c'est Paris.");
            point = point + 1;
            
        }else if (d10 =='a') {
        	point2 = point2 + 1;
        }
        System.out.println("Le joueur 1 a point : "+point+"/10");
        System.out.println("Le joueur 2 a point : "+point2+"/10");
	}
}
 
 