echo "Enter the file name"
read file
if [ -f "$file" ]; then
        echo "found"
else	
	echo "not found"
	echo "not found $file at $(date "+%Y-%m-%d %H:%M:%S") this issue at $0" >> error1.log
fi
