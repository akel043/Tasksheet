package DanCheng;
//Output  Display "H3110 w0r1d 2.0 true"
public class Tasksheet113{
    public static void main(String[] args) {
        
        //Primitive data types 
        char h = 'H';
        byte n3 = 0;
        short n1 = 1;
        char spacing = ' ';
        char W = 'w';
        char R = 'r';
        char D = 'd';
        int x = 3;
        float version = 2.0f;
        boolean isTrue = true;

            //Concatenate primitive types to String
        String output = "" + h + x + n1 + n1 + n3 + spacing
         + W + n3 + R + n1 + D + spacing + version + spacing + isTrue;

         //Display output 
        System.out.println(output);
    }
}