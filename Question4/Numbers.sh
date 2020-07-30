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