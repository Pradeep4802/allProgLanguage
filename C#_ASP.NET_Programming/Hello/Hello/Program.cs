using System;

namespace Hello
{
    class Program
    {
        static void Greet(string name)
        {
            Console.WriteLine("Good Morning " + name);
        }

        static float Average(int a,int b,int c)
        {
            float sum = a + b + c;
            return sum / 3;
        }
        static float Average(int a,int b)
        {
            return (a + b) / 2;  
        }
        static void Main(string[] args)
        {
            /* string inp = Console.ReadLine();
               Console.WriteLine(inp); */

            /* this is important for debugging do not remopve */
            /* Console.WriteLine("hello World!");
            Console.Write("hello Harry!");
            Console.WriteLine("I Love C#"); */

            // Data types Examples
            // int a = 34;
            // float b = 34.4F;
            // double c = 40.45D;
            // bool isGreat = true;
            // char d = 'a';
            // string e = "this is string";
            // Console.WriteLine(a);
            // Console.WriteLine(b);
            // Console.WriteLine(a + b);
            // Console.WriteLine(c);
            // Console.WriteLine(isGreat);
            // Console.WriteLine(d);
            // Console.WriteLine(e);


            // Type Casting
            // There are two types of type casting
            //    1. Implicit Casting
            // char to int to long to float to double
            // int x = 3;
            // double y = x;
            // int z = 'y';
            // float varr = Convert.ToInt64(3.55);
            // Convert.ToDouble
            // Convert.ToString
            // string sx = "Random string";

            // Console.WriteLine(x);
            // Console.WriteLine(y);
            // Console.WriteLine(z);
            // Console.WriteLine(varr);


            //    2. Explicit Casting

            // int x = (int) 3.5;
            // double x1 = (double) 3.5;
            // Console.WriteLine(x1);

            // Taking user Input
            // Console.WriteLine("Enter your name: ");
            // string name = Console.ReadLine();
            // Console.WriteLine("Hey Hello " + name);

            // Console.WriteLine("How many candies Do you want: ");
            // string can = Console.ReadLine();
            // Console.WriteLine("You will get 4 more candies " + (Convert.ToInt32(can) + 4));

            //Operators in c#
            // 1. Arithmetic operators
            // 2. Assignment operators
            // 3. Logical Operators
            // 4. Comparison Operators

            // int a = 4;
            // int b = 2;
            // Console.WriteLine("the value of a + b is: " + (a + b));
            // Console.WriteLine("the value of a - b is: " + (a - b));
            // Console.WriteLine("the value of a * b is: " + (a * b));
            // Console.WriteLine("the value of a / b is: " + (a / b));
            // Console.WriteLine("the value of a + b is: " + (a + b));

            // Logical Operators
            // Console.WriteLine(true && false);
            // Console.WriteLine(true && true);
            // Console.WriteLine(true && false);

            // Console.WriteLine(true || false);
            // Console.WriteLine(true || true);
            // Console.WriteLine(true || false);
            // Console.WriteLine(false || false);
            // Console.WriteLine(!false);
            // Console.WriteLine(!true); 

            // Comparison Operators
            // Console.WriteLine(324 > 555);
            // Console.WriteLine(324 <= 555);
            // Console.WriteLine(324 >= 555);
            // Console.WriteLine(324 != 555);
            // Console.WriteLine(324 < 555);

            // Math Function
            // int a = Math.Min(34, 345);
            // double a = Math.Sqrt(34);
            // double a = Math.Abs(-39);
            // Console.WriteLine(a);

            // string hello = "Hello World this is Harry";
            // Console.WriteLine(hello.Length);
            // Console.WriteLine(hello.ToUpper());
            // Console.WriteLine(hello.ToLower());
            // Console.WriteLine(hello + " You are nice");
            // Console.WriteLine(string.Concat(hello, " You are nice "));

            // string name = Console.ReadLine();
            // string candies = Console.ReadLine();
            // Console.WriteLine($"Your name is {name}. You will get {candies} candies");

            // string hello = "Hello world this \" is Harry";
            // Console.WriteLine(hello[1]);
            // Console.WriteLine(hello.IndexOf("is"));
            // Console.WriteLine(hello.Substring(5));
            // Console.WriteLine(hello);

            //int age = 56;
            //if (age > 18)
            //{
            //    Console.WriteLine("You can drive")
            //}

            // int age = 20;
            // switch (age)
            // {
            //     case 18:
            //         Console.WriteLine("Please wait for an year");
            //         break;
            //     case 20:
            //         Console.WriteLine("You are 20");
            //         break;
            //     default:
            //         Console.WriteLine("Enjoy!");
            //         break;
            // }


            // Loops in C sharp
            // Console.WriteLine(1);
            // Console.WriteLine(2);
            // Console.WriteLine(3);
            // Console.WriteLine(4);
            // Console.WriteLine(5);
            // Console.ReadLine();

            //Greet("Smart");
            //Greet("Intelligent");
            //Greet("Brilliant ");
            //float temp = Average(4, 6, 9);
            //float tempa = Average(4, 6);
            //Console.WriteLine(temp);
            //Console.WriteLine(tempa);
            //Console.WriteLine(Average(3, 3, 3));

            //OOPs - Classes and objects
            Player tommy = new Player();
            Console.WriteLine(tommy.getHealth());
            tommy.setHealth(57);
            Console.WriteLine(tommy.getHealth());
            Console.ReadLine(); 
        }
    } 
}