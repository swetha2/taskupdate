#!/bin/bash
#program to accept filename and its path is commanline arguments and check whether it presents and if presents then delete
echo "enter the filename"
read fname
echo "enter the path"
read path
#grep -f $path  [ echo "file exist" rm $fname ] || echo "file doesn't exist" 
if [ -e $path/$fname ]
# then
 #  if [ -e $fname ]
    then   
         echo "file $fname exist"
          rm  $path/$fname
          echo "file $fname is deleted"
    #fi
  else
   echo "file $fname doesnot exist"
  # read arc
   tar -cf test_arc.tar $path
fi



