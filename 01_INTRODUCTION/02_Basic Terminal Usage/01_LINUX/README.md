# 1.2.1) Basic Terminal Usage - LINUX

Some usefull terminal commands used on LINUX.

<details open>
<summary>Table of Contents</summary>
<br>

[Open terminal](#h1)

[Manual command](#h2)

[See the manual of the manual](#h3)

[See the manual of Nano Command-line text editor](#h4)

[Display options to use with the man command](#h5)

[Display options to use with Nano](#h6)

[Display the path you're currently standing in (print working directory)](#h7)

[For some info about the pwd command](#h8)

[Move cursor back](#h9)

[Move cursor forward](#h10)

[Enter](#h11)

[Scroll command list to previous command](#h12)

[Scroll next](#h13)

[Goes back one word at a time](#h14)

[Moves forward one word at a time(in some systems)](#h15)

[Capitalize the letter your cursor is on, decapitalize all the following letters of the word / If cursor is between words, capitalize the first letter of the next word](#h16)

[Delete rest of the word or the whole word after the cursor](#h17)

[Jump to insert something to the beginning of what you're typing, press again to go back to almost the same place. Toggles between two positions of the cursor](#h18)

[Go to your home directory (/home/username), no matter where you are located (all of these commands work)](#h19)

[Change directory to /usr/bin](#h20)

[Go to the parent directory (from /usr/bin to /usr/)](#h21)

[Go back to the previous directory](#h22)

[Scroll through previous commands (very useful)](#h23)

[Quickly jump back and forth over words with cursor](#h24)

[Quickly jump to the beginning or end of the of the current line](#h25)

[Clear the screen of the text (push the empty lines in front of you to back)](#h26)

[Remove what's on the left of your cursor on the line (use when you want to clear out the command you're currently typing)](#h27)

[Remove everything in front of your cursor on the line](#h28)

[Fast backspace or Erase/cut words/parameters of a command that are separated by space](#h29)

[Paste back what you removed with Ctrl+U, Ctrl+K or Ctrl+W or Alt+Backspace](#h30)

[Somekind of undo, like Ctrl+Y but more accurate (but very unconsistent)](#h31)

[Backspace](#h32)

[Enter](#h33)

[Deletes characters to the right of cursor. (If no characters, Ctrl+D also logs out and closes terminal)](#h34)

[Search text from the whole history (even after reset)](#h35)

[Zombify an application.](#h36)

[Search text from the terminal window scrollback history](#h37)

[You can fast spam the screen full of something by](#h38)

[The command history stays (arrow keys up and down, Ctrl+R search)](#h39)

[Clear bash history (clear all the commands in history)](#h40)

[Sometimes you might want to do Ctrl+L+L to make a nice little gap (the vertical size of your terminal window) to see where your previous command started to give input](#h41)

[And you can't really scroll up and quickly see where you typed the command second or third time.](#h42)

[Copy the highlighted text to clipboard](#h43)

[Paste](#h44)

[Use Tab to autocomplete commands, files and directories you are typing](#h45)

[Double-tap Tab to reveal, for example, all files/folders in /usr/share/ that start with "gtk" while still being able to continue typing the command](#h46)

[Double-tap Tab to reveal what’s inside the folder /usr/ while still being able to continue typing the command](#h47)

[List files and directories of the current directory](#h48)

[List files and directories of the current directory, including hidden files](#h49)

[List more info about the files in current directory](#h50)

[List files starting with "blen" in the directory you're in](#h51)

[List all the .jpg files in the directory you're in](#h52)

[List the contents of another directory](#h53)

[List multiple other directories at the same time](#h54)

[Using echo for listing](#h55)

[Create a file called file1.txt](#h56)

[Insert a text line into file1.txt](#h57)

[Check what the file1.txt contains](#h58)

[Check what the file1.txt contains, for files with a lot of information](#h59)

[Find the word "apple" inside all .txt files](#h60)

[Copy file1.txt to file2.txt](#h61)

[Copy file1.txt to ~/Texts](#h62)

[Move/Rename file1.txt to file2.txt](#h63)

[Move file1.txt to ~/Texts/](#h64)

[Move and Rename at the same time](#h65)

[Chain commands](#h66)

[Chaining choices](#h67)

[Other way to chain commands](#h68)

[Open Thunar File Manager with root privileges](#h69)

[Install Thunar in Ubuntu-based systems with the command](#h70)

[Open Thunar with root privileges in background](#h71)

[Make a symbolic link from file1.txt to file1_symbolic_link.txt](#h72)

[Terminal system monitor (quit with q or Ctrl+C)](#h73)

[Better system monitor (colors, supports mouse)](#h74)

[In Ubuntu-based systems, install better system monitor](#h75)

[Uptime, how long your computer has been on](#h76)

[Calendar](#h77)

[Get the disk usage of the Home folder and /usr/bin](#h78)

[Get the disk usage of the 15 largest folders in /storage/Dropbox/](#h79)

[Find files that have in their name the word "workroom" from your hard drive, in this case, the whole system ( / )](#h80)

[Find files that have in their name the word "workroom" and "weakroom"](#h81)

[Find folders that have in their name the word "workroom". The iname means that it doesn't matter if the letters are upper-case or lower-case](#h82)

[Find a file from the folder you’re currently standing in](#h83)

[Find a file that's exactly Workroom_hour_list, with only W being a capital letter, nothing else](#h84)

[Find all the .txt files](#h85)

[Find all the files](#h86)

[Show your user ID](#h87)

[USEFULL LINKS](#h88)

</details>

**Print stuff:**
```
echo Somestuff
```

**Check files:**
```
ls ~/directory
```

**Create directory/folder:**
```
mkdir directory
```

**Create files:**
```
touch ~/directory/test.txt
```

**Edit files:**
```
vi ~/directory/test.txt

i -> Goes to insert mode

ctrl+c -> Ends insert mode

esc -> Leaves insert mode

:x -> Save changes

:q -> Quit editor

:q! -> Quit editor without saving changes
```

**Copy files:**
```
cp ~/origin/directory/test.txt ~/target/directory
```

**Move files:**
```
mv ~/origin/directory/test.txt ~/target/directory
```

**Delete files:**
```
rm ~/directory/test.txt
```

**Delete directory/folder:**
```
rmdir directory
```

<a name="h1"/>

**Open terminal:**
```
CTRL + ALT + T
```

<a name="h2"/>

**Manual command:**
```
man
```

<a name="h3"/>

**See the manual of the manual (h to help, q to quit):**
```
man man
```

<a name="h4"/>

**See the manual of Nano Command-line text editor, for example:**
```
man nano
```

<a name="h5"/>

**Display options to use with the man command:**
```
man --help

man -h
```

<a name="h6"/>

**Display options to use with Nano:**
```
nano -h
```

<a name="h7"/>

**Display the path you're currently standing in (print working directory):**
```
pwd
```

<a name="h8"/>

**For some info about the pwd command:**
```
man pwd
```

<a name="h9"/>

**Move cursor back:**
```
Ctrl+B or Arrow left
```

<a name="h10"/>

**Move cursor forward:**
```
Ctrl+F(in some systems) or Arrow right
```

<a name="h11"/>

**Enter:**
 ```
Ctrl+J or Enter
```
 
 <a name="h12"/>
 
**Scroll command list to previous command:**
```
Ctrl+P or Arrow up
```

<a name="h13"/>

**Scroll next:**
```
Ctrl+N or Arrow down
```

<a name="h14"/>

**Goes back one word at a time:**
```
Alt+B
```

<a name="h15"/>

**Moves forward one word at a time(in some systems):**
```
Alt + F
```

<a name="h16"/>

**Capitalize the letter your cursor is on, decapitalize all the following letters of the word / If cursor is between words, capitalize the first letter of the next word:**
```
Alt + C
```

<a name="h17"/>

**Delete rest of the word or the whole word after the cursor:**
```
Alt+D
```

<a name="h18"/>

**Jump to insert something to the beginning of what you're typing, press again to go back to almost the same place. Toggles between two positions of the cursor:**
```
Ctrl+X+X
```

<a name="h19"/>

**Go to your home directory (/home/[username]), no matter where you are located (all of these commands work):**
```
cd

cd ~

cd $HOME

cd $home
```

<a name="h20"/>

**Change directory to /usr/bin:**
```
cd /usr/bin
```

<a name="h21"/>

**Go to the parent directory (from /usr/bin to /usr/):**
```
cd ..
```

<a name="h22"/>

**Go back to the previous directory:**
```
cd -
```

<a name="h23"/>

**Scroll through previous commands (very useful):**
```
Up

Down
```

<a name="h24"/>

**Quickly jump back and forth over words with cursor:**
```
Ctrl+Left

Ctrl+Right
```

<a name="h25"/>

**Quickly jump to the beginning or end of the of the current line:**
```
Home

End

Ctrl+A

Ctrl+E
```

<a name="h26"/>

**Clear the screen of the text (push the empty lines in front of you to back):**
```
Ctrl+L

clear

However, you can still scroll up or down with scroll wheel or use Shift+PageUp and Shift+PageDown to scroll to the previous commands.
```

<a name="h27"/>

**Remove what's on the left of your cursor on the line (use when you want to clear out the command you're currently typing):**
```
Ctrl+U
```

<a name="h28"/>

**Remove everything in front of your cursor on the line:**
```
Ctrl+K
```

<a name="h29"/>

**Fast backspace or Erase/cut words/parameters of a command that are separated by space:**
```
Ctrl+W or Alt+Backspace
```

<a name="h30"/>

**Paste back what you removed with Ctrl+U, Ctrl+K or Ctrl+W or Alt+Backspace:**
```
Ctrl+Y
```

<a name="h31"/>

**Somekind of undo, like Ctrl+Y but more accurate (but very unconsistent). Handy to use if you removed characters too much from your command):**
```
Ctrl+- or Ctrl+7
```

<a name="h32"/>

**Backspace:**
```
Ctrl+H or Ctrl+8 or Backspace
```

<a name="h33"/>

**Enter:**
```
Ctrl+J
```

<a name="h34"/>

**Deletes characters to the right of cursor. (If no characters, Ctrl+D also logs out and closes terminal):**
```
Ctrl+D or Delete
```

<a name="h35"/>

**Search text from the whole history (even after reset):**
```
Ctrl+R
```

<a name="h36"/>

**This will zombie an application. If you have a process running in a terminal and you want the terminal back but don’t want to kill the application, you can hit Ctrl + z to send the process to the background. To get the process back, type fg:**
```
Ctrl + Z
```

<a name="h37"/>

**Search text from the terminal window scrollback history:**
```
Ctrl+Shift+F
```

<a name="h38"/>

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

<a name="h39"/>

**Clear screen and the scroll history**
**The command history stays (arrow keys up and down, Ctrl+R search):**
```
reset

Or faster one:

tput reset
```

<a name="h40"/>

**Clear bash history (clear all the commands in history):**
```
history -cw

Or (depending on what Terminal is in use):

Alt+T, C
```

<a name="h41"/>

**Sometimes you might want to do Ctrl+L+L to make a nice little gap (the vertical size of your terminal window) to see where your previous command started to give input. For example:**
```
reset

man -h

*enter* *up-arrow*man -h
 
man -h
```

<a name="h42"/>

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

<a name="h43"/>

**Copy the highlighted text to clipboard:**
```
Ctrl+Shift+C
```

<a name="h44"/>

**Paste:**
```
Ctrl+Shift+V

Shift+Insert

(In elementary OS also Ctrl+C and Ctrl+V work. If text is not highlighted, Ctrl+C is the Cancel command, like it is normally.)
```

<a name="h45"/>

**Use Tab to autocomplete commands, files and directories you are typing:**
```
cd .config/tran *Tab*  -> cd .config/transmission
```

<a name="h46"/>

**Double-tap Tab to reveal, for example, all files/folders in /usr/share/ that start with "gtk" while still being able to continue typing the command:**
```
ls /usr/share/gtk *double-tap Tab
```

<a name="h47"/>

**Double-tap Tab to reveal what’s inside the folder /usr/ while still being able to continue typing the command:**
```
ls /usr/ *double-tap Tab*
```

<a name="h48"/>

**List files and directories of the current directory:**
```
ls
```

<a name="h49"/>

**List files and directories of the current directory, including hidden files:**
```
ls -a
```

<a name="h50"/>

**List more info about the files in current directory:**
```
ls -l
```

<a name="h51"/>

**List files starting with "blen" in the directory you're in:**
```
ls blen*
```

<a name="h52"/>

**List all the .jpg files in the directory you're in:**
```
ls *.jpg
```

<a name="h53"/>

**List the contents of another directory:**
```
ls /usr/bin

ls /usr/bin/blen*

ls /home/mj/.config/blender

ls ~/.config/blender

ls $HOME/.config/blender
```

<a name="h54"/>

**List multiple other directories at the same time:**
```
ls ~/.config/blender ~/.config/transmission
```

<a name="h55"/>

**Using echo for listing:**
```
echo Pictures/*.txt

echo /usr/bin/blen*

echo /usr/bin/*ender
```

<a name="h56"/>

**Create a file called file1.txt**
```
touch file1.txt

touch ~/Documents/file1.txt
```

<a name="h57"/>

**Insert a text line into file1.txt:**
```
echo apple >> file1.txt
```

<a name="h58"/>

**Check what the file1.txt contains:**
```
cat file1.txt
```

<a name="h59"/>

**Check what the file1.txt contains, for files with a lot of information:**
```
less file1.txt

(quit by pressing Q):
```

<a name="h60"/>

**Find the word "apple" inside all .txt files:**
```
grep apple *.txt
```

<a name="h61"/>

**Copy file1.txt to file2.txt:**
```
cp file1.txt file2.txt
```

<a name="h62"/>

**Copy file1.txt to ~/Texts:**
```
cp file1.txt ~/Texts

Or

cp file1.txt ~/Texts/

Or

cp file1.txt ~/Texts/file1.txt
```

<a name="h63"/>

**Move/Rename file1.txt to file2.txt:**
```
mv file1.txt file2.txt
```

<a name="h64"/>

**Move file1.txt to ~/Texts/:**
```
mv file1.txt ~/Texts/
```

<a name="h65"/>

**Move and Rename at the same time:**
```
mv file1.txt ~/Texts/file2.txt
```

<a name="h66"/>

**Chain commands:**
```
cp file1.txt ~/Texts/ && mv file1.txt ~/Texts/file2.txt

Or

cp file1.txt ~/Texts/ && mv ~/Texts/file1.txt ~/Texts/file2.txt

Or

cp file1.txt ~/Texts/ && mv ~/Texts/file1.txt file2.txt
```

<a name="h67"/>

**Chaining choices:**
```
A && B  Run B if A succeeded

A; B    Run A and then B, regardless of success of A

A || B  Run B if A failed
```

<a name="h68"/>

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

<a name="h69"/>

**Open Thunar File Manager with root privileges:**
```
sudo thunar

You can't use that particular terminal window after doing this, until you close that Thunar window.

If you close the terminal, thunar also closes.

If you close Thunar, you can use that terminal window again.
```

<a name="h70"/>

**Install Thunar in Ubuntu-based systems with the command:**
```
sudo apt install thunar
```

<a name="h71"/>

**Open Thunar with root privileges in background:**
```
sudo thunar&

After that you can use or close the terminal and keep the rooted Thunar running.

Remember that if you, for example, copy a picture to your home folder in a rooted Thunar, you can't edit and save them with your regular user unless you modify the file's permissions again.
```

<a name="h72"/>

**Make a symbolic link from file1.txt to file1_symbolic_link.txt:**
```
ln -s file1.txt file1_symbolic_link.txt

When you change the contents of file1.txt the same changes can be seen in file1_symbolic_link.txt.
```

<a name="h73"/>

**Terminal system monitor (quit with q or Ctrl+C):**
```
top
```

<a name="h74"/>

**Better system monitor (colors, supports mouse):**
```
htop
```

<a name="h75"/>

**In Ubuntu-based systems, install better system monitor:**
```
sudo apt install htop
```

<a name="h76"/>

**Uptime, how long your computer has been on:**
```
uptime
```

<a name="h77"/>

**Calendar:**
```
cal
```

<a name="h78"/>

**Get the disk usage of the Home folder and /usr/bin:**
```
du -sh ~ /usr/bin
```

<a name="h79"/>

**Get the disk usage of the 15 largest folders in /storage/Dropbox/:**
```
du -h /storage/Dropbox/ | sort -h | tail -n 15
```

<a name="h80"/>

**Find files that have in their name the word "workroom" from your hard drive, in this case, the whole system ( / ):**
```
sudo find / -iname *workroom*
```

<a name="h81"/>

**Find files that have in their name the word "workroom" and "weakroom":**
```
sudo find / -iname *w??kroom*
```

<a name="h82"/>

**Find folders that have in their name the word "workroom". The iname means that it doesn't matter if the letters are upper-case or lower-case:**
```
sudo find / -type d -iname *workroom*
```

<a name="h83"/>

**Find a file from the folder you’re currently standing in:**
```
sudo find . -iname *workroom*
```

<a name="h84"/>

**Find a file that's exactly Workroom_hour_list, with only W being a capital letter, nothing else:**
```
sudo find / -name Workroom_hour_list
```

<a name="h85"/>

**Find all the .txt files:**
```
sudo find / -iname *.txt
```

<a name="h86"/>

**Find all the files:**
```
sudo find / -iname *.*

If the list you're finding is too long and keeps on growing, cancel it with Ctrl+C. Or go up and down the list with Shift+PgUp and Shift+PgDn
```

<a name="h87"/>

**Show your user ID:**
```
id -un

Or

echo $USER
```

<a name="h88"/>

**USEFULL LINKS**

**The commands can be tested in this online Linux prompt:**

https://bellard.org/jslinux/
