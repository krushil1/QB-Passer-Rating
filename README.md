# QB-Passer-Rating 

 Before the development of the passer rating, the NFL struggled with how to crown a passing leader. In the mid-1930s, it was the quarterback (QB) with the most passing yardage. From 1938 to 1940, it was the quarterback with the highest completion percentage. In 1941, a system was created that ranked the league's quarterbacks relative to their peers' performance.  

 The NFL passer rating formula includes four variables: completion percentage, yards per attempt, touchdowns per attempt, and interceptions per attempt. Each of those variables is scaled to a value between 0 and 2.375, with 1.0 being statistically average (based on league data between 1960-1970). When the formula was first created, a 66.7 rating indicated an average performance, and a 100+ rating indicated an excellent performance. However, passing performance has improved steadily since then and in 2008 the league average rating was 83.2. 

 
In this lab, you will create a program called QBRating that will calculate the quarterback rating given:
att - The number of passing attempts for a game as an integer
comp - The number of completions in a game as an integer
yds - The number of passing yards in a game as an integer
td - The number of touchdown passes in a game as an integer
int - The number of interceptions thrown in a game as an integer
All of these statistics should be represented using the Java type int. Casting can help you if necessary. 

 
The four separate calculations can be expressed in the following equations:

If
a = (COMP/ATT - .3) * 5
b = (YDS/ATT - 3) * .25
c = (TD/ATT) * 20
d = 2.375 - (INT/ATT * 25)

Then
PASSER RATING = ((a + b + c + d)/6) * 100

Where
att is the number of passing attempts
comp is number of completions
yds is the amount of passing yards
td is the number of touchdown passes
int is the number of interceptions

 
For a, b, c, and d above, if the result of any calculation is greater than 2.375, it is set to 2.375. If the result is a negative number, it is set to zero. 

Create a method called calculateRating that takes in the 5 values from above as parameters and returns the qb rating.

Create a method called qbRating that takes in the numerical rating as a parameter and prints out the corresponding statement based on their rating

For testing purposes, here are the quarterback stats from the championship games held on January 19, 2020

 Your program will ask the user for each piece of information, then calculate and report the quarterback rating for that player. Then, based on that rating will make a statement about how good of a game the player had. Here is a chart for this statement: 





