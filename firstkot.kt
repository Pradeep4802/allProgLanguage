// fun main() {
//     var first = 10;
//     var second = 20;
    
//     var sum = first + second;
    
//     println("Sum of Two Numbers is "+sum);
// }

import java.util.Scanner;
fun main(args: Array<String>) {
    
    var sc = Scanner(System.`in`);
    
    println("Enter First Number : ");
    var first = sc.nextInt();
    
    println("Enter Second Number : ");
    var second = sc.nextInt();
    
    var sum = first + second;
    
    println("Sum of Two Numbers is "+sum);
}