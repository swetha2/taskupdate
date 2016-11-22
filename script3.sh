#!/bin/bash

ps | awk '{print $1}' >> /home/swetha/timestamp/file_pid.txt
