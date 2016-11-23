#!/bin/bash
abc=$(date +%Y%m%d%H%M%S)
mkdir $abc
count=`wc -l < $1`
echo $count
#mkdir -p $abc/$(sed -n "${i}p" $1) 
for i in $(seq  "$count" ); do
cp -pv --parents `cat $1` $abc
done
tar -cvf $abc/arc5.tar $abc 
cd $abc
j=$(sed -n "${k}p" $1)
if [ $i -gt $j ]
then
tar cf $j.tar $abc/$j
fi
