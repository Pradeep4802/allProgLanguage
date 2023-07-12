public class E3
{  
    public static void main(String [] args) 
    {
        try 
        {
            badMethod(); /* Line 7 */  // After here any code will not be execute by the compiler
            System.out.print("A"); 
        } 
        catch (Exception ex) /* Line 10 */
        {
            System.out.print("B"); /* Line 12 */
        } 
        finally /* Line 14 */
        {
            System.out.print("C"); /* Line 16 */
        }  
        System.out.print("D"); /* Line 18 */
    } 
    public static void badMethod() 
    {
        throw new RuntimeException(); 
    } 
}