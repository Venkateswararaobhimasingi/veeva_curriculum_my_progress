#!/bin/bash

echo "Files modified within the last 3 days in current directory:"

find . -maxdepth 1 -type f -mtime -3
