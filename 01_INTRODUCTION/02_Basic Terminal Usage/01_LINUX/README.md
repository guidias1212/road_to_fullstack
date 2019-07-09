# 1.2.1) Basic Terminal Usage - LINUX

Some basic, but usefull terminal commands used on LINUX.

The below commands can be tested in this online Linux prompt:

https://bellard.org/jslinux/

Open it:
```
CTRL + ALT + T
```

Manual command:
```
man
```

See the manual of the manual (h to help, q to quit):
```
man man
```

See the manual of Nano Command-line text editor, for example:
```
man nano
```

Display options to use with the man command:
```
man --help

man -h
```

Display options to use with Nano:
```
nano -h
```

Display the path you're currently standing in (print working directory):
```
pwd
```

For some info about the pwd command:
```
man pwd
```

Move cursor back:
```
Ctrl+B or Arrow left
```

Move cursor forward:
```
Ctrl+F(in some systems) or Arrow right
```

Enter:
 ```
Ctrl+J or Enter
```
 
Scroll command list to previous command:
```
Ctrl+P or Arrow up
```

Scroll next:
```
Ctrl+N or Arrow down
```

Goes back one word at a time:
```
Alt+B
```

Moves forward one word at a time(in some systems):
```
Alt + F
```

Capitalize the letter your cursor is on, decapitalize all the following letters of the word / If cursor is between words, capitalize the first letter of the next word:
```
Alt + C
```
   
Delete rest of the word or the whole word after the cursor:
```
Alt+D
```

Jump to insert something to the beginning of what you're typing, press again to go back to almost the same place. Toggles between two positions of the cursor:
```
Ctrl+X+X
```

Go to your home directory (/home/[username]), no matter where you are located (all of these commands work):
```
cd

cd ~

cd $HOME

cd $home
```

Change directory to /usr/bin:
```
cd /usr/bin
```

Go to the parent directory (from /usr/bin to /usr/):
```
cd ..
```

Go back to the previous directory
```
cd -
```

Scroll through previous commands (very useful):
```
Up

Down
```

Quickly jump back and forth over words with cursor:
```
Ctrl+Left

Ctrl+Right
```

Quickly jump to the beginning or end of the of the current line:
```
Home

End

Ctrl+A

Ctrl+E
```

Clear the screen of the text (push the empty lines in front of you to back):
```
Ctrl+L

clear
```

However, you can still scroll up or down with scroll wheel or use Shift+PageUp and Shift+PageDown to scroll to the previous commands
Remove what's on the left of your cursor on the line (use when you want to clear out the command you're currently typing):
```
Ctrl+U
```

Remove everything in front of your cursor on the line:
```
Ctrl+K
```

Fast backspace or Erase/cut words/parameters of a command that are separated by space:
```
Ctrl+W or Alt+Backspace
```

Paste back what you removed with Ctrl+U, Ctrl+K or Ctrl+W or Alt+Backspace:
```
Ctrl+Y
```

Somekind of undo, like Ctrl+Y but more accurate (but very unconsistent). Handy to use if you removed characters too much from your command):
```
Ctrl+- or Ctrl+7
```

Backspace:
```
Ctrl+H or Ctrl+8 or Backspace
```

Enter:
```
Ctrl+J
```

Deletes characters to the right of cursor. (If no characters, Ctrl+D also logs out and closes terminal):
```
Ctrl+D or Delete
```

Search text from the whole history (even after reset):
```
Ctrl+R
```
This will zombie an application. If you have a process running in a terminal and you want the terminal back but don’t want to kill the application, you can hit Ctrl + z to send the process to the background. To get the process back, type fg.
```
Ctrl + Z
```

Search text from the terminal window scrollback history:
```
Ctrl+Shift+F
```

You can fast spam the screen full of something by:
```
wheee

Ctrl+U

Ctrl+hold Y

Ctrl+U

Ctrl+hold Y

Ctrl+U

Ctrl+hold Y
```

If your terminal gets stuck, you can usually get back to entering commands by pressing Enter and Ctrl+L, or just with Ctrl+C (cancelling).

Clear screen and the scroll history
The command history stays (arrow keys up and down, Ctrl+R search):
```
reset
```

Or faster one:
```
tput reset
```

Clear bash history (clear all the commands in history):
```
history -cw

Or (depending on what Terminal is in use):

Alt+T, C
```

Sometimes you might want to do Ctrl+L+L to make a nice little gap (the vertical size of your terminal window) to see where your previous command started to give input. For example:
```
reset

man -h

*enter* *up-arrow*man -h
 
man -h
```

And you can't really scroll up and quickly see where you typed the command second or third time. But:
```
reset

man -h

Ctrl+L+L

man -h

Ctrl+L+L

man -h
```

And scroll up and you can clearly see where your commands begun.

Some people like to keep enter pressed down for one second to make that gap, which is in some cases a better method (the gap isn't as huge as with the Ctrl+L+L method).

Copy the highlighted text to clipboard:
```
Ctrl+Shift+C
```

Paste:
```
Ctrl+Shift+V

Shift+Insert

(In elementary OS also Ctrl+C and Ctrl+V work. If text is not highlighted, Ctrl+C is the Cancel command, like it is normally.)
```



**1.2.2) WINDOWS**

**1.2.3) MAC**

