echo "Enter the file name"
read file
if [ -f "$file" ]; then
	echo "found"
else
echo "not found"
fi
