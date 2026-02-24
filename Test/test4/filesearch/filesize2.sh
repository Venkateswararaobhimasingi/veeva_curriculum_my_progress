#!/bin/bash

data=$(ls -l)

echo "$data" | awk 'NR>1 && $5 > 1000 {print $9}'
