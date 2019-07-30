# 1.2.3) Basic Terminal Usage - MAC

Some usefull terminal commands used on MAC OS.

<details open>
<summary>Table of Contents</summary>
<br>

[Chose a working directory](#h1)

[Show hidden files and folders](#h2)

[Restart the finder](#h3)

[View file contents](#h4)

[Copy the contents of a folder from one place to another](#h5)

[Download files outside the browser](#h6)

[Create a custom login message](#h7)

[Show how long has my Mac been running](#h8)

[Keep the Mac awake](#h9)

[Make your Mac automatically restart after a crash](#h10)

[Add spacers to your Dock](#h11)

[Dull hidden apps in the Dock](#h12)

[Hide non-active apps in your Dock](#h13)

[USEFUULL LINKS](#h14)

</details>

<a name="h1"/>

**Chose a working directory:**
```
cd ~/Directory/
```

<a name="h2"/>

**Show hidden files and folders:**
```
defaults write com.apple.finder AppleShowAllFiles -bool TRUE
```

<a name="h3"/>

**Restart the finder:**
```
killall Finder
```

<a name="h4"/>

**View file contents:**
```
cat ~/enter/file/path
```

<a name="h5"/>

**Copy the contents of a folder from one place to another:**
```
ditto -V ~/original/folder/ ~/new/folder/
```

<a name="h6"/>

**Download files outside the browser:**
```
cd ~/Downloads/

curl -O http://www.thefilename.com/thefile/url.mp3
```

<a name="h7"/>

**Create a custom login message:**
```
sudo defaults write /Library/Preferences/com.apple.loginwindow LoginwindowText "In case of loss, call 555-555-5555."
```

<a name="h8"/>

**Show how long has my Mac been running:**
```
uptime
```

<a name="h9"/>

**Keep the Mac awake:**
```
caffeinate
```

<a name="h10"/>

**Make your Mac automatically restart after a crash:**
```
sudo systemsetup -setrestartfreeze on
```

<a name="h11"/>

**Add spacers to your Dock:**
```
defaults write com.apple.dock persistent-apps -array-add '{"tile-type"="spacer-tile";}'

killall Dock
```

<a name="h12"/>

**Dull hidden apps in the Dock:**
```
defaults write com.apple.Dock showhidden -bool TRUE

killall Dock
```

<a name="h13"/>

**Hide non-active apps in your Dock:**
```
defaults write com.apple.dock static-only -bool TRUE

killall Dock
```

<a name="h14"/>

**USEFUULL LINKS**

**MAC OS basic commands list:**

https://www.makeuseof.com/tag/mac-terminal-commands-cheat-sheet/