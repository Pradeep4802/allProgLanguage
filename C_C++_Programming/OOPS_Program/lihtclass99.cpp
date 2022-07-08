#include <iostream>
using namespace std;

class rectangle
{
private:
	float length;
	float width;

public:
	void setlength();
	void setwidth();
	float perimeter();
	float area();
	void show();
	int sameArea(rectangle);
};

void rectangle::setlength()
{
	// length = len;
	cout << "\n Enter the length: ";
	cin >> length;
}

void rectangle::setwidth()
{
	// width = wid;
	cout << "\n Enter the width: ";
	cin >> width;
}

float rectangle::perimeter()
{
	return 2 * (length + width);
}

float rectangle::area()
{
	return length * width;
}

void rectangle::show()
{
	cout << "\n Length: " << length << " Width: " << width;
}

int rectangle::sameArea(rectangle other)
{
	float areaf = length * width;
	float areas = other.length * other.width;
	if (areaf == areas)
	{
		return 1;
	}
	return 0;
}

int main()
{
	rectangle rec1, rec2;
	rec1.setlength();
	rec1.setwidth();
	rec2.setlength();
	rec2.setwidth();

	cout << "First Rectangle: ";
	rec1.show();

	cout << endl
		 << "Area: " << rec1.area() << "Perimeter : " << rec1.perimeter() << endl
		 << endl;

	cout << "Second Rectangle: ";
	rec2.show();

	cout << endl
		 << "Area: " << rec2.area() << "Perimeter : " << rec2.perimeter() << endl
		 << endl;

	if (rec2.sameArea(rec1))
	{
		cout << "Rectangle have thje same area\n";
	}
	else
	{
		cout << "\n Rectangles do not have the same area\n";
	}

	rec1.setlength();
	rec1.setwidth();
	cout << "First rectangle: ";
	rec1.show();

	cout << endl
		 << "Area: " << rec1.area() << "Perimeter : " << rec1.perimeter() << endl
		 << endl;

	cout << "Second Rectangle: ";
	rec2.show();

	cout << endl
		 << "Area: " << rec2.area() << "Perimeter : " << rec2.perimeter() << endl
		 << endl;

	// if (rec1.sameArea(rec2))
	// {
	// 	cout << "Rectangle have the same area\n";
	// }
	// else
	// {
	// 	cout << "\n Rectangles do not have the same area\n";
	// }

	// rec1.setwidth(6.3);
	// cout << "First rectangle: ";
	// rec1.show();

	// cout << endl
	// 	 << "Area: " << rec1.area() << "Perimeter : " << rec1.perimeter() << endl
	// 	 << endl;

	// rec2.show();

	// cout << endl
	// 	 << "Area: " << rec2.area() << "Perimeter : " << rec2.perimeter() << endl
	// 	 << endl;

	if (rec1.sameArea(rec2))
	{
		cout << "Rectangle have the same area\n";
	}
	else
	{
		cout << "\n Rectangles do not have the same area\n";
	}
	return 0;
}
