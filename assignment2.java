public class assignment2 {
    public static void main(String[] args) throws Exception {
       { 
        int count = 0;

         while (count != 3){
            System.out.println("ACE");
            count ++;
         }     
        
        // do while loop

         int i = 0;
         do {
            System.out.println("VIRAY");
             i ++;
        } while (i != 4);

        //for loop

        for (int l = 0; l != 5;  l++) {
            System.out.println("SALIENDRA");
        }
        // char array
        
        String[] myFirstName = {"A","C","E"};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse
        
        String[] myfirstname = {"E","C", "A"};

        for (int l = 0; l < myFirstName.length; l++) {
            System.out.println(myfirstname[l]);
        }
    }

}

}
