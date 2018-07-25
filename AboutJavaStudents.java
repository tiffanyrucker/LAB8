

import java.util.Scanner;


public class AboutJavaStudents {
        
    public static void main(String[] args) {
        
        String hometowns [] ={"Argentina","Australia","Austria","Bulgaria","Canada"};
        String food [] = {"Eggs","Almonds","Pizza","Oats","Maccroni"};
	String name[] = {"Brandon","Camila","Joe","Julia","John"};
        Student [] students = new Student[5];
        
        for(int i = 0 ; i < 5; i++)
        {
            students[i] = new Student(name[i],hometowns[i],food[i]);
        }
    
        
        Scanner scan = new Scanner(System.in);
        int input,index,num=0;
        String choice=null;   
        do{
        System.out.print("Welcome to our java class. Which student would you like to learn more about? (enter a number 1-5):  ");
        input = scan.nextInt();
        do
        {
             if(input < 1 || input > 5)
            {
                System.out.print("The student does not exist.Please try again. (enter a number (1-5)):  ");
                
                input = scan.nextInt();

                
            }
        }while(input < 1 || input > 5);
        
        
                       index = input - 1;
                System.out.println("Student "+input+" is "+students[index].getName()+".");
                while(num!=1){

                System.out.print("What would you like to know about "+students[index].getName()+" (enter \"hometown\" or \"food\" ):  ");
                choice = scan.next();
                if(choice.equalsIgnoreCase("hometown"))
                {
                    num =1;
                System.out.println(students[index].getName()+" is from "+students[index].getHomeTown());
                }
               else  if(choice.equalsIgnoreCase("food"))
                {
                    num=1;
                System.out.println(students[index].getName()+" is from "+students[index].getFood());
                }
                 else{
                     System.out.print("That data does not exist. Please try again.");
                 }
       }
            
                System.out.print("Would you like to know more? (enter yes or no):  ");
                choice=scan.next();
                num=0;
                
        }while(choice.equalsIgnoreCase("yes"));
                
           System.out.println("Thanks!");
        }
        

public class Student {
   private String name;
   private String homeTown;
   private String food;

    public Student(String name, String homeTown, String food) {
        this.name = name;
        this.homeTown = homeTown;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }



    
}
}
        
        
        
        
