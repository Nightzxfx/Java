Public class while {

public static void main(String[] args) {

int age = 10;

 // while age is lower then 15 it will print value of age + 1, if while funciton is already satified it wont 
 //print anytjing like showed in the example 2
while (age < 15) {
sysout("Value of age: " + age);
++ age;
}
}

 //example 2
 while (age > 3) {
sysout("Value of age: " + age);
++ age;
}
}
// using do

 //It will print Value of age then run the while command, so if while function is satisfied before started it will print one line anyways
do {
sysout("Value of age: " + age);
++ age;
 while (age < 15)
 }
 }
