# 1.2.3) Basic Terminal Usage - MAC

Some usefull terminal commands used on MAC OS.

***Chose a working directory:*
```
cd ~/Directory/
```

**Show hidden files and folders:**
```
defaults write com.apple.finder AppleShowAllFiles -bool TRUE
```

**Restart the finder**
```
killall Finder
```

**View file contents**
```
cat ~/enter/file/path
```

**Copy the contents of a folder from one place to another**
```
ditto -V ~/original/folder/ ~/new/folder/
```

**Download files outside the browser:**
```
cd ~/Downloads/

curl -O http://www.thefilename.com/thefile/url.mp3
```

**Create a custom login message:**
```
sudo defaults write /Library/Preferences/com.apple.loginwindow LoginwindowText "In case of loss, call 555-555-5555."
```

**Show how long has my Mac been running:**
```
uptime
```

**Keep the Mac awake:**
```
caffeinate
```

**Make your Mac automatically restart after a crash:**
```
sudo systemsetup -setrestartfreeze on
```

**Add spacers to your Dock:**
```
defaults write com.apple.dock persistent-apps -array-add '{"tile-type"="spacer-tile";}'

killall Dock
```

**Dull hidden apps in the Dock:**
```
defaults write com.apple.Dock showhidden -bool TRUE

killall Dock
```

**Hide non-active apps in your Dock**
```
defaults write com.apple.dock static-only -bool TRUE

killall Dock
```