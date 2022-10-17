public class assignment2 {
    public static void main(String[] args) throws Exception {
       { 
        int loop = 0;

         while (loop != 3){
            System.out.println("ACE");
            loop ++;
         }     
        
        // do while loop

         int j = 0;
         do {
            System.out.println("VIRAY");
             j ++;
        } while (j != 4);

        //for loop

        for (int t = 0; t != 5;  t++) {
            System.out.println("SALIENDRA");
        }
        // char array
        
        char[] myFirstName = {'A','C','E'};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse
        
        char[] myReveresedName = {'E','C','A'};

        for (int l = 0; l < myReveresedName.length; l++) {
            System.out.println(myReveresedName[l]);
        }
    }
    
}

}
