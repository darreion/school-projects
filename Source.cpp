#include <iostream>
#include <string>
#include <cmath>
#include <iomanip>
#include <fstream>
using namespace std;

// function prototypes
void printName(string);
void printPercentage(int, int);

int main()
{
    cout << "Darreion Bailey -- Lab 5" << endl << endl;

    // variable declarations
    ifstream file;
    string name;
    int score, total;

    // opening file 
    ifstream inData;
    inData.open("scores.txt");

    // while loop
    while (true)
    {
        
        file >> name >> score >> total;

        printName(name);
        printPercentage(score, total);

        if (file.eof()) break;
    }

    cout << endl;
    system("pause");
    return 0;
}

void printName(string name) {
    cout << name << " ";
}


void printPercentage(int score, int total)
{
    
    double percentage = (double)score / total;

    
    int round = ceil(percentage * 100);
    string remark;

    
    if (round > 90)
        remark = "Excellent";
    else if (round > 80)
        remark = "Well Done";
    else if (round > 70)
        remark = "Good";
    else if (round > 60)
        remark = "Need Improvement";
    else
        remark = "Fail";

    
    cout << fixed << setprecision(5);
    cout << round << "% " << percentage << " " << remark << endl;
}