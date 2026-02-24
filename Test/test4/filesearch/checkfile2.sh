#!/bin/bash

echo "Enter the file name to search:"
read filename

# Search from root directory, case-insensitive
result=$(find / -type f -iname "$filename" 2>/dev/null)

if [ "$result" ]; then
    echo "File found at:"
    echo "$result"
else
    echo "File not found"
fi
