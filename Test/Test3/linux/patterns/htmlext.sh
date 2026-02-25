echo " enter file name"
read file

echo "enter tag"

read tag

tag1="<${tag}>"
tag2="</${tag}>"
res=$(sed -n "\|<${tag}>|,\|</${tag}>|p" "$file")
echo "$res" > process.txt

