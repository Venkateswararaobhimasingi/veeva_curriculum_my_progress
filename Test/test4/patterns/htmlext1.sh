echo "enter file name"
read file

echo "Enter tag"
read tag

res=$(sed -n "\|<${tag}[^>]*>|,\|</${tag}>|p" "$file")

res1=$(echo "$res" | sed "s|<${tag}[^>]*>||g; s|</${tag}>||g")

echo "$res1"
