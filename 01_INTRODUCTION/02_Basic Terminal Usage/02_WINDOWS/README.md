# 1.2.2) Basic Terminal Usage - WINDOWS

Some usefull terminal commands used on WINDOWS.

<details open>
<summary>Table of Contents</summary>
<br>

[Displaying text with echo](#h1)

[Displaying text with echo (Two lines)](#h2)

[Change working directory](#h3)

[List files in current directory](#h4)

[List files in current directory and subdirectories](#h5)

[List files in current directory and subdirectories that contains sql in its name](#h6)

[Display file content](#h7)

[Display file content, but add a "more" feature that makes the cmd wait for a enter press in order to display new lines](#h8)

[Write the result of a command to a text file (Overwrites file)](#h9)

[Append the result of a command to a text file](#h10)

[Copy, rename and paste file to another folder](#h11)

[Concatenate contents of two files](#h12)

[Create a new directory](#h13)

[Chaining commands (Second command will only execute after succesfull execution of first one)](#h14)

[Find a particular string inside a file](#h15)

[Show IP configuration](#h16)

[Delete directory and subdirectory files tree](#h17)

[View which drivers are placed on a Windows operating system](#h18)

[Check TCP/IP connection ping](#h19)

[Check TCP/IP connection ping for circumstances in which one or more routers live between hosts](#h20)

[Retrieve data about the tasks that are operating on Windows](#h21)

[Eliminate a task, either by title or by process ID](#h22)

[Examine all secured system files, and substitute damaged files with a cached model that is placed in a compressed enclosure at %WinDir%\System32\dllcache](#h23)

[Operate a series of analyses on the computer in order to sketch out why the computer is encountering network difficulties](#h24)

[The tracert command tracks the path it exercises for a packet to touch a target and displays an erudition about each jaunt along that path](#h25)

[USEFULL LINKS](#h26)

</details>

<a name="h1"/>

**Displaying text with echo:**
```
echo Testing currently CMD
```

<a name="h2"/>

**Displaying text with echo (Two lines):**
```
echo Testing currently CMD & echo Next line
```

<a name="h3"/>

**Change working directory:**
```
cd path\to\directory
```

<a name="h4"/>

**List files in current directory:**
```
dir
```

<a name="h5"/>

**List files in current directory and subdirectories:**
```
dir /S
```

<a name="h6"/>

**List files in current directory and subdirectories that contains sql in its name:**
```
dir /S *sql*
```

<a name="h7"/>

**Display file content:**
```
type "path\directory\filename"
```

<a name="h8"/>

**Display file content, but add a "more" feature that makes the cmd wait for a enter press in order to display new lines:**
```
type "filename" | more
```

<a name="h9"/>

**Write the result of a command to a text file (Overwrites file):**
```
dir > "path\directory\files.txt"
```

<a name="h10"/>

**Append the result of a command to a text file:**
```
dir >> "path\directory\files.txt"
```

<a name="h11"/>

**Copy, rename and paste file to another folder:**
```
copy "path\directory\files.txt" "path\directory\files_renamed.txt"
```

<a name="h12"/>

**Concatenate contents of two files:**
```
type "path\directory\September_report.csv" > "path\directory\Combined_report.csv"
type "path\directory\October_report.csv" >> "path\directory\Combined_report.csv"
```

<a name="h13"/>

**Create a new directory:**
```
mkdir "path\to\new_directory"
```

<a name="h14"/>

**Chaining commands (Second command will only execute after succesfull execution of first one):**
```
mkdir "path\to\new_directory" && copy "path\to\old_directory\text.txt" "path\to\new_directory\text.txt"
```

<a name="h15"/>

**Find a particular string inside a file:**
```
find "[07/Oct" "path\to\directory\text.txt"
```

<a name="h16"/>

**Show IP configuration:**
```
ipconfig
```

<a name="h17"/>

**Delete directory and subdirectory files tree:**
```
deltree c:\MyFiles\directory
```

<a name="h18"/>

**View which drivers are placed on a Windows operating system:**
```
driverquery

With a bit extra report:

driverquery -v

With signature data:

driverquery -si
```

<a name="h19"/>

**Check TCP/IP connection ping:**
```
ping 192.168.1.1
```

<a name="h20"/>

**Check TCP/IP connection ping for circumstances in which one or more routers live between hosts:**
```
pathping 192.168.1.1
```

<a name="h21"/>

**Retrieve data about the tasks that are operating on Windows:**
```
tasklist

illustrate all the DLL modules connected with a job:

tasklist -m

places the settings that back each job:

tasklist -svc
```

<a name="h22"/>

**Eliminate a task, either by title or by process ID:**
```
Title:

taskkill -im chrome.exe

Process ID:

taskkill -pid 3125
```

<a name="h23"/>

**Examine all secured system files, and substitute damaged files with a cached model that is placed in a compressed enclosure at %WinDir%\System32\dllcache.**
```
sfc /scannow
```

<a name="h24"/>

**Operate a series of analyses on the computer in order to sketch out why the computer is encountering network difficulties:**
```
Netdiag
```

<a name="h25"/>

**The tracert command tracks the path it exercises for a packet to touch a target and displays an erudition about each jaunt along that path:**
```
tracert  abc.com
```

<a name="h26"/>

**USEFULL LINKS**

**Windows commands:**

https://bytescout.com/blog/windows-command-prompt-commands.html