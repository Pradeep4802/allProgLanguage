#include <iostream>
#include <cmath>
using namespace std;

class point
{
    double x, y;
    double sum;

public:
    point(double a, double b)
    {
        x = a;
        y = b;
    }
    friend void distance(point p1, point p2);
};
void distance(point p1, point p2)
{
    double p3 = sqrt((pow((p1.y - p1.x), 2) + pow((p2.y - p2.x), 2)));
    cout << "The distance is " << p3 << endl;
}

// Create a function(Hint : Make it a friend function) which takes 2 point objects and computes the distance between those points

int main()
{
    // point s;
    point p(1, 1);
    point q(1, 1);
    distance(p, q);
    return 0;
}