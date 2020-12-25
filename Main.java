import java.util.Scanner; //import scanner
class Main { //main class
  public static void main(String[] args) { //method for the inputs and outputs
    Scanner keyboard = new Scanner(System.in); //input keyboard
    System.out.print("Enter completions => "); //user output
    int comp = keyboard.nextInt(); //user input as comp
    
    System.out.print("Enter attempts => "); //user output
    int att = keyboard.nextInt(); //user input as att
    
    System.out.print("Enter yards => "); //user output
    int yds = keyboard.nextInt(); //user input as yds
    
    System.out.print("Enter touchdown => "); //user output
    int td = keyboard.nextInt(); //user input as td
    
    System.out.print("Enter interceptions => "); //user output
    int interceptions = keyboard.nextInt(); //user input as interceptions
    
    double out = calculateRating(comp, att, yds, td, interceptions); //import passerRating from the calculateRating method
    long round = Math.round(out * 100); //rounds the output from calculateRating method * multipling it by 100
    double qr_Rating = (double) round/100; //divides round by 100 and stores it in the qr_Rating variable
    System.out.println(qr_Rating); //prints the passerRating in a clean decimal
    
    String trial = qbRating(out); //exports the output from qbRating method
    System.out.print(trial); //prints the output from qbRating method 
  }
  
  public static double calculateRating(double comp, double att, double yds, double td, double interceptions){ //method for calculating passerRating
    double a = (comp / att - 0.3) * 5; //divides comp by att and substracts 0.3 out of it and then multiplies it by 5
    double b = (yds / att - 3) * 0.25; //divides yds by att and then multiplies it by 0.25
    double c = (td / att) * 20; //divides td by att and then multiplies it by 20
    double d = 2.375 - (interceptions / att * 25); //divides interceptions by att and multiplies it by 25 and then 2.375 gets substracted

    double passerRating = ((a + b + c + d) / 6) * 100.0; //calculates the passerRating 
    return passerRating; //returns the passerRating
  }

  public static String qbRating(double qr_Rating){ //qbRating method for check how the game was
    if (qr_Rating < 75.0){ //if statement runs if qr_Rating is less than 75.0
      String text = "Bad game"; //stores bad game in text variable
      return text; //returns text
    }
    else if (qr_Rating <= 90.0 && qr_Rating >= 75.0){ //else if statement runs if qr_Rating is less than or 90.0 and greater than or equal to 75.0
      String text = "OK game"; //stores OK game in the text variable
      return text; //returns text
    }
    else if (qr_Rating <= 100.00 && qr_Rating > 90.0){ //else if statement runs if qr_Rating is less than or 100.0 and greater than 90.0
      String text = "Good game"; //stores Good game in the text variable
      return text; //returns text
    }
    else if (qr_Rating <= 120.00 && qr_Rating > 100.00 ){ //else if statement runs if qr_Rating is less than or 120.0 and greater than 100.0
      String text = "Great game"; //stores Great game in the text variable
      return text; //returns text
    }
    else{ //else statement runs if nothing works with the if and the else statements from above
      String text = "Amazing game"; //stores Amazing game in the text variable
      return text; //returns text
    }
  }
  
}

