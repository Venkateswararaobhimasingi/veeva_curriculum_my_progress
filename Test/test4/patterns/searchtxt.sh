echo "Enter the file name"
read file

echo "Enter word name"
read text

if grep -q "$text" "$file"
then
    echo "found"
else
    echo "not found"
fi
