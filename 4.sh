#!/bin/bash
echo "Enter username file  password file"
read user 
read password
wc -l < ~/$user >uc
wc -l < ~/$password >pc
echo $uc   
echo $pc
declare -a myUser
myUser=( `cat $user`)
for (( j = 0 ; j < uc ; j++))
do
echo ${myUser[$j]}
done
declare -a myPasswd
myPasswd=( `cat $password`)
for (( j = 0 ; j < pc ; j++))
do
echo ${myPasswd[$j]}
done
if [ `cat uc` == `cat pc` ]
then	echo "Number of user and number of password matches"
	length=${#myUser[@]}
	for ((i=0;i<$length;i++))
          do	
           sudo useradd ${myUser[$i]}
	   echo -e "${myPasswd[$i]}\n${myPasswd[$i]}" | sudo passwd -q ${myUser[$i]}
           echo -e "${myUser[$i]} : ${myPasswd[$i]}"	 
        done
else	echo "Does not match number of users and number of passwords"	
fi
