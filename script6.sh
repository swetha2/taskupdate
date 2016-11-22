#!/bin/bash
if [ $# -eq 0 ]
then 
  cd pwd
else
  cd $1
fi
#find  -type f -printf "%s  %p\n" | sort -n
ls -s | sort -n
ls -S > text6.txt
c=$(wc -l < text6.txt)
for i in $(seq 1 $c)
do
c1="$(sed -n "${i}p" text6.txt)"
if [ -s $c1 ];
then
c2="${c1}"
 #echo "file not empty "
else
   rm -i $c1
fi
done
rename 's/.txt/ /g' ./*
rename 's/.txt/razorthink_<WORKING_DIRECTORY>/g' .*


