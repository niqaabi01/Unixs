#!bin/bash
#Saaniah Blankenberg


#!/bin/sh
read -p "Enter X: " x;
read -p "Enter Y: " y;

#using if statements
if [ $x -gt $y ]
then 
    echo "X is greater than Y";
elif [ $x == $y ]
then 
	echo "X is equal Y";
elif [ $x -lt $y ]
then 
    echo "Y is greater than X";
	
fi;

a=20
b=20

if [ $a == $b ]
then
   echo "a is equal to b"
elif [ $a -gt $b ]
then
   echo "a is greater than b"
elif [ $a -lt $b ]
then
   echo "a is less than b"
else
   echo "None of the condition met"
fi