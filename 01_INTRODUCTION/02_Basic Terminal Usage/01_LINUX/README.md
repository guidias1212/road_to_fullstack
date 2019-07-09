# 1.2.1) Basic Terminal Usage - LINUX

Some usefull terminal commands used on LINUX.

Some of the below commands can be tested in this online Linux prompt:

https://bellard.org/jslinux/

**Open it:**
```
CTRL + ALT + T
```

**Manual command:**
```
man
```

**See the manual of the manual (h to help, q to quit):**
```
man man
```

**See the manual of Nano Command-line text editor, for example:**
```
man nano
```

**Display options to use with the man command:**
```
man --help

man -h
```

**Display options to use with Nano:**
```
nano -h
```

**Display the path you're currently standing in (print working directory):**
```
pwd
```

**For some info about the pwd command:**
```
man pwd
```

**Move cursor back:**
```
Ctrl+B or Arrow left
```

**Move cursor forward:**
```
Ctrl+F(in some systems) or Arrow right
```

**Enter:**
 ```
Ctrl+J or Enter
```
 
**Scroll command list to previous command:**
```
Ctrl+P or Arrow up
```

**Scroll next:**
```
Ctrl+N or Arrow down
```

**Goes back one word at a time:**
```
Alt+B
```

**Moves forward one word at a time(in some systems):**
```
Alt + F
```

**Capitalize the letter your cursor is on, decapitalize all the following letters of the word / If cursor is between words, capitalize the first letter of the next word:**
```
Alt + C
```
   
**Delete rest of the word or the whole word after the cursor:**
```
Alt+D
```

**Jump to insert something to the beginning of what you're typing, press again to go back to almost the same place. Toggles between two positions of the cursor:**
```
Ctrl+X+X
```

**Go to your home directory (/home/[username]), no matter where you are located (all of these commands work):**
```
cd

cd ~

cd $HOME

cd $home
```

**Change directory to /usr/bin:**
```
cd /usr/bin
```

**Go to the parent directory (from /usr/bin to /usr/):**
```
cd ..
```

**Go back to the previous directory:**
```
cd -
```

**Scroll through previous commands (very useful):**
```
Up

Down
```

**Quickly jump back and forth over words with cursor:**
```
Ctrl+Left

Ctrl+Right
```

**Quickly jump to the beginning or end of the of the current line:**
```
Home

End

Ctrl+A

Ctrl+E
```

**Clear the screen of the text (push the empty lines in front of you to back):**
```
Ctrl+L

clear

However, you can still scroll up or down with scroll wheel or use Shift+PageUp and Shift+PageDown to scroll to the previous commands.
```

**Remove what's on the left of your cursor on the line (use when you want to clear out the command you're currently typing):**
```
Ctrl+U
```

**Remove everything in front of your cursor on the line:**
```
Ctrl+K
```

**Fast backspace or Erase/cut words/parameters of a command that are separated by space:**
```
Ctrl+W or Alt+Backspace
```

**Paste back what you removed with Ctrl+U, Ctrl+K or Ctrl+W or Alt+Backspace:**
```
Ctrl+Y
```

**Somekind of undo, like Ctrl+Y but more accurate (but very unconsistent). Handy to use if you removed characters too much from your command):**
```
Ctrl+- or Ctrl+7
```

**Backspace:**
```
Ctrl+H or Ctrl+8 or Backspace
```

**Enter:**
```
Ctrl+J
```

**Deletes characters to the right of cursor. (If no characters, Ctrl+D also logs out and closes terminal):**
```
Ctrl+D or Delete
```

**Search text from the whole history (even after reset):**
```
Ctrl+R
```

**This will zombie an application. If you have a process running in a terminal and you want the terminal back but don’t want to kill the application, you can hit Ctrl + z to send the process to the background. To get the process back, type fg:**
```
Ctrl + Z
```

**Search text from the terminal window scrollback history:**
```
Ctrl+Shift+F
```

**You can fast spam the screen full of something by:**
```
wheee

Ctrl+U

Ctrl+hold Y

Ctrl+U

Ctrl+hold Y

Ctrl+U

Ctrl+hold Y
```

**If your terminal gets stuck, you can usually get back to entering commands by pressing Enter and Ctrl+L, or just with Ctrl+C (cancelling).**

**Clear screen and the scroll history**
**The command history stays (arrow keys up and down, Ctrl+R search):**
```
reset

Or faster one:

tput reset
```

**Clear bash history (clear all the commands in history):**
```
history -cw

Or (depending on what Terminal is in use):

Alt+T, C
```

**Sometimes you might want to do Ctrl+L+L to make a nice little gap (the vertical size of your terminal window) to see where your previous command started to give input. For example:**
```
reset

man -h

*enter* *up-arrow*man -h
 
man -h
```

**And you can't really scroll up and quickly see where you typed the command second or third time. But:**
```
reset

man -h

Ctrl+L+L

man -h

Ctrl+L+L

man -h
```

**And scroll up and you can clearly see where your commands begun.**

**Some people like to keep enter pressed down for one second to make that gap, which is in some cases a better method (the gap isn't as huge as with the Ctrl+L+L method).**

**Copy the highlighted text to clipboard:**
```
Ctrl+Shift+C
```

**Paste:**
```
Ctrl+Shift+V

Shift+Insert

(In elementary OS also Ctrl+C and Ctrl+V work. If text is not highlighted, Ctrl+C is the Cancel command, like it is normally.)
```

**Use Tab to autocomplete commands, files and directories you are typing:**
```
cd .config/tran *Tab*  -> cd .config/transmission
```

**Double-tap Tab to reveal, for example, all files/folders in /usr/share/ that start with "gtk" while still being able to continue typing the command:**
```
ls /usr/share/gtk *double-tap Tab
```

**Double-tap Tab to reveal what’s inside the folder /usr/ while still being able to continue typing the command:**
```
ls /usr/ *double-tap Tab*
```

**List files and directories of the current directory:**
```
ls
```

**List files and directories of the current directory, including hidden files:**
```
ls -a
```

**List more info about the files in current directory:**
```
ls -l
```

**List files starting with "blen" in the directory you're in:**
```
ls blen*
```

**List all the .jpg files in the directory you're in:**
```
ls *.jpg
```

**List the contents of another directory:**
```
ls /usr/bin

ls /usr/bin/blen*

ls /home/mj/.config/blender

ls ~/.config/blender

ls $HOME/.config/blender
```

**List multiple other directories at the same time:**
```
ls ~/.config/blender ~/.config/transmission
```

**Using echo for listing:**
```
echo Pictures/*.txt

echo /usr/bin/blen*

echo /usr/bin/*ender
```

**Create a file called file1.txt**
```
touch file1.txt

touch ~/Documents/file1.txt
```

**Insert a text line into file1.txt:**
```
echo apple >> file1.txt
```

**Check what the file1.txt contains:**
```
cat file1.txt
```

**Check what the file1.txt contains, for files with a lot of information:**
```
less file1.txt

(quit by pressing Q):
```

**Find the word "apple" inside all .txt files:**
```
grep apple *.txt
```

**Copy file1.txt to file2.txt:**
```
cp file1.txt file2.txt
```

**Copy file1.txt to ~/Texts:**
```
cp file1.txt ~/Texts

Or

cp file1.txt ~/Texts/

Or

cp file1.txt ~/Texts/file1.txt
```

**Move/Rename file1.txt to file2.txt:**
```
mv file1.txt file2.txt
```

**Move file1.txt to ~/Texts/:**
```
mv file1.txt ~/Texts/
```

**Move and Rename at the same time:**
```
mv file1.txt ~/Texts/file2.txt
```

**Chain commands:**
```
cp file1.txt ~/Texts/ && mv file1.txt ~/Texts/file2.txt

Or

cp file1.txt ~/Texts/ && mv ~/Texts/file1.txt ~/Texts/file2.txt

Or

cp file1.txt ~/Texts/ && mv ~/Texts/file1.txt file2.txt
```

**Chaining choices:**
```
A && B  Run B if A succeeded

A; B    Run A and then B, regardless of success of A

A || B  Run B if A failed
```

**Other way to chain commands:**
```
sh -s <<EOF *Enter*> cp ~/test/file.txt ~/test/folder1/

 *Enter*> cp ~/test/file.txt ~/test/folder2/
 
 *Enter*> EOF
 
 *Enter*
 
 Or
 
 for dest in folder1 folder2; do cp ~/test/file.txt ~/test/"$dest"; done
 
A&     Run A in background

A &    Run A in background
```

**Open Thunar File Manager with root privileges:**
```
sudo thunar

You can't use that particular terminal window after doing this, until you close that Thunar window.

If you close the terminal, thunar also closes.

If you close Thunar, you can use that terminal window again.
```

**Install Thunar in Ubuntu-based systems with the command:**
```
sudo apt install thunar
```

**Open Thunar with root privileges in background:**
```
sudo thunar&

After that you can use or close the terminal and keep the rooted Thunar running.

Remember that if you, for example, copy a picture to your home folder in a rooted Thunar, you can't edit and save them with your regular user unless you modify the file's permissions again.
```

**Make a symbolic link from file1.txt to file1_symbolic_link.txt:**
```
ln -s file1.txt file1_symbolic_link.txt

When you change the contents of file1.txt the same changes can be seen in file1_symbolic_link.txt.
```

**Terminal system monitor (quit with q or Ctrl+C):**
```
top
```

**Better system monitor (colors, supports mouse):**
```
htop
```

**In Ubuntu-based systems, install better system monitor:**
```
sudo apt install htop
```

**Uptime, how long your computer has been on:**
```
uptime
```

**Calendar:**
```
cal
```

**Get the disk usage of the Home folder and /usr/bin:**
```
du -sh ~ /usr/bin
```

**Get the disk usage of the 15 largest folders in /storage/Dropbox/:**
```
du -h /storage/Dropbox/ | sort -h | tail -n 15
```

**Find files that have in their name the word "workroom" from your hard drive, in this case, the whole system ( / ):**
```
sudo find / -iname *workroom*
```

**Find files that have in their name the word "workroom" and "weakroom":**
```
sudo find / -iname *w??kroom*
```

**Find folders that have in their name the word "workroom". The iname means that it doesn't matter if the letters are upper-case or lower-case:**
```
sudo find / -type d -iname *workroom*
```

**Find a file from the folder you’re currently standing in:**
```
sudo find . -iname *workroom*
```

**Find a file that's exactly Workroom_hour_list, with only W being a capital letter, nothing else:**
```
sudo find / -name Workroom_hour_list
```

**Find all the .txt files:**
```
sudo find / -iname *.txt
```

**Find all the files:**
```
sudo find / -iname *.*

If the list you're finding is too long and keeps on growing, cancel it with Ctrl+C. Or go up and down the list with Shift+PgUp and Shift+PgDn
```

**Show your user ID:**
```
id -un

Or

echo $USER
```
