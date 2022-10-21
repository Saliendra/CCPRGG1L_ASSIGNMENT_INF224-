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

         for (int num = 0; num < myFirstName.length; num++) {

            System.out.print(myFirstName[num]);

         }

        

        System.out.println();

         // firstname reverse

         for (int num = myFirstName.length-1; num >= 0; num--) 

            System.out.print(myFirstName[num]);

        

    }

}
}
    
    



