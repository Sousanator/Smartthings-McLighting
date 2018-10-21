# Smartthings-McLighting
Smartthings Device Handler for McLighting v2 
https://github.com/toblum/McLighting

This device handler can turn on/off the lights, set any color, set the brightness, change the scene, set the animation speed, and the ability to save and call all of the above with 6 different presets.

Add this device handler in your Smartthings IDE. Create a new device with the above device handler.  In the preferences add the IP address, and port (80 by default) of your Mclighting controller 

I just wanted something quick and dirty to be able to control my light strips with Google Assistant so this just uses the basic HTTP command API (no json).  There's no true feedback or polling so changes on the webBrowser don't get reflected here.  When integrating with Google Assistant via SmartThings, the only commands I figured out were to change color and brightness. To call up scenes and change animation speeds with Google Assistant you can create vitual dimmers and switches and use webCore.  All the internal commands are available in webCore so you can do more advanced stuff in there. 



Device:

![Device](https://github.com/Sousanator/Smartthings-McLighting/blob/master/Smartthings_McLighting_Device.jpg)

Prefrences:

![Preferences](https://github.com/Sousanator/Smartthings-McLighting/blob/master/Smartthings_Mclighting_Preferences.jpg)
