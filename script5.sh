#!/bin/bash
abc=$(date +%Y%m%d%H%M%S)
mkdir $abc
#cd $abc
#tar cvpf t5.tar ./home/swetha
#mkdir -p $abc/home/swetha
mkdir -p $abc/$(sed -n "${i}p" $1)
sudo cp -p -v `cat $1` $abc
tar -cvf arc 22-11-16.tar $(sed -n "${i}p" $1)

