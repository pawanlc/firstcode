public class npremetive {
          public static void main(String[] args) {
     // length
        String name = "pawanbdon";
        System.out.println(name.length()); 
        // concatenate

         String name1 = "pawan";
         String name2 = "samikshya ";
         String name3 = "manjila ";
         String name4 = "kabina";
         String name5 = name1 + " + " + name2;
         String name6 = name1 +" + " +  name3;
         String name7 = name1 +" + " +  name4;
         String name8 = name1 +  name2  +  name3  +  name4;

         System.out.println(name5);
         System.out.println(name6);
         System.out.println(name7);
         System.out.println(name8);

         //charat
           
         String name9 = "pawan";
         System.out.println(name9.charAt(0)); 
         System.out.println(name9.charAt(2));  

         //replace 
         
         String name10 ="sadikshya";
         String name11 = name10.replace('a', 'p');
         System.out.println(name11);

        //substring
        String name12 = "pawan and samikshya ";
        System.out.println(name12.substring(10,20 ));
   
   
        }
}    

