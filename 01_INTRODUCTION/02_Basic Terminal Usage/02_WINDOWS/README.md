# 1.2.2) Basic Terminal Usage - WINDOWS

Some basic, but usefull terminal commands used on WINDOWS.

**Displaying text with echo:**
```
echo Testing currently CMD
```

**Displaying text with echo (Two lines):**
```
echo Testing currently CMD & echo Next line
```

**Change working directory:**
```
cd path\to\directory
```

**List files in current directory:**
```
dir
```

**List files in current directory and subdirectories:**
```
dir /S
```

**List files in current directory and subdirectories that contains sql in its name:**
```
dir /S *sql*
```

**Display file content:**
```
type "path\directory\filename"
```

**Display file content, but add a "more" feature that makes the cmd wait for a enter press in order to display new lines:**
```
type "filename" | more
```

**Write the result of a command to a text file (Overwrites file):**
```
dir > "path\directory\files.txt"
```

**Append the result of a command to a text file:**
```
dir >> "path\directory\files.txt"
```

**Copy, rename and paste file to another folder:**
```
copy "path\directory\files.txt" "path\directory\files_renamed.txt"
```

**Concatenate contents of two files:**
```
type "path\directory\September_report.csv" > "path\directory\Combined_report.csv"
type "path\directory\October_report.csv" >> "path\directory\Combined_report.csv"
```

**Create a new directory:**
```
mkdir "path\to\new_directory"
```

**Chaining commands (Second command will only execute after succesfull execution of first one):**
```
mkdir "path\to\new_directory" && copy "path\to\old_directory\text.txt" "path\to\new_directory\text.txt"
```

**Find a particular string inside a file:**
```
find "[07/Oct" "path\to\directory\text.txt"
```

**Show IP configuration:**
```
ipconfig
```

**Delete directory and subdirectory files tree:**
```
deltree c:\MyFiles\directory
```

**View which drivers are placed on a Windows operating system:**
```
driverquery

With a bit extra report:

driverquery -v

With signature data:

driverquery -si
```

**Check TCP/IP connection ping:**
```
ping 192.168.1.1
```

**Check TCP/IP connection ping for circumstances in which one or more routers live between hosts:**
```
pathping 192.168.1.1
```

**Retrieve data about the tasks that are operating on Windows:**
```
tasklist

illustrate all the DLL modules connected with a job:

tasklist -m

places the settings that back each job:

tasklist -svc
```

**Eliminate a task, either by title or by process ID:**
```
Title:

taskkill -im chrome.exe

Process ID:

taskkill -pid 3125
```

**Examine all secured system files, and substitute damaged files with a cached model that is placed in a compressed enclosure at %WinDir%\System32\dllcache.**
```
sfc /scannow
```

**Operate a series of analyses on the computer in order to sketch out why the computer is encountering network difficulties:**
```
Netdiag
```

**The tracert command tracks the path it exercises for a packet to touch a target and displays an erudition about each jaunt along that path:**
```
tracert  abc.com
```